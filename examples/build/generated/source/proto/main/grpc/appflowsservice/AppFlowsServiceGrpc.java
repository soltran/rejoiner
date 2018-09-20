package appflowsservice;

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
    comments = "Source: appflowsservice.proto")
public final class AppFlowsServiceGrpc {

  private AppFlowsServiceGrpc() {}

  public static final String SERVICE_NAME = "appflowsservice.AppFlowsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.QueryAppBlueprintsReq,
      appflowsservice.Appflowsservice.AppBlueprintsSummaries> METHOD_QUERY_APP_BLUEPRINTS =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.QueryAppBlueprintsReq, appflowsservice.Appflowsservice.AppBlueprintsSummaries>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "QueryAppBlueprints"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.QueryAppBlueprintsReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.AppBlueprintsSummaries.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("QueryAppBlueprints"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.CreateAppBlueprintReq,
      appflowsservice.Appflowsservice.CreateAppBlueprintRsp> METHOD_CREATE_APP_BLUEPRINT =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.CreateAppBlueprintReq, appflowsservice.Appflowsservice.CreateAppBlueprintRsp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "CreateAppBlueprint"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.CreateAppBlueprintReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.CreateAppBlueprintRsp.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("CreateAppBlueprint"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.GetAppBlueprintReq,
      appflowsservice.Appflowsservice.AppBlueprintDetail> METHOD_GET_APP_BLUEPRINT =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.GetAppBlueprintReq, appflowsservice.Appflowsservice.AppBlueprintDetail>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "GetAppBlueprint"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.GetAppBlueprintReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.AppBlueprintDetail.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("GetAppBlueprint"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.UpdateAppBlueprintReq,
      appflowsservice.Appflowsservice.UpdateAppBlueprintRsp> METHOD_UPDATE_APP_BLUEPRINT =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.UpdateAppBlueprintReq, appflowsservice.Appflowsservice.UpdateAppBlueprintRsp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "UpdateAppBlueprint"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.UpdateAppBlueprintReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.UpdateAppBlueprintRsp.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("UpdateAppBlueprint"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.DeleteAppBlueprintReq,
      appflowsservice.Appflowsservice.DeleteAppBlueprintRsp> METHOD_DELETE_APP_BLUEPRINT =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.DeleteAppBlueprintReq, appflowsservice.Appflowsservice.DeleteAppBlueprintRsp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "DeleteAppBlueprint"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.DeleteAppBlueprintReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.DeleteAppBlueprintRsp.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("DeleteAppBlueprint"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.QueryAppBlueprintSnapshotReq,
      appflowsservice.Appflowsservice.AppBlueprintSnapshotSummaries> METHOD_QUERY_APP_BLUEPRINT_SNAPSHOT =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.QueryAppBlueprintSnapshotReq, appflowsservice.Appflowsservice.AppBlueprintSnapshotSummaries>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "QueryAppBlueprintSnapshot"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.QueryAppBlueprintSnapshotReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.AppBlueprintSnapshotSummaries.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("QueryAppBlueprintSnapshot"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.CreateBlueprintSnapshotReq,
      appflowsservice.Appflowsservice.Result> METHOD_CREATE_BLUEPRINT_SNAPSHOT =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.CreateBlueprintSnapshotReq, appflowsservice.Appflowsservice.Result>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "CreateBlueprintSnapshot"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.CreateBlueprintSnapshotReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.Result.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("CreateBlueprintSnapshot"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotsReq,
      appflowsservice.Appflowsservice.Result> METHOD_DELETE_APP_BLUEPRINT_SNAPSHOTS =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotsReq, appflowsservice.Appflowsservice.Result>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "DeleteAppBlueprintSnapshots"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotsReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.Result.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("DeleteAppBlueprintSnapshots"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.GetAppBlueprintSnapshotReq,
      appflowsservice.Appflowsservice.AppBlueprintSnapshotDetail> METHOD_GET_APP_BLUEPRINT_SNAPSHOT =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.GetAppBlueprintSnapshotReq, appflowsservice.Appflowsservice.AppBlueprintSnapshotDetail>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "GetAppBlueprintSnapshot"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.GetAppBlueprintSnapshotReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.AppBlueprintSnapshotDetail.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("GetAppBlueprintSnapshot"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotReq,
      appflowsservice.Appflowsservice.Result> METHOD_DELETE_APP_BLUEPRINT_SNAPSHOT =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotReq, appflowsservice.Appflowsservice.Result>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "DeleteAppBlueprintSnapshot"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.Result.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("DeleteAppBlueprintSnapshot"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.GetAppBlueprintMissedSnapshotsReq,
      appflowsservice.Appflowsservice.MissedSnapshots> METHOD_GET_APP_BLUEPRINT_MISSED_SNAPSHOTS =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.GetAppBlueprintMissedSnapshotsReq, appflowsservice.Appflowsservice.MissedSnapshots>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "GetAppBlueprintMissedSnapshots"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.GetAppBlueprintMissedSnapshotsReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.MissedSnapshots.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("GetAppBlueprintMissedSnapshots"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.SearchAppBlueprintReq,
      appflowsservice.Appflowsservice.AppBlueprintSearchResponses> METHOD_SEARCH_APP_BLUEPRINT =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.SearchAppBlueprintReq, appflowsservice.Appflowsservice.AppBlueprintSearchResponses>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "SearchAppBlueprint"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.SearchAppBlueprintReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.AppBlueprintSearchResponses.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("SearchAppBlueprint"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotExportReq,
      appflowsservice.Appflowsservice.Result> METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_EXPORT =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotExportReq, appflowsservice.Appflowsservice.Result>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "CreateAppBlueprintSnapshotExport"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotExportReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.Result.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("CreateAppBlueprintSnapshotExport"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotMountReq,
      appflowsservice.Appflowsservice.Result> METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_MOUNT =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotMountReq, appflowsservice.Appflowsservice.Result>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "CreateAppBlueprintSnapshotMount"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotMountReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.Result.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("CreateAppBlueprintSnapshotMount"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotInstantRecoveryReq,
      appflowsservice.Appflowsservice.Result> METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_INSTANT_RECOVERY =
      io.grpc.MethodDescriptor.<appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotInstantRecoveryReq, appflowsservice.Appflowsservice.Result>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "appflowsservice.AppFlowsService", "CreateAppBlueprintSnapshotInstantRecovery"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotInstantRecoveryReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              appflowsservice.Appflowsservice.Result.getDefaultInstance()))
          .setSchemaDescriptor(new AppFlowsServiceMethodDescriptorSupplier("CreateAppBlueprintSnapshotInstantRecovery"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppFlowsServiceStub newStub(io.grpc.Channel channel) {
    return new AppFlowsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppFlowsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AppFlowsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppFlowsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AppFlowsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AppFlowsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryAppBlueprints(appflowsservice.Appflowsservice.QueryAppBlueprintsReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintsSummaries> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY_APP_BLUEPRINTS, responseObserver);
    }

    /**
     */
    public void createAppBlueprint(appflowsservice.Appflowsservice.CreateAppBlueprintReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.CreateAppBlueprintRsp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_APP_BLUEPRINT, responseObserver);
    }

    /**
     */
    public void getAppBlueprint(appflowsservice.Appflowsservice.GetAppBlueprintReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintDetail> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_APP_BLUEPRINT, responseObserver);
    }

    /**
     */
    public void updateAppBlueprint(appflowsservice.Appflowsservice.UpdateAppBlueprintReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.UpdateAppBlueprintRsp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_APP_BLUEPRINT, responseObserver);
    }

    /**
     */
    public void deleteAppBlueprint(appflowsservice.Appflowsservice.DeleteAppBlueprintReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.DeleteAppBlueprintRsp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_APP_BLUEPRINT, responseObserver);
    }

    /**
     */
    public void queryAppBlueprintSnapshot(appflowsservice.Appflowsservice.QueryAppBlueprintSnapshotReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintSnapshotSummaries> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY_APP_BLUEPRINT_SNAPSHOT, responseObserver);
    }

    /**
     */
    public void createBlueprintSnapshot(appflowsservice.Appflowsservice.CreateBlueprintSnapshotReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_BLUEPRINT_SNAPSHOT, responseObserver);
    }

    /**
     */
    public void deleteAppBlueprintSnapshots(appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotsReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_APP_BLUEPRINT_SNAPSHOTS, responseObserver);
    }

    /**
     */
    public void getAppBlueprintSnapshot(appflowsservice.Appflowsservice.GetAppBlueprintSnapshotReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintSnapshotDetail> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_APP_BLUEPRINT_SNAPSHOT, responseObserver);
    }

    /**
     */
    public void deleteAppBlueprintSnapshot(appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_APP_BLUEPRINT_SNAPSHOT, responseObserver);
    }

    /**
     */
    public void getAppBlueprintMissedSnapshots(appflowsservice.Appflowsservice.GetAppBlueprintMissedSnapshotsReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.MissedSnapshots> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_APP_BLUEPRINT_MISSED_SNAPSHOTS, responseObserver);
    }

    /**
     */
    public void searchAppBlueprint(appflowsservice.Appflowsservice.SearchAppBlueprintReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintSearchResponses> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_APP_BLUEPRINT, responseObserver);
    }

    /**
     */
    public void createAppBlueprintSnapshotExport(appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotExportReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_EXPORT, responseObserver);
    }

    /**
     */
    public void createAppBlueprintSnapshotMount(appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotMountReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_MOUNT, responseObserver);
    }

    /**
     */
    public void createAppBlueprintSnapshotInstantRecovery(appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotInstantRecoveryReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_INSTANT_RECOVERY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_QUERY_APP_BLUEPRINTS,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.QueryAppBlueprintsReq,
                appflowsservice.Appflowsservice.AppBlueprintsSummaries>(
                  this, METHODID_QUERY_APP_BLUEPRINTS)))
          .addMethod(
            METHOD_CREATE_APP_BLUEPRINT,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.CreateAppBlueprintReq,
                appflowsservice.Appflowsservice.CreateAppBlueprintRsp>(
                  this, METHODID_CREATE_APP_BLUEPRINT)))
          .addMethod(
            METHOD_GET_APP_BLUEPRINT,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.GetAppBlueprintReq,
                appflowsservice.Appflowsservice.AppBlueprintDetail>(
                  this, METHODID_GET_APP_BLUEPRINT)))
          .addMethod(
            METHOD_UPDATE_APP_BLUEPRINT,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.UpdateAppBlueprintReq,
                appflowsservice.Appflowsservice.UpdateAppBlueprintRsp>(
                  this, METHODID_UPDATE_APP_BLUEPRINT)))
          .addMethod(
            METHOD_DELETE_APP_BLUEPRINT,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.DeleteAppBlueprintReq,
                appflowsservice.Appflowsservice.DeleteAppBlueprintRsp>(
                  this, METHODID_DELETE_APP_BLUEPRINT)))
          .addMethod(
            METHOD_QUERY_APP_BLUEPRINT_SNAPSHOT,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.QueryAppBlueprintSnapshotReq,
                appflowsservice.Appflowsservice.AppBlueprintSnapshotSummaries>(
                  this, METHODID_QUERY_APP_BLUEPRINT_SNAPSHOT)))
          .addMethod(
            METHOD_CREATE_BLUEPRINT_SNAPSHOT,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.CreateBlueprintSnapshotReq,
                appflowsservice.Appflowsservice.Result>(
                  this, METHODID_CREATE_BLUEPRINT_SNAPSHOT)))
          .addMethod(
            METHOD_DELETE_APP_BLUEPRINT_SNAPSHOTS,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotsReq,
                appflowsservice.Appflowsservice.Result>(
                  this, METHODID_DELETE_APP_BLUEPRINT_SNAPSHOTS)))
          .addMethod(
            METHOD_GET_APP_BLUEPRINT_SNAPSHOT,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.GetAppBlueprintSnapshotReq,
                appflowsservice.Appflowsservice.AppBlueprintSnapshotDetail>(
                  this, METHODID_GET_APP_BLUEPRINT_SNAPSHOT)))
          .addMethod(
            METHOD_DELETE_APP_BLUEPRINT_SNAPSHOT,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotReq,
                appflowsservice.Appflowsservice.Result>(
                  this, METHODID_DELETE_APP_BLUEPRINT_SNAPSHOT)))
          .addMethod(
            METHOD_GET_APP_BLUEPRINT_MISSED_SNAPSHOTS,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.GetAppBlueprintMissedSnapshotsReq,
                appflowsservice.Appflowsservice.MissedSnapshots>(
                  this, METHODID_GET_APP_BLUEPRINT_MISSED_SNAPSHOTS)))
          .addMethod(
            METHOD_SEARCH_APP_BLUEPRINT,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.SearchAppBlueprintReq,
                appflowsservice.Appflowsservice.AppBlueprintSearchResponses>(
                  this, METHODID_SEARCH_APP_BLUEPRINT)))
          .addMethod(
            METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_EXPORT,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotExportReq,
                appflowsservice.Appflowsservice.Result>(
                  this, METHODID_CREATE_APP_BLUEPRINT_SNAPSHOT_EXPORT)))
          .addMethod(
            METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_MOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotMountReq,
                appflowsservice.Appflowsservice.Result>(
                  this, METHODID_CREATE_APP_BLUEPRINT_SNAPSHOT_MOUNT)))
          .addMethod(
            METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_INSTANT_RECOVERY,
            asyncUnaryCall(
              new MethodHandlers<
                appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotInstantRecoveryReq,
                appflowsservice.Appflowsservice.Result>(
                  this, METHODID_CREATE_APP_BLUEPRINT_SNAPSHOT_INSTANT_RECOVERY)))
          .build();
    }
  }

  /**
   */
  public static final class AppFlowsServiceStub extends io.grpc.stub.AbstractStub<AppFlowsServiceStub> {
    private AppFlowsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppFlowsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppFlowsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppFlowsServiceStub(channel, callOptions);
    }

    /**
     */
    public void queryAppBlueprints(appflowsservice.Appflowsservice.QueryAppBlueprintsReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintsSummaries> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY_APP_BLUEPRINTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAppBlueprint(appflowsservice.Appflowsservice.CreateAppBlueprintReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.CreateAppBlueprintRsp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_APP_BLUEPRINT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAppBlueprint(appflowsservice.Appflowsservice.GetAppBlueprintReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_APP_BLUEPRINT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAppBlueprint(appflowsservice.Appflowsservice.UpdateAppBlueprintReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.UpdateAppBlueprintRsp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_APP_BLUEPRINT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAppBlueprint(appflowsservice.Appflowsservice.DeleteAppBlueprintReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.DeleteAppBlueprintRsp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_APP_BLUEPRINT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAppBlueprintSnapshot(appflowsservice.Appflowsservice.QueryAppBlueprintSnapshotReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintSnapshotSummaries> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY_APP_BLUEPRINT_SNAPSHOT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createBlueprintSnapshot(appflowsservice.Appflowsservice.CreateBlueprintSnapshotReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_BLUEPRINT_SNAPSHOT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAppBlueprintSnapshots(appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotsReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_APP_BLUEPRINT_SNAPSHOTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAppBlueprintSnapshot(appflowsservice.Appflowsservice.GetAppBlueprintSnapshotReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintSnapshotDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_APP_BLUEPRINT_SNAPSHOT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAppBlueprintSnapshot(appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_APP_BLUEPRINT_SNAPSHOT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAppBlueprintMissedSnapshots(appflowsservice.Appflowsservice.GetAppBlueprintMissedSnapshotsReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.MissedSnapshots> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_APP_BLUEPRINT_MISSED_SNAPSHOTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchAppBlueprint(appflowsservice.Appflowsservice.SearchAppBlueprintReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintSearchResponses> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_APP_BLUEPRINT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAppBlueprintSnapshotExport(appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotExportReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_EXPORT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAppBlueprintSnapshotMount(appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotMountReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_MOUNT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAppBlueprintSnapshotInstantRecovery(appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotInstantRecoveryReq request,
        io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_INSTANT_RECOVERY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AppFlowsServiceBlockingStub extends io.grpc.stub.AbstractStub<AppFlowsServiceBlockingStub> {
    private AppFlowsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppFlowsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppFlowsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppFlowsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public appflowsservice.Appflowsservice.AppBlueprintsSummaries queryAppBlueprints(appflowsservice.Appflowsservice.QueryAppBlueprintsReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY_APP_BLUEPRINTS, getCallOptions(), request);
    }

    /**
     */
    public appflowsservice.Appflowsservice.CreateAppBlueprintRsp createAppBlueprint(appflowsservice.Appflowsservice.CreateAppBlueprintReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_APP_BLUEPRINT, getCallOptions(), request);
    }

    /**
     */
    public appflowsservice.Appflowsservice.AppBlueprintDetail getAppBlueprint(appflowsservice.Appflowsservice.GetAppBlueprintReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_APP_BLUEPRINT, getCallOptions(), request);
    }

    /**
     */
    public appflowsservice.Appflowsservice.UpdateAppBlueprintRsp updateAppBlueprint(appflowsservice.Appflowsservice.UpdateAppBlueprintReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_APP_BLUEPRINT, getCallOptions(), request);
    }

    /**
     */
    public appflowsservice.Appflowsservice.DeleteAppBlueprintRsp deleteAppBlueprint(appflowsservice.Appflowsservice.DeleteAppBlueprintReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_APP_BLUEPRINT, getCallOptions(), request);
    }

    /**
     */
    public appflowsservice.Appflowsservice.AppBlueprintSnapshotSummaries queryAppBlueprintSnapshot(appflowsservice.Appflowsservice.QueryAppBlueprintSnapshotReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY_APP_BLUEPRINT_SNAPSHOT, getCallOptions(), request);
    }

    /**
     */
    public appflowsservice.Appflowsservice.Result createBlueprintSnapshot(appflowsservice.Appflowsservice.CreateBlueprintSnapshotReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_BLUEPRINT_SNAPSHOT, getCallOptions(), request);
    }

    /**
     */
    public appflowsservice.Appflowsservice.Result deleteAppBlueprintSnapshots(appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotsReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_APP_BLUEPRINT_SNAPSHOTS, getCallOptions(), request);
    }

    /**
     */
    public appflowsservice.Appflowsservice.AppBlueprintSnapshotDetail getAppBlueprintSnapshot(appflowsservice.Appflowsservice.GetAppBlueprintSnapshotReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_APP_BLUEPRINT_SNAPSHOT, getCallOptions(), request);
    }

    /**
     */
    public appflowsservice.Appflowsservice.Result deleteAppBlueprintSnapshot(appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_APP_BLUEPRINT_SNAPSHOT, getCallOptions(), request);
    }

    /**
     */
    public appflowsservice.Appflowsservice.MissedSnapshots getAppBlueprintMissedSnapshots(appflowsservice.Appflowsservice.GetAppBlueprintMissedSnapshotsReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_APP_BLUEPRINT_MISSED_SNAPSHOTS, getCallOptions(), request);
    }

    /**
     */
    public appflowsservice.Appflowsservice.AppBlueprintSearchResponses searchAppBlueprint(appflowsservice.Appflowsservice.SearchAppBlueprintReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_APP_BLUEPRINT, getCallOptions(), request);
    }

    /**
     */
    public appflowsservice.Appflowsservice.Result createAppBlueprintSnapshotExport(appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotExportReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_EXPORT, getCallOptions(), request);
    }

    /**
     */
    public appflowsservice.Appflowsservice.Result createAppBlueprintSnapshotMount(appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotMountReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_MOUNT, getCallOptions(), request);
    }

    /**
     */
    public appflowsservice.Appflowsservice.Result createAppBlueprintSnapshotInstantRecovery(appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotInstantRecoveryReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_INSTANT_RECOVERY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AppFlowsServiceFutureStub extends io.grpc.stub.AbstractStub<AppFlowsServiceFutureStub> {
    private AppFlowsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppFlowsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppFlowsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppFlowsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.AppBlueprintsSummaries> queryAppBlueprints(
        appflowsservice.Appflowsservice.QueryAppBlueprintsReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY_APP_BLUEPRINTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.CreateAppBlueprintRsp> createAppBlueprint(
        appflowsservice.Appflowsservice.CreateAppBlueprintReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_APP_BLUEPRINT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.AppBlueprintDetail> getAppBlueprint(
        appflowsservice.Appflowsservice.GetAppBlueprintReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_APP_BLUEPRINT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.UpdateAppBlueprintRsp> updateAppBlueprint(
        appflowsservice.Appflowsservice.UpdateAppBlueprintReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_APP_BLUEPRINT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.DeleteAppBlueprintRsp> deleteAppBlueprint(
        appflowsservice.Appflowsservice.DeleteAppBlueprintReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_APP_BLUEPRINT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.AppBlueprintSnapshotSummaries> queryAppBlueprintSnapshot(
        appflowsservice.Appflowsservice.QueryAppBlueprintSnapshotReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY_APP_BLUEPRINT_SNAPSHOT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.Result> createBlueprintSnapshot(
        appflowsservice.Appflowsservice.CreateBlueprintSnapshotReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_BLUEPRINT_SNAPSHOT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.Result> deleteAppBlueprintSnapshots(
        appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotsReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_APP_BLUEPRINT_SNAPSHOTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.AppBlueprintSnapshotDetail> getAppBlueprintSnapshot(
        appflowsservice.Appflowsservice.GetAppBlueprintSnapshotReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_APP_BLUEPRINT_SNAPSHOT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.Result> deleteAppBlueprintSnapshot(
        appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_APP_BLUEPRINT_SNAPSHOT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.MissedSnapshots> getAppBlueprintMissedSnapshots(
        appflowsservice.Appflowsservice.GetAppBlueprintMissedSnapshotsReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_APP_BLUEPRINT_MISSED_SNAPSHOTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.AppBlueprintSearchResponses> searchAppBlueprint(
        appflowsservice.Appflowsservice.SearchAppBlueprintReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_APP_BLUEPRINT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.Result> createAppBlueprintSnapshotExport(
        appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotExportReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_EXPORT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.Result> createAppBlueprintSnapshotMount(
        appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotMountReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_MOUNT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<appflowsservice.Appflowsservice.Result> createAppBlueprintSnapshotInstantRecovery(
        appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotInstantRecoveryReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_INSTANT_RECOVERY, getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_APP_BLUEPRINTS = 0;
  private static final int METHODID_CREATE_APP_BLUEPRINT = 1;
  private static final int METHODID_GET_APP_BLUEPRINT = 2;
  private static final int METHODID_UPDATE_APP_BLUEPRINT = 3;
  private static final int METHODID_DELETE_APP_BLUEPRINT = 4;
  private static final int METHODID_QUERY_APP_BLUEPRINT_SNAPSHOT = 5;
  private static final int METHODID_CREATE_BLUEPRINT_SNAPSHOT = 6;
  private static final int METHODID_DELETE_APP_BLUEPRINT_SNAPSHOTS = 7;
  private static final int METHODID_GET_APP_BLUEPRINT_SNAPSHOT = 8;
  private static final int METHODID_DELETE_APP_BLUEPRINT_SNAPSHOT = 9;
  private static final int METHODID_GET_APP_BLUEPRINT_MISSED_SNAPSHOTS = 10;
  private static final int METHODID_SEARCH_APP_BLUEPRINT = 11;
  private static final int METHODID_CREATE_APP_BLUEPRINT_SNAPSHOT_EXPORT = 12;
  private static final int METHODID_CREATE_APP_BLUEPRINT_SNAPSHOT_MOUNT = 13;
  private static final int METHODID_CREATE_APP_BLUEPRINT_SNAPSHOT_INSTANT_RECOVERY = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AppFlowsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AppFlowsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_APP_BLUEPRINTS:
          serviceImpl.queryAppBlueprints((appflowsservice.Appflowsservice.QueryAppBlueprintsReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintsSummaries>) responseObserver);
          break;
        case METHODID_CREATE_APP_BLUEPRINT:
          serviceImpl.createAppBlueprint((appflowsservice.Appflowsservice.CreateAppBlueprintReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.CreateAppBlueprintRsp>) responseObserver);
          break;
        case METHODID_GET_APP_BLUEPRINT:
          serviceImpl.getAppBlueprint((appflowsservice.Appflowsservice.GetAppBlueprintReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintDetail>) responseObserver);
          break;
        case METHODID_UPDATE_APP_BLUEPRINT:
          serviceImpl.updateAppBlueprint((appflowsservice.Appflowsservice.UpdateAppBlueprintReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.UpdateAppBlueprintRsp>) responseObserver);
          break;
        case METHODID_DELETE_APP_BLUEPRINT:
          serviceImpl.deleteAppBlueprint((appflowsservice.Appflowsservice.DeleteAppBlueprintReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.DeleteAppBlueprintRsp>) responseObserver);
          break;
        case METHODID_QUERY_APP_BLUEPRINT_SNAPSHOT:
          serviceImpl.queryAppBlueprintSnapshot((appflowsservice.Appflowsservice.QueryAppBlueprintSnapshotReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintSnapshotSummaries>) responseObserver);
          break;
        case METHODID_CREATE_BLUEPRINT_SNAPSHOT:
          serviceImpl.createBlueprintSnapshot((appflowsservice.Appflowsservice.CreateBlueprintSnapshotReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result>) responseObserver);
          break;
        case METHODID_DELETE_APP_BLUEPRINT_SNAPSHOTS:
          serviceImpl.deleteAppBlueprintSnapshots((appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotsReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result>) responseObserver);
          break;
        case METHODID_GET_APP_BLUEPRINT_SNAPSHOT:
          serviceImpl.getAppBlueprintSnapshot((appflowsservice.Appflowsservice.GetAppBlueprintSnapshotReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintSnapshotDetail>) responseObserver);
          break;
        case METHODID_DELETE_APP_BLUEPRINT_SNAPSHOT:
          serviceImpl.deleteAppBlueprintSnapshot((appflowsservice.Appflowsservice.DeleteAppBlueprintSnapshotReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result>) responseObserver);
          break;
        case METHODID_GET_APP_BLUEPRINT_MISSED_SNAPSHOTS:
          serviceImpl.getAppBlueprintMissedSnapshots((appflowsservice.Appflowsservice.GetAppBlueprintMissedSnapshotsReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.MissedSnapshots>) responseObserver);
          break;
        case METHODID_SEARCH_APP_BLUEPRINT:
          serviceImpl.searchAppBlueprint((appflowsservice.Appflowsservice.SearchAppBlueprintReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.AppBlueprintSearchResponses>) responseObserver);
          break;
        case METHODID_CREATE_APP_BLUEPRINT_SNAPSHOT_EXPORT:
          serviceImpl.createAppBlueprintSnapshotExport((appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotExportReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result>) responseObserver);
          break;
        case METHODID_CREATE_APP_BLUEPRINT_SNAPSHOT_MOUNT:
          serviceImpl.createAppBlueprintSnapshotMount((appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotMountReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result>) responseObserver);
          break;
        case METHODID_CREATE_APP_BLUEPRINT_SNAPSHOT_INSTANT_RECOVERY:
          serviceImpl.createAppBlueprintSnapshotInstantRecovery((appflowsservice.Appflowsservice.CreateAppBlueprintSnapshotInstantRecoveryReq) request,
              (io.grpc.stub.StreamObserver<appflowsservice.Appflowsservice.Result>) responseObserver);
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

  private static abstract class AppFlowsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppFlowsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return appflowsservice.Appflowsservice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppFlowsService");
    }
  }

  private static final class AppFlowsServiceFileDescriptorSupplier
      extends AppFlowsServiceBaseDescriptorSupplier {
    AppFlowsServiceFileDescriptorSupplier() {}
  }

  private static final class AppFlowsServiceMethodDescriptorSupplier
      extends AppFlowsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AppFlowsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AppFlowsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppFlowsServiceFileDescriptorSupplier())
              .addMethod(METHOD_QUERY_APP_BLUEPRINTS)
              .addMethod(METHOD_CREATE_APP_BLUEPRINT)
              .addMethod(METHOD_GET_APP_BLUEPRINT)
              .addMethod(METHOD_UPDATE_APP_BLUEPRINT)
              .addMethod(METHOD_DELETE_APP_BLUEPRINT)
              .addMethod(METHOD_QUERY_APP_BLUEPRINT_SNAPSHOT)
              .addMethod(METHOD_CREATE_BLUEPRINT_SNAPSHOT)
              .addMethod(METHOD_DELETE_APP_BLUEPRINT_SNAPSHOTS)
              .addMethod(METHOD_GET_APP_BLUEPRINT_SNAPSHOT)
              .addMethod(METHOD_DELETE_APP_BLUEPRINT_SNAPSHOT)
              .addMethod(METHOD_GET_APP_BLUEPRINT_MISSED_SNAPSHOTS)
              .addMethod(METHOD_SEARCH_APP_BLUEPRINT)
              .addMethod(METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_EXPORT)
              .addMethod(METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_MOUNT)
              .addMethod(METHOD_CREATE_APP_BLUEPRINT_SNAPSHOT_INSTANT_RECOVERY)
              .build();
        }
      }
    }
    return result;
  }
}
