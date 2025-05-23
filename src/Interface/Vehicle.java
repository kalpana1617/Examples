package Interface;

public interface Vehicle {
	void draw();
}
	
class Cycle implements  Vehicle {

	@Override
	public void draw() {
		System.out.println("slow");
		
	}
	

}

class Bike implements Vehicle {

	@Override
	public void draw() {
		System.out.println("Speed");
		
	}
	
}
