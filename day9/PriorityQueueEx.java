package day9;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(6);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(4);

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
    }
}
