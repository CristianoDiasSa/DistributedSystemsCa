package CheckingQuality;

import CheckingQuality.CheckingQualityGrpc.CheckingQualityImplBase;
import io.grpc.stub.StreamObserver;

public class Service2_Impl extends CheckingQualityImplBase{

	@Override
	public void checking(CheckingRequest request, StreamObserver<CheckingResponse> responseObserver) {
		int number = request.getNumber();
		CheckingResponse.Builder response = CheckingResponse.newBuilder();
		
		if(	number >= 7) {
			response.setResponse("This sample is not good for consumption!");
		}else {
			response.setResponse("This sample is good for consumption!");
		}

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();

	}
	}
