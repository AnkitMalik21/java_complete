package Collection_framework.arrayList;

import java.util.ArrayList;
import java.util.List;

public class part3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0,0);

        List<Integer> list1 = List.of(4,5,6,7,8,9,10);

        //this will merge all the element
        list.addAll(list1);
        System.out.println(list);

        //convert list to array
        //String[] array = list.toArray(new String[0]);


    }
}
