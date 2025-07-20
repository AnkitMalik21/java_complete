package oops.Inheritance;

interface Animal1{
    void eat();
    void sleep();
    public static final int Max_age = 150;
}

class Dog1 implements Animal1{
    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
}

class Cat1 implements Animal1{
    @Override
    public void eat(){
        System.out.println("CAT EATS FISH");
    }

    @Override
    public void sleep(){
        System.out.println("CAT IS SLEEPING");
    }
}
public class part7_interface {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.sleep();
        System.out.println(Animal1.Max_age);
    }
}
