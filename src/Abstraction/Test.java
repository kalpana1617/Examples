package Abstraction;

public class Test {
	public static void main(String[] args) {

		Calculate c = new Simple();
		c.sum(2, 3);
		c.minus(2, 1);
		c.mul(2, 3);
		c.div(6, 6);
	}

}
