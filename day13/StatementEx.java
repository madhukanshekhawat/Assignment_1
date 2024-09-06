package day13;

import java.sql.*;

public class StatementEx {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Class loaded Succesfully");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_db", "root", "admin");
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery( "SELECT name,email,city from register");
        while (rs.next()){
            String name1 = rs.getString("name");
            String email1= rs.getString("email");
            String city1 = rs.getString("city");
            System.out.println("Name : "+name1+", "+"Email : "+email1+", "+"City : "+ city1);
        }
        ResultSet rs2 = stmt.executeQuery("Select gender from register");
        while (rs2.next()){
            String gender1=rs.getString("gender");
            System.out.println("Gender : "+gender1);
        }
//        rs.close();
//        rs2.close();
//        stmt.close();
//        connection.close();
    }
}
