package Collection_framework.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class part5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Object[] array = list.toArray();
        System.out.println(array);

        //this convert list to array
        //this gives a list of Integer not objects
        Integer[] array1 = list.toArray(new Integer[0]);
        System.out.println(array1);

        System.out.println(Arrays.toString(array));   // [1, 2, 3]
        System.out.println(Arrays.toString(array1));  // [1, 2, 3]
    }
}
