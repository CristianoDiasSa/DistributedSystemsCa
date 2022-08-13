package CheckingQuality;

import CheckingQuality.CheckingQualityGrpc.CheckingQualityImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;
import jmDNS.SimpleServiceRegistration;
public class Service2_server extends CheckingQualityImplBase {


	private static final ServerServiceDefinition Service2_Impl = null;


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
	
	/*
	@Override
	public void checking(CheckingRequest request, StreamObserver<CheckingResponse> responseObserver) {
		int number = request.getNumber();
		CheckingResponse.Builder response = CheckingResponse.newBuilder();
		if(	number >= 7) {
			response.setResponse("This sample is not good for consumption!");
		}else {
			response.setResponse("This sample is good for consumption!");
		}

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
*/
	}

