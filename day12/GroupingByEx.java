package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByEx {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Madhu","Jaipur",22));
        personList.add(new Person("Madhu","Jaipur",22));
        personList.add(new Person("Madhu","Jaipur",23));
        personList.add(new Person("Madhu","Jaipur",24));
        personList.add(new Person("Madhu","Jaipur",23));
        personList.add(new Person("Madhu","Jaipur",23));

        Map<Integer, List<Person>> groupByAge = personList.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(personList);
    }
}
