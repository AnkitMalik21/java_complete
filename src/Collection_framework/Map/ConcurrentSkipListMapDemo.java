package Collection_framework.Map;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {


        /*
        It is a concurrent, thread-safe, sorted map (like TreeMap but safe for multi-threading).

        Internally, it uses a skip list:
        A skip list is a linked list with multiple layers.
        Each higher layer acts like an "express lane" to skip over elements — improving performance.
        Search, insert, and delete have logarithmic time complexity on average: O(log n).
        Maintains elements in natural sorted order (or a custom Comparator).

        */
        // Create a ConcurrentSkipListMap of Integer keys and String values
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

        // Insert key-value pairs using put()
        map.put(5, "Five");
        map.put(1, "One");
        map.put(3, "Three");
        map.put(2, "Two");

        // Automatically sorted by keys: 1, 2, 3, 5
        System.out.println("🌐 Sorted Map Entries:");
        map.forEach((k, v) -> System.out.println(k + " => " + v));

        // putIfAbsent(): only adds if key is missing
        map.putIfAbsent(3, "Another Three");  // Won't overwrite
        map.putIfAbsent(4, "Four");           // Will insert

        // get(): fetch value by key
        System.out.println("\n🔍 Value for key 3: " + map.get(3));

        // firstKey() and lastKey()
        System.out.println("🔽 First Key: " + map.firstKey());
        System.out.println("🔼 Last Key: " + map.lastKey());

        // remove() method
        map.remove(2);
        System.out.println("\n🗑️ Removed key 2");

        // final state
        System.out.println("\n✅ Final Map:");
        map.forEach((k, v) -> System.out.println(k + " => " + v));

    }
}
