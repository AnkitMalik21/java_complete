package Collection_framework.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class part6 {
    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        student.add(new Student("Charlie", 3.8));
        student.add(new Student("Blice", 3.5));
        student.add(new Student("Alice", 3.5));
        student.add(new Student("Ankit", 3.9));

        //this will arrage them based on gpa
        //person  with same gpa will be based on alphabetical order
        student.sort((o1,o2)->{
            if(o2.getGpa() - o1.getGpa()>0){
                return 1;
            }else if(o2.getGpa() - o1.getGpa()<0){
                return -1;
            }else{
                return o1.getName().compareTo(o2.getName());
            }
        });

        for(Student s : student){
            System.out.println(STR."\{s.getName()}: \{s.getGpa()}");
        }

    }
}
