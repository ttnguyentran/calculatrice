package calculatrice.server.operations;

import calculatrice.server.exception.CalculatriceException;

public abstract class Operation {
	
	public abstract double calculate(double x, double y) throws CalculatriceException;
	
	public Operation() {
		super();
	}
}
