package NesteadClass;

public class NesteadStatic {

	static class Outer {
		void display() {
			System.out.println("display");
		}
	}
	public static void main(String[] args) {
		NesteadStatic.Outer nestead= new NesteadStatic.Outer();
		nestead.display();
	}

}
