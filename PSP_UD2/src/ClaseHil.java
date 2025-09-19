public class ClaseHil extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(i + Thread.currentThread().getName());
        }
    }
}