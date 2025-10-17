package Semaforos.Ej4;

public class Coche implements Runnable{

    Parking parking;
    int peso;

    public Coche(int peso,  Parking parking) {
        this.peso=peso;
        this.parking=parking;
    }

    @Override
    public void run() {
        try {
            parking.entrarParking(peso);
            Thread.sleep(100 + Math.round(Math.random() * 1000));
            parking.salirParking(peso);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
