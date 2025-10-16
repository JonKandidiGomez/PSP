package Monitores.Ej1;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Gastador extends Thread {
	   int numveces;
    Cuenta cuenta;

    /**
     *
     * @param cuenta objeto cuenta del que saca 10€ cada vez
     * @param i número de veces que ha de gastar
     */
    public Gastador(Cuenta cuenta, int i) {
        numveces = i;
        this.cuenta = cuenta;
    }

    public void run() {
        for (int i = 0; i < numveces; i++) {
            cuenta.sacar(10);
        }

    }

}
