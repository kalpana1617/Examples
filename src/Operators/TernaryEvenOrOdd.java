package Operators;

import java.util.Scanner;

public class TernaryEvenOrOdd {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		System.out.println(num % 2 == 0 ? "even" : "odd");
	}

}
