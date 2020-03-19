package unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		assertEquals(8.0, CalculatorOperations.add(4, 4));
		assertEquals(-4.0, CalculatorOperations.add(-8, 4));
		assertEquals(8.3, CalculatorOperations.add(3.7, 4.6));
	}

	@Test
	public void testSubtract() {
		assertEquals(5.0, CalculatorOperations.subtract(8, 3));
		assertEquals(-5.0, CalculatorOperations.subtract(-7, -2));
		assertEquals(5.3, CalculatorOperations.subtract(7.1, 1.8));
	}

	@Test
	public void testMultiply() {
		assertEquals(15.0, CalculatorOperations.multiply(5, 3));
		assertEquals(15.0, CalculatorOperations.multiply(-5, -3));
		assertEquals(1.5, CalculatorOperations.multiply(3, 0.5));
	}

	@Test
	public void testDivide() {
		assertEquals(15, CalculatorOperations.divide(15, 0));
		assertEquals(3, CalculatorOperations.divide(15, 5));
		assertEquals(3, CalculatorOperations.divide(-15, -5));
		assertEquals(6, CalculatorOperations.divide(3, 0.5));
	}
}