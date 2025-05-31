package CollectionFrameWork;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();

		stack.push("Page1");
		stack.push("Page2");
		stack.push("Page3");

		System.out.println("Top of stack: " + stack.peek()); // top from Last 
		System.out.println("Popped: " + stack.pop());  //remove
		System.out.println("Now top: " + stack.peek());

	}

}
