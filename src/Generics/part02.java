package Generics;

import java.util.ArrayList;

public class part02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        String s = list.get(0);
        String s1 = list.get(1);

        for(String x:list){
            System.out.println(x);
        }
    }
}
