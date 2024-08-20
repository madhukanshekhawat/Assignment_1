package day1;

public class finalEx {
    final double PI = 3.14;

    double circumstanceOfCircle(int r) {
        double result = 2 * PI * r;
        return result;
    }

    public static void main(String[] args) {
        finalEx f1 = new finalEx();
        double r = f1.circumstanceOfCircle(2);
        System.out.println(r);
    }
}
