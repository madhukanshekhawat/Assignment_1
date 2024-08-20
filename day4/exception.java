package day4;

public class exception {
    public static void main(String[] args) {
        try {
//            A a1 = new A();
////            a1.check();
            B b1 = new B();
            b1.check1();
        } catch (ArithmeticException a){
            System.out.println(a);
        }


    }
}
class A
{
    void check() throws ArithmeticException
    {
        int a=10;
        int b=0;
        int res=a/b;
    }
}
class B
{
    void check1() throws ArithmeticException
    {
        int a=10;
        int b=0;
        int res=a/b;

    }
}