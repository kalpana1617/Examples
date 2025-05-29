package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {

		List<List<String>> letters = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"),
				Arrays.asList("a", "b"));

		List<String> flat = letters.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(flat);
	}

}
