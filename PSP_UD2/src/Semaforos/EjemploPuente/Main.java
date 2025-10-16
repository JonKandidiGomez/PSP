package Semaforos.EjemploPuente;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore controlvehiculo = new Semaphore(2);
        Semaphore limpieza = new Semaphore(0);
        System.out.println(limpieza.availablePermits() + "inicio semaforo limpieza");
        Puente p = new Puente(controlvehiculo, limpieza);
        vehiculo v1 = new vehiculo(p);
        vehiculo v2 = new vehiculo(p);
        vehiculo v3 = new vehiculo(p);
        Vehiculoespecial ve1 = new Vehiculoespecial(p);
        vehiculo v4 = new vehiculo(p);
        Vehiculoespecial ve2 = new Vehiculoespecial(p);
        Limpieza l1 = new Limpieza(p);
        v1.start();
        v2.start();
        v3.start();
        v4.start();
        ve1.start();
        ve2.start();
        l1.start();
    }

    static class vehiculo extends Thread {
        Puente p;

        public vehiculo(Puente p) {
            this.p = p;
        }

        @Override
        public void run() {
            try {
                p.entrar();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            p.salir();

        }
    }

    static class Puente {
        Semaphore limpieza;

        public Puente(Semaphore controlvehiculo) {
            this.controlvehiculo = controlvehiculo;
        }

        public Puente(Semaphore controlvehiculo, Semaphore limpieza) {
            this.limpieza = limpieza;
            this.controlvehiculo = controlvehiculo;
        }

        Semaphore controlvehiculo;

        public void limpiar() throws InterruptedException {
            System.out.println(limpieza.availablePermits());
            System.out.println("intentando entrar limpieza");
            limpieza.acquire();
            System.out.println("sistema  de limpieza activado");
            limpieza.release();
        }

        public void entrar() throws InterruptedException {
            controlvehiculo.acquire();
            System.out.println("ha entrado al puente");
            Thread.sleep(1000);

        }

        public void entrarespecial() throws InterruptedException {
            controlvehiculo.acquire(2);
            System.out.println("ha entrado al puente vehiculo especial");
            Thread.sleep(1000);

        }

        public void salir() {
            System.out.println("Estamos saliendo");
            controlvehiculo.release();
            System.out.println("semaforo de nuevo en verde");
        }

        public void salirespecial() {
            System.out.println("Sale vehiculo especial");
            controlvehiculo.release(2);
            System.out.println("semaforo de nuevo en verde");
        }
    }

    static class Vehiculoespecial
            extends Thread {
        Puente p;

        public Vehiculoespecial(Puente p) {
            this.p = p;
        }

        @Override
        public void run() {
            try {
                System.out.println("intentando entrar especial");

                p.entrarespecial();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            p.salirespecial();
            p.limpieza.release();

        }


    }

    static class Limpieza extends Thread {

        Puente p;

        public Limpieza(Puente p) {
            this.p = p;
        }

        @Override
        public void run() {
            try {
                p.limpiar();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}