package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class Lambda2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("kiwi", "appleeeee", "banana");

		list.sort((s1, s2) -> s1.length() - s2.length());

		list.forEach(System.out::println);
		
		list.sort((s1, s2) -> s1.compareTo(s2));

		list.forEach(System.out::println);
	}

}
