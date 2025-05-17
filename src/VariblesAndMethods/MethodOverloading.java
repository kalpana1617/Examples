package VariblesAndMethods;

public class MethodOverloading {

	public static void print(String msg) {
		System.out.println(msg);
	}

	public static void print(int age) {
		System.out.println(age);
	}

	public static void main(String[] args) {
		print("hii");
		print(24);

	}
}
