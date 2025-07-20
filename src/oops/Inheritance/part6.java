package oops.Inheritance;

abstract class Vehicle{
    public abstract void accelerate();
    public abstract void brake();
}

class Cycle extends Vehicle{
    @Override
    public void accelerate(){
        System.out.println("Cyle is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Braking is being pressed");
    }
}


public class part6 {
    public static void main(String[] args) {
        Cycle c = new Cycle();
        c.accelerate();
        c.brake();
    }
}
