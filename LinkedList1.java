package collection_framework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<Integer>(); 
		
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		
		Iterator itr = ls.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(ls);
		
		for(int str: ls) {
			System.out.println(str);
		}
	}

}
