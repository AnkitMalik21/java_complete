package Collection_framework.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*

o1    o2
 "ok"  "bye"

 if -ive -> o1 comes first
 if 0 -> both have same preference
 if +ive -> o2 comes first

 */

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String o1,String o2){
        return o1.length() - o2.length();
    }
}

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1,Integer o2){
        return o1-o2;
    }
}

public class part2 {
    public static void main(String[] args) {
        //Comparator compares 2 objects

        List<Integer> li = new ArrayList<>();
        li.add(13);
        li.add(1);
        li.add(21);
        li.add(12);

        li.sort(new MyComparator());
        System.out.println(li);

        List<String> words = Arrays.asList("banana","apple","date");
        words.sort(new StringLengthComparator());
        System.out.println(words);



    }
}
