package day2;
class EX<T,X>
{
    T obj1;
    X obj2;

    EX(T obj1, X obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public X getObj2() {
        return obj2;
    }
    void display(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
public class Main2 {
    public static void main(String[] args) {
        EX<Integer,String> e1= new EX<>(1,"Madhu");
        e1.display();
    }
}
