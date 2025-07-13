package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
// allow same thread to acquire multiple locks avoiding deadlock

//reentrant Example
public class part9{
    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer method lock");
            innerMethod();
        }finally {
            System.out.println("Outer method lock unlocked");
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try {
            System.out.println("Inner method lock");
        }finally {
            System.out.println("Inner method lock unlocked");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        part9 example = new part9();
        example.outerMethod();
    }
}
