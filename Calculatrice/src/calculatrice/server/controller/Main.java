package calculatrice.server.controller;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ServerController server = new ServerController();
		server.startServer();
	}
	
}
