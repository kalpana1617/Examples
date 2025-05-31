package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<String, Integer> marks = new HashMap<String, Integer>();

		marks.put("puppy", 100);
		marks.put("pinky", 50);
		marks.put("bob", 60);
		marks.put("puppy", 95);

		System.out.println(marks);

		for (Map.Entry<String, Integer> entry : marks.entrySet()) {
			System.out.println(entry.getKey() + " Scored " + entry.getValue());

		}

	}

}
