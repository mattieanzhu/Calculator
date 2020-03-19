package unittesting;

public class CalculatorOperations  {
	
	public static double add(double currentValue, double addValue) {
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
	}

}