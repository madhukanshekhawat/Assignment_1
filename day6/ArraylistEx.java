package day6;
import java.util.*;
public class ArraylistEx {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Madhu");
        name.add("Ruchi");
        name.add("Goransh");
        name.add("Mohit");

        System.out.println(name);

        name.add(1,"Mridul");
        System.out.println(name);

        System.out.println(name.get(0));

        name.remove(1);
        System.out.println(name);

        System.out.println(name.size());

//        name.clear();
//        System.out.println(name);

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=5;i++){
            arr.add(i);
        }
        System.out.println(arr);

        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int j=6;j<=10;j++){
            arr1.add(j);
        }
        System.out.println(arr1);


//        arr.addAll(arr1);
//        System.out.println(arr);

        arr.addAll(3,arr1);
        System.out.println(arr);


        System.out.println(arr1.contains(4));





    }
}
