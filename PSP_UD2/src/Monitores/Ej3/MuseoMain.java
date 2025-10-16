package Monitores.Ej3;

public class MuseoMain {

    public static void main(String[] args) {
        Museo museo = new Museo();
        Thread termometro = new Thread(new Termometro(museo));
        termometro.start();
        for (int i = 0; i < 60; i++) {
            Thread visitante = new Thread(new Visitante(museo));
            visitante.start();
        }
    }
}
