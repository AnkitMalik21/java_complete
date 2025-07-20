package Collection_framework.set;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Ravi");
        set.add("Ankit");
        set.add("Vijay");
        set.add("Sumit");

        System.out.println("An initial list of  elements " + set);

        //removing specific element

        set.remove("Ravi");
        System.out.println("After invoking remove (object) method: " + set);

        HashSet<String> set1 = new HashSet<>();
        set1.add("Ajay");
        set1.add("Guarav");
        set.addAll(set1);

        System.out.println("Updated list " + set);

        // removing all new element from hashset
        set.removeAll(set1);
        System.out.println("Ater invoking removeAll() method: " + set);
        //removing elements on the basis of specific condition
        set.removeIf(str->str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: " + set);
        //removing all elements avaiable in the set
        set.clear();

        System.out.println("After invoking clear() method: " + set);



    }
}
