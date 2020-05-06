package calculatrice.server.controller;

import java.io.IOException;

import calculatrice.server.exception.CalculatriceException;
import calculatrice.server.service.*;

public class ServerController {
	
	public void startServer() throws ClassNotFoundException, IOException, CalculatriceException {
		ServerService.launch();
	}
	
}
