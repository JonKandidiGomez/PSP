package Ej4;

public class HSumImpares extends Thread {

    @Override
    public void run() {
        int n = 0;

        for (int i = 0; i < 21; i++) {
            if (i % 2 == 1) {
                n += i;
                System.out.println(n);
            }
        }
    }
}
