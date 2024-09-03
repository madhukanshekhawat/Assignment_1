package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByEx {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Madhu","Jaipur",22));
        personList.add(new Person("Goransh","Jaipur",22));
        personList.add(new Person("Kapil","Delhi",23));
        personList.add(new Person("Khushi","Jaipur",24));
        personList.add(new Person("Sonali","Pune",23));
        personList.add(new Person("Ruchi","Delhi",23));

        System.out.println("Grouping by age : ");
        Map<Integer, List<Person>> groupByAge = personList.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(groupByAge);
        System.out.println("Grouping by city : ");
        Map<String, List<Person>> groupByCity = personList.stream().collect(Collectors.groupingBy(Person::getCity));
        System.out.println(groupByCity);
        System.out.println("Group by city then age :");
        Map<String, Map<Integer, List<Person>>> groupByCityThenAge = personList.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.groupingBy(Person::getAge)));
        System.out.println(groupByCityThenAge);
        System.out.println("Grouping by age");
        Map<Integer, Long> countByAge = personList.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
        System.out.println(countByAge);
        System.out.println("Sum of age : ");
        Map<String, Integer> sumOfAgesByCity = personList.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.summingInt(Person::getAge)));
        System.out.println(sumOfAgesByCity);

    }
}
