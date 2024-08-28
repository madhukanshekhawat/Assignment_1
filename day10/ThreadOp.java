package day10;

class UserThread extends Thread{
    public void run(){
        System.out.println("User define thread running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThreadOp extends Thread{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread Started...");
        int X=96+4;
        System.out.println("Value of X is : "+ X);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread tName = ThreadOp.currentThread();
        System.out.println("Current Thread Name is : "+tName.getName());
        tName.setName("MyThreadOp");
        System.out.println("New Thread Name is : "+tName.getName());
        System.out.println("State of Thread : "+tName.getState());
        long threadId = tName.threadId();
        System.out.println("Thread Id is : " + threadId);
        System.out.println("Thread Ended...");
        UserThread thread = new UserThread();
        thread.start();

    }
}
