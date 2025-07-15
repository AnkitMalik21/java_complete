package Collection_framework.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class part1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i:list){
            System.out.println(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        /*
        for(Integer number : numbers){
            if(number % 2 == 0){
                numbers.remove(number);
            }
        }
        java.util.ConcurrentModificationException
        */

        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext()){
            Integer number = itr.next();
            if(number % 2 ==0){
                itr.remove();
            }
        }

        System.out.println(numbers);
        ListIterator<Integer> listIterator = numbers.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

    }
}
