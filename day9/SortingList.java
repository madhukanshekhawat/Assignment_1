package day9;

import java.util.*;

public class SortingList {
    public static void main(String[] args) {
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
//        Arrays.sort(arr);
        Arrays.sort(arr,1,5);
        Integer[] arr1 = { 13, 7, 6, 45, 21, 9, 2, 199 };
        Arrays.sort(arr1 , Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(8);
        arr2.add(2);
        arr2.add(31);
        arr2.add(7);
        arr2.add(90);
        arr2.add(32);
        arr2.add(21);


        System.out.println(arr2);

        Collections.sort(arr2);

        System.out.println(arr2);

        LinkedList<String> ll = new LinkedList<>();
        ll.push("Amit");
        ll.push("Ajit");
        ll.push("Bhuwan");
        ll.push("Bhumika");

        System.out.println(ll);
        Collections.sort(ll);
        System.out.println(ll);
    }
}
