package CheckingQuality;

import CheckingQuality.CheckingQualityGrpc.CheckingQualityImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import jmDNS.SimpleServiceRegistration;
public class Service2_server extends CheckingQualityImplBase {

	public static void main(String[] args) {
		Service2_server server2 = new Service2_server();

    	System.out.println("Starting gRPC Checking Quality service server.");
    	
    	//Define the port
		int port = 5002;
		
		// jmDNS
		String service_type = "_CheckingQuality._tcp.local.";
		String service_name = "GrpcServer";
		SimpleServiceRegistration ssr = new SimpleServiceRegistration();
		ssr.run(port, service_type, service_name);

		try {		
			Server server = ServerBuilder.forPort(port)
					.addService(new Service2_Impl())
					.build()
					.start();
			System.out.println("Server started, listening on " + port);
			server.awaitTermination();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}

