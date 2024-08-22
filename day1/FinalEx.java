package day1;

public class FinalEx {
    final double PI = 3.14;

    double circumstanceOfCircle(int r) {
        double result = 2 * PI * r;
        return result;
    }

    public static void main(String[] args) {
        FinalEx f1 = new FinalEx();
        double r = f1.circumstanceOfCircle(2);
        System.out.println(r);
    }
}
