package collection_framework;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C");
        map.put(4, "Java");   // duplicate value allowed
        map.put(null, "HTML"); // null key allowed

        System.out.println(map);

        System.out.println("Value at key 2: " + map.get(2));

        map.remove(3);

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());
    }
}
