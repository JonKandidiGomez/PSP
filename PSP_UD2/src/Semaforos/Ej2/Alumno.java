package Semaforos.Ej2;

public class Alumno implements Runnable{

    private Aula aula;

    public Alumno(Aula aula){
        this.aula=aula;
    }

    @Override
    public void run() {
        try {
            aula.usarPortatiles();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
