package Semaforos.Ej4;

import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Parking parking = new Parking(15);
        Thread[] coches = new Thread[25];
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            coches[i] = new Thread(new Coche(random.nextInt(4001) + 1000, parking));
            coches[i].start();
        }

        for (int i = 0; i < 25; i++) {
            try {
                coches[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Peso total del dia: " + parking.pesoTotal);
        System.out.println("Entradas totales del dia: " + parking.totalEntradas);

    }
}
