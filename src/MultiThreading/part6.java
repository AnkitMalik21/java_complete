package MultiThreading;
//thread daemon
//Marks the thread as either a daemon thread or a
//user thread. When the JVM exits, all daemon threads are terminated.

//daemon thread is background thread if user thread dies it also termintes

public class part6 extends Thread{
    @Override
    public void run(){
        System.out.println("Daemon running: " + isDaemon());
        while(true);
    }

    public static void main(String[] args) throws InterruptedException {
        part6 t1 = new part6();
        t1.setDaemon(true);// t1 is daemon thread(like garbage collector)
        t1.start();

        Thread.sleep(2000);
        System.out.println("Main thread ends");

    }
}
