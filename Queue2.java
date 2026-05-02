package collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {
	public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.add(10);
		que.add(20);
		que.offer(15);
		que.offer(30);
		
		System.out.println(que);
		
		System.out.println("First element in queue:"+que.poll());
		System.out.println(que);
		
		// Access the head element without removing
        System.out.println("Head using peek(): " + que.peek());      
        System.out.println("Head using element(): " + que.element());
        
        System.out.println("Is queue empty?" + que.isEmpty());
        que.poll();
        que.poll();
        que.poll();
        
        
        System.out.println("Is queue empty?" + que.isEmpty());
		
		que.poll();
		System.out.println(que);
		System.out.println("Is queue empty?" + que.isEmpty());
	}
}
