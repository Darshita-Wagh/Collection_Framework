package collection_framework;

import java.util.Stack;

public class StackExample1 {
	
	public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        // Push elements
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack: " + s);

        // Peek element
        System.out.println("Top element: " + s.peek());

        // Pop element
        System.out.println("Popped: " + s.pop());

        System.out.println("Stack after pop: " + s);

        // Search element
        System.out.println("Position of 20: " + s.search(20));

        // Check empty
        System.out.println("Is stack empty? " + s.empty());
    }

}
