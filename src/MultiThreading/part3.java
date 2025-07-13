package MultiThreading;
//Thread lifeCycle

class Thread3 extends Thread{
    @Override
    public void run(){
        System.out.println("Running");//Running
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class part3 {
    public static void main(String[] args) throws InterruptedException {
        Thread3 t1 = new Thread3();
        System.out.println(t1.getState()); //NEW

        t1.start();

        System.out.println(t1.getState());
        try {
            Thread.sleep(100);//
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(t1.getState());//timed_waiting

        t1.join();
        System.out.println(t1.getState());//terminated

    }
}
