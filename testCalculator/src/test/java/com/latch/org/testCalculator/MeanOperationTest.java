package com.latch.org.testCalculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MeanOperationTest {

	@Test(description = "Mean Operation TC1")
	public void TestMean1() {
		assertEquals(5.0, AppLogic.Mean(new double[] { 5.0, 5.0, 5.0, 5.0 }));
		// assertEquals(0.0, AppLogic.Mean(new double[] { }));

	}

	@Test
	public void TestMean2() {
		assertEquals(0.0, AppLogic.Mean(new double[] { 0.0 }));
	}

	@Test
	public void TestMean3() {
		assertEquals(7.0, AppLogic.Mean(new double[] { 1.5, 4.5, 15.0, 7.0 }));
	}

	@Test
	public void TestMean4() {
		assertEquals(0.0, AppLogic.Mean(new double[] { -5.0, -6.0, 5.0, 6.0 }));
	}

	@Test
	public void TestMean5() {
		assertEquals(1.25, AppLogic.Mean(new double[] { 0.0, 0.0, 2.0, 3.0 }));
	}

	@Test
	public void TestMean6() {
		assertEquals(-1.25, AppLogic.Mean(new double[] { -2.0, -3.0, 0.0, 0.0 }));
	}

	@Test
	public void TestMean7() {
		assertEquals(-3.0, AppLogic.Mean(new double[] { -1.0, -2.0, -3.0, -4.0, -5.0 }));
	}

	@Test(expectedExceptions = NullPointerException.class)
	public void TestMeanWithNullInputs() {
		AppLogic.Mean(new double[] { (Double) null, (Double) null, (Double) null });
	}

}
