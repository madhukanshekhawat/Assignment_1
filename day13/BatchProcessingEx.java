package day13;

import javax.print.attribute.standard.Sides;
import java.sql.*;
import java.util.Scanner;

public class BatchProcessingEx {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded Successfully ! ");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Class loaded Succesfully");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_db", "root", "admin");
        System.out.println("Connection established successfully");
        connection.setAutoCommit(false);
//        Statement statement = connection.createStatement();
//        statement.addBatch("Insert into register(name,email,pass,gender,city) Values ('Karan','karan@gmail.com','karan@123','male','jaipur')");
//        statement.addBatch("Insert into register(name,email,pass,gender,city) Values ('Krishna','krishna@gmail.com','krishna@123','female','mumbai')");
//        statement.addBatch("Insert into register(name,email,pass,gender,city) Values ('Isha','isha@gmail.com','isha@123','female','Goa')");
//        int[] batchResult = statement.executeBatch();
//        connection.commit();
//        System.out.println("Batch Executed Successfully ");

        String query = "Insert into register (name,email,pass,gender,city) Values (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter Name : ");
            String name1 = scanner.nextLine();
            System.out.println("Enter Email : ");
            String email1 = scanner.nextLine();
            System.out.println("Enter Password : ");
            String pass1 = scanner.next();
            System.out.println("Enter Gender : ");
            String gender1 = scanner.next();
            System.out.println("Enter city : ");
            String city1 = scanner.nextLine();
           preparedStatement.setString(1, name1);
            preparedStatement.setString(2, email1);
            preparedStatement.setString(3, pass1);
            preparedStatement.setString(4, gender1);
            preparedStatement.setString(5, city1);
            preparedStatement.addBatch();
            System.out.println("Want to add more values Y/N : ");
            String decision = scanner.next();
            if(decision.toUpperCase().equals("N"))
            {
                break;
            }
            int[] batchResult = preparedStatement.executeBatch();
            connection.commit();
            System.out.println("Batch Executed Successfully ");

        }
    }
}
