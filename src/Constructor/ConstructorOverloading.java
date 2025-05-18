package Constructor;

public class ConstructorOverloading {
	String name;
	int age;

	public ConstructorOverloading() {
		this.name = "Unknown";
		this.age = 0;
	}

	public ConstructorOverloading(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		ConstructorOverloading student1 = new ConstructorOverloading();
		ConstructorOverloading student2 = new ConstructorOverloading("Bob", 22);

		System.out.println("Student 1: " + student1.name + ", " + student1.age);
		System.out.println("Student 2: " + student2.name + ", " + student2.age);
	}
}

