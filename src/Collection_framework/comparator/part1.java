package Collection_framework.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class part1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        List<String> words = Arrays.asList("banana","apple","date");
        words.sort(null);//this will sort the elements
        System.out.println(words);

    }
}
