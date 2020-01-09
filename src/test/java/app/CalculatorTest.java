package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test1() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.add(4, 5), 9);
	}

	@Test
	public void test2() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.add(3, 5, 7), 15);
	}

	@Test
	public void test3() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.add(1, 2), 3);
	}
}
