package airQualityService;

import java.util.LinkedList;
import java.util.List;

import io.grpc.stub.StreamObserver;

public class Service1_Impl extends airQualityServiceGrpc.airQualityServiceImplBase {
	  
  @Override
  public void requestQualityService(requestQuality request, StreamObserver<responseByArea> responseObserver) {

	  LinkedList<responseByArea> Ireland = new LinkedList<responseByArea>();
	  
	  Ireland.add(responseByArea.newBuilder()
			  .setCity("")
			  .setIndex(0)
              .setBand("")
              .setAdvice("")
              .build());
	  
	  Ireland.add(responseByArea.newBuilder()
			  .setCity("")
			  .setIndex(0)
              .setBand("")
              .setAdvice("")
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