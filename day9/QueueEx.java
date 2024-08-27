package day9;

import java.awt.im.InputMethodRequests;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> customerLine = new LinkedList<>();

        //adding customer
        customerLine.add("Alia");
        customerLine.add("Bhuwan");
        customerLine.add("Chetna");
        customerLine.add("Deepak");
        customerLine.add("Goransh");

        //checking number of customer in line
        System.out.println("No of customer in line :" + customerLine.size());

        //serving customer
        while(!customerLine.isEmpty()){
            System.out.println("Next Customer who is getting serve ?" + customerLine.peek());
            System.out.println("Serving to : "+customerLine.remove());
        }

        //more customer joined the line
        customerLine.add("Madhu");
        customerLine.add("Ruchi");
        customerLine.add("Ritu");
        customerLine.add("Vyom");

        System.out.println("No of customer in line added : " + customerLine.size());

        //serving customer
        while(!customerLine.isEmpty()){
            System.out.println("Next Customer who is getting serve ?" + customerLine.peek());
            System.out.println("Serving to : "+customerLine.poll());
        }

        // checking if any customer left or not here
        System.out.println("All customer Served? " + customerLine.isEmpty());

    }
}
