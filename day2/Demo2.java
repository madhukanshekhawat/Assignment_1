package day2;

import java.awt.desktop.SystemEventListener;

class X{
    void show(){
        System.out.println("Showing a");
    }
}
//class Y extends X {
//    void show(){
//        System.out.println("Showing b");
//    }
//}
public class Demo2 {
    public static void main(String[] args) {
//        X x1 = new X();
//        x1.show();
        X x2 = new X(){
            void show(){
                System.out.println("Showing a as new ");
            }
        };
        x2.show();

//        X x2 = new Y();
//        x2.show();

    }
}
