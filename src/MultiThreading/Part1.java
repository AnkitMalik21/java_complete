package MultiThreading;

//by extending the thread class
class Thread1 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

public class Part1 {
    public static void main(String[] args) {
        Thread1 t1  = new Thread1();
        t1.start();
    }
}
