package example.costCollegeDaoTwo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: costCollegeDaoTwo.proto")
public final class DaoTwoGrpc {

  private DaoTwoGrpc() {}

  public static final String SERVICE_NAME = "example.costCollegeDaoTwo.grpc.DaoTwo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoRequest,
      example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoResponse> getGetQueryTwoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getQueryTwo",
      requestType = example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoRequest.class,
      responseType = example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoRequest,
      example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoResponse> getGetQueryTwoMethod() {
    io.grpc.MethodDescriptor<example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoRequest, example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoResponse> getGetQueryTwoMethod;
    if ((getGetQueryTwoMethod = DaoTwoGrpc.getGetQueryTwoMethod) == null) {
      synchronized (DaoTwoGrpc.class) {
        if ((getGetQueryTwoMethod = DaoTwoGrpc.getGetQueryTwoMethod) == null) {
          DaoTwoGrpc.getGetQueryTwoMethod = getGetQueryTwoMethod =
              io.grpc.MethodDescriptor.<example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoRequest, example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getQueryTwo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DaoTwoMethodDescriptorSupplier("getQueryTwo"))
              .build();
        }
      }
    }
    return getGetQueryTwoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DaoTwoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoTwoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoTwoStub>() {
        @java.lang.Override
        public DaoTwoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoTwoStub(channel, callOptions);
        }
      };
    return DaoTwoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DaoTwoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoTwoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoTwoBlockingStub>() {
        @java.lang.Override
        public DaoTwoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoTwoBlockingStub(channel, callOptions);
        }
      };
    return DaoTwoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DaoTwoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DaoTwoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DaoTwoFutureStub>() {
        @java.lang.Override
        public DaoTwoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DaoTwoFutureStub(channel, callOptions);
        }
      };
    return DaoTwoFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DaoTwoImplBase implements io.grpc.BindableService {

    /**
     */
    public void getQueryTwo(example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoRequest request,
        io.grpc.stub.StreamObserver<example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueryTwoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetQueryTwoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoRequest,
                example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoResponse>(
                  this, METHODID_GET_QUERY_TWO)))
          .build();
    }
  }

  /**
   */
  public static final class DaoTwoStub extends io.grpc.stub.AbstractAsyncStub<DaoTwoStub> {
    private DaoTwoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoTwoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoTwoStub(channel, callOptions);
    }

    /**
     */
    public void getQueryTwo(example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoRequest request,
        io.grpc.stub.StreamObserver<example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueryTwoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DaoTwoBlockingStub extends io.grpc.stub.AbstractBlockingStub<DaoTwoBlockingStub> {
    private DaoTwoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoTwoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoTwoBlockingStub(channel, callOptions);
    }

    /**
     */
    public example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoResponse getQueryTwo(example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueryTwoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DaoTwoFutureStub extends io.grpc.stub.AbstractFutureStub<DaoTwoFutureStub> {
    private DaoTwoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DaoTwoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DaoTwoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoResponse> getQueryTwo(
        example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueryTwoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUERY_TWO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DaoTwoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DaoTwoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_QUERY_TWO:
          serviceImpl.getQueryTwo((example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoRequest) request,
              (io.grpc.stub.StreamObserver<example.costCollegeDaoTwo.grpc.CostCollegeDaoTwoResponse>) responseObserver);
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

  private static abstract class DaoTwoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DaoTwoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return example.costCollegeDaoTwo.grpc.QueryTwo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DaoTwo");
    }
  }

  private static final class DaoTwoFileDescriptorSupplier
      extends DaoTwoBaseDescriptorSupplier {
    DaoTwoFileDescriptorSupplier() {}
  }

  private static final class DaoTwoMethodDescriptorSupplier
      extends DaoTwoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DaoTwoMethodDescriptorSupplier(String methodName) {
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
      synchronized (DaoTwoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DaoTwoFileDescriptorSupplier())
              .addMethod(getGetQueryTwoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
