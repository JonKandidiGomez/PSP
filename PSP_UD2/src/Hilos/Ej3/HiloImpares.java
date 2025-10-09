package Ej3;

public class HiloImpares extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 51; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (Exception _) {
                }
            }
        }
    }
}
