package day3;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class WriteFile {
    public static void main(String[] args) {
        try {
 //           FileWriter myWriter = new FileWriter("xyz.txt",true);// append in file whereas if i write flase it will overwrite
//            myWriter.write("Understanding Java is fun part");
            FileWriter myWriter = new FileWriter("xyz.txt", StandardCharsets.US_ASCII);
            myWriter.write("\u0041");
//           myWriter.write("Understanding Java is fun part");
//            myWriter.write("xyzyxz");

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("an error occur");
            e.printStackTrace();
        }

    }
}
