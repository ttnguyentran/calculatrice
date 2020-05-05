package calculatrice.server.operations;

public class Addition extends Operation {

	@Override
	public double calculate(double x, double y) {
		return x + y;
	}
}
