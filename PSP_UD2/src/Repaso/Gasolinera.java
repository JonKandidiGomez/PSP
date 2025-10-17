package Repaso;

import java.util.concurrent.Semaphore;

public class Gasolinera {

    private final Semaphore surtidor;
    private int volumen = 1000;

    public Gasolinera() {
        this.surtidor = new Semaphore(1);
    }

    public void repostar(int cantidad) {
        try {
            if (volumen >= cantidad) {
                surtidor.acquire();
                volumen -= cantidad;
                System.out.println(Thread.currentThread().getName() + " empieza a repostar " + cantidad + " litros.");
                for (int i = 0; i < cantidad; i++) {
                    Thread.sleep(200);
                    System.out.println("\t\t\t" + (i + 1) + "/" + cantidad + " Litros");
                }
                System.out.println(Thread.currentThread().getName() + " sale de la gasolinera.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void recargarSurtidor() {
        int n = surtidor.availablePermits();
        int x = 1000 - n;
        if (n < 1000) {
            try {
                surtidor.acquire();
                System.out.println("Recargando surtidor.");
                for (int i = n; i < x; i++) {
                    Thread.sleep(200);
                    System.out.println("\t\t\t" + i + "/1000 Litros");
                }
                surtidor.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
