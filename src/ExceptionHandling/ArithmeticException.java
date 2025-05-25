package ExceptionHandling;

public class ArithmeticException {

	public static void main(String[] args) {
		int num1 = 19, num2 = 0, sum;
		try {
			sum = num1 / num2;
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println("Cannot divide by zero.");
		}

	}

}
