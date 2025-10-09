package Ej7;

public class Compartida {

    int num = 0;
    public synchronized void sumar() {
        num += 1;
    }
}
