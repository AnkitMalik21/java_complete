package oops.Encapsulation;

class Student{
    //properties/fields/instance variable and behaviour
    //encapsulation mean you can only modify via getter setter
    //private is used to encapsulate
    // generally class member are kept private
    private String name; //this is instance variable
    private int rollNumber;
    private int age;


    /*
    this is part of constructor video
    while creating the parameterised constructor we always have to
    pass the argument otherwise it will give error
    */

    public Student(String name,int rollNumber,int age){
        this.name = name;
        this.rollNumber=rollNumber;
        this.age=age;
    }
    public void setAge(int x){
        if(x<0){
            x=0;
        }
        this.age = x; //this refers to current class instance
    }

    public int getAge(){
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}


public class part1 {
    public static void main(String[] args) {
        Student student = new Student("Ankit",102,21);//this is a constructor
        //this is called to initialise the object
        //same name as class
        //the above constructor is a default constructor

//        student.setAge(-15);
//        System.out.println(student.getAge());

        System.out.println(student.getAge());
    }
}
