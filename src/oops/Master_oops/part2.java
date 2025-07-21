package oops.Master_oops;

//we are hiding data and bundling them
//this is called encapsulation which is bundling of a data  into s single unit
//oops is a programming paradims

class Car1{
    //properties of class
    private String color;
    private String brand;
    private String model;
    private int year;
    private int speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

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
public class part2 {
    public static void main(String[] args) {
        /*
        Car1 car = new Car1();
        car.color = "blue";
        car.brand = "Tata";
        car.model = "ev";
        car.year = 2009;
        car.speed = 200;

        car.brake(23);
        System.out.println(car.speed);
        */

        //with private access modifire we cannot directly access the properites of clas
        //we use getter setters
        //this is done to make the class more secure


        Car1 car = new Car1();
        car.setBrand("Tata");
        System.out.println(car.getBrand());
    }

}

