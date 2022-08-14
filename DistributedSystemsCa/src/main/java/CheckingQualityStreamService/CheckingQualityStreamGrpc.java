package CheckingQualityStreamService;

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
    comments = "Source: CheckingQualityStream.proto")
public final class CheckingQualityStreamGrpc {

  private CheckingQualityStreamGrpc() {}

  public static final String SERVICE_NAME = "CheckingQualityStream.CheckingQualityStream";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CheckingQualityStreamService.streamRequest,
      CheckingQualityStreamService.streamResponse> getRequestingStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestingStream",
      requestType = CheckingQualityStreamService.streamRequest.class,
      responseType = CheckingQualityStreamService.streamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<CheckingQualityStreamService.streamRequest,
      CheckingQualityStreamService.streamResponse> getRequestingStreamMethod() {
    io.grpc.MethodDescriptor<CheckingQualityStreamService.streamRequest, CheckingQualityStreamService.streamResponse> getRequestingStreamMethod;
    if ((getRequestingStreamMethod = CheckingQualityStreamGrpc.getRequestingStreamMethod) == null) {
      synchronized (CheckingQualityStreamGrpc.class) {
        if ((getRequestingStreamMethod = CheckingQualityStreamGrpc.getRequestingStreamMethod) == null) {
          CheckingQualityStreamGrpc.getRequestingStreamMethod = getRequestingStreamMethod = 
              io.grpc.MethodDescriptor.<CheckingQualityStreamService.streamRequest, CheckingQualityStreamService.streamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CheckingQualityStream.CheckingQualityStream", "RequestingStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CheckingQualityStreamService.streamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CheckingQualityStreamService.streamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CheckingQualityStreamMethodDescriptorSupplier("RequestingStream"))
                  .build();
          }
        }
     }
     return getRequestingStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CheckingQualityStreamStub newStub(io.grpc.Channel channel) {
    return new CheckingQualityStreamStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CheckingQualityStreamBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CheckingQualityStreamBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CheckingQualityStreamFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CheckingQualityStreamFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class CheckingQualityStreamImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<CheckingQualityStreamService.streamRequest> requestingStream(
        io.grpc.stub.StreamObserver<CheckingQualityStreamService.streamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getRequestingStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRequestingStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                CheckingQualityStreamService.streamRequest,
                CheckingQualityStreamService.streamResponse>(
                  this, METHODID_REQUESTING_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CheckingQualityStreamStub extends io.grpc.stub.AbstractStub<CheckingQualityStreamStub> {
    private CheckingQualityStreamStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckingQualityStreamStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckingQualityStreamStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckingQualityStreamStub(channel, callOptions);
    }

    /**
     * <pre>
     * server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<CheckingQualityStreamService.streamRequest> requestingStream(
        io.grpc.stub.StreamObserver<CheckingQualityStreamService.streamResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getRequestingStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CheckingQualityStreamBlockingStub extends io.grpc.stub.AbstractStub<CheckingQualityStreamBlockingStub> {
    private CheckingQualityStreamBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckingQualityStreamBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckingQualityStreamBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckingQualityStreamBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CheckingQualityStreamFutureStub extends io.grpc.stub.AbstractStub<CheckingQualityStreamFutureStub> {
    private CheckingQualityStreamFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckingQualityStreamFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckingQualityStreamFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckingQualityStreamFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_REQUESTING_STREAM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CheckingQualityStreamImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CheckingQualityStreamImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUESTING_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.requestingStream(
              (io.grpc.stub.StreamObserver<CheckingQualityStreamService.streamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CheckingQualityStreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CheckingQualityStreamBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CheckingQualityStreamService.CheckingQualityStreamServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CheckingQualityStream");
    }
  }

  private static final class CheckingQualityStreamFileDescriptorSupplier
      extends CheckingQualityStreamBaseDescriptorSupplier {
    CheckingQualityStreamFileDescriptorSupplier() {}
  }

  private static final class CheckingQualityStreamMethodDescriptorSupplier
      extends CheckingQualityStreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CheckingQualityStreamMethodDescriptorSupplier(String methodName) {
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
      synchronized (CheckingQualityStreamGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CheckingQualityStreamFileDescriptorSupplier())
              .addMethod(getRequestingStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
