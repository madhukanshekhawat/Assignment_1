package day1;

public class car extends Inheritance {
    void start(){
        System.out.println("Car is starting");
    } // method overriding
    public static void main(String[] args) {
        car c1 = new car();
        c1.start();
        c1.WheelCount=4;
        System.out.println("char have "+c1.WheelCount +" wheels");
    }
}

//simple / Hierarical