package FlowControl;

public class TryReturnExample {

	public static int calculateSum(int a, int b) {
		try {
			int sum = a + b;
			return sum;
		} catch (Exception e) {
			System.out.println("error:" + e.getMessage());
			return 1;
		}

	}

	public static void main(String[] args) {
		int result = calculateSum(5, 4);
		System.out.println(result);
	}

}
