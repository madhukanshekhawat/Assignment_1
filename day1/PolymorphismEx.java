package day1;

public class PolymorphismEx {
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        PolymorphismEx calci1 = new PolymorphismEx();

        int result=calci1.add(1,2);
//        System.out.println(calci1.add(1,2));
//        System.out.println(calci1.add(1,2,3));
        System.out.println(result);
    }
}
//method overloading
