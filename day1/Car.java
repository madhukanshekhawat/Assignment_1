package day1;

public class Car extends Inheritance {
    void start(){
        System.out.println("Car is starting");
    } // method overriding
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.wheelCount=4;
        System.out.println("char have "+c1.wheelCount +" wheels");
    }
}

//simple / Hierarical