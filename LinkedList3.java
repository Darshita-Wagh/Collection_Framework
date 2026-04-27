package collection_framework;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		// Creating LinkedList of Integer
        LinkedList<Integer> list = new LinkedList<>();

        // ---------------------- ADD OPERATIONS ----------------------

        // add(E e) → adds element at end
        list.add(10);
        list.add(20);
        list.add(30);

        // addFirst(E e) → adds at start
        list.addFirst(5); //5 10 20 30

        // addLast(E e) → adds at end (same as add)
        list.addLast(40); //5 10 20 30 40

        // add(index, element) → insert at given position
        list.add(2, 15); //5 10 15 20 30 40

        System.out.println("After Adding Elements: " + list);

        // ---------------------- ACCESS / FETCH OPERATIONS ----------------------

        // get(int index) → returns element at index
        System.out.println("Element at index 2: " + list.get(2));

        // getFirst() → returns first element
        System.out.println("First element: " + list.getFirst());

        // getLast() → returns last element
        System.out.println("Last element: " + list.getLast());

        // ---------------------- REMOVE OPERATIONS ----------------------

        // remove() → removes first element
        list.remove();
        System.out.println(list);

        // remove(index) → removes element at index
        list.remove(2);
        System.out.println(list);

        // remove(Object o) → removes first occurrence of given value
        list.remove(Integer.valueOf(30));
        System.out.println(list);

        // removeFirst() → removes first element
        list.removeFirst();
        System.out.println(list);

        // removeLast() → removes last element
        list.removeLast();

        System.out.println("After Removing Elements: " + list);

        // ---------------------- UPDATE / MODIFY ----------------------

        // set(index, element) → update value at index
        list.set(0, 100);
        System.out.println("After Updating First Element: " + list);

        // ---------------------- SEARCH OPERATIONS ----------------------

        // contains(Object o) → checks if element exists
        System.out.println("Contains 20? " + list.contains(20));

        // indexOf(Object o) → returns first index of element
        System.out.println("Index of 100: " + list.indexOf(100));

        //---------------------- SIZE OPERATION ----------------------

        // size() → returns number of elements
        System.out.println("Size of LinkedList: " + list.size());

        // ---------------------- CLEAR OPERATION ----------------------

        // clear() → removes all elements
        list.clear();
        System.out.println("After Clear: " + list);
	}

}
