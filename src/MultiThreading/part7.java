package MultiThreading;
//synchronization


//this problem arise when resource is not having lock
//and multiple threads are access a same resource simultaneously


//join
// the main thread is politely waiting for t1 and t2 to finish before moving on.
//class Counter{
//    private int count = 0;//this is a shared resource
//    public void increment(){
//        count++;
//    }
//    public int getCount(){
//        return count;
//    }
//}
//public class part7 extends Thread{
//    private Counter counter;
//
//    public part7(Counter counter){
//        this.counter = counter;
//    }
//
//    @Override
//    public void run(){
//        for(int i=0;i<1000;i++){
//            counter.increment();
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        Counter counter = new Counter();
//        part7 t1 = new part7(counter);
//        part7 t2 = new part7(counter);
//
//        t1.start();
//        t2.start();
//
//        try{
//            t1.join();
//            t2.join();
//        }catch (Exception e){
//            System.out.println(e);
//        }
//
//        System.out.println(counter.getCount());//excepted 2000 actaul will be less
//    }
//
//}


//using synchronisation

import java.sql.SQLOutput;

class Counter{
    private int count = 0;
    public synchronized  void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}

class part7 extends Thread{
    Counter counter;
    public part7(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run(){
        for(int i=0;i<1000;i++){
            counter.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        part7 t1 = new part7(counter);
        part7 t2 = new part7(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());

    }
}
