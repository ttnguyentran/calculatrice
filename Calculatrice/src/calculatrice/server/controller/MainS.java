package calculatrice.server.controller;

import java.io.IOException;

import calculatrice.server.exception.CalculatriceException;

public class MainS {
	
	public static void launch() throws ClassNotFoundException, IOException, CalculatriceException {
		ServerController server = new ServerController();
		server.startServer();
	}
	
}
