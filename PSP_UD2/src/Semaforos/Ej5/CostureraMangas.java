package Semaforos.Ej5;

public class CostureraMangas implements Runnable {

    private TallerCostura taller;

    public CostureraMangas(TallerCostura t){
        this.taller = t;
    }

    @Override
    public void run() {
        while (true) {
            taller.fabricarManga();
        }
    }
}
