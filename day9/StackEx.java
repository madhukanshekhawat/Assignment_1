package day9;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class StackEx {
    public static boolean searchBook(Stack<String> stack, String bookName) {
        return stack.contains(bookName);
    }
    public static void main(String[] args) {
        Stack<String> booksStack = new Stack<>();

        booksStack.push("Functional English");
        booksStack.push("Finance");
        booksStack.push("Marketing Management");
        booksStack.push("Entrepreneurship");
        booksStack.push("Organizational Behaviour");
        booksStack.push("Creative Decoding");

        System.out.println("Total Books in MBA 1st semester : " + booksStack.size());
        System.out.println("Books Name of MBA 1st semester : "+booksStack);
        System.out.println("First Subject : "+ booksStack.peek());
        System.out.println("Remove First Subject" + booksStack.pop());
        System.out.println("Remaining Books Name of MBA 1st semester : "+booksStack);
        String bookToSearch = "Finance";
        boolean isBookFound = searchBook(booksStack, bookToSearch);
        System.out.println("Is '" + bookToSearch + "' in the Course ? " + isBookFound);
        //PRINTING ELEMENTS WITH THE HELP ITERATOR
//        Iterator iterator = booksStack.iterator();
//        while(iterator.hasNext())
//        {
//            Object values = iterator.next();
//            System.out.println(values);
//        }
        while (!booksStack.isEmpty()) {
            try {
                System.out.println("Book Removed from course : " + booksStack.pop());
            } catch (EmptyStackException e) {
                System.out.println("empty stack");
            }
        }
        if (booksStack.isEmpty()) {
            System.out.println("All books have been removed from the Course.");
        }
    }
}
