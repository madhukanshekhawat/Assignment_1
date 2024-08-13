public class car extends Inheritance{
    void start(){
        System.out.println("Car is starting");
    }
    public static void main(String[] args) {
        car c1 = new car();
        c1.start();
        c1.veelcount=4;
        System.out.println("char have "+c1.veelcount +" vehicles");
    }
}
