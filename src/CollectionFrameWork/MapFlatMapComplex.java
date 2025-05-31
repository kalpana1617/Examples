package CollectionFrameWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapComplex {

	public static void main(String[] args) {
		List<List<String>> listOfLists = Arrays.asList(
				Arrays.asList("Apple", "Banana"), 
				Arrays.asList("Cat", "Dog"),
				Arrays.asList("Elephant", "Frog"));

		List<String> result = listOfLists.stream()
				.flatMap(list -> list.stream())
				.map(String::toLowerCase)
				.collect(Collectors.toList());

		System.out.println(result);
	}

}
