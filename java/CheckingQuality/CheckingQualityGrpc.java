package CheckingQuality;

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
    comments = "Source: CheckingQuality.proto")
public final class CheckingQualityGrpc {

  private CheckingQualityGrpc() {}

  public static final String SERVICE_NAME = "CheckingQuality.CheckingQuality";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CheckingQuality.CheckingRequest,
      CheckingQuality.CheckingResponse> getCheckingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Checking",
      requestType = CheckingQuality.CheckingRequest.class,
      responseType = CheckingQuality.CheckingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CheckingQuality.CheckingRequest,
      CheckingQuality.CheckingResponse> getCheckingMethod() {
    io.grpc.MethodDescriptor<CheckingQuality.CheckingRequest, CheckingQuality.CheckingResponse> getCheckingMethod;
    if ((getCheckingMethod = CheckingQualityGrpc.getCheckingMethod) == null) {
      synchronized (CheckingQualityGrpc.class) {
        if ((getCheckingMethod = CheckingQualityGrpc.getCheckingMethod) == null) {
          CheckingQualityGrpc.getCheckingMethod = getCheckingMethod = 
              io.grpc.MethodDescriptor.<CheckingQuality.CheckingRequest, CheckingQuality.CheckingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CheckingQuality.CheckingQuality", "Checking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CheckingQuality.CheckingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CheckingQuality.CheckingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CheckingQualityMethodDescriptorSupplier("Checking"))
                  .build();
          }
        }
     }
     return getCheckingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CheckingQualityStub newStub(io.grpc.Channel channel) {
    return new CheckingQualityStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CheckingQualityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CheckingQualityBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CheckingQualityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CheckingQualityFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class CheckingQualityImplBase implements io.grpc.BindableService {

    /**
     */
    public void checking(CheckingQuality.CheckingRequest request,
        io.grpc.stub.StreamObserver<CheckingQuality.CheckingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CheckingQuality.CheckingRequest,
                CheckingQuality.CheckingResponse>(
                  this, METHODID_CHECKING)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CheckingQualityStub extends io.grpc.stub.AbstractStub<CheckingQualityStub> {
    private CheckingQualityStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckingQualityStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckingQualityStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckingQualityStub(channel, callOptions);
    }

    /**
     */
    public void checking(CheckingQuality.CheckingRequest request,
        io.grpc.stub.StreamObserver<CheckingQuality.CheckingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CheckingQualityBlockingStub extends io.grpc.stub.AbstractStub<CheckingQualityBlockingStub> {
    private CheckingQualityBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckingQualityBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckingQualityBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckingQualityBlockingStub(channel, callOptions);
    }

    /**
     */
    public CheckingQuality.CheckingResponse checking(CheckingQuality.CheckingRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckingMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CheckingQualityFutureStub extends io.grpc.stub.AbstractStub<CheckingQualityFutureStub> {
    private CheckingQualityFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckingQualityFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckingQualityFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckingQualityFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CheckingQuality.CheckingResponse> checking(
        CheckingQuality.CheckingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECKING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CheckingQualityImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CheckingQualityImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECKING:
          serviceImpl.checking((CheckingQuality.CheckingRequest) request,
              (io.grpc.stub.StreamObserver<CheckingQuality.CheckingResponse>) responseObserver);
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

  private static abstract class CheckingQualityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CheckingQualityBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CheckingQuality.CheckingQualityImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CheckingQuality");
    }
  }

  private static final class CheckingQualityFileDescriptorSupplier
      extends CheckingQualityBaseDescriptorSupplier {
    CheckingQualityFileDescriptorSupplier() {}
  }

  private static final class CheckingQualityMethodDescriptorSupplier
      extends CheckingQualityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CheckingQualityMethodDescriptorSupplier(String methodName) {
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
      synchronized (CheckingQualityGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CheckingQualityFileDescriptorSupplier())
              .addMethod(getCheckingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
