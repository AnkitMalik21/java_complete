package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//true is used to make the reentrant lock fair
public class part11_fairLock {
    private final Lock lock = new ReentrantLock(true);

    public void accesResource(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + " released the lock");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        part11_fairLock example = new part11_fairLock();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accesResource();
            }
        };

        Thread thread1 = new Thread(task,"Thread 1");
        Thread thread2 = new Thread(task,"Thread 2");
        Thread thread3 = new Thread(task,"Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
