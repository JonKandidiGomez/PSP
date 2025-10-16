package Monitores.Ej4;

public class Pista {

    private boolean disponible;
    private boolean limpia;

    public Pista() {
        this.disponible = true;
        this.limpia = true;
    }

    public synchronized void reservarPista(String jugador) {
        System.out.println(jugador + " quiere reservar la pista.");
        while (!disponible || !limpia) {
            try {
                System.out.println(jugador + " esperando");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(jugador + " ha reservado la pista.");
        this.disponible = false;
        notifyAll();
    }

    public synchronized void salirDePista(String jugador) {
        System.out.println(jugador + " ha dejado la pista libre.");
        this.limpia = false;
        notifyAll();
    }

    public synchronized void limpiarPista() {
        while (limpia) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("El servicio de limpieza esta limpiando la pista.");
        this.limpia = true;
        this.disponible = true;
        notifyAll();
    }
}
