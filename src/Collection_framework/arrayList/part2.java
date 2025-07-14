package Collection_framework.arrayList;

import java.util.*;

public class part2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("MONDAY","TUESDAY");
        System.out.println(list1.getClass().getName());

        String[] array = {"apple","banana","cherry"};
        System.out.println(array.getClass().getName());

        List<String>list2 = Arrays.asList(array);
        System.out.println(list.getClass().getName());

        List<Integer> list3 = List.of(1,2,3,4);
        //this is immutable

        //creating another list
        List<String> list4 = new ArrayList<>(list2);
        list4.add("MONGO");

        System.out.println("List4: " + list4);


    }
}
