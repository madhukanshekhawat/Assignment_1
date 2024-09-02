package day10;

public class MyAnotherThread extends Thread{
    @Override
    public void run() {
        for(int i=10;i>0;i--){
            System.out.println("Value for my another thread"+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
