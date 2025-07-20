package oops.Inheritance;

//abstract class can have abstract as well as non-abstract method
// abstract class cannot be instantiated
//Animals a = new Animal -> not possible
// access modifier can't be private
// you can create the constructor of animal class
//use protected access modifier only when use require to extend in other class

abstract class Animals{
    private int age;
    private String name;
    private boolean hasSuperPowers;

    public Animals(){
        this.hasSuperPowers = true;
    }
    public abstract void sayHello();

    public void sleep(){
        System.out.println("zzz....");
    }
}

class Dogs extends Animals{
    @Override
    public void sayHello(){
        System.out.println("Barkie - barkie");
    }
}
public class part5 {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.sayHello();
        Animals a = new Dogs();
        a.sayHello();
    }
}
