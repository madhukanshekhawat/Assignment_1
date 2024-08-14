package day2;

import java.util.Arrays;
import java.util.List;

class Wildcard {
    public static void main(String[] args) {
//        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
//        System.out.println("Total sum is: " + sum(list1));
//
//        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
//        System.out.print("Total sum is: " + sum(list2));
        List<Integer> List_Integer = Arrays.asList(1, 2, 3, 4);
        List<Double> List_Double = Arrays.asList(4.4, 5.5, 6.6);
        Display(List_Integer);
        Display(List_Double);
    }

    private static void Display(List<?> list) {//unbounded wildcard
        System.out.println(list);
    }
}


//    private static double sum(List<? extends Number> list) {//bounded wildcards
//        double sum = 0.0;
//        for (Number i : list) {
//            sum += i.doubleValue();
//        }
//        return sum;
//    }
//}