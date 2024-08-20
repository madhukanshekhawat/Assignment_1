package day1;

public class truck extends Inheritance {
    void capacity(){
        System.out.println("It can load 4 maruti 800");
    }
    public static void main(String[] args) {
        truck t1 = new truck();
        t1.WheelCount=8;
        t1.start();
        System.out.println("Truck have "+t1.WheelCount+" Wheels");
    }
}
//Heriracal inheritance
