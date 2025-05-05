package CollectionFramework;
import java.util.*;

public class HashSetClass {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>(); // No guaranteed order of elements (not insertion or sorted).
        // Set<Integer> set = new LinkedHashSet(); // Maintains insertion order.
        Set<Integer> set = new TreeSet(); // Maintains elements in sorted (natural) order, or uses a custom comparator if provided.

        set.add(56);
        set.add(68);
        set.add(18);
        set.add(95);
        set.add(39);
        
        System.out.println(set);
        
        // set.add(39);
        // set.add(39);
        // set.add(39);
        // System.out.println(set);
        
        set.remove(39);
        System.out.println(set);

        // set.clear();

        System.out.println(set.contains(56));
        System.out.println(set.isEmpty());
        System.out.println(set.size());


    }
}