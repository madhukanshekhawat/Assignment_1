package day9;

import java.util.PriorityQueue;

public class PriorityQueue2 {
    public static void main(String[] args) {
//        PriorityQueue<Customer> customers = new PriorityQueue<>();
        PriorityQueue<Customer> customers = new PriorityQueue<>(new CustomerOrder());
        customers.add(new Customer(4, 50, "Vipun"));
        customers.add(new Customer(1, 500, "Nidhi"));
        customers.add(new Customer(6, 150, "Neha"));


        System.out.println(customers);
    }
}
