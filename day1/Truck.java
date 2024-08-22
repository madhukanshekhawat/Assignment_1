package day1;

public class Truck extends Inheritance {
    void capacity(){
        System.out.println("It can load 4 maruti 800");
    }
    public static void main(String[] args) {
        Truck t1 = new Truck();
        t1.wheelCount=8;
        t1.start();
        System.out.println("Truck have "+t1.wheelCount+" Wheels");
    }
}
//Heriracal inheritance
