package collection_framework;

import java.util.*;

public class VectorExample3 {

    public static void main(String[] args) {

        // Creating Vector
        Vector<Integer> v = new Vector<>();

        // Adding elements
        v.add(10);
        v.add(20);
        v.add(30);
        v.addElement(40);   // legacy method
        v.add(20);          // duplicate allowed

        // Display Vector
        System.out.println("Vector Elements: " + v);

        // Size and Capacity
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());

        // Access elements
        System.out.println("Element at index 2: " + v.get(2));
        System.out.println("First Element: " + v.firstElement());
        System.out.println("Last Element: " + v.lastElement());

        // Update element
        v.set(1, 25);
        System.out.println("After update: " + v);

        // Check element
        System.out.println("Contains 30? " + v.contains(30));
        System.out.println("Is Empty? " + v.isEmpty());

        // Remove elements
        v.remove(3);        // remove by index
        v.removeElement(10); // legacy remove
        System.out.println("After removal: " + v);

        // Clear Vector
        v.clear();
        System.out.println("After clear: " + v);
        System.out.println("Is Empty? " + v.isEmpty());
    }
}

