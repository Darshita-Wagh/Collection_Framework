package collection_framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue3 {
	public static void main(String[] args) {

        // Creating ArrayDeque
        Deque<Integer> dq = new ArrayDeque<>();

        // Adding elements
        dq.add(10);          
        dq.add(20);
        dq.addFirst(5);      // add at beginning
        dq.addLast(30);      // add at end  5 10 20 30

        System.out.println("After adding elements: " + dq);

        // Accessing elements
        System.out.println("First element: " + dq.peekFirst());
        System.out.println("Last element: " + dq.peekLast());

        // Removing elements
        System.out.println("Removed first: " + dq.pollFirst());
        System.out.println("Removed last: " + dq.pollLast());

        System.out.println("After removal: " + dq);

        // Using ArrayDeque as Stack (LIFO)
        dq.push(40);     // push at front
        dq.push(50);
        
//        dq.add(40);
//        dq.add(50);

        System.out.println("After push operations (Stack): " + dq);

        System.out.println("Pop element: " + dq.pop());

        System.out.println("Final Deque: " + dq);
    }
}
