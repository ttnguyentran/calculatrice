package settings;

import model.Operation;


public class Factory {

	public static Operation initOperation(String ope) {
		
		Configuration config = new Configuration(Op.valueOf(ope));
		
		return config.configuration();
	}
	
}
