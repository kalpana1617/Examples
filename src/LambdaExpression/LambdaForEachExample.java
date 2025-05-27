package LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaForEachExample {

	public static void main(String[] args) {
		
		  List<String> list = Arrays.asList("Banana", "Cherry", "Apple");
		  Collections.sort(list);
		  list.forEach(item -> System.out.println("Fruit:"+item));
	}
}
