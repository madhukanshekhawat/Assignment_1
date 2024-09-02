package day12;

import com.sun.jdi.event.StepEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        ArrayList<Integer> salary = new ArrayList<>();
        salary.add(3000);
        salary.add(3800);
        salary.add(3450);
        salary.add(4830);
        salary.add(7900);
        salary.add(9000);

        long countSal = salary.stream().filter((Integer sal) -> sal > 3000).count();
        System.out.println(countSal);

        //From Collection
        List<Integer> salaryList = Arrays.asList(3000, 3800, 3450, 4830, 7900, 9000);
        Stream<Integer> streamFromIntegerList = salaryList.stream();
        //From Array
        Integer[] salaryArray = {3000, 3800, 3450, 4830, 7900, 9000};
        Stream<Integer> streamFromIntegerArray = Arrays.stream(salaryArray);
        //From Static method
        Stream<Integer> streamFromStaticMethod = Stream.of(1000, 3500, 3450, 4830, 7900, 9000);
        //Stream Builder
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(1000).add(9000).add(3500);
        Stream<Integer> streamFromStreamBuilder = streamBuilder.build();
        //From Stream Iterate
        Stream<Integer> streamFromIterator = Stream.iterate(1000, (Integer n) -> n + 5000).limit(5);

    }
}


