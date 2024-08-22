package day5;

import java.io.Serializable;

public class Serilaization implements Serializable {
    String name;
    String email;
     transient  int age;
    String address;

    public Serilaization(String name, String email, int age, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    void displayName(){
        System.out.println("My name is " + this.name);
    }

    public static void main(String[] args) {




    }
}
