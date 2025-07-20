package Collection_framework.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("One");
        set1.add("Two");
        set1.add("Three");
        set1.add("Four");
        set1.add("Five");

        Iterator<String> i = set1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
