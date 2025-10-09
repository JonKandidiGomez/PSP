/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Ahorrador extends Thread {

	   int numveces;
    Cuenta cuenta;

    /**
     *
     * @param cuenta objeto cuenta en el que guarda 10€ cada vez
     * @param i número de veces que ha de ahorrar
     */
    public Ahorrador(Cuenta cuenta, int i) {
        numveces = i;
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        for (int i = 0; i < numveces; i++) {
            cuenta.meter(10);
        }

    }
}
