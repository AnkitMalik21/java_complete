package oops.video1_Master_oops;

//oops is a programming paradims
class Car{
     //properties of class
     String color;
     String brand;
     String model;
     int year;
     int speed;

    public void acceelerate (int increment){ //method of clas
        speed+=increment;
    }
    //this is a behaviour
    public void brake(int decrement){
        speed -= decrement;
        if(speed<0){
            speed = 0;
        }
    }
}
public class Part1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "blue";
        car.brand = "Tata";
        car.model = "ev";
        car.year = 2009;
        car.speed = 200;

        car.brake(23);
        System.out.println(car.speed);
    }

}
