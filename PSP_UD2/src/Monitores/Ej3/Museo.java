package Monitores.Ej3;


public class Museo {

    private double temperatura;

    private int UMBRAL_TEMP = 30;

    private int aforo;

    private int max_aforo = 50;

    public Museo() {
        this.temperatura = 18.0;
        this.aforo = 0;
    }

    public synchronized void entrarMuseo() {
        while (aforo >= max_aforo) {
            try {
                System.out.println("Visitante esperando...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        aforo++;
        System.out.println("Visitante entrando. Aforo: " + aforo);
    }

    public synchronized void salirMuseo() {
        aforo--;
        System.out.println("Visitante se ha ido. Aforo: " + aforo);
        notifyAll();
    }

    public synchronized void cambioTemp(double cambio) {
        temperatura = cambio;
        if (temperatura > UMBRAL_TEMP) {
            System.out.println("Temperatura maxima superada: " + temperatura + "º");
            max_aforo = 35;
        } else {
            max_aforo = 50;
            System.out.println("Temperatura: " + temperatura + "º");
        }
    }
}
