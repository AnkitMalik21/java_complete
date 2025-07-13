package MultiThreading;


class Thread2 implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
public class Part2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread2());
        t1.start();
    }
}
