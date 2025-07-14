package Collection_framework.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// we will se sorting over here
public class part6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(2);
        list.add(31);

        System.out.println(list);
        Collections.sort(list);//this will sort the list
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(32);
        list1.add(2);
        list1.add(31);

        System.out.println(list1);
        list.sort(null);//this also sort according to natural ordering
        System.out.println(list);
    }
}
