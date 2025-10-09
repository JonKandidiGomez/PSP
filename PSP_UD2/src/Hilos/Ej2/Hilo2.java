package Ej2;

public class Hilo2 extends Thread {

    @Override
    public void run() {
        System.out.println("Comienzo del Hilo 2 " + this.getName());
        for (int i = 1; i < 31 + 1; i++) {
            System.out.println("Hilo 2 " + i);
            System.out.println("Hilo 2 ejecutando su bucle " + this.getState());
        }
        System.out.println("Hilo 2 termina su bucle " + this.getState());
    }
}
