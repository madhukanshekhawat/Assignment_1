package day6;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistEx {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        ll.addFirst(0);
        ll.addLast(4);

        for(int i =0;i< ll.size();i++){
            System.out.print(ll.get(i) + "->");
        }
        System.out.print("null");

        System.out.println();
        ll.remove(0);
        Iterator<Integer> it = ll.iterator();
        for(int i=0;i<ll.size();i++){
           System.out.print(it.next()+"-->");
        }

        System.out.print("null");

        System.out.println();
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Madhu");
        ls.add("Mani");
        ls.add("Goransh");
        ls.add("Ruchi");
        ls.add("John");
        ls.add("Tony");
        ls.addFirst("xyz");
        ls.addLast("TT");
        ls.removeFirst();
        ls.removeLast();

        System.out.println(ls);
        ls.remove("Tony");
        System.out.println(ls);


        Iterator<String> itr = ls.descendingIterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

//        ls.clear();
//        System.out.println(ls);
        System.out.println();
        System.out.println(ls.peek());
        System.out.println(ls.peekFirst());
        System.out.println(ls.peekLast());

        System.out.println(ls.get(1));
        System.out.println(ls.getLast());
        System.out.println(ls.set(0,"AB"));
        System.out.println(ls);
    }
}
