package collection_framework;

import java.util.LinkedList;

public class LinkedList2 {


	   public static void main(String args[]) {
	       LinkedList<String> list = new LinkedList<String>();
	       list.add("is");
	       list.add("a");
	       
	       System.out.println("Initial List :"+list);
	       
	       list.addLast("list");
	       System.out.println("Add element at end :"+list);
	       
	       list.addFirst("this");
	       System.out.println("Add element at start :"+list);
	       
	       list.add(3, "linked");
	       System.out.println(list);


	       System.out.println(list.get(0));
	       System.out.println("List size : "+list.size());   
	       list.remove(3);
	       System.out.println("Remove element at index3 :"+list);
	       
	       list.removeFirst();
	       System.out.println("\nRemove first element :"+list);
	       
	       list.removeLast();
	       System.out.println("\nRemove last element :"+list);
	      
	       System.out.println(list);
	   }

}
