package day5;

import java.io.*;

public class serialArray {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30, 40, 50};

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("array.ser"))) {
            out.writeObject(intArray);
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("array.ser"))) {
            int[] deserializedArray = (int[]) in.readObject();
            for (int num : deserializedArray) {
                System.out.print(num + " ");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
