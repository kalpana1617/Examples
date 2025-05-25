package WrapperClass;

public class AutoboxingExample {

	public static void main(String[] args) {

		int i = 100;
		Integer integer = i; // Autoboxing
		System.out.println("primitive:" + i);
		System.out.println("Wrapper:" + integer);

		Integer numObj = 10;
		int num = numObj; // Unboxing
		System.out.println("Wrapper:" + numObj);
		System.out.println("primitive:" + num);

	}

}
