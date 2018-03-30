package com.latch.org.testCalculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AdditionTest {

	@Test()
	public void TestAddition1() {
		assertEquals(5.0, AppLogic.Add(2.0, 3.0));
	}

	@Test
	public void TestAddition2() {
		assertEquals(0.0, AppLogic.Add(0.0, 0.0));
	}

	@Test
	public void TestAddition3() {
		assertEquals(5.0, AppLogic.Add(5.0, 0.0));
	}

	@Test
	public void TestAddition4() {
		assertEquals(5.0, AppLogic.Add(2.5, 2.5));
	}

	@Test
	public void TestAddition5() {
		assertEquals(5.0, AppLogic.Add(1.11, 3.89));
	}

	@Test
	public void TestAddition6() {
		assertEquals(5.0, AppLogic.Add(-2.0, 7.0));
	}

}
