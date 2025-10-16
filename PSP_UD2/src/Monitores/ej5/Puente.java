package Monitores.ej5;

public class Puente {

    private final int MAXCOCHESCRUZANDO = 5;
    private final int PESO_MAXIMO = 15000;
    private int pesoActual;
    private int cochesCruzando;

    public Puente() {
        pesoActual = 0;
        cochesCruzando = 0;
    }

    public synchronized void entraCoche(int pesoCoche, String coche) {
        System.out.println(coche + " llegando al puente. Coches cruzando: " + cochesCruzando + ", Peso actual: " + pesoActual);
        while (pesoActual + pesoCoche > PESO_MAXIMO || cochesCruzando == MAXCOCHESCRUZANDO) {
            try {
                System.out.print(coche + " esperando para entrar. ");
                if (pesoCoche + pesoActual > PESO_MAXIMO) {
                    System.out.println("Demasiado peso. ");
                }
                if (cochesCruzando == MAXCOCHESCRUZANDO) {
                    System.out.println("Demasiados coches en el puente.");
                }
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(coche + " entra en el puente");
        cochesCruzando ++;
        pesoActual += pesoCoche;
    }

    public synchronized void saleCoche(int peso, String coche) {
        pesoActual -= peso;
        cochesCruzando --;
        System.out.println(coche + " sale del puente. Peso actual: " + pesoActual + " Coches cruzando: " + cochesCruzando);
        notifyAll();
    }
}
