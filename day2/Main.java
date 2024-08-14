package day2;
class Example<T>
{
    T obj;

    Example(T obj){
        this.obj=obj;
    }

    public T getObj() {
        return obj;
    }


}
public class Main {
    public static void main(String[] args) {
     Example<Integer> e1=new Example<Integer>(15);
     System.out.println(e1.getObj());

     Example<String> e2 = new Example<>("Generics Example");
     System.out.println(e2.getObj());
    }
}
