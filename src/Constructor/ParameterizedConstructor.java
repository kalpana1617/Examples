package Constructor;

public class ParameterizedConstructor {

	String name;
	int age;

	ParameterizedConstructor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		ParameterizedConstructor pc = new ParameterizedConstructor("Srikanth", 24);
		System.out.println(pc.name);
		System.out.println(pc.age);
	}

}
