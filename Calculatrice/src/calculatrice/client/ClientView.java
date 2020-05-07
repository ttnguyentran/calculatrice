package calculatrice.client;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import calculatrice.client.service.ClientSocket;
import calculatrice.model.OperationModel;
import calculatrice.utils.ApplicationProperties;
import calculatrice.utils.ExceptionEnum;

public class ClientView {

	private OperationModel result;

	public void afficher() throws ClassNotFoundException, IOException {
		while (true) {
			try {
				@SuppressWarnings("resource")
				String lang="EN";
				if(lang.equals("FR"))
					ApplicationProperties.getInstance("src/main/ressources/messages_fr.properties");
				else if (lang.equals("EN"))
					ApplicationProperties.getInstance("src/main/ressources/messages_en.properties");
				Scanner sc = new Scanner(System.in);
				
				System.out.print(ApplicationProperties.readProperty("FIRST_INPUT", "Choose a first number "));
				double x = sc.nextDouble();
				
				System.out.print(ApplicationProperties.readProperty("CHOICE_OPERATER", "What operation ? (+, -, /, *) "));
				char operation = sc.next().charAt(0);
				
				System.out.print(ApplicationProperties.readProperty("SECOND_INPUT", "Input a second number "));
				double y = sc.nextDouble();

				try {
					this.result = ClientSocket.call(new OperationModel(x, y, operation));
					if (null != result.getStatus() && result.getStatus().equals("failed")) {
						System.out.println((ApplicationProperties.readProperty("RESULT", "result : ")) + ApplicationProperties.readProperty(
								ExceptionEnum.getNameFromCode(result.getErrorCode()),
								ExceptionEnum.getNameFromCode(result.getErrorCode())));
					} else {
						System.out.println((ApplicationProperties.readProperty("RESULT", "result : ")) + result.getResult());
					}
				} catch (ClassNotFoundException | IOException e) {
					System.out.println(ApplicationProperties.readProperty(
							ExceptionEnum.getNameFromCode(ExceptionEnum.SERVER_ERROR.getCode()),
							ExceptionEnum.SERVER_ERROR.getDefaultMessage()));
					
				}
			} catch (InputMismatchException e) {
				System.out.println(ApplicationProperties.readProperty(
						ExceptionEnum.getNameFromCode(ExceptionEnum.INPUT_MISMATCH.getCode()),
						ExceptionEnum.INPUT_MISMATCH.getDefaultMessage()));
			}
		}
	}

	public void showResult() {
		System.out.println((ApplicationProperties.readProperty("RESULT", "result : "))+ this.result.getResult());
	}
}
