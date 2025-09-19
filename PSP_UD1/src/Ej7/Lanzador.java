package Ej7;

import java.io.IOException;

public class Lanzador {
    public static void main(String[] args) throws IOException {

        ProcessBuilder pb =  new ProcessBuilder();
        pb.command("java", "src/Ej7/NumPrim.java");
        pb.inheritIO();
        pb.start();
    }
}
