// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: costCollegeDaoOne.proto

package example.costCollegeDaoOne.grpc;

public final class QueryOne {
  private QueryOne() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027costCollegeDaoOne.proto\022\036example.costC" +
      "ollegeDaoOne.grpc\"f\n\030CostCollegeDaoOneRe" +
      "quest\022\014\n\004year\030\001 \001(\005\022\r\n\005state\030\002 \001(\t\022\014\n\004ty" +
      "pe\030\003 \001(\t\022\016\n\006length\030\004 \001(\t\022\017\n\007expense\030\005 \001(" +
      "\t\",\n\031CostCollegeDaoOneResponse\022\017\n\007messag" +
      "e\030\001 \001(\t2\217\001\n\006DaoOne\022\204\001\n\013getQueryOne\0228.exa" +
      "mple.costCollegeDaoOne.grpc.CostCollegeD" +
      "aoOneRequest\0329.example.costCollegeDaoOne" +
      ".grpc.CostCollegeDaoOneResponse\"\000B,\n\036exa" +
      "mple.costCollegeDaoOne.grpcB\010QueryOneP\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneRequest_descriptor,
        new java.lang.String[] { "Year", "State", "Type", "Length", "Expense", });
    internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_costCollegeDaoOne_grpc_CostCollegeDaoOneResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}