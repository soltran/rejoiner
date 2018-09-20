package com.google.api.graphql.examples.library.graphqlserver.schema;

import appflowsservice.Appflowsservice;
import appflowsservice.Appflowsservice.CreateAppBlueprintRsp;
import appflowsservice.Appflowsservice.CreateAppBlueprintReq;
import appflowsservice.Appflowsservice.GetAppBlueprintReq;
import appflowsservice.Appflowsservice.QueryAppBlueprintsReq;
import appflowsservice.Appflowsservice.AppBlueprintDetail;
import appflowsservice.AppFlowsServiceGrpc.AppFlowsServiceFutureStub;
import com.google.api.graphql.rejoiner.Mutation;
import com.google.api.graphql.rejoiner.Query;
import com.google.api.graphql.rejoiner.SchemaModification;
import com.google.api.graphql.rejoiner.Type;
import com.google.api.graphql.rejoiner.TypeModification;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.api.graphql.rejoiner.SchemaModule;
import graphql.schema.DataFetchingEnvironment;

final class AppFlowSchemaModule extends SchemaModule {

  TypeModification removeAccountInput =
    Type.find(QueryAppBlueprintsReq.getDescriptor()).removeField(
      "accountName");

  @Query("appBlueprintDetail")
  ListenableFuture<AppBlueprintDetail> getAppBlueprint(
    GetAppBlueprintReq request,
    DataFetchingEnvironment dataFetchingEnvironment,
    AppFlowsServiceFutureStub client) {
    GetAppBlueprintReq adjustedReq = request.toBuilder()
      .setAccountName(dataFetchingEnvironment.<String>getContext())
      .build();
    return client.getAppBlueprint(adjustedReq);
  }

  @Query("appBlueprintList")
  ListenableFuture<Appflowsservice.AppBlueprintsSummaries> getAppBlueprintList(
    QueryAppBlueprintsReq request,
    DataFetchingEnvironment dataFetchingEnvironment,
    AppFlowsServiceFutureStub client) {
    QueryAppBlueprintsReq adjustedReq = request.toBuilder()
      .setAccountName(dataFetchingEnvironment.<String>getContext())
      .build();
    return client.queryAppBlueprints(adjustedReq);
  }

  @Mutation("createAppBlueprint")
  ListenableFuture<CreateAppBlueprintRsp> createAppBlueprint(
    CreateAppBlueprintReq request,
    AppFlowsServiceFutureStub client
  )  {
    return client.createAppBlueprint(request);
  }

  @SchemaModification
  TypeModification arbitraryName =
    Type.find(Appflowsservice.AppBlueprintsSummaries.getDescriptor()).renameType(
      "CreateNewAppBlueprintResponse");

}
