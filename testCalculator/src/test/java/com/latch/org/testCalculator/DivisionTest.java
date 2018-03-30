package com.latch.org.testCalculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DivisionTest {

	@Test
	public void TestDivision1() {
		assertEquals(5.0, AppLogic.Divide(15.0, 3.0));

	}

	@Test
	public void TestDivision2() {
		assertEquals(-5.0, AppLogic.Divide(15.0, -3.0));
	}

	@Test
	public void TestDivision3() {
		assertEquals(-5.0, AppLogic.Divide(-15.0, 3.0));

	}

	@Test
	public void TestDivision4() {
		assertEquals(1.0, AppLogic.Divide(0.5, 0.5));

	}

	@Test
	public void TestDivision5() {
		assertEquals(0.16666666666666666, AppLogic.Divide(0.5, 3.0));

	}

	@Test
	public void TestDivision6() {
		assertEquals(15.0, AppLogic.Divide(15.0, 1.0));

	}

	@Test
	public void TestDivision7() {
		assertEquals(1.0, AppLogic.Divide(1.0, 1.0));

	}

	@Test
	public void TestDivision8() {
		assertEquals(5.0, AppLogic.Divide(15.0, 3.0));

	}

	@Test
	public void TestDivision9() {
		assertEquals(5.0, AppLogic.Divide(15.0, 3.0));

	}

	@Test
	public void TestDivideByZero1() {
		assertEquals(AppLogic.Divide(-4.0, 0), Double.NEGATIVE_INFINITY);
	}

	@Test
	public void TestDivideByZero2() {
		assertEquals(AppLogic.Divide(4.0, 0), Double.POSITIVE_INFINITY);
	}
}
