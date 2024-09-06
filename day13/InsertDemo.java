package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDemo {
    public static void main(String[] args)  {
//        Scanner scanner = new Scanner(System.in);
//        String inp = scanner.nextLine();
//        System.out.println(inp);
        String name1 = "Madhu";
        String email1 = "madhu@gmail.com";
        String password1 = "madhu123";
        String gender1 = "female";
        String city1="Jaipur";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Class Loaded Succesfully");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_db", "root", "admin");
//            PreparedStatement ps = connection.prepareStatement("insert into register values ('"+inp+"','madhu@gmail.com','deepak123','female','Jaipur')");
//            PreparedStatement ps = connection.prepareStatement("insert into register values ('Goransh','goransh@gmail.com','goransh123','male','Delhi')");
            PreparedStatement ps = connection.prepareStatement("insert into register values (?,?,?,?,?)");// provisional parameter
            ps.setString(1, name1);
            ps.setString(2, email1);
            ps.setString(3, password1);
            ps.setString(4, gender1);
            ps.setString(5, city1);

            int i = ps.executeUpdate();
            if(i>0){
                System.out.println("Success");
            }
            else {
                System.out.println("Fail");
            }
        }catch (Exception e){
            e.getStackTrace();
        }


    }
}
