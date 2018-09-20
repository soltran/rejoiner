// Copyright 2017 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.graphql.examples.library.graphqlserver.client;

import appflowsservice.AppFlowsServiceGrpc;
import com.google.inject.AbstractModule;
import io.grpc.Attributes;
import io.grpc.CallCredentials;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.examples.helloworld.GreeterGrpc;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.concurrent.Executor;

/** Binds a stub for the {@link GreeterGrpc} service. */
final class AppFlowClientModule extends AbstractModule {

  private static final String HOST = "localhost";
  private static final int PORT = 50070;

  @Override
  protected void configure() {
    String keyFile = "/Users/soltran/Projects/spark/secrets/default/pki" +
      "/certs/api-server-key.pem";
    String certFile = "/Users/soltran/Projects/spark/secrets/default/pki/certs/api-server.pem";
    String rootCAFile = "/Users/soltran/Projects/spark/secrets/default/pki/certs/ca-bundle.pem";
    String JWTTokenFile =  "/Users/soltran/Projects/spark/secrets/default" +
      "/jwt/tokens/api-server.jwt";

    byte[] token = new byte[0];
    try {
      token = Files.readAllBytes(Paths.get(JWTTokenFile));
    } catch (IOException e) {
      e.printStackTrace();
    }
    String tokenStr = (new String(token)).trim();
    JWTCallCredentials creds = new JWTCallCredentials(tokenStr);
    CallCredsInterceptor authz = new CallCredsInterceptor(creds);
    SslContext tlsCtx = null;
    try {
      tlsCtx = GrpcSslContexts
        .forClient()
      .sslProvider(SslProvider.OPENSSL)
        .ciphers(Arrays.asList("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"))
        .keyManager(new File(certFile), new File(keyFile))
        .protocols("TLSv1.2")
        .trustManager(loadX509Cert(rootCAFile))
        .build();
    } catch (Exception e) {
      e.printStackTrace();
    }
    ManagedChannel channel =
       NettyChannelBuilder
          .forAddress(HOST, PORT)
          .negotiationType(NegotiationType.TLS)
          .sslContext(tlsCtx)
          .overrideAuthority("appflows-service")
          .intercept(authz)
          .build();
    bind(AppFlowsServiceGrpc.AppFlowsServiceFutureStub.class)
      .toInstance(AppFlowsServiceGrpc.newFutureStub(channel));
  }

  private X509Certificate loadX509Cert(String file) throws Exception {
    InputStream inStream = new FileInputStream(file);
    try {
      CertificateFactory cf = CertificateFactory.getInstance("X.509");
      X509Certificate cert = (X509Certificate) cf.generateCertificate(inStream);
      cert.checkValidity();
      return cert;
    } finally {
      inStream.close();
    }
  }

  /**
   * Implements a JWT based per-RPC authorization mechanism.
   */
  private class JWTCallCredentials implements CallCredentials {

    private String jwtToken;
    public JWTCallCredentials(String jwtToken) {
      this.jwtToken = jwtToken;
    }
    public void applyRequestMetadata(
      MethodDescriptor<?,?> method,
      Attributes attrs,
      Executor appExecutor,
      CallCredentials.MetadataApplier applier
  ) {
      Metadata metadata = new Metadata();
      metadata.put(
        Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER),
        jwtToken
      );
      applier.apply(metadata);
    }

    @Override
    public void thisUsesUnstableApi() {

    }
  }

  /**
   * Interceptor the attaches a per-RPC JWT capability to each request.
   *
   * You can avoid an interceptor by attaching CallCredentials to a gRPC Stub,
   * but as stubs are specific to a service, this is less generic so we implement
   * our own interceptor.
   */
  private class CallCredsInterceptor
    implements ClientInterceptor {

    private CallCredentials creds;
    public CallCredsInterceptor(CallCredentials creds) {
      this.creds = creds;
    }

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
      return next.newCall(method, callOptions.withCallCredentials(creds));
    }
  }
}


