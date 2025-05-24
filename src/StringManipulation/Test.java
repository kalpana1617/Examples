package StringManipulation;

public class Test {
	
	String name;

	public Test(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		
		Test t = new Test("check");
		Test t1 = new Test("check");
		System.out.println(t.equals(t1));
		System.out.println(t == t1);
		
		
		String t2 = new String("check");
		String t3 = new String("check");
		System.out.println(t2.equals(t3));
		System.out.println(t2 == t3);
		
		String s = "kalpana";
		String s1 = "kalpana";
		System.out.println(s.equals(s1));
		System.out.println(s == s1);
	}

}
