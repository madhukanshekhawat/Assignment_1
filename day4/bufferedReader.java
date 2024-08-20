package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            br.close();
        }
    }
}
