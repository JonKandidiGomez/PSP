package Monitores.Ej4;

public class Limpiador implements Runnable {

    private Pista pista;

    public Limpiador(Pista pista) {
        this.pista = pista;
    }

    @Override
    public void run() {
        while (true) {
            pista.limpiarPista();
        }
    }
}
