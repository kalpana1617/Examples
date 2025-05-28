package LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda1 {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple", "kiwi", "carrot", "guava");
		fruits.stream().map(fruit -> fruit.toUpperCase()).forEach(System.out::println);
		
		List<String> fruitss = Arrays.asList("apple", "kiwi", "carrot", "guava");
		fruits.stream().map(fruit -> fruit.toLowerCase()).forEach(System.out::println);
		
		List<String> fruitsss = Arrays.asList("apple", "kiwi", "carrot", "guava");
		Collections.sort(fruitsss);
		fruits.stream().map(fruit -> fruit.toLowerCase());
		fruitsss.forEach(System.out::println);

	}

}
