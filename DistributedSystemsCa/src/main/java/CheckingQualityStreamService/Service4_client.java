package CheckingQualityStreamService;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.jmdns.ServiceInfo;
import javax.swing.JOptionPane;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import jmDNS.SimpleServiceDiscovery;

public class Service4_client {   

	public static void main(String[] args) throws InterruptedException {

		// jmdns
		@SuppressWarnings("unused")
		ServiceInfo serviceInfo;
		String service_type = "_CheckingQualityStream._tcp.local.";
		String service_name = "GrpcServer";
		serviceInfo = SimpleServiceDiscovery.run(service_type);
		
		// port & host
		int port = 5004;
		String host = "localhost";
				
    	// build a channel
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host , port)
				.usePlaintext()
				.build();
		
		//Calling the BiDirectionalMethod
		doBidirectionalStreamCheck(channel);
		
		// Shutting down the client!
		System.out.println("Shutting down channel");
		channel.shutdown().awaitTermination(15, TimeUnit.SECONDS);
		
	}
	public static void doBidirectionalStreamCheck(ManagedChannel channel) {
    	System.out.println("Starting bidirectional streaming...");
        CheckingQualityStreamGrpc.CheckingQualityStreamStub stub = CheckingQualityStreamGrpc.newStub(channel);
		CountDownLatch latch = new CountDownLatch(1);

		StreamObserver<streamRequest> requestObserver =
			stub.requestingStream(new StreamObserver<streamResponse>() {
				@Override
				public void onNext(streamResponse response) {		
					JOptionPane.showMessageDialog(null, "Response from server: "+response);
				}

				@Override
				public void onError(Throwable t) {
				}

				@Override
				public void onCompleted() {
					latch.countDown();
				}
			});
		
		for (int i=0; i<5; i++) 
		{
        	int number = createRandomNumber(1, 13);
        	System.out.println("Sending sample "+number+" to server...");
            requestObserver.onNext(streamRequest.newBuilder()
            		.setSample(number).build());
        }    
		requestObserver.onCompleted();
		try {
			latch.await(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		channel.shutdownNow();
    }
    
    public static int createRandomNumber(int min, int max) {
    	Random random = new Random();
    	int number = random.nextInt(max+1)+min;
    	return number;
    }
}

    	
		
		
				

   

