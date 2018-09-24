package com.google.api.graphql.examples.library.graphqlserver.schema;

import com.google.api.graphql.rejoiner.Mutation;
import com.google.api.graphql.rejoiner.Query;
import com.google.api.graphql.rejoiner.SchemaModule;
import com.google.common.util.concurrent.ListenableFuture;
import graphql.schema.DataFetchingEnvironment;
import lambdaconfigurationservice.LambdaConfigurationGrpc;
import lambdaconfigurationservice.Lambdaconfigurationservice;
import lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReply;
import lambdaconfigurationservice.Lambdaconfigurationservice.GetLambdaConfigReq;

final class LambdaSchemaModule extends SchemaModule {

  @Query("getLambdaConfig")
  ListenableFuture<GetLambdaConfigReply> getLambdaConfig(
    GetLambdaConfigReq request,
    DataFetchingEnvironment dataFetchingEnvironment,
    LambdaConfigurationGrpc.LambdaConfigurationFutureStub client) {
    GetLambdaConfigReq adjustedReq = request.toBuilder()
      .setAccountId(dataFetchingEnvironment.<String>getContext())
      .build();
    return client.getSparkSettableLambdaConfig(adjustedReq);
  }

  @Mutation("enableLambdaForSnappable")
  ListenableFuture<Lambdaconfigurationservice.EnableLambdaForSnappableReply> enableLambdaForSnappable(
    Lambdaconfigurationservice.EnableLambdaForSnappableReq request,
    DataFetchingEnvironment dataFetchingEnvironment,
    LambdaConfigurationGrpc.LambdaConfigurationFutureStub client) {
    Lambdaconfigurationservice.EnableLambdaForSnappableReq adjustedReq = request.toBuilder()
      .setAccountId(dataFetchingEnvironment.<String>getContext())
      .build();
    return client.enableLambdaForSnappable(adjustedReq);
  }
}
