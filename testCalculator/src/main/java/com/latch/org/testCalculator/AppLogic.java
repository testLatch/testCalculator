package com.latch.org.testCalculator;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppLogic {

	public static double Add(double a, double b) {
		double result = 0.0;
		try {
			result = a + b;
			System.out.print("Result = " + result);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}

	public static double Subtract(double a, double b) {
		double result = 0.0;
		try {
			result = a - b;
			System.out.print("Result = " + result);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}

	public static double Multiply(double a, double b) {
		double result = 1;
		try {
			result = a * b;
			System.out.print("Result = " + result);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}

	public static double Divide(double a, double b) {
		double result = 1;
		try {			
			result = a / b;
			System.out.print("Result = " + result);
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}

	public static double SquareRoot(double a) {
		double result = 0.0;
		try {
			result = (double) Math.sqrt(a);
			System.out.print("Result = " + result);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}

	public static double Mean(double[] input) {
		double result = 0;
		double total = 0;
		try {
			for (double i : input) {
				total += i;
			}
			result = total / input.length;
			System.out.print("Result = " + result);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}

	public static double Power(double a, double b) {
		double result = 0.0;
		try {
			result =  Math.pow(a, b);
			System.out.print("Result = " + result);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}

	public static ArrayList<Integer> PrintRange(int a, int b) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		try {
			if(a == b)
			{
				throw new CustomException("Range cannot be printed for 2 equal numbers");
			}
			System.out.println("Range between " + a + " and " + b + " in ascending order is :");
			if (a > b) {
				int temp = a;
				a = b;
				b = temp;
			}
			for (int i = 1; i < b - a; i++) {
				al.add(a + i);
				System.out.println(a + i);
			}
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return al;
	}

}
