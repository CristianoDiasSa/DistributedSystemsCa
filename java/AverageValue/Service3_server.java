package AverageValue;

import AverageValue.AverageValueGrpc.AverageValueImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import jmDNS.SimpleServiceRegistration;
public class Service3_server extends AverageValueImplBase {

	public static void main(String[] args) {
		Service3_server server3 = new Service3_server();

    	System.out.println("Starting gRPC Average Value service server.");
    	
    	//Define the port
		int port = 5003;
		
		// jmDNS
		String service_type = "_AverageValue._tcp.local.";
		String service_name = "GrpcServer";
		SimpleServiceRegistration ssr = new SimpleServiceRegistration();
		ssr.run(port, service_type, service_name);

		try {		
			Server server = ServerBuilder.forPort(port)
					.addService(new Service3_Impl())
					.build()
					.start();
			System.out.println("Server started, listening on " + port);
			server.awaitTermination();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}