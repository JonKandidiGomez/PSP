package Monitores.Ej3;

import java.util.Random;

public class Termometro implements Runnable {

    private Museo museo;

    public Termometro(Museo museo) {
        this.museo = museo;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000); // entre 1 y 6 segundos
                Random r = new Random();
                museo.cambioTemp(r.nextInt(50));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
