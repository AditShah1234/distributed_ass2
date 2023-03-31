package example.costCollegeDaoFive.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: costCollegeDaoFive.proto")
public final class DaoFiveGrpc {

  private DaoFiveGrpc() {}

  public static final String SERVICE_NAME = "example.costCollegeDaoFive.grpc.DaoFive";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<example.costCollegeDaoFive.grpc.CostCollegeDaoFiveRequest,
      example.costCollegeDaoFive.grpc.CostCollegeDaoFiveResponse> getGetQueryFiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getQueryFive",
      requestType = example.costCollegeDaoFive.grpc.CostCollegeDaoFiveRequest.class,
      responseType = example.costCollegeDaoFive.grpc.CostCollegeDaoFiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.costCollegeDaoFive.grpc.CostCollegeDaoFiveRequest,
      example.costCollegeDaoFive.grpc.CostCollegeDaoFiveResponse> getGetQueryFiveMethod() {
    io.grpc.MethodDescriptor<example.costCollegeDaoFive.grpc.CostCollegeDaoFiveRequest, example.costCollegeDaoFive.grpc.CostCollegeDaoFiveResponse> getGetQueryFiveMethod;
    if ((getGetQueryFiveMethod = DaoFiveGrpc.getGetQueryFiveMethod) == null) {
      synchronized (DaoFiveGrpc.class) {
        if ((getGetQueryFiveMethod = DaoFiveGrpc.getGetQueryFiveMethod) == null) {
          DaoFiveGrpc.getGetQueryFiveMethod = getGetQueryFiveMethod =
              io.grpc.MethodDescriptor.<example.costCollegeDaoFive.grpc.CostCollegeDaoFiveRequest, example.costCollegeDaoFive.grpc.CostCollegeDaoFiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getQueryFive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.costCollegeDaoFive.grpc.CostCollegeDaoFiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.costCollegeDaoFive.grpc.CostCollegeDaoFiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DaoFiveMethodDescriptorSupplier("getQueryFive"))
              .build();
        }
      }
    }
    return getGetQueryFiveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DaoFiveStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoFiveStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoFiveStub>() {
        @java.lang.Override
        public DaoFiveStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoFiveStub(channel, callOptions);
        }
      };
    return DaoFiveStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DaoFiveBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoFiveBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoFiveBlockingStub>() {
        @java.lang.Override
        public DaoFiveBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoFiveBlockingStub(channel, callOptions);
        }
      };
    return DaoFiveBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DaoFiveFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoFiveFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoFiveFutureStub>() {
        @java.lang.Override
        public DaoFiveFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoFiveFutureStub(channel, callOptions);
        }
      };
    return DaoFiveFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DaoFiveImplBase implements io.grpc.BindableService {

    /**
     */
    public void getQueryFive(example.costCollegeDaoFive.grpc.CostCollegeDaoFiveRequest request,
        io.grpc.stub.StreamObserver<example.costCollegeDaoFive.grpc.CostCollegeDaoFiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueryFiveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetQueryFiveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                example.costCollegeDaoFive.grpc.CostCollegeDaoFiveRequest,
                example.costCollegeDaoFive.grpc.CostCollegeDaoFiveResponse>(
                  this, METHODID_GET_QUERY_FIVE)))
          .build();
    }
  }

  /**
   */
  public static final class DaoFiveStub extends io.grpc.stub.AbstractAsyncStub<DaoFiveStub> {
    private DaoFiveStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoFiveStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoFiveStub(channel, callOptions);
    }

    /**
     */
    public void getQueryFive(example.costCollegeDaoFive.grpc.CostCollegeDaoFiveRequest request,
        io.grpc.stub.StreamObserver<example.costCollegeDaoFive.grpc.CostCollegeDaoFiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueryFiveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DaoFiveBlockingStub extends io.grpc.stub.AbstractBlockingStub<DaoFiveBlockingStub> {
    private DaoFiveBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoFiveBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoFiveBlockingStub(channel, callOptions);
    }

    /**
     */
    public example.costCollegeDaoFive.grpc.CostCollegeDaoFiveResponse getQueryFive(example.costCollegeDaoFive.grpc.CostCollegeDaoFiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueryFiveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DaoFiveFutureStub extends io.grpc.stub.AbstractFutureStub<DaoFiveFutureStub> {
    private DaoFiveFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoFiveFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoFiveFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.costCollegeDaoFive.grpc.CostCollegeDaoFiveResponse> getQueryFive(
        example.costCollegeDaoFive.grpc.CostCollegeDaoFiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueryFiveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUERY_FIVE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DaoFiveImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DaoFiveImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_QUERY_FIVE:
          serviceImpl.getQueryFive((example.costCollegeDaoFive.grpc.CostCollegeDaoFiveRequest) request,
              (io.grpc.stub.StreamObserver<example.costCollegeDaoFive.grpc.CostCollegeDaoFiveResponse>) responseObserver);
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

  private static abstract class DaoFiveBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DaoFiveBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return example.costCollegeDaoFive.grpc.QueryFive.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DaoFive");
    }
  }

  private static final class DaoFiveFileDescriptorSupplier
      extends DaoFiveBaseDescriptorSupplier {
    DaoFiveFileDescriptorSupplier() {}
  }

  private static final class DaoFiveMethodDescriptorSupplier
      extends DaoFiveBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DaoFiveMethodDescriptorSupplier(String methodName) {
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
      synchronized (DaoFiveGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DaoFiveFileDescriptorSupplier())
              .addMethod(getGetQueryFiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
