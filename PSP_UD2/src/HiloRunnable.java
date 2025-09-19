public class HiloRunnable implements Runnable {

    @Override
    public void run() {
        for (char i ='A'; i < '['; i++) {
            System.out.println(i + " letras");

        }
    }
}
