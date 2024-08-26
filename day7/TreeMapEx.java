package day7;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        // Creating a TreeMap instance
        TreeMap<String, Integer> tm = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        tm.put("Alia", 85);
        tm.put("Bhuwan", 92);
        tm.put("Chetna", 78);
        tm.put("Deepak", 90);

        // Creating another TreeMap instance and copying all entries from the first TreeMap
        TreeMap<String, Integer> tm1 = new TreeMap<>();
        tm1.putAll(tm);

        // Adding a key-value pair only if the key is not already present
        tm1.putIfAbsent("Madhu", 95);

        // Printing the original TreeMap
        System.out.println(tm);

        // Printing the second TreeMap
        System.out.println(tm1);

        // Getting the value associated with the key "Alia"
        System.out.println(tm1.get("Alia")); // returns value of the key "Alia"

        // Getting the value associated with the key "Alia" or returning a default value if the key is not found
        System.out.println(tm1.getOrDefault("Alia", 25));

        // Removing the key-value pair with the key "Madhu"
        tm1.remove("Madhu");
        System.out.println(tm1);

        // Replacing the value associated with the key "Alia"
        tm1.replace("Alia", 50);
        System.out.println(tm1);
    }
}

