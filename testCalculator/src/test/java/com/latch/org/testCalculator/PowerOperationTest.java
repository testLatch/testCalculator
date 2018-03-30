package com.latch.org.testCalculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class PowerOperationTest {

	@Test
	public void TestPower1() {
		assertEquals(0.03125, AppLogic.Power(2.0, -5.0));
	}

	@Test
	public void TestPower2() {
		assertEquals(0.01940379134559859, AppLogic.Power(2.2, -5.0));
	}

	@Test
	public void TestPower3() {
		assertEquals(0.027204705103003875, AppLogic.Power(2.0, -5.2));
	}

	@Test
	public void TestPower4() {
		assertEquals(0.21054235726688475, AppLogic.Power(2.1, -2.1));
	}

	@Test
	public void TestPower5() {
		assertEquals(Double.POSITIVE_INFINITY, AppLogic.Power(0.0, -5.0));
	}

	@Test
	public void TestPower6() {
		assertEquals(1.0, AppLogic.Power(2.0, -0.0));
	}

	@Test
	public void TestPower7() {
		assertEquals(1.0, AppLogic.Power(0.0, -0.0));
	}

	@Test
	public void TestPower8() {
		assertEquals(0.0, AppLogic.Power(9999999999999999999999.0, -999999999999999999.0));
	}

	@Test
	public void TestPower9() {
		assertEquals(-32.0, AppLogic.Power(-2.0, 5.0));
	}

	@Test
	public void TestPower10() {
		assertEquals(-51.53632000000002, AppLogic.Power(-2.2, 5.0));
	}

	@Test
	public void TestPower12() {
		assertEquals(Double.NaN, AppLogic.Power(-2.1, 2.1));
	}

	@Test
	public void TestPower13() {
		assertEquals(-0.0, AppLogic.Power(-0.0, 5.0));
	}

	@Test
	public void TestPower14() {
		assertEquals(1.0, AppLogic.Power(-2.0, 0.0));
	}

	@Test
	public void TestPower15() {
		assertEquals(1.0, AppLogic.Power(-0.0, 0.0));
	}

	@Test
	public void TestPower16() {
		assertEquals(Double.POSITIVE_INFINITY, AppLogic.Power(-9999999999999999999999.0, 999999999999999999.0));
	}

	@Test
	public void TestPower17() {
		assertEquals(-0.03125, AppLogic.Power(-2.0, -5.0));
	}

	@Test
	public void TestPower18() {
		assertEquals(-0.01940379134559859, AppLogic.Power(-2.2, -5.0));
	}

	@Test
	public void TestPower19() {
		assertEquals(Double.NaN, AppLogic.Power(-2.0, -5.2));
	}

	@Test
	public void TestPower21() {
		assertEquals(Double.NEGATIVE_INFINITY, AppLogic.Power(-0.0, -5.0));
	}

	@Test
	public void TestPower22() {
		assertEquals(1.0, AppLogic.Power(-2.0, -0.0));
	}

	@Test
	public void TestPower23() {
		assertEquals(1.0, AppLogic.Power(-0.0, -0.0));
	}

	@Test
	public void TestPower24() {
		assertEquals(0.0, AppLogic.Power(-9999999999999999999999.0, -999999999999999999.0));
	}

	@Test
	public void TestPower32() {
		assertEquals(32.0, AppLogic.Power(2.0, 5.0));
	}

	@Test
	public void TestPower25() {
		assertEquals(51.53632000000002, AppLogic.Power(2.2, 5.0));
	}

	@Test
	public void TestPower26() {
		assertEquals(36.758347359905120217556062296894, AppLogic.Power(2.0, 5.2));
	}

	@Test
	public void TestPower27() {
		assertEquals(4.749638091742242, AppLogic.Power(2.1, 2.1));
	}

	@Test
	public void TestPower28() {
		assertEquals(0.0, AppLogic.Power(0.0, 5.0));
	}

	@Test
	public void TestPower29() {
		assertEquals(1.0, AppLogic.Power(2.0, 0.0));

	}

	@Test
	public void TestPower30() {
		assertEquals(1.0, AppLogic.Power(0.0, 0.0));
	}

	@Test
	public void TestPower31() {
		assertEquals(Double.POSITIVE_INFINITY, AppLogic.Power(9999999999999999999999.0, 999999999999999999.0));
	}
}
