package Semaforos.Ej5;

import java.util.concurrent.Semaphore;

public class TallerCostura {

    private Semaphore stockMangas = new Semaphore(10);
    private Semaphore stockCuerpos = new Semaphore(5);
    private Semaphore stockJerseys = new Semaphore(0);
    private Semaphore control = new Semaphore(1);

    private int mangas = 0;
    private int cuerpos = 0;
    private int jerseys= 0;


    public TallerCostura() {}

    public void fabricarManga() {
        try {
            stockMangas.acquire();
            Thread.sleep(500);
            control.acquire();
            mangas++;
            System.out.println(Thread.currentThread().getName() + " fabrica una manga. Mangas en el cesto: " + mangas);
            control.release();
            if (mangas > 1 && cuerpos > 0) {
                stockJerseys.release();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void fabricarCuerpo() {
        try {
            stockCuerpos.acquire();
            Thread.sleep(500);
            control.acquire();
            cuerpos++;
            System.out.println(Thread.currentThread().getName() + " fabrica un cuerpo. Cuerpos en el cesto: " + cuerpos);
            control.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void fabricarJersey() {
        try {
                stockJerseys.acquire();
                Thread.sleep(500);
                control.acquire();
                jerseys++;
                mangas -= 2;
                cuerpos--;
                System.out.println(Thread.currentThread().getName() + " fabrica un jersey. Jerseys en el cesto: " + jerseys);
                control.release();
                stockMangas.release(2);
                stockCuerpos.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
