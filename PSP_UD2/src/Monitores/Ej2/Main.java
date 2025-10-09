public class Main {
    public static void main(String[] args)
    {
        Restaurante restaurante = new Restaurante();


        for (int i = 1; i <= 10; i++) {
            Thread cliente = new Thread(new Cliente(restaurante, i));
            cliente.start();
        }
    }
}