package Collection_framework.comparator;

import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private double gpa;

    public Student(String name,double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public double getGpa(){
        return gpa;
    }
}

public class part4 {
    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        student.add(new Student("Charlie",3.8));
        student.add(new Student("Bob",3.4));
        student.add(new Student("Alice",3.5));
        student.add(new Student("Ankit",3.9));

        student.sort((o1,o2)->{
            if(o2.getGpa() - o1.getGpa()>0){
                return 1;
            }else if(o2.getGpa() - o1.getGpa()<0){
                return -1;
            }else{
                return 0;
            }
        });

        for(Student s : student){
            System.out.println(s.getName() +": " + s.getGpa());
        }
    }
}
