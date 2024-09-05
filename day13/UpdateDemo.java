package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {
    public static void main(String[] args) {
        String pass1= "madhu@123";
        String name1= "madhu";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Class Loaded Succesfully");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_db", "root", "admin");
            PreparedStatement ps = connection.prepareStatement("Update register set pass=? where name=?");// provisional parameter
            ps.setString(1, pass1);
            ps.setString(2, name1);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Updated Successfully");
            } else {
                System.out.println("Failed");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
