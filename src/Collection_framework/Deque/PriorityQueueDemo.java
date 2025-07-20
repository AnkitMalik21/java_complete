package Collection_framework.Deque;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //part of the queue interface
        //order elements based on their natural ordering (for primitive lowest first)
        //custom comparator for customised ordering
        //does not allow null elements

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(10);
        pq.add(17);
        pq.add(5);
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());//retrieve and remove the front
        }

        //internal working
        //priority Queue is implemented as a min heap by default ( for natural ordering)

    }
}
