package com.latch.org.testCalculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MultiplicationTest {

	@Test
	public void TestMultiplication1() {
		//

		assertEquals(6.0, AppLogic.Multiply(2.0, 3.0));
	}

	@Test
	public void TestMultiplication2() {
		assertEquals(6.0, AppLogic.Multiply(-2.0, -3.0));
	}

	@Test
	public void TestMultiplication3() {
		assertEquals(-6.0, AppLogic.Multiply(2.0, -3.0));
	}

	@Test
	public void TestMultiplication4() {
		assertEquals(-6.0, AppLogic.Multiply(-2.0, 3.0));
	}

	@Test
	public void TestMultiplication5() {
		assertEquals(0.0, AppLogic.Multiply(0.0, 3.0));
	}

	@Test
	public void TestMultiplication6() {
		assertEquals(0.0, AppLogic.Multiply(0.0, 0.0));
	}

	@Test
	public void TestMultiplication7() {
		assertEquals(66.0, AppLogic.Multiply(2.0, 33.0));
	}

	@Test
	public void TestMultiplication8() {
		assertEquals(10.5, AppLogic.Multiply(2.1, 5.0));
	}
}
