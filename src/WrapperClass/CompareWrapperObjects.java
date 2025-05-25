package WrapperClass;

public class CompareWrapperObjects {

	public static void main(String[] args) {
		Integer a = 128; //integer accepts -128 to -127 becomes true in both conditions.
		Integer b = 128;

		System.out.println("Using equals(): " + a.equals(b)); // True(.equals() for value comparison)
		System.out.println("Using == : " + (a == b)); // False(== checks for reference equality)
	}
}



