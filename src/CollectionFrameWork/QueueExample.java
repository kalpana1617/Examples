package CollectionFrameWork;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();
		queue.add("Task1");
		queue.add("Task2");
		queue.add("Task3");

		System.out.println(queue.poll()); // remove
		System.out.println(queue.peek()); // first queue
	}

}
