package Abstraction;

public class Main {

	public static void main(String[] args) {
		
		Vehicle car = new Car("Ford", 2023);
        Vehicle motorcycle = new Motorcycle("Benzzle", 2022);
        
        System.out.println(car.getBrand());
        System.out.println(car.getYear());
        System.out.println(motorcycle.getYear());
        System.out.println(motorcycle.getBrand());
        
        car.start();
        motorcycle.start();
	}

}
