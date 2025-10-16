package Monitores.ej5;

public class PuenteMain {
    public static void main(String[] args) {
        Puente puente = new Puente();
        Thread[] coches = new Thread[15];

        for (int i = 0; i < 15; i++) {
            coches[i] = new Thread(new Coche(puente, i));
        }

        for (int i = 0; i < 15; i++) {
            coches[i].start();
        }
    }
}
