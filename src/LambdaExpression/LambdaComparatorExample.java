package LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaComparatorExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("kalpana", "Rekha","Akhila");
		Collections.sort(names, (a, b) -> a.compareTo(b));
		System.out.println(names);
	}

}
