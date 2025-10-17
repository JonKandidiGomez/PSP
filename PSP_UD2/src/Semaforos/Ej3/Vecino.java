package Semaforos.Ej3;

public class Vecino implements Runnable{

    Ascensor ascensor;

    public Vecino(Ascensor ascensor){
        this.ascensor = ascensor;
    }

    @Override
    public void run() {
        ascensor.usarAscensor();
    }
}
