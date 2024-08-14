package day2;
class A{
    int a;
    void show(){
        System.out.println("Showing");
    }
    class B{
        void Config(){
            System.out.println("Configuring");
        }
    }
    static class C{
       void Config2(){
           System.out.println("Configuring2");
       }
    }

}
public class Demo {
    public static void main(String[] args) {
        A a1= new A();
        a1.show(); // A class can not be static as it is the main class , whereas inner classes can be static

        A.B b1= a1.new B();
        b1.Config(); // have to call it by referring the obj of A class because it is an non static class

        A.C c1= new A.C();
        c1.Config2();//no need to call by obj because c is a static class
    }
}
