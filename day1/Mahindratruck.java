package day1;

public class Mahindratruck extends Truck {

    public static void main(String[] args) {
        Mahindratruck mt1 = new Mahindratruck();
        mt1.start();
        mt1.wheelCount=16;
        mt1.capacity();
        System.out.println(mt1.wheelCount);
    }
}

//Here i am implementing multilevel inheritance

