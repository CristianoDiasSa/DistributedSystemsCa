package CheckingQuality;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.jmdns.ServiceInfo;

import CheckingQuality.CheckingQualityGrpc.CheckingQualityBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import jmDNS.SimpleServiceDiscovery;


public class Service2_client {
    private static CheckingQualityBlockingStub bStub;    

	public static void main(String[] args) throws InterruptedException {

		// jmdns
		ServiceInfo serviceInfo;
		String service_type = "_CheckingQuality._tcp.local.";
		String service_name = "GrpcServer";
		serviceInfo = SimpleServiceDiscovery.run(service_type);
		
		// port & host
		int port = 5002;
		String host = "localhost";
				
    	// build a channel
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host , port)
				.usePlaintext()
				.build();
		
		// stub
		bStub = CheckingQualityGrpc.newBlockingStub(channel);
		
		
		
		System.out.println("Please enteder the sample concentration!");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		CheckingRequest request = CheckingRequest.newBuilder().setNumber(value).build();
		CheckingResponse Response = bStub.checking(request);
		System.out.println(Response.getResponse());
		
		System.out.println("Shutting down channel");
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		}
	}

	
    


    	
		
		
				

   

