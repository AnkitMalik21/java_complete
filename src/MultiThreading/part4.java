package MultiThreading;

public class part4 extends Thread {
    public part4(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println("Thread is running...");
        for(int i=1;i<=5;i++){
            for(int j=0;j<=5;j++){
                System.out.println(Thread.currentThread().getName() + "-Priority: " + Thread.currentThread().getPriority() + "- count: " + i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        part4 l = new part4("Low priority Thread");
        part4 m = new part4("Medium priority Thread");
        part4 h = new part4("High priority Thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();
    }
}
