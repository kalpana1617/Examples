package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 2, 2, 3, 34, 5, 4, 5, 6);
		Set<Integer> set = numbers.stream().collect(Collectors.toSet());
		System.out.println(set);

	}

}
