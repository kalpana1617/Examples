package Inheritance;

class Animal {

	void eat() {
		System.out.println("food");
	}
}
	
	class Dog extends Animal {
		void bark() {
			System.out.println("bark");
		}
	}
	
	public class SingleInheritance {

		public static void main(String[] args) {

			Dog dog = new Dog();
			dog.bark();
			dog.eat();
		}
	}
