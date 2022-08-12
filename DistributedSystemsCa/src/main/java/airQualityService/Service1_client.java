package airQualityService;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import javax.jmdns.ServiceInfo;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import jmDNS.SimpleServiceDiscovery;
import jmDNS.SimpleServiceRegistration;
import airQualityService.airQualityServiceGrpc.airQualityServiceBlockingStub;


public class Service1_client {
    private static airQualityServiceGrpc.airQualityServiceBlockingStub bStub;    

	public static void main(String[] args) throws InterruptedException {

		// jmdns
		ServiceInfo serviceInfo;
		String service_type = "_airQuality._tcp.local.";
		serviceInfo = SimpleServiceDiscovery.run(service_type);
		
		// port & host
		int port = 5000;
		String host = "localhost";
				
    	// build a channel
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host , port)
				.usePlaintext()
				.build();
		
		// stub
		bStub = airQualityServiceGrpc.newBlockingStub(channel);

		method_1();
		
		System.out.println("Shutting down channel");
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);

	}
    
    // method_1
    public static void method_1() {
    	// GUI
		JFrame f;
		f = new JFrame();
		
		// method 1.				
		int a = JOptionPane.showConfirmDialog(f,
				"Air Quality Service\nWe have information about Dublin and Galway air conditions\n"
				+ "Would you like to know them? ");
		if (a != JOptionPane.YES_OPTION) {
			return;
		}
		
		requestQuality request = requestQuality.newBuilder().setCountry("Ireland").build();
		Iterator<responseByArea> response;

		try {
			response = bStub.requestQualityService(request);
			for(int i = 1; response.hasNext(); i++) {
				responseByArea result = response.next();
				JOptionPane.showMessageDialog(f, "RESPONSE # " + i + " : " + result);
				System.out.println("RESPONSE # " + i + " : " + result);
			}			
		} catch (StatusRuntimeException e) {
			// logInfo("RPC failed: {0}", e.getStatus());
			System.out.println("RPC failed: {0} " + e.getStatus());
			return;
		}
				
    }
    
}

