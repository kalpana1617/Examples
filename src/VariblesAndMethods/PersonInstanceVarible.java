package VariblesAndMethods;

public class PersonInstanceVarible {

	int id;
	long height;
	String name;
	String address;
	double salary;
	float prize;

	PersonInstanceVarible(int id, long height, String name, String address, double salary, float prize) {
		this.id = id;
		this.height = height;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.prize = prize;

	}

	@Override
	public String toString() {
		return "[id=" + id + ", height=" + height + ", name=" + name + ", address="
				+ address + ", salary=" + salary + ", prize=" + prize + "]";
	}

	public static void main(String[] args) {
		PersonInstanceVarible personDetails = new PersonInstanceVarible(1, 54L, "kalpana", "jangaon",
				31500.0d, 1000.0f);
		System.out.println("Person Details are:" + personDetails);
	}

}
