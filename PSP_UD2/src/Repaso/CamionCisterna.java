package Repaso;

public class CamionCisterna implements Runnable {

    private Gasolinera gasolinera;

    public CamionCisterna(Gasolinera gasolinera) {
        this.gasolinera = gasolinera;
    }

    @Override
    public void run() {
        while (true) {
            gasolinera.recargarSurtidor();
        }
    }
}
