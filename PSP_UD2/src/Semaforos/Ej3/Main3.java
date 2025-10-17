package Semaforos.Ej3;

public class Main3 {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        Thread[] vecinos = new Thread[10];
        for (int i = 0; i < 10; i++) {
            vecinos[i] = new Thread(new Vecino(ascensor));
            vecinos[i].setName("Vecino " + i);
            vecinos[i].start();
        }
    }
}
