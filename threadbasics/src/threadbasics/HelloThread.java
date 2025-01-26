package threadbasics;

public class HelloThread extends Thread{
    //Sobrecargar los metodos
    //Run es ejecutar el conjunto de instrucciones en el hilo
    // main es el equivalente a run
    //Sí tenemos muchos hilos, pero pocos cores 
    //Hilos entran y salen de los core.
    //Forzar que los hilos entren y salgan
    @Override
    public void run(){
        for (int i=0; i < 10000; i++){ //Ponerle 10k es importante (para que entre y salga el hilo)
            System.out.println(i + " Hello desde Extends " + Thread.currentThread().getName());
            
        }
    }
}
