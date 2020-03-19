package unittesting;
import java.util.Scanner;

public class Calculator extends CalculatorOperations {
	public static void main(String[] args) {
		System.out.println("Commands:");
		System.out.println("'+' is for addition");
		System.out.println("'*' is for multiplication");
		System.out.println("'/' is for division");
		System.out.println("'c' is to clear calculator");
		System.out.println("'e' is to exit");
		System.out.println("'h' is for help");
		double currentValue = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value");
		currentValue = scan.nextDouble();
		while(true) {
			Character operation;
			System.out.println("Enter operation");
			operation = scan.next().charAt(0);
			if(operation == '+') {
				double addValue = scan.nextDouble();
				double sum = add(currentValue, addValue);
				currentValue = sum;
				System.out.println("Result: " + currentValue);
			}
			else if(operation == '-') {
				double subtractValue = scan.nextDouble();
				double difference = subtract(currentValue, subtractValue);
				currentValue = difference;
				System.out.println("Result: " + currentValue);
			}
			else if(operation == '*') {
				double multiplyValue = scan.nextDouble();
				double product = multiply(currentValue, multiplyValue);
				currentValue = product;
				System.out.println("Result: " + currentValue);
			}
			else if(operation == '/') {
				double divideValue = scan.nextDouble();
				double quotient = divide(currentValue, divideValue);
				currentValue = quotient;
				System.out.println("Result: " + currentValue);
			}
			else if(operation == 'c') {
				currentValue = 0;
				System.out.println("Result: " + currentValue);
				System.out.println("Please enter value");
				currentValue = scan.nextDouble();
			}
			else if(operation == 'e') {
				return;
			}
			else if(operation == 'h') {
				System.out.println("Commands:");
				System.out.println("'+' is for addition");
				System.out.println("'*' is for multiplication");
				System.out.println("'/' is for division");
				System.out.println("'c' is to clear calculator");
				System.out.println("'e' is to exit");
				System.out.println("'h' is for help");
			}
			else {
				System.out.println("Error. Invalid operation");
			}
		}
	}
/**	public static double add(double currentValue, double addValue) {
		double result = currentValue + addValue;
		return result;
	}
	public static double subtract(double currentValue, double subtractValue) {
		double result = currentValue - subtractValue;
		return result;
	}
	public static double multiply(double currentValue, double multiplyValue) {
		double result = currentValue * multiplyValue;
		return result;
	}
	public static double divide(double currentValue, double divideValue) {
		if(divideValue == 0) {
			System.out.println("Error. Can't divide by 0");
			return currentValue;
		}
		else {
			double result = currentValue / divideValue;
			return result;
		}
	}**/
}
