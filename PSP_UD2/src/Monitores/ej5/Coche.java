package Monitores.ej5;

import java.util.Random;

public class Coche implements Runnable {

    private int peso;
    private String nombre;
    private Puente puente;

    public Coche(Puente puente, int n) {
        Random rand = new Random();
        this.peso = rand.nextInt(3500) + 1500;
        this.nombre = "coche " + n;
        this.puente = puente;
    }

    @Override
    public void run() {
        puente.entraCoche(peso, nombre);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        puente.saleCoche(peso, nombre);
    }
}
