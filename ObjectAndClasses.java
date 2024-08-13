import javax.management.ObjectName;

public class ObjectAndClasses {
    int id;
    String name;

    ObjectAndClasses(){
        System.out.println("Constructor called");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        ObjectAndClasses s1 = new ObjectAndClasses();
//        ObjectAndClasses s2 = new ObjectAndClasses();
//        s2.setId(2);
//        s2.setName("Goransh");
        s1.id=1;
        s1.name="Madhu";
        System.out.println(s1.id +" "+ s1.name);
//        System.out.println(s2.getId()+" "+s2.getName());
    }
}
