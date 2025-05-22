package Abstraction;

abstract class Vehicle {

	private String brand;
	private int year;

	public Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public int getYear() {
		return year;
	}

	abstract void start();
}


class Car extends Vehicle {
	public Car(String brand, int year) {
		super(brand, year);
	}

	@Override
	void start() {
		System.out.println("Starting the " + getBrand() + " car.");
	}
}


class Motorcycle extends Vehicle {
	public Motorcycle(String brand, int year) {
		super(brand, year);
	}

	@Override
	void start() {
		System.out.println("Starting the " + getBrand() + " motorcycle.");
	}
}
