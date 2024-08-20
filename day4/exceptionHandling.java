package day4;

public class exceptionHandling {
    public static void divide(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("oops! Divison by zero");
        }
        int result = a/b;
        System.out.println(result);
    }
    public static void main(String[] args)  {
        try {
            divide(10,0);
        }
        catch (ArithmeticException e){
            System.out.println("caught exception:  "+ e.getMessage());
        }

//        try{
//          int arr[] = new int[10];
//          arr[11]=10/2;
//
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//
//        }
//        catch(IndexOutOfBoundsException a){
//            System.out.println(a.getMessage());
//        }

//        try{
//            int arr[] = new int[10];
//            arr[11]=10/0;
//        }
//        catch (  IndexOutOfBoundsException | ArithmeticException a){
//           System.out.println(a.getMessage());
//        }

//        try{
//            int arr[] = new int[10];
//            arr[11]=10/2;
//        }
//        catch (Exception e){
////            e.printStackTrace();
////            System.out.println(e.getMessage());
//            System.out.println("You got Exception");
//            throw e;
//        }
//        finally {
//            System.out.println("oops!");
//        }

    }
}
