package week1.day2;

import java.util.concurrent.SubmissionPublisher;

public class Calculator {

	public int add(int num1, int num2) {

		return num1 + num2;
	}

	public double sub(double num1, double num2) {
		return num1 - num2;
	}

	public double multiply(double num1, double num2) {
		return num1 * num2;

	}

	public int divide(int num1, int num2) {
		return num1 / num2;

	}

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		int i = calc.add(20, 10);
		// call method add using addition object i.e: addition.add
		// then press and release ctrl+2 then L. This is to create a variable.
		System.out.println(i);

		double sub = calc.sub(23.43, 13.76);
		System.out.println(sub);

		double multiply = calc.multiply(10.50, 5.50);
		System.out.println(multiply);

		int divide = calc.divide(125, 5);
		System.out.println(divide);
	}

}
