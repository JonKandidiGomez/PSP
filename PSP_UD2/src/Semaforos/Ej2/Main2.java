package Semaforos.Ej2;

public class Main2 {
    public static void main(String[] args) {
        Aula aula = new Aula();
        Thread[] alumnos = new Thread[5];
        for (int i = 0; i < 5; i++) {
            alumnos[i] = new Thread(new Alumno(aula));
            alumnos[i].start();
        }
    }
}
