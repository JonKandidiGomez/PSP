package Semaforos.Ej5;

public class CostureraCuerpos implements Runnable {

    private TallerCostura taller;

    public CostureraCuerpos(TallerCostura taller) {
        this.taller = taller;
    }

    @Override
    public void run() {
        while (true) {
            taller.fabricarCuerpo();
        }
    }
}
