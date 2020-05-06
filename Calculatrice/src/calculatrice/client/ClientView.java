package calculatrice.client;

import java.io.IOException;
import java.util.Scanner;

import calculatrice.client.service.ClientSocket;
import calculatrice.model.OperationModel;
import calculatrice.utils.ApplicationProperties;

public class ClientView {
	
	private Scanner sc = new Scanner(System.in);
	private OperationModel operationModel;
	
	public void afficher() throws ClassNotFoundException, IOException {
		
		String lang="FR";
		if(lang.equals("FR"))
			ApplicationProperties.getInstance("src/main/ressources/messages_fr.properties");
		else if (lang.equals("EN"))
			ApplicationProperties.getInstance("src/main/ressources/messages_en.properties");
		
		
		System.out.print(ApplicationProperties.readProperty("FIRST_INPUT", ""));
		double x = sc.nextDouble();
		System.out.print(ApplicationProperties.readProperty("CHOICE_OPERATER", ""));
		char operation = sc.next().charAt(0);
		System.out.print(ApplicationProperties.readProperty("SECOND_INPUT", ""));
		double y = sc.nextDouble();
		
		this.operationModel = ClientSocket.call(new OperationModel(x, y, operation));
	}
	
	public void showResult() {
		System.out.println("Résultat : " + this.operationModel.getResult());
	}
}
