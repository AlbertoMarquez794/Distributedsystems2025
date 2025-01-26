package threadbasics;

public class SynchronizedThread extends Thread{
    private Counter counter;

    public SynchronizedThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        this.counter.increase(Thread.currentThread().getName());
    }
}
