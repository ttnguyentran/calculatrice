package calculatrice.client.service;

import java.net.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;

import calculatrice.model.OperationModel;

import java.io.*; 

public class ClientSocket {
	
	//private static final Logger LOGGER = Logger.getLogger(ClientSocket.class.getName());
	
	private static int PORT = 5000;
	
	public static OperationModel call(OperationModel operation) throws IOException, ClassNotFoundException {
		InetAddress host = InetAddress.getLocalHost();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		Socket socket = new Socket(host.getHostName(), PORT);
		
		oos = new ObjectOutputStream(socket.getOutputStream());
		//LOGGER.log(Level.INFO, "Connection to server established");
		
		//LOGGER.log(Level.INFO, "Sending request to Socket Server");
		oos.writeObject(operation);
		
		ois = new ObjectInputStream(socket.getInputStream());
		OperationModel result = (OperationModel) ois.readObject();
		//LOGGER.log(Level.INFO, "Received response : " + result);
		
		socket.close();
		
		return result;
	}
}
