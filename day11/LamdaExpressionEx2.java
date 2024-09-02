package day11;

@FunctionalInterface
interface C{
    int add(int i , int j);
}

public class LamdaExpressionEx2 {
    public static void main(String[] args) {
        C c1 = (int i, int j)->  i + j;
//        C c1 = Integer::sum;

//        C c1 = new C() {
//            @Override
//            public int add(int i, int j) {
//                return i + j;
//            }
//        };

        int x= c1.add(1,2);
        System.out.println(x);
    }
}
