package day9;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
    private Integer id;
    private Integer Amount;
    private String Name;

    public Customer(Integer id, Integer amount, String name) {
        this.id = id;
        Amount = amount;
        Name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Amount=" + Amount +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return o.id > this.id ? 1 : -1 ;
    }

    public void produce_item(int i) {
    }
}
