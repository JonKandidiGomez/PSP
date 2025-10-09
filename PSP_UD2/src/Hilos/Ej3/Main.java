package Ej3;

public class Main {
    public static void main(String[] args) {

        HiloImpares hi = new HiloImpares();
        HiloPares hp = new HiloPares();

        System.out.println("Hilo impares: " + hi.getPriority());
        System.out.println("Hilo pares: " + hp.getPriority());

        hp.setPriority(10);
        hi.setPriority(1);

        hi.start();
        hp.start();


    }
}
