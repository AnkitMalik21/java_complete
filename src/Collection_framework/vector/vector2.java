package Collection_framework.vector;

import java.util.ArrayList;

public class vector2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Thread t1 = new Thread(()->{
           for(int i=0;i<1000;i++){
               list.add(i);
           }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final list size " + list.size());
    }
}
// this will give exception
// since arrayList is not thread safe we will be corrupt data in our list
//the total count will be less than 2000