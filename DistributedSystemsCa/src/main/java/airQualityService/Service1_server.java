package airQualityService;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import jmDNS.SimpleServiceRegistration;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;
import airQualityService.airQualityServiceGrpc.airQualityServiceBlockingStub;
import airQualityService.airQualityServiceGrpc.airQualityServiceImplBase;



public class Service1_server extends airQualityServiceImplBase{
	
    public static void main(String[] args) throws IOException, InterruptedException {
    	
    	// get a reference to the server
    	Service1_server service1 = new Service1_server();	
    	System.out.println("Starting gRPC Air Quality service server.");
    	
    	//Define the port
		int port = 5000;
		
		// jmDNS
		String service_type = "_AirQuality._tcp.local.";
		String service_name = "GrpcServer";
		SimpleServiceRegistration ssr = new SimpleServiceRegistration();
		ssr.run(port, service_type, service_name);
		
		try {		
			Server server = ServerBuilder.forPort(port)
					.addService(new Service1_Impl())
					.build()
					.start();
			System.out.println("Server started, listening on " + port);
			server.awaitTermination();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}

}



