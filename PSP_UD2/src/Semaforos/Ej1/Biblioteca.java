package Semaforos.Ej1;

import java.util.concurrent.Semaphore;

public class Biblioteca {

    Semaphore impresora = new Semaphore(1);

    public void imprimir(String nombre) {
        try {
            impresora.acquire();
            System.out.println(nombre + " imprimiendo");
            Thread.sleep(2000);
            System.out.println(nombre + " finalizando");
            impresora.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
