package com.latch.org.testCalculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SubtractionTest {

	@Test
	public void TestSutraction1() {
		assertEquals(5.0, AppLogic.Subtract(7.0, 2.0));
	}

	@Test
	public void TestSutraction2() {
		assertEquals(0.0, AppLogic.Subtract(0.0, 0.0));
	}

	@Test
	public void TestSutraction3() {
		assertEquals(-5.0, AppLogic.Subtract(-7.0, -2.0));
	}

	@Test
	public void TestSutraction4() {
		assertEquals(4.0, AppLogic.Subtract(8.4, 4.4));
	}

	@Test
	public void TestSutraction5() {
		assertEquals(-5.0, AppLogic.Subtract(0.0, 5.0));
	}

	@Test
	public void TestSutraction6() {
		assertEquals(3.8899999999999997, AppLogic.Subtract(5.0, 1.11));
	}

}
