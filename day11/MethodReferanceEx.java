package day11;

public class MethodReferanceEx {
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        MethodReferanceEx methodReferanceEx = new MethodReferanceEx();
        System.out.println(add(1,2));
    }
}
