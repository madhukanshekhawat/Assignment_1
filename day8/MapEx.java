package day8;
import java.util.*;

public class MapEx {
    public static void main(String[] args) {

        Map<MyObject, String> map = new HashMap<>();

        MyObject obj1 = new MyObject("1", "A");
        MyObject obj2 = new MyObject("2", "B");
        MyObject obj3 = new MyObject("1", "A");// Duplicate key
        MyObject obj4 = new MyObject("2", "A");

        // Adding objects to the map
        map.put(obj1, "First");
        map.put(obj2, "Second");
        map.put(obj3, "Duplicate");
        map.put(obj4, "Id same but Value diff");// it will consider as a new one nothing will be override.

        System.out.println("Map entries:");
        for (Map.Entry<MyObject, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
class MyObject {
    String id;
    String value;

    MyObject(String id, String value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyObject myObject = (MyObject) obj;
        return Objects.equals(id, myObject.id) && Objects.equals(value, myObject.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }

    @Override
    public String toString() {
        return "MyObject{id='" + id + "', value='" + value + "'}";
    }
}

