package Ej5;

public class Main {
    public static void main(String[] args) {

        double[] numeros = new double[2000];

        for (int i = 0; i < 2000; i++) {
            numeros[i] = 10 * Math.random();
        }

        HiloContable h1 = new HiloContable(numeros, 0, 400);
        HiloContable h2 = new HiloContable(numeros, 401, 800);
        HiloContable h3 = new HiloContable(numeros, 801, 1200);
        HiloContable h4 = new HiloContable(numeros, 1201, 1600);
        HiloContable h5 = new HiloContable(numeros, 1601, 2000);

        try {
            h1.start();
            h1.join();
            h2.start();
            h2.join();
            h3.start();
            h3.join();
            h4.start();
            h4.join();
            h5.start();
            h5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        double media = (h1.getSuma() + h2.getSuma() + h3.getSuma() + h4.getSuma() + h5.getSuma()) / 2000;
        System.out.printf("Media: %.2f", media);
    }
}
