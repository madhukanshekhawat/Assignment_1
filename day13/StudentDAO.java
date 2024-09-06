package day13;

import java.sql.*;
//Data Access object
public class StudentDAO {
    Connection connection = null;
    public void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded Successfully ! ");
            System.out.println("Class loaded Succesfully");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_db", "root", "admin");
            System.out.println("Connection established successfully");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public void alterTable(String alteration) {
        String query = "ALTER TABLE Student " + alteration;
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table 'Student' altered successfully.");
            statement.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void dropTable() {
        String query = "DROP TABLE IF EXISTS Students";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table 'Student' dropped successfully.");
            statement.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void createTable() {
        String query = "CREATE TABLE IF NOT EXISTS Students (" +
                "rollNo INT PRIMARY KEY, " +
                "name VARCHAR(50))";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table 'Students' created successfully.");
            statement.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Student getStudent(int rollNo) {
        Student student = new Student();
        student.rollNo = rollNo;
        try {
            String query = "Select name from Student where rollNo =" + rollNo;

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            rs.next();
            String name = rs.getString(1);
            student.name = name;

            return student;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public void addStudent(Student s){
        String query = "insert into Student values (?,?)";
        try{
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1, s.rollNo);
            pst.setString(2, s.name);
            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public void removeStudent(int rollNo) {
        String query = "DELETE FROM Student WHERE rollNo = ?";
        try {
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1, rollNo);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student with rollNo " + rollNo + " removed successfully.");
            } else {
                System.out.println("No student found with rollNo " + rollNo);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void updateStudent(int rollNo, String newName) {
        String query = "UPDATE Student SET name = ? WHERE rollNo = ?";
        try {
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, newName);
            pst.setInt(2, rollNo);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student with rollNo " + rollNo + " updated successfully.");
            } else {
                System.out.println("No student found with rollNo " + rollNo);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed successfully");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
