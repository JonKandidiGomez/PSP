package Sincro1;

public class HiloEntrar extends Thread {

    ControlJardin cjardin;

    public HiloEntrar(ControlJardin cjardin) {
        this.cjardin = cjardin;
    }

    @Override
    public void run() {
        cjardin.entrar();
    }
}
