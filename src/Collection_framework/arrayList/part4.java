package Collection_framework.arrayList;

import java.util.ArrayList;
import java.util.List;

public class part4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);//1 2 3
        list.remove(1);//this will remove the index
        System.out.println(list);//1 3

        //to remove object we need to convert it to wrapper class
        // 3-> is object here .please remember

        list.remove(Integer.valueOf(3));//this removes the alue
        System.out.println(list);//1

        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("Banana");
        fruit.add("Date");
        fruit.add("Apple");

        System.out.println(fruit);
        fruit.remove("Apple");//this will remove single element from first position it gets
        System.out.println(fruit);


    }
}
