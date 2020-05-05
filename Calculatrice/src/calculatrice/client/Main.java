package calculatrice.client;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ClientView view = new ClientView();
		ClientController client = new ClientController(view);
		client.showCalculatrice();
		client.showResult();
	}
	
}
