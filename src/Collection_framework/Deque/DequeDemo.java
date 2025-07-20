package Collection_framework.Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {

        //  double-ended queue
        //  allows insertion and removal of elements from both ends
        //  versatile than regular queues and stacks because they support all the operations of both

          /*
           INSERTION METHODS

           addFirst(E e): Inserts the specified element at the front.
           addLast(E e): Inserts the specified element at the end.
           offerFirst(E e): Inserts the specified element at the front if possible.
           offerLast(E e): Inserts the specified element at the end if possible.

           */


            /*

           REMOVAL METHODS

            removeFirst(): Retrieves and removes the first element.
            removeLast(): Retrieves and removes the last element.
            pollFirst(): Retrieves and removes the first element, or returns null if empty.
            pollLast(): Retrieves and removes the last element, or returns null if empty.

           */

        /*

           EXAMINATION METHODS

            getFirst(): Retrieves, but does not remove, the first element.
            getLast(): Retrieves, but does not remove, the last element.
            peekFirst(): Retrieves, but does not remove, the first element, or returns null if empty.
            peekLast(): Retrieves, but does not remove, the last element, or returns null if empty.

           */

        /*

           STACK METHODS

            push(E e): Adds an element at the front (equivalent to addFirst(E e)).
            pop(): Removes and returns the first element (equivalent to removeFirst())..

           */


        Deque<Integer> deque1 = new ArrayDeque<>();
        // circular , head and tail
        // no need to shift elements, just shift head and tail

        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);//add first if capacity is not voilated
        deque1.offerLast(25);

        // 5,10,20,25
        System.out.println(deque1);
        System.out.println("First Element " + deque1.getFirst());//output 5
        System.out.println("Last Element " + deque1.getLast());//output 25
        deque1.removeFirst(); //removes 5;
        deque1.pollLast(); // remove 25

        //current Deque: [10,20]
        for(int num : deque1){
            System.out.println(num);
        }

        Deque<Integer> deque2 = new LinkedList<>(); //indertion, deletion somewhere in the middle
        deque2.add(12);
        deque2.add(87);
        deque2.add(42);
        deque2.add(23);

        for(Integer i:deque2){
            System.out.println(i);
        }

        System.out.println(deque2.remove(87));
        System.out.println(deque2);
    }
}
