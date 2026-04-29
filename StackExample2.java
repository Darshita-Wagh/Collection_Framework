package collection_framework;

import java.util.Iterator;
import java.util.Stack;

public class StackExample2 {
	public static void main(String[] args) {
		Stack<String> stk = new Stack();  
		
		//pushing elements into stack  
		stk.push("BMW");  
		stk.push("Audi");  
		stk.push("Ferrari");  
		stk.push("Bugatti");  
		stk.push("Jaguar");  
		
		//iteration over the stack  
//		Iterator<String> iterator = stk.iterator();  
//		while(iterator.hasNext())  
//		{  
//			System.out.println(iterator.next());   
//		} 
		
		//iteration using forEach()
		stk.forEach(element -> {
            System.out.println(element);
        });
	}
}