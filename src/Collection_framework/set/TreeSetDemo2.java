package Collection_framework.set;

import java.util.*;

public class TreeSetDemo2 {
    public static void main(String[] args) {

        TreeSet<String> set1=new TreeSet<>();
        set1.add("Ravi");
        set1.add("Vijay");
        set1.add("Ajay");
        System.out.println("Traversing element through Iterator in descending order");

        Iterator i=set1.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}

