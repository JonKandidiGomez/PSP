package Ej4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hilo principal empieza aqui");

        Hx5 hx5 = new Hx5();
        HSumImpares hsum = new HSumImpares();
        HCiudades hcudades = new HCiudades();

        System.out.println("Hilo A empieza aqui");
        hx5.start();

        try {
            hx5.join();
            System.out.println("Hilo B empieza aqui");
            hsum.start();

            hsum.join();
            System.out.println("Hilo C empieza aqui");
            hcudades.start();
            hcudades.join();
            System.out.println("Hilo principal termina aqui");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
