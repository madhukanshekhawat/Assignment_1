package day10;

public class Main {
    public static void main(String[] args) {
        Company camp = new Company();
        Producer producer = new Producer(camp);
        Consumer consumer = new Consumer(camp);
        producer.start();
        consumer.start();
    }
}
