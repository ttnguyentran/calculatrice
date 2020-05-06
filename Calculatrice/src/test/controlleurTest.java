package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calculatrice.model.OperationModel;
import calculatrice.server.controller.Calculate;
import calculatrice.server.exception.CalculatriceException;
import calculatrice.server.operations.Multiplication;

public class controlleurTest {
	
	@Test
	public void testCalculateOk() throws CalculatriceException {
	Calculate control = new Calculate();
	OperationModel opModel = new OperationModel(Double.valueOf(4),Double.valueOf(5), '*');
	OperationModel opModel1 =control.calculate(opModel);
	Class<Multiplication> class1 = Multiplication.class;
	assertTrue(opModel1.equals(class1));
	assertEquals(opModel.getResult(), Double.valueOf(20));
}
}