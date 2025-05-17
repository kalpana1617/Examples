package VariblesAndMethods;

public class LocalVariable {

	int a = 10, b = 20;

	void add(int a, int b) {
		System.out.println(a + b);

		LocalVariable local = new LocalVariable();
		System.out.println(local.a + local.b);

		System.out.println(this.a + this.b);
	}

	public static void main(String[] args) {
		LocalVariable localVar = new LocalVariable();
		localVar.add(100, 200);
	}
}



