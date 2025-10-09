package Sincro1;

public class ControlJardin {

    int aforo = 20;

    public synchronized void salir() {
        System.out.println("Saliendo " + Thread.currentThread().getName());
        aforo--;
        System.out.println(aforo + " personas en el jardin");
    }

    public synchronized void entrar() {
        System.out.println("Entrando " + Thread.currentThread().getName());
        aforo++;
        System.out.println(aforo + " personas en el jardin");
    }
}
