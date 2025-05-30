package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {

		List<String> sentences = Arrays.asList("hello world", "java streams", "flatmap example");

		List<String> words = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" ")))
				.collect(Collectors.toList());

		words.forEach(System.out::println);

	}

}
