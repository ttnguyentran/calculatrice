package control;

import model.Operation;
import settings.Factory;
import view.View;

public class Controller {

	private static Operation model;
	private static View view;
	
	public void start() {
		view = new View();
		view.startAppli();
	}
	
	public static void checkOperation(double x, double y, String op) {
		model = Factory.initOperation(op);
		view.showResult(model.calculate(x, y));
	}
	
}
