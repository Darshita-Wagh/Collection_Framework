package collection_framework;

import java.util.ListIterator;
import java.util.Stack;

public class StackExample4 {
	public static void main(String[] args) {
		
	 Stack<Integer> stk = new Stack<>();

     // Pushing elements into stack
     stk.push(119);
     stk.push(203);
     stk.push(988);

     // ListIterator starting from top of stack
     ListIterator<Integer> listIterator = stk.listIterator(stk.size());

     System.out.println("Iteration over the Stack from top to bottom:");

     // Iterating in reverse direction
     while (listIterator.hasPrevious()) {
         Integer value = listIterator.previous();
         System.out.println(value);
     }
     
	}
}
