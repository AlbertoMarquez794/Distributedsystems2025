package threadbasics;

public class HelloRunnable implements Runnable{
    @Override
    public void run(){
        for (int i=0; i < 10000; i++){ //Ponerle 10k es importante (para que entre y salga el hilo)
            System.out.println(i + " Hello desde Runnable " + Thread.currentThread().getName());
            
        }
    }
}
