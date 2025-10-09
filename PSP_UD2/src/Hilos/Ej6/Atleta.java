package Ej6;

public class Atleta extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 51; i++) {
            if (i == 0) {
                System.out.println(Thread.currentThread().getName() + " empieza a correr");

            } else if (i == 50) {
                System.out.println(Thread.currentThread().getName() + " ha cruzado la meta");

            } else {
                System.out.println(Thread.currentThread().getName() + " esta en el metro " + i);
            }
           try {
               double n = Math.random() * 1000;
                Thread.sleep((long) n);
            } catch (InterruptedException _) {}
        }
    }
}
