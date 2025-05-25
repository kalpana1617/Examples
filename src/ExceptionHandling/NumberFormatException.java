package ExceptionHandling;

public class NumberFormatException {

	public static void main(String[] args) {

		String s = "abc";
		try {
			int num = Integer.valueOf(s);
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("Invalid number format");
		}
	}
}  //The string "abc" cannot be parsed into an integer because it contains alphabetic characters, not digits.
