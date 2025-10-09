package Ej2;

public class Main {
    public static void main(String[] args) {

        Hilo1 h1 = new Hilo1();
        System.out.println("Hilo 1 inicializado " + h1.getState());
        Hilo2 h2 = new Hilo2();
        System.out.println("Hilo 2 inicializado " + h2.getState());
        Hilo3 h3 = new Hilo3();
        System.out.println("Hilo 3 inicializado " + h3.getState());

        h1.start();
        System.out.println("Hilo 1 arrancado " + h3.getState());

        h2.start();
        System.out.println("Hilo 2 arrancado " + h3.getState());

        h3.start();
        System.out.println("Hilo 3 arrancado " + h3.getState());

        try {
            h1.join();
            h2.join();
            h3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(h1.getState() +  "\n" + h2.getState() + "\n" + h3.getState());
    }
}
