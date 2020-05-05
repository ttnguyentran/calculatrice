package calculatrice.server.controller;

import calculatrice.server.operations.Operation;
import calculatrice.utils.Factory;
import calculatrice.model.OperationModel;

public class Calculate {
	
	public static OperationModel calculate(OperationModel operation) {
		Operation model = Factory.initOperation(operation.getOperation());
		operation.setResult(model.calculate(operation.getFisrtOperand(), operation.getSecondOperand()));
		return operation;
	}
	
}
