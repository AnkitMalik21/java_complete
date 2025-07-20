package oops.Inheritance;

//polymorphism

class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    //method to add double value
    public double add(double a,double b){
        return a+b;
    }
}

public class part4 {
    public static void main(String[] args) {
        //at compile time it is decided which method to call
        Calculator  c = new Calculator();
        System.out.println(c.add(12,14));
        System.out.println(c.add(12,23,24));
        System.out.println(c.add(5.5,6.5));
    }
}
