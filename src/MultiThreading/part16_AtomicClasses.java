package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class part16_AtomicClasses {
    private AtomicInteger counter = new AtomicInteger();

    public void increment(){
        counter.incrementAndGet();
    }

    public int getCounter(){
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        part16_AtomicClasses vc = new part16_AtomicClasses();
        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                vc.increment();
            }
        });

        Thread t2 = new Thread(()->{
           for(int i=0;i<1000;i++){
               vc.increment();
           }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(vc.getCounter());
    }

}
