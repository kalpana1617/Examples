package FlowControl;

import java.util.ArrayList;
import java.util.List;

public class ForEachListExample {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		fruits.add("guava");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("carrot");
		fruits.add("pineapple");

		for (String fruit : fruits) {
			System.out.println(fruit);

		}
	}

}
