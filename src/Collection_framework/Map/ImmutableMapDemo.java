package Collection_framework.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {

        // Creating a mutable HashMap
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        // Creating an immutable map using Collections.unmodifiableMap
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println("Immutable map using Collections.unmodifiableMap: " + map2);

        // The below line will throw UnsupportedOperationException if uncommented
        // map2.put("C", 3); // ❌ Not allowed, map2 is immutable

        // Creating an immutable map using Map.of (Java 9+)
        Map<String, Integer> map3 = Map.of("Shubham", 98, "Vivek", 89);
        System.out.println("Immutable map using Map.of: " + map3);

        // The below line will throw UnsupportedOperationException if uncommented
        // map3.put("Akshit", 88); // ❌ Not allowed

        // Creating an immutable map using Map.ofEntries (Java 9+)
        Map<String, Integer> map4 = Map.ofEntries(
                Map.entry("Akshit", 99),
                Map.entry("Vivek", 99)
        );
        System.out.println("Immutable map using Map.ofEntries: " + map4);
    }
}
