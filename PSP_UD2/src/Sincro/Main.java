package Sincro1;

public class Main {
    public static void main(String[] args) {

        ControlJardin cjardin = new ControlJardin();
        Thread[] hilosSalir = new Thread[15];
        Thread[] hilosEntrar = new Thread[10];

        for (int i = 0; i < 15; i++) {
            hilosSalir[i] = new HiloSalir(cjardin);
            hilosSalir[i].setName("HiloSalir " + (i + 1));
        }

        for (int i = 0; i < 10; i++) {
            hilosEntrar[i] = new HiloEntrar(cjardin);
            hilosEntrar[i].setName("HiloEntrar " + (i + 1));
        }

        for (int i = 0; i < 15; i++) {
            if (i < 10) {
                hilosSalir[i].start();
                hilosEntrar[i].start();
            } else {
                hilosSalir[i].start();
            }
        }
    }
}
