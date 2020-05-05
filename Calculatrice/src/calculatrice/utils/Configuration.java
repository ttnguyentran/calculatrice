package calculatrice.utils;

import calculatrice.server.operations.Addition;
import calculatrice.server.operations.Operation;
import calculatrice.server.operations.Soustraction;


public class Configuration {
	
	char op;
	
	public Configuration(char ope) {
		this.op = ope;
	}

	public Operation configuration() {
		
		Operation o = new Addition();
		
		switch (this.op) 
		{
		case '+': 
			return new Addition();
		case '-':
			return new Soustraction();
        }	
		
		return o;
	}
	
}
