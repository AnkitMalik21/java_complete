//
//public class Main {
//    static void divide(int a,int b){
//        if(b==0){
//            throw new ArithmeticException("Division by zero is not allowed");
//        }else{
//            int result = a/b;
//            System.out.println("Result: " + result);
//        }
//
//    }
//    public static void main(String[] args) {
//        try{
//            divide(10,0);
//        } catch (ArithmeticException e) {
//            System.out.println("CAUGHT EXCEPTION: " + e.getMessage());
//        }
//    }
//
//
//}

//public class Main{
//    public static void main(String[] args) {
//        try{
//            int result =10/5;
//            System.out.println("Result: " + result);
//        }catch (ArithmeticException e){
//            System.out.println("Caught: " + e.getMessage());
//        }
//        finally{
//            System.out.println("This is the finally block.");
//        }
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        int age = 15;
//        if(age<18){
//            throw new ArithmeticException("You are not eligible to vote.");
//        }
//
//        System.out.print("You can vote");
//    }
//}

//public class Main{
//    public static void checkAge(int age) throws Exception{
//        if(age<18){
//            throw new Exception("Access denied - you must be atleast 18 year old");
//        }else{
//            System.out.println("Access greanted - you are old enough.");
//        }
//    }
//
//    public static void main(String[] args) {
//        try{
//            checkAge(16);
//        } catch (Exception e) {
//            System.out.println("Caught exception : " + e.getMessage());
//        }
//    }
//}


//extending the thread class

//class MyThread extends Thread{
//    @Override
//    public void run(){
//        System.out.println("Thread is running");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.start();
//    }
//}

//implementing the runnable interface

//class MyThread implements Runnable{
//    @Override
//    public void run(){
//        for(int i=0;i<30;i++){
//            System.out.println("Thread: " + Thread.currentThread().getName());
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        MyThread m1 = new MyThread();
//        Thread t1 = new Thread(m1);
//        Thread t2 = new Thread(m1);
//        t1.start();
//        t2.start();
//    }
//}

// thread synchronization part
//class Counter{
//    int count = 0;
//
//    public synchronized void increment(){
//        count++;
//    }
//}
//
//public class Main{
//    public static void main(String[] args) throws InterruptedException {
//        Counter counter = new Counter();
//
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<1000;i++){
//                    counter.increment();
//                    System.out.println("Thread" + Thread.currentThread().getName());
//                }
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i=0;i<1000;i++){
//                    counter.increment();
//                    System.out.println("Thread" + Thread.currentThread().getName());
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("Final count: " + counter.count);
//    }
//}

//public class Main extends Thread{
//    @Override
//    public void run(){
//        System.out.println("Thread is running");
//    }
//
//    public static void main(String[] args) {
//        Main t1 = new Main();
//        Main t2 = new Main();
//
//        System.out.println("Priority of thread 1 " + t1.getPriority());
//        System.out.println("Priority of thread 2 " + t2.getPriority());
//
//        t1.setPriority(3);
//        t2.setPriority(8);
//
//        t1.start();
//        t2.start();
//
//        System.out.println("Priority of thread 1 " + t1.getPriority());
//        System.out.println("Priority of thread 2 " + t2.getPriority());
//    }
//}

