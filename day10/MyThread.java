package day10;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<11;i++){
           System.out.println("Value of my thread is : "+ i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);

        MyAnotherThread t2 = new MyAnotherThread();
        thread.start();
        t2.start();
    }
}
