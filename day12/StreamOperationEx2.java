package day12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationEx2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "apple");
        Stream<String> stream = words.stream()
                .filter(word -> word.length() > 4)
                .map(String::toUpperCase)
                .flatMap(word -> Stream.of(word.split("")))
                .distinct()
                .sorted()
                .peek(System.out::println)
                .limit(20)
                .skip(2);
        System.out.println("Using collect:");
        Set<String> resultSet = stream.collect(Collectors.toSet());
        System.out.println(resultSet);
    }
}
