package calculatrice.client;

import java.io.IOException;

import calculatrice.client.service.ClientSocket;
import calculatrice.server.operations.Operation;
import calculatrice.model.OperationModel;

public class ClientController {
	
	private ClientView view;
	private OperationModel operationModel;
	
	public ClientController(ClientView view) {
		super();
		this.view = view;
	}
	
	public void showCalculatrice() throws ClassNotFoundException, IOException {
		view.afficher();
	}
	
	public void showResult() {
		view.showResult();
	}
}
