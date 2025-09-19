import java.io.IOException;

public class Ej2 {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("whoami");
        pb.inheritIO();
        pb.start();
    }
}