package Abstraction;

public class Simple extends Calculate {

	@Override
	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	@Override
	public void minus(int a, int b) {
		System.out.println(a - b);

	}

	@Override
	public void mul(int a, int b) {
		System.out.println(a * b);

	}

	@Override
	public void div(int a, int b) {
		System.out.println(a / b);

	}

}
