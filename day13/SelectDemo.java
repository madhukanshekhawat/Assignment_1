package day13;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Class Loaded Succesfully");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_db", "root", "admin");
            PreparedStatement ps = connection.prepareStatement("select * from register");// provisional parameter
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                String name1 = rs.getString("name");
                String email1 = rs.getString("email");
                String pass1 = rs.getString("pass");
                String gender1 = rs.getString("gender");
                String city1 = rs.getString("city");
                System.out.println("Name : "+name1+", "+"Email : "+email1+", "+"Password : "+pass1+", "+"Gender : "+gender1+", "+"City : "+city1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
