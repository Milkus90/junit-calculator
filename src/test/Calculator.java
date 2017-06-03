package test;


public class Calculator {

	public double sum(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) throws IllegalAccessException {
		if (b == 0) {
			throw new IllegalArgumentException("Can't divide by zero!");
		}
		return a / b;
	}
}
