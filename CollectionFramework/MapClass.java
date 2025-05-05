package CollectionFramework;
import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        // Map<String, Integer> numbers = new HashMap<>();
        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        
        System.out.println(numbers);
        
        // numbers.put("Five", 10); // It will override the privious five, if you want the hashmap not to check if value is present and then add the value for that use below
        // numbers.putIfAbsent("Five", 10);
        // System.out.println(numbers);

        System.out.println(numbers.keySet()); // to print keyset
        System.out.println(numbers.values()); // to print Values

        System.out.println(numbers.containsKey("One"));
        System.out.println(numbers.containsValue(3));

        // numbers.remove("Three");

        // numbers.isEmpty();
        // numbers.clear();

        // for(String s : numbers.keySet()){
        //     System.out.println(numbers.get(s));
        // }

        // for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
        //     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        // }

        numbers.forEach((key, val) -> {
            System.out.println("Key: " + key + ", Value: " + val);
        });
    }
} 
