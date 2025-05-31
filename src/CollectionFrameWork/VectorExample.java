package CollectionFrameWork;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<String> animals = new Vector<String>();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("cat");
		animals.add("elaphant");

		animals.add(2, "horse");

		System.out.println(animals.get(2));

		animals.remove(2);

		System.out.println("Current Vector elements:");

		for (String animal : animals) {
			System.out.println(animal);
		}

	}
}
