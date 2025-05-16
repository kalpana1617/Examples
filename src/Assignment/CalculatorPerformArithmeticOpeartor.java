package Assignment;

import java.util.Scanner;

public class CalculatorPerformArithmeticOpeartor {
	
	public static void main(String[] args) {
		
		double number1, number2, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		number1 = sc.nextDouble();
		System.out.println("Enter the second number:");
		number2 = sc.nextDouble();
		
		result = number1 + number2;
		System.out.println("Result:"+ number1 + " + " + number2 + " = " + result);
		result = number1 - number2;
		System.out.println("Result:"+ number1 + " - " + number2 + " = " + result);
		result = number1 * number2;
		System.out.println("Result:"+ number1 + " * " + number2 + " = " + result);
		result = number1 / number2;
		System.out.println("Result:"+ number1 + " / " + number2 + " = " + result);
		result = number1 % number2;
		System.out.println("Result:"+ number1 + " % " + number2 + " = " + result);
		System.out.println("The result is:"+result);
	}

}
