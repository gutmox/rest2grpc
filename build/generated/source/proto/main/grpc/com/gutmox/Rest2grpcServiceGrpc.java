package com.gutmox;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.1)",
    comments = "Source: rest2grpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class Rest2grpcServiceGrpc {

  private Rest2grpcServiceGrpc() {}

  public static final String SERVICE_NAME = "com.gutmox.Rest2grpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.gutmox.Rest2grpcRequest,
      com.gutmox.Rest2grpcReply> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = com.gutmox.Rest2grpcRequest.class,
      responseType = com.gutmox.Rest2grpcReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gutmox.Rest2grpcRequest,
      com.gutmox.Rest2grpcReply> getSendMethod() {
    io.grpc.MethodDescriptor<com.gutmox.Rest2grpcRequest, com.gutmox.Rest2grpcReply> getSendMethod;
    if ((getSendMethod = Rest2grpcServiceGrpc.getSendMethod) == null) {
      synchronized (Rest2grpcServiceGrpc.class) {
        if ((getSendMethod = Rest2grpcServiceGrpc.getSendMethod) == null) {
          Rest2grpcServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<com.gutmox.Rest2grpcRequest, com.gutmox.Rest2grpcReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gutmox.Rest2grpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gutmox.Rest2grpcReply.getDefaultInstance()))
              .setSchemaDescriptor(new Rest2grpcServiceMethodDescriptorSupplier("send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Rest2grpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Rest2grpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Rest2grpcServiceStub>() {
        @java.lang.Override
        public Rest2grpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Rest2grpcServiceStub(channel, callOptions);
        }
      };
    return Rest2grpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Rest2grpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Rest2grpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Rest2grpcServiceBlockingStub>() {
        @java.lang.Override
        public Rest2grpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Rest2grpcServiceBlockingStub(channel, callOptions);
        }
      };
    return Rest2grpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Rest2grpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Rest2grpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Rest2grpcServiceFutureStub>() {
        @java.lang.Override
        public Rest2grpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Rest2grpcServiceFutureStub(channel, callOptions);
        }
      };
    return Rest2grpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class Rest2grpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(com.gutmox.Rest2grpcRequest request,
        io.grpc.stub.StreamObserver<com.gutmox.Rest2grpcReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.gutmox.Rest2grpcRequest,
                com.gutmox.Rest2grpcReply>(
                  this, METHODID_SEND)))
          .build();
    }
  }

  /**
   */
  public static final class Rest2grpcServiceStub extends io.grpc.stub.AbstractAsyncStub<Rest2grpcServiceStub> {
    private Rest2grpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Rest2grpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Rest2grpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void send(com.gutmox.Rest2grpcRequest request,
        io.grpc.stub.StreamObserver<com.gutmox.Rest2grpcReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class Rest2grpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<Rest2grpcServiceBlockingStub> {
    private Rest2grpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Rest2grpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Rest2grpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.gutmox.Rest2grpcReply send(com.gutmox.Rest2grpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Rest2grpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<Rest2grpcServiceFutureStub> {
    private Rest2grpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Rest2grpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Rest2grpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gutmox.Rest2grpcReply> send(
        com.gutmox.Rest2grpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Rest2grpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Rest2grpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((com.gutmox.Rest2grpcRequest) request,
              (io.grpc.stub.StreamObserver<com.gutmox.Rest2grpcReply>) responseObserver);
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

  private static abstract class Rest2grpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Rest2grpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.gutmox.Rest2grpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Rest2grpcService");
    }
  }

  private static final class Rest2grpcServiceFileDescriptorSupplier
      extends Rest2grpcServiceBaseDescriptorSupplier {
    Rest2grpcServiceFileDescriptorSupplier() {}
  }

  private static final class Rest2grpcServiceMethodDescriptorSupplier
      extends Rest2grpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Rest2grpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (Rest2grpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Rest2grpcServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
