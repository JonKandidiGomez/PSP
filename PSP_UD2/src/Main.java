public class Main {
    public static void main(String[] args) {

        ClaseHil c1 = new ClaseHil();
        ClaseHil c2 = new ClaseHil();
        c1.start();
        c2.start();

        HiloRunnable hr = new HiloRunnable();
        Thread hilor = new Thread(hr, "Hilo Letras");
        hilor.start();

    }
}