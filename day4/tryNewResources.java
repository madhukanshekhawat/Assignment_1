package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tryNewResources {
    public static void main(String[] args) throws IOException {
        int num =0;
        try( BufferedReader br= new BufferedReader(new InputStreamReader(System.in))) {
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
        }
//        BufferedReader br = null;
//        try {
////            InputStreamReader in = new InputStreamReader(System.in);
////            br=new BufferedReader(in);
//            br= new BufferedReader(new InputStreamReader(System.in));
//            num=Integer.parseInt(br.readLine());
//            System.out.println(num);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        finally
//        {
//            br.close();
//        }
    }
}
