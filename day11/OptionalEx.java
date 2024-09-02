package day11;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        String str="Java 8";
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional);

    }
}
