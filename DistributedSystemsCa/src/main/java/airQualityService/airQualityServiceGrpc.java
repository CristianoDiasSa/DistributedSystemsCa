package airQualityService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: airQuality.proto")
public final class airQualityServiceGrpc {

  private airQualityServiceGrpc() {}

  public static final String SERVICE_NAME = "airQuality.airQualityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<airQualityService.requestQuality,
      airQualityService.responseByArea> getRequestQualityServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "requestQualityService",
      requestType = airQualityService.requestQuality.class,
      responseType = airQualityService.responseByArea.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<airQualityService.requestQuality,
      airQualityService.responseByArea> getRequestQualityServiceMethod() {
    io.grpc.MethodDescriptor<airQualityService.requestQuality, airQualityService.responseByArea> getRequestQualityServiceMethod;
    if ((getRequestQualityServiceMethod = airQualityServiceGrpc.getRequestQualityServiceMethod) == null) {
      synchronized (airQualityServiceGrpc.class) {
        if ((getRequestQualityServiceMethod = airQualityServiceGrpc.getRequestQualityServiceMethod) == null) {
          airQualityServiceGrpc.getRequestQualityServiceMethod = getRequestQualityServiceMethod = 
              io.grpc.MethodDescriptor.<airQualityService.requestQuality, airQualityService.responseByArea>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "airQuality.airQualityService", "requestQualityService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  airQualityService.requestQuality.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  airQualityService.responseByArea.getDefaultInstance()))
                  .setSchemaDescriptor(new airQualityServiceMethodDescriptorSupplier("requestQualityService"))
                  .build();
          }
        }
     }
     return getRequestQualityServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static airQualityServiceStub newStub(io.grpc.Channel channel) {
    return new airQualityServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static airQualityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new airQualityServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static airQualityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new airQualityServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class airQualityServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * server
     * </pre>
     */
    public void requestQualityService(airQualityService.requestQuality request,
        io.grpc.stub.StreamObserver<airQualityService.responseByArea> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestQualityServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRequestQualityServiceMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                airQualityService.requestQuality,
                airQualityService.responseByArea>(
                  this, METHODID_REQUEST_QUALITY_SERVICE)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class airQualityServiceStub extends io.grpc.stub.AbstractStub<airQualityServiceStub> {
    private airQualityServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private airQualityServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected airQualityServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new airQualityServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * server
     * </pre>
     */
    public void requestQualityService(airQualityService.requestQuality request,
        io.grpc.stub.StreamObserver<airQualityService.responseByArea> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getRequestQualityServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class airQualityServiceBlockingStub extends io.grpc.stub.AbstractStub<airQualityServiceBlockingStub> {
    private airQualityServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private airQualityServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected airQualityServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new airQualityServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * server
     * </pre>
     */
    public java.util.Iterator<airQualityService.responseByArea> requestQualityService(
        airQualityService.requestQuality request) {
      return blockingServerStreamingCall(
          getChannel(), getRequestQualityServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class airQualityServiceFutureStub extends io.grpc.stub.AbstractStub<airQualityServiceFutureStub> {
    private airQualityServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private airQualityServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected airQualityServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new airQualityServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_REQUEST_QUALITY_SERVICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final airQualityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(airQualityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST_QUALITY_SERVICE:
          serviceImpl.requestQualityService((airQualityService.requestQuality) request,
              (io.grpc.stub.StreamObserver<airQualityService.responseByArea>) responseObserver);
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

  private static abstract class airQualityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    airQualityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return airQualityService.airQualityServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("airQualityService");
    }
  }

  private static final class airQualityServiceFileDescriptorSupplier
      extends airQualityServiceBaseDescriptorSupplier {
    airQualityServiceFileDescriptorSupplier() {}
  }

  private static final class airQualityServiceMethodDescriptorSupplier
      extends airQualityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    airQualityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (airQualityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new airQualityServiceFileDescriptorSupplier())
              .addMethod(getRequestQualityServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
