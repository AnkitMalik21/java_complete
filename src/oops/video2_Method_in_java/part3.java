package oops.video2_Method_in_java;

class Animal{
    String name;
    int age;
    //parent class method has been overridden
    public void makeSound(){
        System.out.println("hello animal");
    }

}
class Cat extends Animal {
    String breed;

    public void makeSound(){
        System.out.println("hello cat");
    }

}

class Dog extends Animal {
    String breed;
    public void makeSound(){
        System.out.println("hello dog");
    }

}
public class part3 {
    public static void main(String[] args) {
        Cat a = new  Cat();
        a.name = "bob";
        Cat cat = makeCatNameUpperCase(a);//returning a cat object
        System.out.println(cat.name);
        System.out.println(cat.hashCode());

        System.out.println(a.name);
        System.out.println(a.hashCode());
    }
    //they all working on same objects
    public static Cat makeCatNameUpperCase(Cat cat){
        System.out.println(cat.hashCode());
        cat.name = cat.name.toUpperCase();
        return cat;
    }
}
