package CheckingQualityStreamService;

import CheckingQualityStreamService.CheckingQualityStreamGrpc.CheckingQualityStreamImplBase;
import io.grpc.stub.StreamObserver;

public class Service4_Impl extends CheckingQualityStreamImplBase {

	@Override
	public StreamObserver<streamRequest> requestingStream(StreamObserver<streamResponse> responseObserver) {
		return new StreamObserver<streamRequest>() {
			@Override
			public void onNext(streamRequest request) {
				double singleSample = request.getSample();
				String rate = sampleClassification((int) singleSample);
				streamResponse response = streamResponse.newBuilder().setResponse(rate).build();			    
                responseObserver.onNext(response);
			}

			@Override
			public void onError(Throwable t) {
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();				
			}
		};
    }

    //Creating a random method to generate random heart rate.
    public static double randomSamples(double min, double max)
    {   double singleSample =((Math.random()*((max-min)+1))+min);
        return singleSample;
    }
    
    public static String sampleClassification(double singleSample) 
    {
    	if (singleSample <= 5){	
    		return singleSample +  ", This is an acid sample, not proper for human consumption!";
    		
    	} else if (singleSample > 5 && singleSample<=7){ 
        	return singleSample + ", This is a neutral sample, will not do any harm, but you can find better ones!";
        
    	} else if (singleSample > 7){ 
    	return singleSample + ", This is an alcaline sample, ideal for human consumption!";
    }
    	return null;
    }
    }


