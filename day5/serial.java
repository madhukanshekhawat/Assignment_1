package day5;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serial {
    public static void main(String[] args) {
        try {
            //object created
            serilaization s1 = new serilaization("Madhu kanwar", "madhu@gmail.com", 21, "Jaipur");
            //Write into file
            FileOutputStream f1 = new FileOutputStream("xyz.txt");
            // converting it into byte stream
            ObjectOutputStream ob1 = new ObjectOutputStream(f1);
            // storing obj
            ob1.writeObject(s1);

            ob1.close();
            f1.close();

            System.out.println("object is converted into byte stream ans stored in textfile successfully ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
