package day13;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementEx {
    // Method to validate table and column names
    private static boolean isValidIdentifier(String identifier) {
        return identifier == null || !identifier.matches("[a-zA-Z_][a-zA-Z0-9_]*");
    }
    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Class Loaded Successfully");

        // Get dynamic table and column names from user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter table name: ");
        String tableName = scanner.nextLine();
        System.out.print("Enter column name: ");
        String columnName = scanner.nextLine();

        // Validate the input to prevent SQL injection
        if (isValidIdentifier(tableName) || isValidIdentifier(columnName)) {
            System.out.println("Invalid table or column name.");
            return;
        }

        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_db", "root", "admin");

        // Use String.format to create the SQL query dynamically
        String query = String.format("SELECT %s FROM %s", columnName, tableName); // %s -> placeholders
        PreparedStatement ps = connection.prepareStatement(query);

        ResultSet resultSet1 = ps.executeQuery();
        while (resultSet1.next()) {
            String name1 = resultSet1.getString(columnName);
            System.out.println(columnName + " : " + name1);
        }

        resultSet1.close();
        ps.close();
        connection.close();
    }
}
