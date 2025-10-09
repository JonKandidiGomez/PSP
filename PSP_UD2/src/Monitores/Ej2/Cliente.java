public class Cliente implements Runnable {
    private final Restaurante restaurante;
    private final int idCliente;

    public Cliente(Restaurante restaurante, int idCliente) {
        this.restaurante = restaurante;
        this.idCliente = idCliente;
    }

    @Override
    public void run() {
        restaurante.entrar(idCliente);

        // Simula el tiempo comiendo
        try {
            Thread.sleep((long) (Math.random() * 5000 + 1000)); // entre 1 y 6 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        restaurante.salir(idCliente);
    }

}
