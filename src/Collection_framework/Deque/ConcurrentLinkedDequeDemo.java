package Collection_framework.Deque;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {
    public static void main(String[] args) {
        //non - blocking , thread safe doubke - ended queue
        //cas

        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Element1");
        deque.addFirst("Element0");
        deque.addLast("Element2");
        deque.addLast("Element4");

        System.out.println(deque);

        String first = deque.removeFirst();
        String last = deque.removeLast();
        System.out.println(first);
        System.out.println(last);


    }
}
