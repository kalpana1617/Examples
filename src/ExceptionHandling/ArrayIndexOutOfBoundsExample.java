package ExceptionHandling;

public class ArrayIndexOutOfBoundsExample {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3 };
		try {
			System.out.println(num[4]);
		} catch (Exception e) {
			System.out.println("Array index out of bounds");
		}

	}

}
