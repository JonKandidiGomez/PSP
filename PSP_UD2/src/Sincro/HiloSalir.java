package Sincro1;

public class HiloSalir extends Thread {

    ControlJardin cjardin;

    public HiloSalir(ControlJardin cjardin) {
        this.cjardin = cjardin;
    }

    @Override
    public void run() {
        cjardin.salir();
    }
}
