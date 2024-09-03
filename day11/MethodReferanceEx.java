package day11;

import java.util.function.BiFunction;

public class MethodReferanceEx {
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        //First two are input parameters and third one is output parameter
        BiFunction<Integer, Integer, Integer> addFunction = MethodReferanceEx::add;
        System.out.println(add(1,2));
    }
}
