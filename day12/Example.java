package day12;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape"};
        List<String> result =  Arrays.stream(stringArray).map(s -> s.contains("ry") ? "ry" : null).toList();
        System.out.println(result);
    }
}
