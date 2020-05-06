package calculatrice.server.operations;

import calculatrice.server.exception.CalculatriceException;
import calculatrice.utils.ExceptionEnum;

public class Division extends Operation {

	@Override
	public double calculate(double x, double y) throws CalculatriceException {
		
		if (y == 0) {
			throw new CalculatriceException(ExceptionEnum.DIVISION_BY_ZERO.getCode(), 
					                        ExceptionEnum.DIVISION_BY_ZERO.getDefaultMessage());
		}
		return x/y;
	}

}
