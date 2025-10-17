package Semaforos.Ej3;

import java.util.concurrent.Semaphore;

public class Ascensor {

    Semaphore semaforo = new Semaphore(3);
    Semaphore subirBajar = new Semaphore(1);
    int genteDentro = 0;

    public Ascensor() {
    }

    public void usarAscensor(){
        try {
            subirBajar.acquire();
            semaforo.acquire();
            genteDentro++;
            System.out.println(Thread.currentThread().getName() + " entra en el ascensor (" + genteDentro + "/3)");
            subirBajar.release();
            Thread.sleep(500 + Math.round(Math.random()*1000));

            genteDentro--;
            System.out.println(Thread.currentThread().getName() + " se baja del ascensor (" + genteDentro + "/3)");
            semaforo.release();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
