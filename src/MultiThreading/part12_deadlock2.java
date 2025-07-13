package MultiThreading;

import java.sql.SQLOutput;

public class part12_deadlock2 {
    public static void main(String[] args) {
        String lockA = "LockA";
        String lockB = "LockB";

        Thread t1 = new Thread(()->{
           synchronized (lockA){
               System.out.println("Thread 1 : Got LockA");
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println("Thread 1:Waiting for LockB");
               synchronized (lockB){
                   System.out.println("Thread 1: Got both locks");
               }
           }
        });

        Thread t2 = new Thread(()->{
           synchronized (lockB){
               System.out.println("Thread 2: Got LockB");
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println("Thread 2: Waiting for LockA");
               synchronized (lockA){
                   System.out.println("Thread 2: Got both locks!");
               }
           }
        });

        t1.start();
        t2.start();
    }
}


//another example

//public class DeadlockExample {
//    // Two locks
//    private static final Object Lock1 = new Object();
//    private static final Object Lock2 = new Object();
//
//    public static void main(String[] args) {
//        Thread t1 = new Thread(() -> {
//            synchronized (Lock1) {
//                System.out.println("Thread 1: Holding Lock1...");
//
//                try { Thread.sleep(100); } catch (Exception e) {}
//
//                System.out.println("Thread 1: Waiting for Lock2...");
//                synchronized (Lock2) {
//                    System.out.println("Thread 1: Holding Lock1 & Lock2");
//                }
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            synchronized (Lock2) {
//                System.out.println("Thread 2: Holding Lock2...");
//
//                try { Thread.sleep(100); } catch (Exception e) {}
//
//                System.out.println("Thread 2: Waiting for Lock1...");
//                synchronized (Lock1) {
//                    System.out.println("Thread 2: Holding Lock2 & Lock1");
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();
//    }
//}


