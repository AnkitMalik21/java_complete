package oops.Inheritance;

class GrandParent1{
    private String Name;
    private int age;
    private boolean hasSuperPower;

    public GrandParent1(String name,int age){
        this.Name= name;
        this.age=age;
        System.out.println("GrandParent constructor called");
    }
    public String getName(){
        return this.Name;
    }

    public void setName(String name){
        this.Name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

class Parent1 extends GrandParent1{
    public Parent1(String name,int age){
        super(name,age);
        System.out.println("Parent constructor called");
    }

    public void parentMethod(){
        System.out.println("This is a parent method");
    }
}

class Child1 extends Parent1{
    public Child1(String name,int age){
        super(name,age);
        System.out.println("Child constructor called");
    }

    public void childMethod(){
        super.parentMethod();
        System.out.println("aaaa");
    }

}
public class part3 {
    public static void main(String[] args) {
        //object are created at run time
        Child1 c = new Child1("Ankit",12);
        System.out.println(c.getName());
    }
}
