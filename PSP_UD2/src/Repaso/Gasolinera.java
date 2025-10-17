package Repaso;

import java.util.concurrent.Semaphore;

public class Gasolinera {

    private final Semaphore surtidor;
    private final Semaphore acceso = new Semaphore(1);

    public Gasolinera() {
        this.surtidor = new Semaphore(1000);
    }

    public void repostar(int cantidad) {
        try {
            System.out.println(Thread.currentThread().getName() + "en cola para repostar.");
            if (surtidor.availablePermits() >= cantidad) {
                surtidor.acquire(cantidad);
                acceso.acquire();
                System.out.println(Thread.currentThread().getName() + " empieza a repostar " + cantidad + " litros.");
                for (int i = 0; i < cantidad; i++) {
                    Thread.sleep(50);
                    System.out.println("\t\t\t" + i + 1 + "/" + cantidad + " Litros");
                }
                System.out.println(Thread.currentThread().getName() + " sale de la gasolinera.");
                acceso.release();
            } else {
                System.out.println("No hay suficiente gasolina.");
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
                acceso.acquire();

                System.out.println("Recargando surtidor.");
                for (int i = n; i < x; i++) {
                    Thread.sleep(50);
                    System.out.println("\t\t\t" + i + "/1000 Litros");
                }
                surtidor.release(x);
                acceso.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
