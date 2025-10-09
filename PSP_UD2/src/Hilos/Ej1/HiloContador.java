package Ej1;


public class HiloContador extends Thread {

    @Override
    public void run() {
        System.out.println("HILO CONTADOR EMPIEZA");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("HILO CONTADOR TERMINA");
    }
}
