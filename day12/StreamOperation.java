package day12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "apple");

        // Intermediate Operations
        Stream<String> stream = words.stream()
                .filter(word -> word.length() > 4) // Filter words with length > 4
                .map(String::toUpperCase) // Convert to uppercase
                .flatMap(word -> Stream.of(word.split(""))) // Flatten each word into a stream of characters
                .distinct() // Remove duplicates
                .sorted() // Sort alphabetically
                .peek(System.out::println) // Print each element
                .limit(20) // Limit to 20 elements
                .skip(2); // Skip the first 2 elements

        // Terminal Operations
        // 1. forEach
        System.out.println("forEach:");
        stream.forEach(System.out::println);

        /*
        1. Filter : >4 ["apple", "banana", "cherry", "elderberry", "grape", "apple"]
        2. UpperCase ["APPLE", "BANANA", "CHERRY", "ELDERBERRY", "GRAPE", "APPLE"]
        3. split : ["A", "P", "P", "L", "E", "B", "A", "N", "A", "N", "A", "C", "H", "E", "R", "R", "Y", "E", "L", "D", "E", "R", "B", "E", "R", "R", "Y", "G", "R", "A", "P", "E", "A", "P", "P", "L", "E"]
        4. remove duplicates : ["A", "B", "C", "D", "E", "G", "H", "L", "N", "P", "R", "Y"]
        5.Sort ["A", "B", "C", "D", "E", "G", "H", "L", "N", "P", "R", "Y"]
        6. peek A
                B
                C
                D
                E
                F
                G
                H
                L
                N
                P
                R
                Y
        7. limit-20 ["A", "B", "C", "D", "E", "G", "H", "L", "N", "P", "R", "Y"]
        8. skip 2 ["C", "D", "E", "G", "H", "L", "N", "P", "R", "Y"]



        */

    }
}