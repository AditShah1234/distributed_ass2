package example.costCollegeDaoThree.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: costCollegeDaoThree.proto")
public final class DaoThreeGrpc {

  private DaoThreeGrpc() {}

  public static final String SERVICE_NAME = "example.costCollegeDaoThree.grpc.DaoThree";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<example.costCollegeDaoThree.grpc.CostCollegeDaoThreeRequest,
      example.costCollegeDaoThree.grpc.CostCollegeDaoThreeResponse> getGetQueryThreeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getQueryThree",
      requestType = example.costCollegeDaoThree.grpc.CostCollegeDaoThreeRequest.class,
      responseType = example.costCollegeDaoThree.grpc.CostCollegeDaoThreeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.costCollegeDaoThree.grpc.CostCollegeDaoThreeRequest,
      example.costCollegeDaoThree.grpc.CostCollegeDaoThreeResponse> getGetQueryThreeMethod() {
    io.grpc.MethodDescriptor<example.costCollegeDaoThree.grpc.CostCollegeDaoThreeRequest, example.costCollegeDaoThree.grpc.CostCollegeDaoThreeResponse> getGetQueryThreeMethod;
    if ((getGetQueryThreeMethod = DaoThreeGrpc.getGetQueryThreeMethod) == null) {
      synchronized (DaoThreeGrpc.class) {
        if ((getGetQueryThreeMethod = DaoThreeGrpc.getGetQueryThreeMethod) == null) {
          DaoThreeGrpc.getGetQueryThreeMethod = getGetQueryThreeMethod =
              io.grpc.MethodDescriptor.<example.costCollegeDaoThree.grpc.CostCollegeDaoThreeRequest, example.costCollegeDaoThree.grpc.CostCollegeDaoThreeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getQueryThree"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.costCollegeDaoThree.grpc.CostCollegeDaoThreeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.costCollegeDaoThree.grpc.CostCollegeDaoThreeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DaoThreeMethodDescriptorSupplier("getQueryThree"))
              .build();
        }
      }
    }
    return getGetQueryThreeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DaoThreeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoThreeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoThreeStub>() {
        @java.lang.Override
        public DaoThreeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoThreeStub(channel, callOptions);
        }
      };
    return DaoThreeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DaoThreeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoThreeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoThreeBlockingStub>() {
        @java.lang.Override
        public DaoThreeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoThreeBlockingStub(channel, callOptions);
        }
      };
    return DaoThreeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DaoThreeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoThreeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoThreeFutureStub>() {
        @java.lang.Override
        public DaoThreeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoThreeFutureStub(channel, callOptions);
        }
      };
    return DaoThreeFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DaoThreeImplBase implements io.grpc.BindableService {

    /**
     */
    public void getQueryThree(example.costCollegeDaoThree.grpc.CostCollegeDaoThreeRequest request,
        io.grpc.stub.StreamObserver<example.costCollegeDaoThree.grpc.CostCollegeDaoThreeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueryThreeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetQueryThreeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                example.costCollegeDaoThree.grpc.CostCollegeDaoThreeRequest,
                example.costCollegeDaoThree.grpc.CostCollegeDaoThreeResponse>(
                  this, METHODID_GET_QUERY_THREE)))
          .build();
    }
  }

  /**
   */
  public static final class DaoThreeStub extends io.grpc.stub.AbstractAsyncStub<DaoThreeStub> {
    private DaoThreeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoThreeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoThreeStub(channel, callOptions);
    }

    /**
     */
    public void getQueryThree(example.costCollegeDaoThree.grpc.CostCollegeDaoThreeRequest request,
        io.grpc.stub.StreamObserver<example.costCollegeDaoThree.grpc.CostCollegeDaoThreeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueryThreeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DaoThreeBlockingStub extends io.grpc.stub.AbstractBlockingStub<DaoThreeBlockingStub> {
    private DaoThreeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoThreeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoThreeBlockingStub(channel, callOptions);
    }

    /**
     */
    public example.costCollegeDaoThree.grpc.CostCollegeDaoThreeResponse getQueryThree(example.costCollegeDaoThree.grpc.CostCollegeDaoThreeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueryThreeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DaoThreeFutureStub extends io.grpc.stub.AbstractFutureStub<DaoThreeFutureStub> {
    private DaoThreeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoThreeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoThreeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.costCollegeDaoThree.grpc.CostCollegeDaoThreeResponse> getQueryThree(
        example.costCollegeDaoThree.grpc.CostCollegeDaoThreeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueryThreeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUERY_THREE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DaoThreeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DaoThreeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_QUERY_THREE:
          serviceImpl.getQueryThree((example.costCollegeDaoThree.grpc.CostCollegeDaoThreeRequest) request,
              (io.grpc.stub.StreamObserver<example.costCollegeDaoThree.grpc.CostCollegeDaoThreeResponse>) responseObserver);
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

  private static abstract class DaoThreeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DaoThreeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return example.costCollegeDaoThree.grpc.QueryThree.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DaoThree");
    }
  }

  private static final class DaoThreeFileDescriptorSupplier
      extends DaoThreeBaseDescriptorSupplier {
    DaoThreeFileDescriptorSupplier() {}
  }

  private static final class DaoThreeMethodDescriptorSupplier
      extends DaoThreeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DaoThreeMethodDescriptorSupplier(String methodName) {
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
      synchronized (DaoThreeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DaoThreeFileDescriptorSupplier())
              .addMethod(getGetQueryThreeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
