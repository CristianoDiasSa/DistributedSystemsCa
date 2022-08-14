package AverageValue;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.jmdns.ServiceInfo;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import jmDNS.SimpleServiceDiscovery;

public class Service3_client {
    private static AverageValueGrpc.AverageValueBlockingStub bStub;    

	public static void main(String[] args) throws InterruptedException {

		// jmdns
		ServiceInfo serviceInfo;
		String service_type = "_AverageValue._tcp.local.";
		serviceInfo = SimpleServiceDiscovery.run(service_type);
		
		// port & host
		int port = 5003;
		String host = "localhost";
				
    	// build a channel
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host , port)
				.usePlaintext()
				.build();
		
	
		

		doClientStreamingCall(channel);
		
		System.out.println("Shutting down channel");
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);

	}
	private static void doClientStreamingCall(ManagedChannel channel)
    {   
        //asynchronous client
    	System.out.println("Starting client streaming...");
        AverageValueGrpc.AverageValueStub asyncClient = AverageValueGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<AverageRequest> requestObsever = asyncClient.average(new StreamObserver<AverageResponse>() {
            @Override
            public void onNext(AverageResponse value)
            {
                System.out.println("Received a response from the server.");
                System.out.println("The average Read Value is: "+ value.getResponse());
            }
            @Override
            public void onError(Throwable t)
            {            }
            @Override
            public void onCompleted()
            {                
                latch.countDown();
            }

        });
        for (int i=0; i<10; i++) 
        {
        	int number = createRandomNumber(0, 10);
        	System.out.println("Sending the polution concentration sample of value "+number+" to server!");        	
            requestObsever.onNext(AverageRequest.newBuilder().setRequest(number).build());
        }        
        requestObsever.onCompleted();        
        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	public static int createRandomNumber(int min, int max) {
    	Random random = new Random();
    	int number = random.nextInt(max+1)+min;
    	return number;
    }
}