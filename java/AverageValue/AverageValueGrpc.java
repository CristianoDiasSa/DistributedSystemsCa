package AverageValue;

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
    comments = "Source: AverageValue.proto")
public final class AverageValueGrpc {

  private AverageValueGrpc() {}

  public static final String SERVICE_NAME = "AverageValueImpl.AverageValue";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<AverageValue.AverageRequest,
      AverageValue.AverageResponse> getAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Average",
      requestType = AverageValue.AverageRequest.class,
      responseType = AverageValue.AverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<AverageValue.AverageRequest,
      AverageValue.AverageResponse> getAverageMethod() {
    io.grpc.MethodDescriptor<AverageValue.AverageRequest, AverageValue.AverageResponse> getAverageMethod;
    if ((getAverageMethod = AverageValueGrpc.getAverageMethod) == null) {
      synchronized (AverageValueGrpc.class) {
        if ((getAverageMethod = AverageValueGrpc.getAverageMethod) == null) {
          AverageValueGrpc.getAverageMethod = getAverageMethod = 
              io.grpc.MethodDescriptor.<AverageValue.AverageRequest, AverageValue.AverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AverageValueImpl.AverageValue", "Average"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AverageValue.AverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AverageValue.AverageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AverageValueMethodDescriptorSupplier("Average"))
                  .build();
          }
        }
     }
     return getAverageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AverageValueStub newStub(io.grpc.Channel channel) {
    return new AverageValueStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AverageValueBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AverageValueBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AverageValueFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AverageValueFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class AverageValueImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<AverageValue.AverageRequest> average(
        io.grpc.stub.StreamObserver<AverageValue.AverageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAverageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAverageMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                AverageValue.AverageRequest,
                AverageValue.AverageResponse>(
                  this, METHODID_AVERAGE)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AverageValueStub extends io.grpc.stub.AbstractStub<AverageValueStub> {
    private AverageValueStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AverageValueStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AverageValueStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AverageValueStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<AverageValue.AverageRequest> average(
        io.grpc.stub.StreamObserver<AverageValue.AverageResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAverageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AverageValueBlockingStub extends io.grpc.stub.AbstractStub<AverageValueBlockingStub> {
    private AverageValueBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AverageValueBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AverageValueBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AverageValueBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AverageValueFutureStub extends io.grpc.stub.AbstractStub<AverageValueFutureStub> {
    private AverageValueFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AverageValueFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AverageValueFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AverageValueFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_AVERAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AverageValueImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AverageValueImplBase serviceImpl, int methodId) {
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
        case METHODID_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.average(
              (io.grpc.stub.StreamObserver<AverageValue.AverageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AverageValueBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AverageValueBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return AverageValue.AverageValueImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AverageValue");
    }
  }

  private static final class AverageValueFileDescriptorSupplier
      extends AverageValueBaseDescriptorSupplier {
    AverageValueFileDescriptorSupplier() {}
  }

  private static final class AverageValueMethodDescriptorSupplier
      extends AverageValueBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AverageValueMethodDescriptorSupplier(String methodName) {
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
      synchronized (AverageValueGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AverageValueFileDescriptorSupplier())
              .addMethod(getAverageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
