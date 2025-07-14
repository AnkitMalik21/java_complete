package Collection_framework.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class part3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        list.sort((a,b)->a-b);
        System.out.println(list);

        //this will not sort alphabetically
        List<String> words = Arrays.asList("banana","apple","orange","cherry");
        words.sort((a,b)->a.length() - b.length());
        System.out.println(words);

    }
}
