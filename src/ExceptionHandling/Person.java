package ExceptionHandling;

public class Person {
	private int age;

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age must be a positive number. Provided: " + age);
		}
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Person person = new Person();
		try {
			person.setAge(-1);
		} catch (IllegalArgumentException e) {
			System.out.println("Caught exception: " + e.getMessage());
		}
	}
}
