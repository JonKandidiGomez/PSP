package Repaso;

import java.util.Random;

public class Coche implements Runnable{

    private Gasolinera gasolinera;
    private int deposito;

    public Coche(int deposito, Gasolinera gasolinera) {
        this.deposito = deposito;
        this.gasolinera = gasolinera;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(new Random().nextInt(5000 - 1000 + 1) + 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            gasolinera.repostar(deposito);
        }
    }
}
