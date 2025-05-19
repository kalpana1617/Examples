package Inheritance;

class Names {
	void First() {
		System.out.println("Sree");
	}
}

class Kalpana extends Names {
	void Middle() {
		System.out.println("---");
	}
	
}

class Srikanth extends Kalpana {
	void Last() {
		System.out.println("Talari");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		Srikanth s = new Srikanth();
		s.First();
		s.Middle();
		s.Last();
		
		
	}
	
}
