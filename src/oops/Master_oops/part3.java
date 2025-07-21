package oops.Master_oops;
//inheritance
class Animal{
    String name;
    int age;
    //parent class method has been overridden
    public void makeSound(){
        System.out.println("hello animal");
    }

}
class Cat extends Animal{
    String breed;

    public void makeSound(){
        System.out.println("hello cat");
    }

}

class Dog extends Animal{
    String breed;
    public void makeSound(){
        System.out.println("hello dog");
    }

}
public class part3 {
    public static void main(String[] args) {
/*
        Dog dog  = new Dog();
        dog.makeSound();//hello dog
*/
        Animal dog = new Dog();
        dog.makeSound();//hello dog

        //object is of dog type but reference is of parent class
        //sub class object can be treated as super class instance

        //dog.breed = "PARAYAH DOG"; THIS CONTAIN ONLY PARENT CLASS PROPERTY NOT DOG CLASS
        //abstraction hiding implementation details

    }
}
