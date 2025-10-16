package Monitores.Ej4;

public class Jugador implements Runnable {

    private Pista pista;
    private String nombre;

    public Jugador(Pista pista, int i) {
        this.pista = pista;
        this.nombre = "Jugador " + i;
    }

    @Override
    public void run() {
        pista.reservarPista(nombre);

        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pista.salirDePista(nombre);
    }
}
