package Ej1;


public class HiloSaludador extends Thread {

    @Override
    public void run() {
        System.out.println("HILO SALUDADOR EMPEZANDO");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola mundo");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("HILO SALUDADOR TERMINA");
    }
}
