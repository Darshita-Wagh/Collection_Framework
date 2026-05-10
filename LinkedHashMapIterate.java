package collection_framework;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapIterate {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}