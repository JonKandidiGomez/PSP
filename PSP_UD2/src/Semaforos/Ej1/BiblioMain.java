package Semaforos.Ej1;

public class BiblioMain {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Thread[] estudiantes = new Thread[8];

        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Thread(new Estudiante(biblioteca, "Estudiante " + i));
        }

        for (Thread estudiante : estudiantes) {
            estudiante.start();
        }
    }
}
