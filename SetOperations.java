package collection_framework;
import java.util.*;

public class SetOperations {
    public static void main(String[] args) {

        Integer[] A = {22, 45, 33, 66, 55, 34, 77};
        Integer[] B = {33, 2, 83, 45, 3, 12, 55};

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(A));

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(B));

        System.out.println(set1);
        // Union
        Set<Integer> union_data = new HashSet<>(set1);
        union_data.addAll(set2);
        System.out.println("Union: " + union_data);

        // Intersection
        Set<Integer> intersection_data = new HashSet<>(set1);
        intersection_data.retainAll(set2);
        System.out.println("Intersection: " + intersection_data);

        // Difference
        Set<Integer> difference_data = new HashSet<>(set1);
        difference_data.removeAll(set2);
        System.out.println("Difference: " + difference_data);
    }
}
