package settings;

import model.Addition;
import model.Operation;
import model.Soustraction;

enum Op {
	ADD, SUBSTRACT;
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
		case ADD: 
			return new Addition();
		case SUBSTRACT:
			return new Soustraction();
        }	
		
		return o;
	}
	
}
