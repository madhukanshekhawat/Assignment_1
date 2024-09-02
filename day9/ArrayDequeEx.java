package day9;

import jdk.jfr.SettingControl;

import java.awt.im.InputMethodRequests;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> sitingArrangement= new ArrayDeque<>();
        sitingArrangement.add(1);
        sitingArrangement.add(2);
        sitingArrangement.add(3);
        sitingArrangement.addFirst(4);
        sitingArrangement.addLast(5);
        sitingArrangement.offer(6); // add at last
        sitingArrangement.offerFirst(7); // add at first
        sitingArrangement.offerLast(8); // add at last

        System.out.println("Number of student sitting allowed : "+sitingArrangement.size());
        if(!sitingArrangement.isEmpty()){
            System.out.println("First in row : "+sitingArrangement.getFirst());
        }
        else{
            System.out.println("OOPS! No sitting arrangement available");
        }

        if(!sitingArrangement.isEmpty()){
            System.out.println("Last in row : "+sitingArrangement.getLast());        }
        else{
            System.out.println("OOPS! No sitting arrangement available");
        }

        System.out.println("Student siting on first bench : "+ sitingArrangement.peek());

        System.out.println("siting arrangement is : ");
        while(!sitingArrangement.isEmpty()){
            System.out.print(sitingArrangement.poll() + " ");
        }



    }
}
