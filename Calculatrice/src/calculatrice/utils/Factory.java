package calculatrice.utils;

import calculatrice.server.operations.Operation;


public class Factory {

	public static Operation initOperation(char ope) {
		
		Configuration config = new Configuration(ope);
		
		return config.configuration();
	}
	
}
