package Collection_framework.copyOnWriteArray;

import java.util.ArrayList;
import java.util.List;

public class part3 {
    public static void main(String[] args) {
        List<String> sharedList = new ArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");

        Thread readerThread = new Thread(()->{
            try {
                while(true){
                    for(String item: sharedList){
                        System.out.println("Reading items: "+item);
                        Thread.sleep(100);
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception in reader thread: " + e);
            }
        });

        Thread writerThread = new Thread(()->{
            try{
                Thread.sleep(500);
                sharedList.add("Item4");
                System.out.println("Added Item4 to the list.");

                Thread.sleep(500);
                sharedList.remove("Item1");
                System.out.println("Removed Item1 from the list");
            }catch (Exception e){
                 e.printStackTrace();
            }
        });

        readerThread.start();
        writerThread.start();
    }
}
