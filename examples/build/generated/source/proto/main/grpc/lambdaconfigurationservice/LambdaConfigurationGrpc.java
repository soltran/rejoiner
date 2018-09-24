package lambdaconfigurationservice;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: lambdaconfigurationservice.proto")
public final class LambdaConfigurationGrpc {

  private LambdaConfigurationGrpc() {}

  public static final String SERVICE_NAME = "lambdaconfigurationservice.LambdaConfiguration";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReq,
      lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReply> METHOD_ENABLE_AUTOMATIC_FMD_UPLOAD =
      io.grpc.MethodDescriptor.<lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReq, lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lambdaconfigurationservice.LambdaConfiguration", "EnableAutomaticFmdUpload"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReply.getDefaultInstance()))
          .setSchemaDescriptor(new LambdaConfigurationMethodDescriptorSupplier("EnableAutomaticFmdUpload"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReq,
      lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReply> METHOD_ENABLE_LAMBDA_FOR_SNAPPABLE =
      io.grpc.MethodDescriptor.<lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReq, lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lambdaconfigurationservice.LambdaConfiguration", "EnableLambdaForSnappable"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReply.getDefaultInstance()))
          .setSchemaDescriptor(new LambdaConfigurationMethodDescriptorSupplier("EnableLambdaForSnappable"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReq,
      lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReply> METHOD_GET_SPARK_SETTABLE_LAMBDA_CONFIG =
      io.grpc.MethodDescriptor.<lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReq, lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lambdaconfigurationservice.LambdaConfiguration", "GetSparkSettableLambdaConfig"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReply.getDefaultInstance()))
          .setSchemaDescriptor(new LambdaConfigurationMethodDescriptorSupplier("GetSparkSettableLambdaConfig"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LambdaConfigurationStub newStub(io.grpc.Channel channel) {
    return new LambdaConfigurationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LambdaConfigurationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LambdaConfigurationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LambdaConfigurationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LambdaConfigurationFutureStub(channel);
  }

  /**
   */
  public static abstract class LambdaConfigurationImplBase implements io.grpc.BindableService {

    /**
     */
    public void enableAutomaticFmdUpload(lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReq request,
        io.grpc.stub.StreamObserver<lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ENABLE_AUTOMATIC_FMD_UPLOAD, responseObserver);
    }

    /**
     */
    public void enableLambdaForSnappable(lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReq request,
        io.grpc.stub.StreamObserver<lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ENABLE_LAMBDA_FOR_SNAPPABLE, responseObserver);
    }

    /**
     */
    public void getSparkSettableLambdaConfig(lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReq request,
        io.grpc.stub.StreamObserver<lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SPARK_SETTABLE_LAMBDA_CONFIG, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ENABLE_AUTOMATIC_FMD_UPLOAD,
            asyncUnaryCall(
              new MethodHandlers<
                lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReq,
                lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReply>(
                  this, METHODID_ENABLE_AUTOMATIC_FMD_UPLOAD)))
          .addMethod(
            METHOD_ENABLE_LAMBDA_FOR_SNAPPABLE,
            asyncUnaryCall(
              new MethodHandlers<
                lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReq,
                lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReply>(
                  this, METHODID_ENABLE_LAMBDA_FOR_SNAPPABLE)))
          .addMethod(
            METHOD_GET_SPARK_SETTABLE_LAMBDA_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReq,
                lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReply>(
                  this, METHODID_GET_SPARK_SETTABLE_LAMBDA_CONFIG)))
          .build();
    }
  }

  /**
   */
  public static final class LambdaConfigurationStub extends io.grpc.stub.AbstractStub<LambdaConfigurationStub> {
    private LambdaConfigurationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LambdaConfigurationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LambdaConfigurationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LambdaConfigurationStub(channel, callOptions);
    }

    /**
     */
    public void enableAutomaticFmdUpload(lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReq request,
        io.grpc.stub.StreamObserver<lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ENABLE_AUTOMATIC_FMD_UPLOAD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableLambdaForSnappable(lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReq request,
        io.grpc.stub.StreamObserver<lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ENABLE_LAMBDA_FOR_SNAPPABLE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSparkSettableLambdaConfig(lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReq request,
        io.grpc.stub.StreamObserver<lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SPARK_SETTABLE_LAMBDA_CONFIG, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LambdaConfigurationBlockingStub extends io.grpc.stub.AbstractStub<LambdaConfigurationBlockingStub> {
    private LambdaConfigurationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LambdaConfigurationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LambdaConfigurationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LambdaConfigurationBlockingStub(channel, callOptions);
    }

    /**
     */
    public lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReply enableAutomaticFmdUpload(lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ENABLE_AUTOMATIC_FMD_UPLOAD, getCallOptions(), request);
    }

    /**
     */
    public lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReply enableLambdaForSnappable(lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ENABLE_LAMBDA_FOR_SNAPPABLE, getCallOptions(), request);
    }

    /**
     */
    public lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReply getSparkSettableLambdaConfig(lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SPARK_SETTABLE_LAMBDA_CONFIG, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LambdaConfigurationFutureStub extends io.grpc.stub.AbstractStub<LambdaConfigurationFutureStub> {
    private LambdaConfigurationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LambdaConfigurationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LambdaConfigurationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LambdaConfigurationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReply> enableAutomaticFmdUpload(
        lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ENABLE_AUTOMATIC_FMD_UPLOAD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReply> enableLambdaForSnappable(
        lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ENABLE_LAMBDA_FOR_SNAPPABLE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReply> getSparkSettableLambdaConfig(
        lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SPARK_SETTABLE_LAMBDA_CONFIG, getCallOptions()), request);
    }
  }

  private static final int METHODID_ENABLE_AUTOMATIC_FMD_UPLOAD = 0;
  private static final int METHODID_ENABLE_LAMBDA_FOR_SNAPPABLE = 1;
  private static final int METHODID_GET_SPARK_SETTABLE_LAMBDA_CONFIG = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LambdaConfigurationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LambdaConfigurationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENABLE_AUTOMATIC_FMD_UPLOAD:
          serviceImpl.enableAutomaticFmdUpload((lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReq) request,
              (io.grpc.stub.StreamObserver<lambdaconfigurationservice.Lambdaconfigurationservice.EnableAutomaticFmdUploadReply>) responseObserver);
          break;
        case METHODID_ENABLE_LAMBDA_FOR_SNAPPABLE:
          serviceImpl.enableLambdaForSnappable((lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReq) request,
              (io.grpc.stub.StreamObserver<lambdaconfigurationservice.Lambdaconfigurationservice.EnableLambdaForSnappableReply>) responseObserver);
          break;
        case METHODID_GET_SPARK_SETTABLE_LAMBDA_CONFIG:
          serviceImpl.getSparkSettableLambdaConfig((lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReq) request,
              (io.grpc.stub.StreamObserver<lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LambdaConfigurationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LambdaConfigurationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lambdaconfigurationservice.Lambdaconfigurationservice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LambdaConfiguration");
    }
  }

  private static final class LambdaConfigurationFileDescriptorSupplier
      extends LambdaConfigurationBaseDescriptorSupplier {
    LambdaConfigurationFileDescriptorSupplier() {}
  }

  private static final class LambdaConfigurationMethodDescriptorSupplier
      extends LambdaConfigurationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LambdaConfigurationMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LambdaConfigurationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LambdaConfigurationFileDescriptorSupplier())
              .addMethod(METHOD_ENABLE_AUTOMATIC_FMD_UPLOAD)
              .addMethod(METHOD_ENABLE_LAMBDA_FOR_SNAPPABLE)
              .addMethod(METHOD_GET_SPARK_SETTABLE_LAMBDA_CONFIG)
              .build();
        }
      }
    }
    return result;
  }
}
