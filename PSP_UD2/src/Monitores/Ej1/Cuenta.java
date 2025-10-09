/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Cuenta {
    private int saldo;

   

    public Cuenta(int cantidad) {
        saldo = cantidad;

     
    }

    public synchronized void meter(int cantidad) {
        while(saldo>=250){
            try {
                System.out.println("Ahorrador bloqueado");

                wait();
            } catch (InterruptedException ex) {

            }
        }
        saldo = saldo + cantidad;
        System.out.println("Ahorrando- saldo: " + saldo);
       notifyAll();
    }

    public synchronized void sacar(int cantidad) {

         while(saldo ==0){
            try {
                System.out.println(" \t\tNo hay saldo para gastar");
                wait();
                System.out.println("he salido del bloqueo");
            } catch (InterruptedException e) {
            }
        }
        
            saldo = saldo - cantidad;
            System.out.println("Gastando- saldo: " + saldo);
            notifyAll();
        
    }

    public int getSaldo() {

        return saldo;
    }

    
}
