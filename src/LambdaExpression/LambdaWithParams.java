package LambdaExpression;


@FunctionalInterface
interface MathOperation {
	int operate(int a, int b);

}

public class LambdaWithParams {
	public static void main(String[] args) {
		MathOperation add = (a, b) -> a + b;
		MathOperation multiply = (a, b) -> a * b;
		System.out.println(add.operate(4, 3));
		System.out.println(multiply.operate(4, 3));
	}

}
