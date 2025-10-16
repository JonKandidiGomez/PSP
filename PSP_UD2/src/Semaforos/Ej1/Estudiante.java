package Semaforos.Ej1;

public class Estudiante implements Runnable{

    private Biblioteca biblioteca;
    private String nombre;

    public Estudiante(Biblioteca biblioteca, String nombre) {
        this.biblioteca = biblioteca;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        biblioteca.imprimir(nombre);
    }
}
