package CollectionFrameWork;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(10);
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(30);

		System.out.println("Numbers are:" + numbers);
	}

}
