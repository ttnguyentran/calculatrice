package calculatrice.server.controller;

import calculatrice.server.exception.CalculatriceException;
import calculatrice.server.operations.Operation;
import calculatrice.utils.Factory;
import calculatrice.model.OperationModel;

public class Calculate {
	
	public static OperationModel calculate(OperationModel operationModel) throws CalculatriceException {
		Operation operation;
		try {
			operation = Factory.initOperation(operationModel.getOperation());
			operationModel.setResult(operation.calculate(operationModel.getFisrtOperand(), operationModel.getSecondOperand()));
		}
		catch (CalculatriceException e) {
			operationModel.setStatus("failed");
			operationModel.setErrorCode(e.getCode());
		}
		
		return operationModel;
	}
	
}
