package Ej3;

public class HiloPares extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 51; i++) {
            if(i % 2 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        }
    }
}
