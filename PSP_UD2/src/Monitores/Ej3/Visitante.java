package Monitores.Ej3;

public class Visitante implements Runnable {

    private Museo museo;
    
    public Visitante(Museo museo) {
        this.museo = museo;
    }

    @Override
    public void run() {
        museo.entrarMuseo();

        // Simula el tiempo comiendo
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        museo.salirMuseo();
    }
}
