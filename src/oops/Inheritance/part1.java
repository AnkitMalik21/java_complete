package oops.Inheritance;
//inheritance

//dog will inherit props from its parent class

class Animal{
    private String name;
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("This animal eats food");
    }

    public void sayHello(){
        System.out.println("....");
    }
}

class Dog extends Animal{
    @Override
    public void sayHello(){
        System.out.println("Woof");
    }
    public void sayBye(){
        System.out.println("bye from dog");
    }
}

class Cat extends Animal{
    @Override
    public void sayHello(){
        System.out.println("Meow");
    }
}

public class part1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setAge(12);
        System.out.println(d.getAge());

        d.eat();
        d.sayHello();

        Cat c = new Cat();
        c.sayHello();

        //reference of parent class and object of child class
        Animal dog = new Dog();//upcasting
        dog.sayHello();//dog object still point to Dog class method but only those which are also present in parent class

        //dog.sayBye(); -> this will give error

        /*
        dog.sayBye(); -> we can only call method which are present in animal class
        this is decided at run time
        this is also called dynamic method dispatch
        */

        Animal cat = new Cat();
        cat.sayHello();

        Dog myDog = (Dog) dog;//downcasting
    }
}
