package Assignment;

import java.util.Scanner;

public class PatternStars {

	public static void main(String[] args) {

		int lines;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		lines = sc.nextInt();

		for (int i = 1; i <= lines; i++) { // iterators the s 1 to no. lines(5)
			for (int j = 1; j <= i; j++) { // nested loop 1 to 5 stars.
				System.out.print("*");

			}
			System.out.println();

		}

	}

}
