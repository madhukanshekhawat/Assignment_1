package day5;

import java.io.*;

public class deserial {
    public static void main(String[] args) {
       try{
           FileInputStream fi= new FileInputStream("xyz.txt");
           ObjectInputStream ob1 = new ObjectInputStream(fi);

           serilaization s1 = (serilaization) ob1.readObject();

           s1.displayName();
           System.out.println(s1.getAge());
           System.out.println(s1.getEmail());
           System.out.println(s1.getAddress());

       } catch (IOException | ClassNotFoundException ex) {
           throw new RuntimeException(ex);
       }
    }
}
