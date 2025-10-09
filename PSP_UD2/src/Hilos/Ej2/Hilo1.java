package Ej2;

public class Hilo1 extends Thread {

    @Override
    public void run() {
        System.out.println("Comienzo del Hilo 1 " + this.getName());
        for (char i = 'a'; i <'z' + 1; i++) {
            System.out.println("Hilo 1 " + i);
            System.out.println("Hilo 1 ejecutando su bucle " + this.getState());
        }
        System.out.println("Hilo 1 termina su bucle " + this.getState());
    }
}
