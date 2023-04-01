package example.costCollegeDaoFour.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: costCollegeDaoFour.proto")
public final class DaoFourGrpc {

  private DaoFourGrpc() {}

  public static final String SERVICE_NAME = "example.costCollegeDaoFour.grpc.DaoFour";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<example.costCollegeDaoFour.grpc.CostCollegeDaoFourRequest,
      example.costCollegeDaoFour.grpc.CostCollegeDaoFourResponse> getGetQueryFourMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getQueryFour",
      requestType = example.costCollegeDaoFour.grpc.CostCollegeDaoFourRequest.class,
      responseType = example.costCollegeDaoFour.grpc.CostCollegeDaoFourResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.costCollegeDaoFour.grpc.CostCollegeDaoFourRequest,
      example.costCollegeDaoFour.grpc.CostCollegeDaoFourResponse> getGetQueryFourMethod() {
    io.grpc.MethodDescriptor<example.costCollegeDaoFour.grpc.CostCollegeDaoFourRequest, example.costCollegeDaoFour.grpc.CostCollegeDaoFourResponse> getGetQueryFourMethod;
    if ((getGetQueryFourMethod = DaoFourGrpc.getGetQueryFourMethod) == null) {
      synchronized (DaoFourGrpc.class) {
        if ((getGetQueryFourMethod = DaoFourGrpc.getGetQueryFourMethod) == null) {
          DaoFourGrpc.getGetQueryFourMethod = getGetQueryFourMethod =
              io.grpc.MethodDescriptor.<example.costCollegeDaoFour.grpc.CostCollegeDaoFourRequest, example.costCollegeDaoFour.grpc.CostCollegeDaoFourResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getQueryFour"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.costCollegeDaoFour.grpc.CostCollegeDaoFourRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.costCollegeDaoFour.grpc.CostCollegeDaoFourResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DaoFourMethodDescriptorSupplier("getQueryFour"))
              .build();
        }
      }
    }
    return getGetQueryFourMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DaoFourStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoFourStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoFourStub>() {
        @java.lang.Override
        public DaoFourStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoFourStub(channel, callOptions);
        }
      };
    return DaoFourStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DaoFourBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoFourBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoFourBlockingStub>() {
        @java.lang.Override
        public DaoFourBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoFourBlockingStub(channel, callOptions);
        }
      };
    return DaoFourBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DaoFourFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoFourFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoFourFutureStub>() {
        @java.lang.Override
        public DaoFourFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoFourFutureStub(channel, callOptions);
        }
      };
    return DaoFourFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DaoFourImplBase implements io.grpc.BindableService {

    /**
     */
    public void getQueryFour(example.costCollegeDaoFour.grpc.CostCollegeDaoFourRequest request,
        io.grpc.stub.StreamObserver<example.costCollegeDaoFour.grpc.CostCollegeDaoFourResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueryFourMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetQueryFourMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                example.costCollegeDaoFour.grpc.CostCollegeDaoFourRequest,
                example.costCollegeDaoFour.grpc.CostCollegeDaoFourResponse>(
                  this, METHODID_GET_QUERY_FOUR)))
          .build();
    }
  }

  /**
   */
  public static final class DaoFourStub extends io.grpc.stub.AbstractAsyncStub<DaoFourStub> {
    private DaoFourStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoFourStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoFourStub(channel, callOptions);
    }

    /**
     */
    public void getQueryFour(example.costCollegeDaoFour.grpc.CostCollegeDaoFourRequest request,
        io.grpc.stub.StreamObserver<example.costCollegeDaoFour.grpc.CostCollegeDaoFourResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueryFourMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DaoFourBlockingStub extends io.grpc.stub.AbstractBlockingStub<DaoFourBlockingStub> {
    private DaoFourBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoFourBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoFourBlockingStub(channel, callOptions);
    }

    /**
     */
    public example.costCollegeDaoFour.grpc.CostCollegeDaoFourResponse getQueryFour(example.costCollegeDaoFour.grpc.CostCollegeDaoFourRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueryFourMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DaoFourFutureStub extends io.grpc.stub.AbstractFutureStub<DaoFourFutureStub> {
    private DaoFourFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoFourFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoFourFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.costCollegeDaoFour.grpc.CostCollegeDaoFourResponse> getQueryFour(
        example.costCollegeDaoFour.grpc.CostCollegeDaoFourRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueryFourMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUERY_FOUR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DaoFourImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DaoFourImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_QUERY_FOUR:
          serviceImpl.getQueryFour((example.costCollegeDaoFour.grpc.CostCollegeDaoFourRequest) request,
              (io.grpc.stub.StreamObserver<example.costCollegeDaoFour.grpc.CostCollegeDaoFourResponse>) responseObserver);
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

  private static abstract class DaoFourBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DaoFourBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return example.costCollegeDaoFour.grpc.QueryFour.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DaoFour");
    }
  }

  private static final class DaoFourFileDescriptorSupplier
      extends DaoFourBaseDescriptorSupplier {
    DaoFourFileDescriptorSupplier() {}
  }

  private static final class DaoFourMethodDescriptorSupplier
      extends DaoFourBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DaoFourMethodDescriptorSupplier(String methodName) {
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
      synchronized (DaoFourGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DaoFourFileDescriptorSupplier())
              .addMethod(getGetQueryFourMethod())
              .build();
        }
      }
    }
    return result;
  }
}
