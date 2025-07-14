package Collection_framework.copyOnWriteArray;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class part2 {
    public static void main(String[] args) {
        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Milk");
        sharedList.add("Eggs");
        sharedList.add("Bread");

        System.out.println("Initial Shopping List: " + sharedList);

        for(String item : sharedList){
            System.out.println(item);
            if(item.equals("Eggs")){
                sharedList.add("Butter");
                System.out.println("Adding butter while reading.");
            }
        }

        System.out.println("Updated shopping List " + sharedList);


    }
}
