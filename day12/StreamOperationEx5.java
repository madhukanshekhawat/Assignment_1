package day12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamOperationEx5 {
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
        System.out.println("findFirst:");
        Optional<String> first = stream.findFirst();
        first.ifPresent(System.out::println);
    }
}
