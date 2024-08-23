package day7;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
         tm.put("Alia", 85);
        tm.put("Bhuwan", 92);
        tm.put("Chetna", 78);
        tm.put("Deepak", 90);

        TreeMap<String,Integer> tm1 = new TreeMap<>();
        tm1.putAll(tm);
        tm1.putIfAbsent("Madhu",95);
        System.out.println(tm);
        System.out.println(tm1);

        System.out.println(tm1.get("Alia")); // return value of any key
//        System.out.println(tm1.getOrDefault("Alia","default"));
        tm1.remove("Madhu");
        System.out.println(tm1);
        tm1.replace("Alia", 50);
        System.out.println(tm1);
    }
}
