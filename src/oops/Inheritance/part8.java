package oops.Inheritance;
//interface

interface A{
    void eat();
    void sleep();
    public static int age = 150;
}

class D implements A{
    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    public void sleep(){
        System.out.println("Dog is sleeping");
    }
}

class C implements A{
    @Override
    public void eat(){
        System.out.println("Cat eats fish");
    }

    @Override
    public void sleep(){
        System.out.println("cat is sleeping");
    }
}

public class part8 {
    public static void main(String[] args) {
        D d = new D();
        d.sleep();
        d.eat();
    }
}
