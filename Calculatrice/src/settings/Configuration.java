package settings;

import model.Addition;
import model.Operation;
import model.Soustraction;

enum Op {
	ADDITION, SOUSTRACTION;
}

public class Configuration {
	
	Op op;
	
	public Configuration(Op ope) {
		this.op = ope;
	}

	public Operation configuration() {
		
		Operation o = new Addition();
		
		switch (this.op) 
		{
		case ADDITION: 
			return new Addition();
		case SOUSTRACTION:
			return new Soustraction();
        }	
		
		return o;
	}
	
}
