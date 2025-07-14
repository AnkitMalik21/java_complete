package Collection_framework.vector;

import java.util.List;
import java.util.Vector;

// the vector is a thread safe class
//there will not overriding of data

public class vector3 {
    public static void main(String[] args) {
        List<Integer> li = new Vector<>();

        Thread t1 =  new Thread(()->{
            for(int i=0;i<1000;i++){
                li.add(i);
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                li.add(i);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("The final list size is: " + li.size());
    }
}

