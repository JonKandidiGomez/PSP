package Semaforos.Ej5;

public class CostureraJerseys implements Runnable {

    private TallerCostura taller;

    public CostureraJerseys(TallerCostura taller) {
        this.taller = taller;
    }

    @Override
    public void run() {
        while (true) {
            taller.fabricarJersey();
        }
    }
}
