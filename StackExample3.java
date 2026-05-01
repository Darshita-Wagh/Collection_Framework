package collection_framework;

import java.util.Stack;

public class StackExample3 {
	public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        // push elements
        s.push("Java");
        s.push("Python");
        s.push("C");
        s.push("Java");   // duplicate allowed

        System.out.println("Stack elements: " + s);

        // peek
        System.out.println("Top element (peek): " + s.peek());

        // pop
        System.out.println("Removed element (pop): " + s.pop());
        System.out.println("After pop: " + s);

        // search
        System.out.println("Position of Java: " + s.search("Java"));

        // size
        System.out.println("Size of stack: " + s.size());

        // empty
        System.out.println("Is stack empty? " + s.empty());

        // contains
        System.out.println("Contains C? " + s.contains("C"));

        // remove by index
        s.remove(0);
        System.out.println("After remove index 0: " + s);

        // clear
        s.clear();
        System.out.println("After clear: " + s);
    }
}
