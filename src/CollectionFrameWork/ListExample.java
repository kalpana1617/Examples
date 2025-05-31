package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");

		fruits.remove("Banana");
		fruits.add("Mango");

		System.out.println("Fruits List:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
