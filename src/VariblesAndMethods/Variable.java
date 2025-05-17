package VariblesAndMethods;

public class Variable {

	int num = 10;

	int check(int num) {
		System.out.println("Good morning...");
		return this.num;
	}

	public static void main(String[] args) {
		Variable variable = new Variable();
		int num = variable.check(100);
		System.out.println(num);
	}
}



