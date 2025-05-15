package FlowControl;

import java.util.Scanner;

public class ControlFlowExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("positive number");

		} else if (num < 0) {
			System.out.println("negative number");
		} else {
			System.out.println("Zero number");
		}
		System.out.println("Even numbers from 1 to 10:");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Numbers from 1 to 5, Skipping 3:");
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
	}

}
