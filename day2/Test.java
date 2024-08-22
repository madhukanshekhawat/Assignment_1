package day2;

class Test extends Student{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.setRollNo(1);
        t1.setName("Madhu");
        t1.setDepartment("Java");
        System.out.println("Your RollNo is: "+t1.getRollNo()+ " Your Name is: "+t1.getName()+" Your Department is: "+t1.getDepartment());
    }
}
