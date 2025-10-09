package Ej4;

public class Hx5 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " X 5 = " + i * 5);
        }
    }
}
