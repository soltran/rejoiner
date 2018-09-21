package com.google.api.graphql.examples.library.graphqlserver.schema;

import appflowsservice.Appflowsservice;
import appflowsservice.Appflowsservice.AppBlueprintSearchResponses;
import appflowsservice.Appflowsservice.UpdateAppBlueprintRsp;
import appflowsservice.Appflowsservice.UpdateAppBlueprintReq;
import appflowsservice.Appflowsservice.AppBlueprintsSummaries;
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

  @SchemaModification
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
  ListenableFuture<AppBlueprintsSummaries> getAppBlueprintList(
    QueryAppBlueprintsReq request,
    DataFetchingEnvironment dataFetchingEnvironment,
    AppFlowsServiceFutureStub client) {
    QueryAppBlueprintsReq adjustedReq = request.toBuilder()
      .setAccountName(dataFetchingEnvironment.<String>getContext())
      .build();
    return client.queryAppBlueprints(adjustedReq);
  }

  @Query("searchAppBlueprint")
  ListenableFuture<AppBlueprintSearchResponses> searchAppBlueprints(
    Appflowsservice.SearchAppBlueprintReq request,
    DataFetchingEnvironment dataFetchingEnvironment,
    AppFlowsServiceFutureStub client) {
    Appflowsservice.SearchAppBlueprintReq adjustedReq = request.toBuilder()
      .setAccountName(dataFetchingEnvironment.<String>getContext())
      .build();
    return client.searchAppBlueprint(adjustedReq);
  }

  @Mutation("createAppBlueprint")
  ListenableFuture<CreateAppBlueprintRsp> createAppBlueprint(
    CreateAppBlueprintReq request,
    AppFlowsServiceFutureStub client
  )  {
    return client.createAppBlueprint(request);
  }

  @Mutation("updateAppBlueprint")
  ListenableFuture<UpdateAppBlueprintRsp> updateAppBlueprint(
    UpdateAppBlueprintReq request,
    DataFetchingEnvironment dataFetchingEnvironment,
    AppFlowsServiceFutureStub client
  ) {
    UpdateAppBlueprintReq adjustedReq = request.toBuilder()
      .setAccountName(dataFetchingEnvironment.<String>getContext())
      .build();
    return client.updateAppBlueprint(adjustedReq);
  }

  @Mutation("deleteAppBlueprint")
  ListenableFuture<Appflowsservice.DeleteAppBlueprintRsp> deleteAppBlueprint(
    Appflowsservice.DeleteAppBlueprintReq request,
    DataFetchingEnvironment dataFetchingEnvironment,
    AppFlowsServiceFutureStub client
  ) {
    Appflowsservice.DeleteAppBlueprintReq adjustedReq = request.toBuilder()
      .setAccountName(dataFetchingEnvironment.<String>getContext())
      .build();
    return client.deleteAppBlueprint(adjustedReq);
  }

  @SchemaModification
  TypeModification arbitraryName =
    Type.find(AppBlueprintsSummaries.getDescriptor()).renameType(
      "AppBluePrints");

  @SchemaModification
  TypeModification oneMore =
    Type.find(QueryAppBlueprintsReq.getDescriptor()).renameType(
      "AppBlueprintQueryRequest");

}
