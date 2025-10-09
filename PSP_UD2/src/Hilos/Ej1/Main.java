package Ej1;


public class Main {
    public static void main(String[] args) {
        HiloContador hc = new HiloContador();
        HiloSaludador hs  = new HiloSaludador();
        System.out.println("HILO PRINCIPAL EMPIEZA");

        hc.start();
        hs.start();

        try {
            hs.join();
            hc.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("HILO PRINCIPAL TERMINA");
    }
}
