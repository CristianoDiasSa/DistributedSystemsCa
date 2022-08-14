package CheckingQualityStreamService;



import CheckingQualityStreamService.CheckingQualityStreamGrpc.CheckingQualityStreamImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import jmDNS.SimpleServiceRegistration;

public class Service4_server extends CheckingQualityStreamImplBase {

	public static void main(String[] args) {
		Service4_server server4 = new Service4_server();

    	System.out.println("Starting gRPC Checking Quality Stream service server.");
    	
    	//Define the port
		int port = 5004;
		
		// jmDNS
		String service_type = "_CheckingQualityStreamService._tcp.local.";
		String service_name = "GrpcServer";
		SimpleServiceRegistration ssr = new SimpleServiceRegistration();
		ssr.run(port, service_type, service_name);

		try {		
			Server server = ServerBuilder.forPort(port)
					.addService(new Service4_Impl())
					.build()
					.start();
			System.out.println("Server started, listening on " + port);
			server.awaitTermination();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}

