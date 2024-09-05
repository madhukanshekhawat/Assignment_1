package day13;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        Student s2 = new Student();
        s2.rollNo=5;
        s2.name = "Cheetah";
        studentDAO.connect();
//        studentDAO.createTable();
//        studentDAO.alterTable("ADD COLUMN age INT");
        studentDAO.updateStudent(4, "Karan Kapoor");
        studentDAO.addStudent(s2);
//        studentDAO.removeStudent(4);
        Student s1 = studentDAO.getStudent(1);
        System.out.println(s1.name);
        studentDAO.updateStudent(1, "Mani");
        studentDAO.closeConnection();
    }
}
