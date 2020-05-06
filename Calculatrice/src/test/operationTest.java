package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import calculatrice.server.exception.CalculatriceException;
import calculatrice.server.operations.Addition;
import calculatrice.server.operations.Division;
import calculatrice.server.operations.Multiplication;
import calculatrice.server.operations.Soustraction;

public class operationTest {


	@Test
	public void testAddition() {
		Addition add = new Addition ();
		
		assertEquals(add.calculate(3.0, 5.0), 8.0);
	}
	@Test
	public void testSoustraction() {
		Soustraction resultSous =  new Soustraction();
		assertEquals(resultSous.calculate(3.0, 5.0), -2.0);
	}
	@Test
	public void testMultiplication() {
		Multiplication resultMult = new Multiplication();
		assertEquals(resultMult.calculate(3.0, 5.0), 15.0);
	}
	@Test
	public void testDivision() throws CalculatriceException {
		Division resultDiv =new Division();
		assertEquals(resultDiv.calculate(15.0, 5.0), 3.0);
	}
	
	@Test(expected=CalculatriceException.class)
	public void testDivisionByZero() throws CalculatriceException{
		Division resultDiv =new Division();
		assertEquals(resultDiv.calculate(15.0, 0.0), 3.0);
	}
	
}
