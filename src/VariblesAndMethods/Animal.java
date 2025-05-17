package VariblesAndMethods;

//Method overriding
class Animal {

	public void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal {

	public void sound() {
		System.out.println("Dog barks");
	}

}


