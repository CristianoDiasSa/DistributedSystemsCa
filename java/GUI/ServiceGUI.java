package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import airQualityService.Service1_client;
import airQualityService.Service1_server;
import airQualityService.airQualityServiceGrpc;
import airQualityService.airQualityServiceGrpc.airQualityServiceBlockingStub;
import airQualityService.requestQuality;
import airQualityService.responseByArea;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import jmDNS.SimpleServiceDiscovery;

import jmDNS.SimpleServiceRegistration;

import java.awt.Font;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ChangeListener;

import javax.swing.event.ChangeEvent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.SystemColor;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class ServiceGUI implements ActionListener{
	
	private static int qualityPort = 5000;

	
	public JLabel pmsDataId;
	public JLabel pmsDataStatus;
	public JLabel pmsDataIntensity;
	
	private JTextField entry1, reply1;
	private JTextField entry2, reply2;
	private JTextField entry3, reply3;
	
	private JPanel getService1JPanel() {
		JPanel panel = new JPanel();
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		
		// create an instance of a label
		JLabel label = new JLabel("Request a country name");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry1 = new JTextField("Ireland", 10);
		panel.add(entry1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 1");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply1 = new JTextField("", 10);
		reply1.setEditable(false);
		panel.add(reply1);
		panel.setLayout(boxlayout);
		
		return panel;
	}
	
	
	
	private JPanel closeJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.PAGE_AXIS);

		JButton button = new JButton("Exit");
		button.addActionListener(this);
		panel.add(button);

		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});

		panel.setLayout(boxlayout);
		return panel;
	}
	
// ---------------------------------------------------------------------------------------------- //


	public static void main(String[] args) throws InterruptedException, IOException {

		ServiceGUI gui = new ServiceGUI();
		gui.build();
		
	}
	private void build() {

		// create an instance of frame
		JFrame frame = new JFrame("Pollution Monitoring");

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.PAGE_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(100, 100, 100, 100)));

		panel.add(getService1JPanel());
		panel.add(closeJPanel());

		// Set size for the frame
		frame.setSize(420, 420);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();

		// make frame visible
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		JButton button = (JButton) e.getSource();
		String label = button.getActionCommand();
		
		if (label.equals("Invoke Service 1")) {	
			
			ManagedChannel channel = ManagedChannelBuilder
					.forAddress("localhost", qualityPort)
					.usePlaintext()
					.build();
			
			System.out.println(" ===================================================="
					+ "\n Ozone service to be invoked ...");
			
			airQualityServiceGrpc.airQualityServiceBlockingStub stub = airQualityServiceGrpc
					.newBlockingStub(channel);
			
			requestQuality request = requestQuality
					.newBuilder()
					.setCountry("Korea")
					.build();

			Iterator<responseByArea> responseIterator;

			try {
				responseIterator = stub.requestQualityService(request);
				reply1.setText("Ozone information of cities in : " + request.getCountry());
				// only last response is returned in gui
				for (int i = 1; responseIterator.hasNext(); i++) {
					responseByArea result = responseIterator.next();
					System.out.println("RESPONSE # " + i + ": " + result);
				}
			} catch (StatusRuntimeException e1) {
				// logInfo("RPC failed: {0}", e.getStatus());
				System.out.println("RPC failed: {0} " + e1.getStatus());
			}
			
			System.out.println("Ozone Service complete! "
					+ "\n ===============================================");

		
		} 

	}
}
	

				


