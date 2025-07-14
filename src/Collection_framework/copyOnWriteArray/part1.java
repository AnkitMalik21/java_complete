package Collection_framework.copyOnWriteArray;

import java.util.ArrayList;
import java.util.List;

public class part1 {
    public static void main(String[] args) {

        /*
         * CopyOnWriteArrayList Explanation:
         *
         * "Copy on Write" means that during a write operation (like adding or removing an element),
         * instead of modifying the existing list directly, a new copy of the list is created,
         * and the modification is applied to that copy.
         *
         * This ensures that other threads reading the list while it's being modified remain unaffected.
         *
         * - Read Operations: Fast and direct, since they happen on a stable copy of the list.
         * - Write Operations: A new copy of the list is created on each modification.
         *
         * Best used in read-intensive and write-light scenarios.
         */

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");

        System.out.println("Initail shopping List: " + shoppingList);

        for(String item:shoppingList){
            System.out.println(item);
            if(item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Adding butter while reading");
            }
        }
        // we will get this error ConcurrentModificationException
        System.out.println("Updated Shopping List: " + shoppingList);


    }
}
