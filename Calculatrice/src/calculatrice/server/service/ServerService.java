package calculatrice.server.service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import calculatrice.server.controller.Calculate;
import calculatrice.server.exception.CalculatriceException;
import calculatrice.model.OperationModel;

public class ServerService {
	private static final Logger LOGGER = Logger.getLogger(ServerService.class.getName());
	
	private static int PORT = 5000;
	private static ServerSocket server;
	
	public static void launch() throws IOException, ClassNotFoundException, CalculatriceException {
		server = new ServerSocket(PORT);
		LOGGER.log(Level.INFO, "Server running");
		
		while(true) {
			Socket socket = server.accept();
			LOGGER.log(Level.INFO, "Connection established");
			
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			
			OperationModel operation = (OperationModel) ois.readObject();
			LOGGER.log(Level.INFO, "Message received : " + operation);
			
			OperationModel result = Calculate.calculate(operation);
			
			oos.writeObject(result);
			LOGGER.log(Level.INFO, "Response sent : " + result);
		}
	}
}
