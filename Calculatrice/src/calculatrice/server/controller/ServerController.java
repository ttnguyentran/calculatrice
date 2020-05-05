package calculatrice.server.controller;

import java.io.IOException;

import calculatrice.server.service.*;

public class ServerController {
	
	public void startServer() throws ClassNotFoundException, IOException {
		ServerService.launch();
	}
	
}
