package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LamdaExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("pandu", "cherry", "binnu", "chom");

		names.stream().filter(name -> name.startsWith("c") && name.length() > 4).forEach(System.out::println);

	}

}
