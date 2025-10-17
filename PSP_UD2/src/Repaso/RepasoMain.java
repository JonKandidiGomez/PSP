package Repaso;

import java.util.Random;

public class RepasoMain {
    public static void main(String[] args) {
        Gasolinera gasolinera = new Gasolinera();
        Thread[] coches = new Thread[20];
        Thread camion = new Thread(new CamionCisterna(gasolinera));

        Random rand = new Random();

        for (int i = 0; i < coches.length; i++) {
            coches[i] = new Thread(new Coche(rand.nextInt((100 - 50 + 1) + 50), gasolinera));
            coches[i].setName("Coche " + i);
            coches[i].start();
        }

        camion.start();
    }
}
