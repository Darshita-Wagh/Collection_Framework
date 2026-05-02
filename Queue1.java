package collection_framework;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1{

    public static void main(String[] args){
        
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Java");
        pq.add("CPP");
        pq.add("C");
        pq.add("HTML");
        System.out.println(pq);
       while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }


        
//        pq.poll();
//        System.out.println(pq);
//        
//        System.out.println("Head element: " + pq.peek());
//        
//        pq.poll();
//        System.out.println(pq);
    }
	

}
