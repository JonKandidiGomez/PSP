package Monitores.Ej4;

public class PadelMain {
    public static void main(String[] args) {

        Pista pista = new Pista();

        Thread limpiador = new Thread(new Limpiador(pista));
        limpiador.start();
        Thread[] jugadores = new Thread[6];

        for (int i = 0; i < 6; i++) {
            jugadores[i] = new Thread(new Jugador(pista, i));
        }

        for (int i = 0; i < 6; i++) {
            jugadores[i].start();
        }

        for (int i = 0; i < 6; i++) {
            try {
                jugadores[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
