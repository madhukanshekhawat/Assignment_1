package day10;

public class Consumer extends Thread{
    Company c;
    Consumer(Company c){
        this.c = c;
    }
    @Override
    public void run() {
        while(true){
            try {
                this.c.consume_item();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
