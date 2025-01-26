package threadbasics;


public class Main {

    public static void main(String[] args) {
        /* 
        try{
            System.out.println("Hello word!" + Thread.currentThread().getName());
            HelloThread hilo0= new HelloThread();
            Thread hilo1 = new Thread(new HelloRunnable());
    
            hilo0.start();
            //Queremos que los dos hilos se sincronicen
            hilo1.start();
            hilo0.join();
            System.out.println("Ya terminó el hilo 0");

            System.out.println("Ya llegue al final");
        } catch (Exception e){
            System.out.println(e);
        }*/



/* 
        try{
            System.out.println("Hello word!" + Thread.currentThread().getName());
            HelloThread hilo0= new HelloThread();
            Thread hilo1 = new Thread(new HelloRunnable());
    
            hilo0.start();
            //Queremos que los dos hilos se sincronicen
            hilo1.start();
            hilo0.join();
            hilo1.join();
            System.out.println("Ya terminó el hilo 0 y 1");

            System.out.println("Ya llegue al final");
        } catch (Exception e){
            System.out.println(e);
        }
            */

        Counter counter = new Counter(0);
        SynchronizedThread h0 =  new SynchronizedThread(counter);
        SynchronizedThread h1 = new SynchronizedThread(counter);
        h0.start();
        h1.start();    
        
    }
}
