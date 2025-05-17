package VariblesAndMethods;

public class StaticVariable {

	public static void main(String[] args) {

		int sum = add(4, 3);
		System.out.println("Sum:" + sum);

		Double area = calculteArea(7.5, 4.5);
		System.out.println("area:" + area);
	}

	private static Double calculteArea(double length, double breadth) {
		return length * breadth;
	}

	private static int add(int a, int b) {
		return a + b;
	}

}
