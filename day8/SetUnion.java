package day8;

import java.util.HashSet;
import java.util.Set;

public class SetUnion {
    public static  void main(String[] args) {
        Set<String> event1Guests = new HashSet<>();
        event1Guests.add("Madhu");
        event1Guests.add("Goransh");
        event1Guests.add("Ruchi");

        Set<String> event2Guests = new HashSet<>();
        event2Guests.add("Ravi");
        event2Guests.add("Rahul");
        event2Guests.add("Goransh");

        Set<String> allGuests = new HashSet<>(event1Guests);
        allGuests.addAll(event2Guests);
        System.out.println("List of All guest is :" + allGuests);

        Set<String> commonGuests = new HashSet<>(event1Guests);
        commonGuests.retainAll(event2Guests);
        System.out.println("List of common guests in event :"+ commonGuests);

        Set<String> uniqueGuest = new HashSet<>(event1Guests);
        uniqueGuest.removeAll(event2Guests);
        System.out.println("Unique guests of event1 :"+ uniqueGuest);

        System.out.print("List of all guests : ");
        for (String element : allGuests) {
            System.out.print(element+" ");
        }

//        System.out.println();
        System.out.println(" Is Goransh available on the guest list?");
        boolean contains = allGuests.contains("Goransh");
    }
}
