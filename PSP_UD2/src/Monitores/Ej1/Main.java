package Monitores.Ej1;

public class Main {
    static final int NUMVECES = 5;
    public static final int NUMHILOS = 5;

    public static void main(String[] args) throws InterruptedException {
        Cuenta cuenta;
        Ahorrador ahorradores[] = new Ahorrador[NUMHILOS];
        Gastador gastadores[] = new Gastador[NUMHILOS];
        cuenta = new Cuenta(50);
        for (int i = 0; i < NUMHILOS; i++) {
            ahorradores[i] = new Ahorrador(cuenta, 10);
            gastadores[i] = new Gastador(cuenta, 10);
        }
        for (int i = 0; i < NUMHILOS; i++) {
            ahorradores[i].start();
            gastadores[i].start();

        }
        for (int i = 0; i < NUMHILOS; i++) {
            ahorradores[i].join();
            gastadores[i].join();

        }

        System.out.println("el saldo final de la cuenta es: "+cuenta.getSaldo());

    }
}