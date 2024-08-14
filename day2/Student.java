package day2;

public class Student {
    private int rollNo;
    private String name;
    private String department;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {
     Student s1= new Student();
     s1.setRollNo(1);
     s1.setName("Goransh");
     s1.setDepartment("Java");
     System.out.println(s1.rollNo+" "+s1.getName()+" "+s1.getDepartment());
     System.out.println();
    }
}
