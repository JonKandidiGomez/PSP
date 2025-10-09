package Ej6;

public class Main {
    public static void main(String[] args) {

        Atleta a1 = new Atleta();
        a1.setName("Atleta 1");
        Atleta a2 = new Atleta();
        a2.setName("Atleta 2");
        Atleta a3 = new Atleta();
        a3.setName("Atleta 3");
        Atleta a4 = new Atleta();
        a4.setName("Atleta 4");
        Atleta a5 = new Atleta();
        a5.setName("Atleta 5");

        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}
