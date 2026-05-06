package collection_framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // Add elements
        dq.add(10);           // add at end
        dq.addFirst(5);       // add at front method for Deque
        dq.addLast(20);       // add at end method for Deque
        dq.offer(30);         // add at end
        dq.offerFirst(1);     // add at front method for Deque
        dq.offerLast(40);     // add at end method for Deque

        System.out.println("Deque after adding elements: " + dq);

        // Access elements
        System.out.println("First element: " + dq.getFirst());
        System.out.println("Last element: " + dq.getLast());
        System.out.println("Peek First: " + dq.peekFirst());
        System.out.println("Peek Last: " + dq.peekLast());

        // Remove elements
        System.out.println("Removed First: " + dq.removeFirst());
        System.out.println("Removed Last: " + dq.removeLast());
        System.out.println("Poll First: " + dq.pollFirst());
        System.out.println("Poll Last: " + dq.pollLast());

        System.out.println("Deque after removals: " + dq);

        // Stack operations using ArrayDeque
        dq.push(100);   // push at front
        dq.push(200);

        System.out.println("After push operations: " + dq);

        System.out.println("Popped element: " + dq.pop());

        // Other operations
        System.out.println("Size of deque: " + dq.size());
        System.out.println("Contains 10? " + dq.contains(10));
        System.out.println("Is deque empty? " + dq.isEmpty());

        // Clear deque
        dq.clear();
        System.out.println("After clear: " + dq);
    }
}