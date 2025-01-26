package threadbasics;

public class Counter {

    private int count = 0;

    public Counter(int count){
        this.count = count;
    }

    public synchronized void increase(String threadId){
        for (int i=0; i <10000; i++){
             this.count++;
             System.out.println(count + " soy " + threadId);
        }
    }
}
