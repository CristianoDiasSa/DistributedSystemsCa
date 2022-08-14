package airQualityService;

import java.util.LinkedList;
import java.util.List;

import io.grpc.stub.StreamObserver;

public class Service1_Impl extends airQualityServiceGrpc.airQualityServiceImplBase {
	  

  @Override
  public void requestQualityService(requestQuality request, StreamObserver<responseByArea> responseObserver) {

	  LinkedList<responseByArea> Ireland = new LinkedList<responseByArea>();
	  
	  Ireland.add(responseByArea.newBuilder()
			  .setCity("Dublin")
			  .setIndex(5)
              .setBand("Very Good!")
              .setAdvice("Step outside and enjoy some fresh air!")
              .build());
	  
	  Ireland.add(responseByArea.newBuilder()
			  .setCity("Galway")
			  .setIndex(1)
              .setBand("Very Bad!")
              .setAdvice("Air humidity is low, stay close to water sources!.")
              .build());
	 
      for (int i = 0; i < 2; i++) {
    	  responseByArea stockQuote = responseByArea.newBuilder()
    			  .setCity(Ireland.get(i).getCity())
    			  .setIndex(Ireland.get(i).getIndex())
                  .setBand(Ireland.get(i).getBand())
                  .setAdvice(Ireland.get(i).getAdvice())
                  .build();

          responseObserver.onNext(stockQuote);
      }
      responseObserver.onCompleted();
  }
  
}