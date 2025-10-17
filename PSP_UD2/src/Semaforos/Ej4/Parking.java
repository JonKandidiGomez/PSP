package Semaforos.Ej4;

import java.util.concurrent.Semaphore;

public class Parking {

    Semaphore aforo;
    Semaphore controlEntrada = new Semaphore(1);

    int pesoActual = 0;
    int pesoTotal = 0;
    int totalEntradas = 0;

    public Parking(int plazas) {
        aforo = new Semaphore(plazas);
    }

    public void entrarParking(int peso) {
        try {
            aforo.acquire();
            controlEntrada.acquire();
            pesoActual += peso;
            System.out.println("Entra un coche. Peso actual: " + pesoActual);
            totalEntradas++;
            pesoTotal += peso;
            controlEntrada.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void salirParking(int peso) {
        try {
            controlEntrada.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pesoActual -= peso;
        System.out.println("Sale un coche. Peso actual: " + pesoActual);
        controlEntrada.release();
        aforo.release();
    }
}
