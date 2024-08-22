package day3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {
        public static void main(String[] args) {
            try{
//                FileReader reader = new FileReader("C:\\Users\\MadhuShekhawat\\Desktop\\alt.txt");
                FileReader reader = new FileReader("C:\\Users\\MadhuShekhawat\\Desktop\\Rough Data.txt");
                int data = reader.read();
                while(data != -1){
                    System.out.print((char)data);
                    data= reader.read();
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

