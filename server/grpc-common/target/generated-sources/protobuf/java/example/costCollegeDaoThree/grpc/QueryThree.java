// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: costCollegeDaoThree.proto

package example.costCollegeDaoThree.grpc;

public final class QueryThree {
  private QueryThree() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_costCollegeDaoThree_grpc_CostCollegeDaoThreeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_costCollegeDaoThree_grpc_CostCollegeDaoThreeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_costCollegeDaoThree_grpc_CostCollegeDaoThreeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_costCollegeDaoThree_grpc_CostCollegeDaoThreeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031costCollegeDaoThree.proto\022 example.cos" +
      "tCollegeDaoThree.grpc\"H\n\032CostCollegeDaoT" +
      "hreeRequest\022\014\n\004year\030\001 \001(\005\022\014\n\004type\030\002 \001(\t\022" +
      "\016\n\006length\030\003 \001(\t\".\n\033CostCollegeDaoThreeRe" +
      "sponse\022\017\n\007message\030\001 \001(\t2\233\001\n\010DaoThree\022\216\001\n" +
      "\rgetQueryThree\022<.example.costCollegeDaoT" +
      "hree.grpc.CostCollegeDaoThreeRequest\032=.e" +
      "xample.costCollegeDaoThree.grpc.CostColl" +
      "egeDaoThreeResponse\"\000B0\n example.costCol" +
      "legeDaoThree.grpcB\nQueryThreeP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_example_costCollegeDaoThree_grpc_CostCollegeDaoThreeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_example_costCollegeDaoThree_grpc_CostCollegeDaoThreeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_costCollegeDaoThree_grpc_CostCollegeDaoThreeRequest_descriptor,
        new java.lang.String[] { "Year", "Type", "Length", });
    internal_static_example_costCollegeDaoThree_grpc_CostCollegeDaoThreeResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_example_costCollegeDaoThree_grpc_CostCollegeDaoThreeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_costCollegeDaoThree_grpc_CostCollegeDaoThreeResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}