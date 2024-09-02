package day11;

@FunctionalInterface
interface B{
    //    void show();
    void show(int n);
}
//class B implements A {
//
//    @Override
//    public void show() {
//        System.out.println("In Class B and implementing Class A method");
//    }
//}
class LamdaExpressionEx {
    public static void main(String[] args) {
//        B obj = () -> {
//                System.out.println("Showing But with the help of anonymous method...!");
//            };
//        B obj = () -> System.out.println("Showing But with the help of anonymous method...!");

//        B obj = (int i ) -> System.out.println("Showing But with the help of anonymous method...!" +i );
//        obj.show(5);
//        B obj = ( i ) -> System.out.println("Showing But with the help of anonymous method...!" +i );
//        obj.show(5);
        B obj = i  -> System.out.println("Showing But with the help of anonymous method...!" +i );
        obj.show(5);
    }
}

