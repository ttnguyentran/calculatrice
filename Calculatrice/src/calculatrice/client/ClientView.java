package calculatrice.client;

import java.io.IOException;
import java.util.Scanner;

import calculatrice.client.service.ClientSocket;
import calculatrice.model.OperationModel;

public class ClientView {
	
	private Scanner sc = new Scanner(System.in);
	private OperationModel operationModel;
	
	public void afficher() throws ClassNotFoundException, IOException {
		System.out.print("Veuillez saisir un nombre : ");
		double x = sc.nextDouble();
		System.out.print("operation (+ ou -) : ");
		char operation = sc.next().charAt(0);
		System.out.print("Veuillez saisir un autre nombre : ");
		double y = sc.nextDouble();
		
		this.operationModel = ClientSocket.call(new OperationModel(x, y, operation));
	}
	
	public void showResult() {
		System.out.println("Résultat : " + this.operationModel.getResult());
	}
}
