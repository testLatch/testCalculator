package com.latch.org.testCalculator;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		double[] input;
		int x = 0, y = 0, n = 2;
		double a, b, c, res;
		char choice, ch;
		Scanner scan = new Scanner(System.in);
		try {
			do {
				System.out.println("\n");
				System.out.print("1. Addition  ");
				System.out.print("2. Subtraction  ");
				System.out.print("3. Multiplication ");
				System.out.print("4. Division ");
				System.out.print("5. Square Root ");
				System.out.print("6. Mean ");
				System.out.print("7. Power ");
				System.out.print("8. Print Range ");
				System.out.print("9. Exit\n\n");
				System.out.print("Enter Your Choice : ");
				choice = scan.next().charAt(0);
				switch (choice) {
				case '1':
					System.out.print("Enter Two Numbers for Addition : ");
					a = scan.nextDouble();
					b = scan.nextDouble();
					AppLogic.Add(a, b);
					break;
				case '2':
					System.out.print("Enter Two Numbers for subtraction : ");
					a = scan.nextDouble();
					b = scan.nextDouble();
					AppLogic.Subtract(a, b);
					break;
				case '3':
					System.out.print("Enter Two Numbers for Multiplication : ");
					a = scan.nextDouble();
					b = scan.nextDouble();
					AppLogic.Multiply(a, b);
					break;
				case '4':
					System.out.print("Enter the Dividend and the Divisor respetively : ");
					a = scan.nextDouble();
					b = scan.nextDouble();
					if (b != 0)
						AppLogic.Divide(a, b);
					else {
						throw new CustomException("Divisor cannot be 0..!!");
					}
					break;
				case '5':
					System.out.print("Enter One Number to caculate SquareRoot : ");
					a = scan.nextDouble();
					if (a >= 0)
						AppLogic.SquareRoot(a);
					else {
						throw new CustomException("Square root cannot be calculated on negative numbers..!!");
					}
					break;
				case '6':
					System.out.print("How many numbers you want to input? ");
					n = scan.nextInt();
					input = new double[n];
					for (int i = 0; i < n; i++) {
						System.out.println("Enter next Number: ");
						input[i] = scan.nextDouble();
					}
					AppLogic.Mean(input);
					break;
				case '7':
					System.out.print("Enter Base and Power Numbers respectively : ");
					a = scan.nextDouble();
					b = scan.nextDouble();
					AppLogic.Power(a, b);
					break;
				case '8':
					try {
						System.out.print("Enter Two Integers : ");
						x = scan.nextInt();
						y = scan.nextInt();
					} catch (InputMismatchException ime1) {
						System.out.println("Please enter valid Integers..!! (InputMismatchException)");
						main(null);
					}
					AppLogic.PrintRange(x, y);
					break;
				default:
					System.out.print("Wrong Choice!!!");
					break;
				}
				System.out.print("\n---------------------------------------\n");
			} while (choice != 9);

		} catch (CustomException ce) {
			System.out.println(ce.getMessage());
			main(null);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("Please enter valid number..!! (ArithmeticException)");
			main(null);
		} catch (IllegalArgumentException ae) {
			System.out.println(ae.getMessage());
			System.out.println("Please enter valid number..!! (IllegalArgumentException)");
			main(null);
		} catch (InputMismatchException ime) {
			System.out.println("Please enter valid number..!! (InputMismatchException)");
			main(null);
		} catch (NullPointerException npe) {
			System.out.println("Something wen wrong..!! Please try again!! (NullPointerException)");
			main(null);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			main(null);
		} finally {
			scan.close();
		}
	}
}
