package Collection_framework.Map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        // Java 7 --> segment based locking --> 16 segments --> smaller hashmaps
        // Only the segment being written to or read from is locked
        // read: do not require locking unless there is a write operation happening on the same segment
        // write: lock

        // java 8 --> no segmentation
        //        --> Compare-And-Swap approach --> no locking except resizing or collision
        // Thread A last saw --> x = 45
        // Thread A work --> x to 50
        // if x is still 45, then change it to 50 else don't change and retry
        // put --> index

        // MAP --> SORTED --> THREAD SAFE --> ConcurrentSkipListMap

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Thread 1: insert values using put()
        Thread writerThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                map.put(i, "Value" + i);
            }
        });

        // Thread 2: update values using computeIfPresent()
        Thread updaterThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                map.computeIfPresent(i, (key, value) -> value + "-Updated");
            }
        });

        // Thread 3: use putIfAbsent()
        Thread conditionalInsertThread = new Thread(() -> {
            for (int i = 5; i < 15; i++) {
                map.putIfAbsent(i, "InsertedIfAbsent" + i);
            }
        });

        // Start threads
        writerThread.start();
        updaterThread.start();
        conditionalInsertThread.start();

        // Wait for threads to finish
        try {
            writerThread.join();
            updaterThread.join();
            conditionalInsertThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Use get() and remove()
        System.out.println("\n📌 Final Map Entries:");
        map.forEach((k, v) -> System.out.println(k + " => " + v));

        System.out.println("\n🔍 Get value for key 2: " + map.get(2));

        map.remove(2);
        System.out.println("🗑️ Removed key 2");

        System.out.println("\n✅ Updated Map:");
        map.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
