// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: library/shelf_service.proto

package com.google.example.library.shelf.v1;

public final class ShelfServiceProto {
  private ShelfServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_example_library_shelf_v1_CreateShelfRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_example_library_shelf_v1_CreateShelfRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_example_library_shelf_v1_GetShelfRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_example_library_shelf_v1_GetShelfRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_example_library_shelf_v1_ListShelvesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_example_library_shelf_v1_ListShelvesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_example_library_shelf_v1_ListShelvesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_example_library_shelf_v1_ListShelvesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_example_library_shelf_v1_DeleteShelfRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_example_library_shelf_v1_DeleteShelfRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_example_library_shelf_v1_MergeShelvesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_example_library_shelf_v1_MergeShelvesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_example_library_shelf_v1_ListBooksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_example_library_shelf_v1_ListBooksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_example_library_shelf_v1_ListBooksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_example_library_shelf_v1_ListBooksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_example_library_shelf_v1_MoveBookRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_example_library_shelf_v1_MoveBookRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033library/shelf_service.proto\022\037google.ex" +
      "ample.library.shelf.v1\032\033google/protobuf/" +
      "empty.proto\032\023library/shelf.proto\"K\n\022Crea" +
      "teShelfRequest\0225\n\005shelf\030\001 \001(\0132&.google.e" +
      "xample.library.shelf.v1.Shelf\"\035\n\017GetShel" +
      "fRequest\022\n\n\002id\030\001 \001(\t\";\n\022ListShelvesReque" +
      "st\022\021\n\tpage_size\030\001 \001(\005\022\022\n\npage_token\030\002 \001(" +
      "\t\"g\n\023ListShelvesResponse\0227\n\007shelves\030\001 \003(" +
      "\0132&.google.example.library.shelf.v1.Shel" +
      "f\022\027\n\017next_page_token\030\002 \001(\t\" \n\022DeleteShel",
      "fRequest\022\n\n\002id\030\001 \001(\t\"9\n\023MergeShelvesRequ" +
      "est\022\n\n\002id\030\001 \001(\t\022\026\n\016other_shelf_id\030\002 \001(\t\"" +
      "E\n\020ListBooksRequest\022\n\n\002id\030\001 \001(\t\022\021\n\tpage_" +
      "size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\">\n\021ListBo" +
      "oksResponse\022\020\n\010books_id\030\001 \003(\t\022\027\n\017next_pa" +
      "ge_token\030\002 \001(\t\"5\n\017MoveBookRequest\022\n\n\002id\030" +
      "\001 \001(\t\022\026\n\016other_shelf_id\030\002 \001(\t2\256\004\n\014ShelfS" +
      "ervice\022l\n\013CreateShelf\0223.google.example.l" +
      "ibrary.shelf.v1.CreateShelfRequest\032&.goo" +
      "gle.example.library.shelf.v1.Shelf\"\000\022f\n\010",
      "GetShelf\0220.google.example.library.shelf." +
      "v1.GetShelfRequest\032&.google.example.libr" +
      "ary.shelf.v1.Shelf\"\000\022z\n\013ListShelves\0223.go" +
      "ogle.example.library.shelf.v1.ListShelve" +
      "sRequest\0324.google.example.library.shelf." +
      "v1.ListShelvesResponse\"\000\022\\\n\013DeleteShelf\022" +
      "3.google.example.library.shelf.v1.Delete" +
      "ShelfRequest\032\026.google.protobuf.Empty\"\000\022n" +
      "\n\014MergeShelves\0224.google.example.library." +
      "shelf.v1.MergeShelvesRequest\032&.google.ex",
      "ample.library.shelf.v1.Shelf\"\000B:\n#com.go" +
      "ogle.example.library.shelf.v1B\021ShelfServ" +
      "iceProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.example.library.shelf.v1.ShelfProto.getDescriptor(),
        }, assigner);
    internal_static_google_example_library_shelf_v1_CreateShelfRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_example_library_shelf_v1_CreateShelfRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_example_library_shelf_v1_CreateShelfRequest_descriptor,
        new java.lang.String[] { "Shelf", });
    internal_static_google_example_library_shelf_v1_GetShelfRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_example_library_shelf_v1_GetShelfRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_example_library_shelf_v1_GetShelfRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_google_example_library_shelf_v1_ListShelvesRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_example_library_shelf_v1_ListShelvesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_example_library_shelf_v1_ListShelvesRequest_descriptor,
        new java.lang.String[] { "PageSize", "PageToken", });
    internal_static_google_example_library_shelf_v1_ListShelvesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_example_library_shelf_v1_ListShelvesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_example_library_shelf_v1_ListShelvesResponse_descriptor,
        new java.lang.String[] { "Shelves", "NextPageToken", });
    internal_static_google_example_library_shelf_v1_DeleteShelfRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_example_library_shelf_v1_DeleteShelfRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_example_library_shelf_v1_DeleteShelfRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_google_example_library_shelf_v1_MergeShelvesRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_example_library_shelf_v1_MergeShelvesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_example_library_shelf_v1_MergeShelvesRequest_descriptor,
        new java.lang.String[] { "Id", "OtherShelfId", });
    internal_static_google_example_library_shelf_v1_ListBooksRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_example_library_shelf_v1_ListBooksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_example_library_shelf_v1_ListBooksRequest_descriptor,
        new java.lang.String[] { "Id", "PageSize", "PageToken", });
    internal_static_google_example_library_shelf_v1_ListBooksResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_example_library_shelf_v1_ListBooksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_example_library_shelf_v1_ListBooksResponse_descriptor,
        new java.lang.String[] { "BooksId", "NextPageToken", });
    internal_static_google_example_library_shelf_v1_MoveBookRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_example_library_shelf_v1_MoveBookRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_example_library_shelf_v1_MoveBookRequest_descriptor,
        new java.lang.String[] { "Id", "OtherShelfId", });
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.example.library.shelf.v1.ShelfProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
