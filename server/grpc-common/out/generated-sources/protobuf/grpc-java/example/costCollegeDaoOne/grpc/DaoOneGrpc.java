package example.costCollegeDaoOne.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: costCollegeDaoOne.proto")
public final class DaoOneGrpc {

  private DaoOneGrpc() {}

  public static final String SERVICE_NAME = "example.costCollegeDaoOne.grpc.DaoOne";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest,
      example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse> getGetQueryOneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getQueryOne",
      requestType = example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest.class,
      responseType = example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest,
      example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse> getGetQueryOneMethod() {
    io.grpc.MethodDescriptor<example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest, example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse> getGetQueryOneMethod;
    if ((getGetQueryOneMethod = DaoOneGrpc.getGetQueryOneMethod) == null) {
      synchronized (DaoOneGrpc.class) {
        if ((getGetQueryOneMethod = DaoOneGrpc.getGetQueryOneMethod) == null) {
          DaoOneGrpc.getGetQueryOneMethod = getGetQueryOneMethod =
              io.grpc.MethodDescriptor.<example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest, example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getQueryOne"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DaoOneMethodDescriptorSupplier("getQueryOne"))
              .build();
        }
      }
    }
    return getGetQueryOneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DaoOneStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoOneStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoOneStub>() {
        @java.lang.Override
        public DaoOneStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoOneStub(channel, callOptions);
        }
      };
    return DaoOneStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DaoOneBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoOneBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoOneBlockingStub>() {
        @java.lang.Override
        public DaoOneBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoOneBlockingStub(channel, callOptions);
        }
      };
    return DaoOneBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DaoOneFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoOneFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoOneFutureStub>() {
        @java.lang.Override
        public DaoOneFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoOneFutureStub(channel, callOptions);
        }
      };
    return DaoOneFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DaoOneImplBase implements io.grpc.BindableService {

    /**
     */
    public void getQueryOne(example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest request,
        io.grpc.stub.StreamObserver<example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueryOneMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetQueryOneMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest,
                example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse>(
                  this, METHODID_GET_QUERY_ONE)))
          .build();
    }
  }

  /**
   */
  public static final class DaoOneStub extends io.grpc.stub.AbstractAsyncStub<DaoOneStub> {
    private DaoOneStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoOneStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoOneStub(channel, callOptions);
    }

    /**
     */
    public void getQueryOne(example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest request,
        io.grpc.stub.StreamObserver<example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueryOneMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DaoOneBlockingStub extends io.grpc.stub.AbstractBlockingStub<DaoOneBlockingStub> {
    private DaoOneBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoOneBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoOneBlockingStub(channel, callOptions);
    }

    /**
     */
    public example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse getQueryOne(example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueryOneMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DaoOneFutureStub extends io.grpc.stub.AbstractFutureStub<DaoOneFutureStub> {
    private DaoOneFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoOneFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoOneFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse> getQueryOne(
        example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueryOneMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUERY_ONE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DaoOneImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DaoOneImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_QUERY_ONE:
          serviceImpl.getQueryOne((example.costCollegeDaoOne.grpc.CostCollegeDaoOneRequest) request,
              (io.grpc.stub.StreamObserver<example.costCollegeDaoOne.grpc.CostCollegeDaoOneResponse>) responseObserver);
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

  private static abstract class DaoOneBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DaoOneBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return example.costCollegeDaoOne.grpc.QueryOne.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DaoOne");
    }
  }

  private static final class DaoOneFileDescriptorSupplier
      extends DaoOneBaseDescriptorSupplier {
    DaoOneFileDescriptorSupplier() {}
  }

  private static final class DaoOneMethodDescriptorSupplier
      extends DaoOneBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DaoOneMethodDescriptorSupplier(String methodName) {
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
      synchronized (DaoOneGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DaoOneFileDescriptorSupplier())
              .addMethod(getGetQueryOneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
