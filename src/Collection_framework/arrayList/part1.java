package Collection_framework.arrayList;

import java.util.ArrayList;

public class part1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(80);

        System.out.println(list.get(2));
        System.out.println(list.size());

        //forEach loop

        for(int x: list){
            System.out.println(x);
        }

        System.out.println(list.contains(5));//true
        System.out.println(list.contains(50));//false

        //set methof

        list.set(3,90);
        for(int x: list){
            System.out.println(x+" ");
        }
    }
}
