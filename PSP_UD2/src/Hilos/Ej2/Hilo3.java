package Ej2;

public class Hilo3 extends Thread {

    @Override
    public void run() {
        System.out.println("Comienzo del Hilo 3 " + this.getName());
        for (char i = 'A'; i <'[' + 1; i++) {
            System.out.println("Hilo 3 " + i);
            System.out.println("Hilo 3 ejecutando su bucle " + this.getState());
        }
        System.out.println("Hilo 3 termina su bucle " + this.getState());
    }
}
