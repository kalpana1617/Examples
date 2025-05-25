package WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class WrapperInCollections {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		for (Integer number : numbers) {
			System.out.println("Number is:" + number);
		}
	}
}
