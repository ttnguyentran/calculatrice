package calculatrice.client;

import java.io.IOException;

public class MainC {

	public static void launch() throws ClassNotFoundException, IOException {
		ClientView view = new ClientView();
		ClientController client = new ClientController(view);
		client.showCalculatrice();
		client.showResult();
	}
	
}
