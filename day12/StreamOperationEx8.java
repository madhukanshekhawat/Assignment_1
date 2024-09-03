package day12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamOperationEx8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "apple");
        Stream<String> stream = words.stream()
                .filter(word -> word.length() > 4)
                .map(String::toUpperCase)
                .flatMap(word -> Stream.of(word.split("")))
                .distinct()
                .sorted()
                .limit(20)
                .skip(2);
        System.out.println("\nUsing max:");
        Optional<String> max = stream.max(Comparator.naturalOrder());
        max.ifPresent(System.out::println);
    }
}
