public class Restaurante {

    private int mesasDisponibles =5;


    public synchronized void entrar(int idCliente) {
        while (mesasDisponibles == 0) {
            try {
                System.out.println("Cliente " + idCliente + " espera por una mesa...");
                wait(); // espera a que haya una mesa disponible
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        mesasDisponibles--;
        System.out.println("Cliente " + idCliente + " se ha sentado. Mesas disponibles: " + mesasDisponibles);
        notifyAll();
    }

    public synchronized void salir(int idCliente) {
        mesasDisponibles++;
        System.out.println("Cliente " + idCliente + " se ha ido. Mesas disponibles: " + mesasDisponibles);
        notifyAll(); // notifica a los clientes que están esperando
    }

}
