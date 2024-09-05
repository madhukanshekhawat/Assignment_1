package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {
    public static void main(String[] args) {
        String email1= "amit@gmail.com";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Class Loaded Succesfully");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_db", "root", "admin");
            PreparedStatement ps = connection.prepareStatement("delete from register where email=?");// provisional parameter
            ps.setString(1, email1);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Deleted Successfully");
            } else {
                System.out.println("Failed");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
