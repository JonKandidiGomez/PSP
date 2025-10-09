package Ej4;

public class HCiudades extends Thread {

    String[] ciudades = new String[5];

    @Override
    public void run(){
        ciudades[0] = "Tokyo";
        ciudades[1] = "Marsella";
        ciudades[2] = "Bogotá";
        ciudades[3] = "Buenos Aires";
        ciudades[4] = "Vitoria-Gasteiz";

        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }
    }
}
