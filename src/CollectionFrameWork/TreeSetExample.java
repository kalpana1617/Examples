package CollectionFrameWork;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(50);
		numbers.add(10);
		numbers.add(40);
		numbers.add(20);
		numbers.add(10);

		System.out.println("All numnbers in trees set:");
		for (int number : numbers) {
			System.out.println(number);

		}

		System.out.println(numbers.first());
		System.out.println(numbers.last());
		System.out.println(numbers.higher(20));
		System.out.println(numbers.lower(20));
		System.out.println(numbers.higher(50));
	}

}
