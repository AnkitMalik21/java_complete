package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class part10_ReadWriteCounter {
    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment(){
        writeLock.lock();
        try{
            count++;
            Thread.sleep(50);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }finally {
            writeLock.unlock();
        }
    }

    public int getCount(){
        readLock.lock();
        try{
            return count;
        }finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        part10_ReadWriteCounter counter = new part10_ReadWriteCounter();

        Runnable readTask = new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName() + " read: " + counter.getCount());
                    try {
                        Thread.sleep(100); // Add some delay to make the output more readable
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 5; i++) { // Multiple increments to see the effect
                    counter.increment();
                    System.out.println(Thread.currentThread().getName()+ " increment - count is now: " + counter.getCount());
                }
            }
        };

        Thread writeThread = new Thread(writeTask, "Writer");
        Thread readThread1 = new Thread(readTask, "Reader-1");
        Thread readThread2 = new Thread(readTask, "Reader-2");

        // Start the threads BEFORE joining them
        writeThread.start();
        readThread1.start();
        readThread2.start();

        // Wait for all threads to complete
        writeThread.join();
        readThread1.join();
        readThread2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}