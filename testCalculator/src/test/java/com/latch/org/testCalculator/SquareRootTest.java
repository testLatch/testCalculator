package com.latch.org.testCalculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SquareRootTest {

	

	@Test
	public void TestSquareRoot1() {
		assertEquals(5.0, AppLogic.SquareRoot(25.00));
	}

	@Test
	public void TestSquareRoot2() {
		assertEquals(3.872983346207417, AppLogic.SquareRoot(15.00));
	}

	@Test
	public void TestSquareRoot3() {
		assertEquals(Double.NaN, AppLogic.SquareRoot(-25.00));
	}

	@Test
	public void TestSquareRoot4() {
		assertEquals(0.0, AppLogic.SquareRoot(00.00));
	}

	@Test
	public void TestSquareRoot5() {
		assertEquals(1.0, AppLogic.SquareRoot(1.00));
	}

	@Test
	public void TestSquareRoot6() {
		assertEquals(1.0E46, AppLogic.SquareRoot(
				99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.00));
	}
	

}
