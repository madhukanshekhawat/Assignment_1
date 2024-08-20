package day3;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("xyz.txt");
            myWriter.write("Understanding Java is fun part");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("an error occur");
            e.printStackTrace();
        }

    }
}
