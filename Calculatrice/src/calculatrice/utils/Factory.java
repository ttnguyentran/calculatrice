package calculatrice.utils;

import calculatrice.server.exception.CalculatriceException;
import calculatrice.server.operations.Operation;


public class Factory {

	public static Operation initOperation(char ope) throws CalculatriceException {
		
		Configuration config = new Configuration(ope);
		
		return config.configuration();
	}
	
}
