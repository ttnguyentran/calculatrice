package main;

import java.io.IOException;

import calculatrice.client.MainC;
import calculatrice.server.controller.ServerController;

import calculatrice.server.exception.CalculatriceException;
import calculatrice.utils.ApplicationProperties;
import calculatrice.utils.ExceptionEnum;

/**
 * 
 * @author Thien Thanh NGUYEN TRAN
 * @author Narjess ZAYATI
 *
 */
	
	public class App {
		
		public static void main(String[] args) {
			String lang="FR";
			if(lang.equals("FR"))
				ApplicationProperties.getInstance("src/main/ressources/messages_fr.properties");
			else if (lang.equals("EN"))
				ApplicationProperties.getInstance("src/main/ressources/messages_en.properties");
			ServerController controller = new ServerController();
			
			new Thread(new Runnable() {
				public void run() {
					try {
							controller.startServer();
							
					} catch (CalculatriceException e) {
						System.out.println(ApplicationProperties.readProperty
								(ExceptionEnum.getNameFromCode(e.getCode()),e.getDefaultMessage()));
					}catch(ClassNotFoundException | IOException e) {
						}}
				
			}).start();
		
		new Thread(new Runnable() {
			public void run() {
					try {
						MainC.launch();
					}catch(ClassNotFoundException | IOException e) {
						System.out.println(ApplicationProperties.readProperty
									(ExceptionEnum.getNameFromCode(ExceptionEnum.SERVER_ERROR.getCode()),ExceptionEnum.SERVER_ERROR.getDefaultMessage()));
				}
			}}
		).start();
	
	}
	}