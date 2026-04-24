package collection_framework;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNew {
    public static void main(String[] args) {

        // 1. Creating ArrayLists
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        // 2. add(), add(index, element)
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1, 15);      // Insert at index

        names.add("Darshana");
        names.add("Riya");
        names.add(1, "Neha");
        
        System.out.println(numbers);
        System.out.println(names);

        // 3. get(index)
        System.out.println("\nNumber at index 2: " + numbers.get(2));
        System.out.println("Name at index 1: " + names.get(1));

        
        // 4. set(index, element)
        numbers.set(2, 25);
        names.set(0, "Sai");
        
        System.out.println(numbers);

        // 5. remove(element) & remove(index)
        numbers.remove(1);       // remove index 1 → 15 removed
        names.remove("Neha");    // remove element

        // 6. contains(element)
        System.out.println("Contains 25? " + numbers.contains(25));
        System.out.println("Contains 'Riya'? " + names.contains("Riya"));

        // 7. size()
        System.out.println("Numbers size: " + numbers.size());
        System.out.println("Names size: " + names.size());

        // 8. isEmpty()
        System.out.println("Is numbers empty? " + numbers.isEmpty());

        // 9. indexOf() & lastIndexOf()
        numbers.add(25);  // Duplicate value
        System.out.println(numbers);
        System.out.println("First index of 25: " + numbers.indexOf(25));
        System.out.println("Last index of 25: " + numbers.lastIndexOf(25));

        // 10. Sorting
        Collections.sort(numbers);
        Collections.sort(names);

        // 11. Iteration using for-each
        System.out.println("Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("Names:");
        for (String n : names) {
            System.out.println(n);
        }

        // 12. clear()
        names.clear();
        System.out.println("Names after clear(): " + names);
    }
}
