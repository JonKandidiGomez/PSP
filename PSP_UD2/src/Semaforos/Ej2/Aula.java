package Semaforos.Ej2;

import java.util.concurrent.Semaphore;

public class Aula {

    Semaphore portatiles = new Semaphore(3);

    public void usarPortatiles() throws InterruptedException{
        System.out.println("Un alumno quiere usar un portatil. Portatiles libres: " + portatiles.availablePermits());
        portatiles.acquire(1);
        System.out.println(Thread.currentThread().getName() + " usa un portatil");
        Thread.sleep(500 + Math.round(Math.random()*1000));
        System.out.println(Thread.currentThread().getName() + " deja libre un portatil");
        portatiles.release(1);
    }
}

