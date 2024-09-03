package day11;

//Predicate
@FunctionalInterface
interface Prediacte<T>{
    boolean test (T t);
}
public class FunctionalInterfaceType {
    public static void main(String[] args) {
        Prediacte<Integer> isEven = (Integer val) ->
        {
            if(val%2==0){
                return true;
            }
            return false;
        };
        System.out.println(isEven.test(2));
    }
}

//Function
//@FunctionalInterface
//interface Function<T,R>{
//    R apply(T t);
//}
//public class FunctionalInterfaceType {
//    public static void main(String[] args) {
//       Function<Integer,String> integerToString =(Integer num)->
//       {
//          String output = num.toString();
//          return output;
//       };
//       System.out.println(integerToString.apply(2));
//    }
//}

//Supplier
//@FunctionalInterface
//interface Supplier<T> {
//    T get();
//}
//public class FunctionalInterfaceType {
//    public static void main(String[] args) {
//        Supplier<String> retuning = () ->"Returning...";
//        System.out.println(retuning.get());
//    }
//}


//Consumer
//@FunctionalInterface
// interface Consumer<T>{
//    void accept(T t);
//}
//public class FunctionalInterfaceType {
//    public static void main(String[] args) {
//        Consumer<Integer> loggingObj = (Integer val) ->
//        {
//            if(val>10){
//                System.out.println("Logging...");
//            }
//        };
//        loggingObj.accept(16);
//    }
//}
