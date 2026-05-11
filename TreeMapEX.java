package collection_framework;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapEX {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();

        map.put("I", "A");
        map.put("L", "B");
        map.put("B", "C"); 

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}