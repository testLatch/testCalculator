package com.latch.org.testCalculator;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class PrintRangeTest {

	@Test
	public void TestPrintRange1() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(3);
		expected.add(4);
		expected.add(5);

		assertEquals(true, expected.equals(AppLogic.PrintRange(2, 6)));
	}

	@Test
	public void TestPrintRange2() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(-1);
		expected.add(0);
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);

		assertEquals(true, expected.equals(AppLogic.PrintRange(-2, 6)));
	}

	@Test
	public void TestPrintRange4() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(-71);
		expected.add(-70);
		expected.add(-69);
		expected.add(-68);
		expected.add(-67);
		assertEquals(true, expected.equals(AppLogic.PrintRange(-72, -66)));
	}
}
