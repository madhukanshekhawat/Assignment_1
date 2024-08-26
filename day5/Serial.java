package day5;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
        try {
            //object created
            Serilaization s1 = new Serilaization("Madhu kanwar shekhawat", "madhukanwar@gmail.com", 18, "Jaipur");
            Serilaization s2 = new Serilaization("Madhu kanwar shekhawat", "madhukanwar47@gmail.com", 18, "Jaipur");


            //Write into file
            FileOutputStream f1 = new FileOutputStream("xyz.txt");
            // converting it into byte stream
            ObjectOutputStream ob1 = new ObjectOutputStream(f1);
            // storing obj
            ob1.writeObject(s1);
            ob1.writeObject(s2);

            ob1.close();
            f1.close();

            System.out.println("object is converted into byte stream ans stored in textfile successfully ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
