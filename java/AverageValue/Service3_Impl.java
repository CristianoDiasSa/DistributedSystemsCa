package AverageValue;

import AverageValue.AverageValueGrpc.AverageValueImplBase;
import io.grpc.stub.StreamObserver;

public class Service3_Impl extends AverageValueImplBase{

	@Override
	public StreamObserver<AverageRequest> average(StreamObserver<AverageResponse> responseObserver) {
		StreamObserver <AverageRequest> observerRequest = new StreamObserver<AverageRequest>() {
			int value = 0, sum = 0, count = 0;
			
			@Override
			public void onNext(AverageRequest value) {
				sum+= value.getRequest();
				count++;
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				float average = sum/count;
				responseObserver.onNext(AverageResponse.newBuilder().setResponse(average).build());
				responseObserver.onCompleted();
			}
			
		};
		return observerRequest;
	}

}
