package Collection_framework.Deque;

import java.awt.geom.Line2D;
import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        System.out.println(queue1.size());

        System.out.println(queue1.remove(1)); //throws an exception if empty
        System.out.println(queue1.poll());

        //System.out.println(queue1.element()); throws exception if empty
        System.out.println(queue1.peek());

        Queue<Integer>queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(1));//true
        System.out.println(queue2.offer(2));//true

        //System.out.println(queue2.add(3)); this throws an exception please remember
        System.out.println(queue2.offer(3));
    }
}
