import java.io.File;
import java.io.IOException;

public class Ej6 {
    public static void main(String[] args) throws IOException {
        File errores = new File("errores.txt");
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "dr");
        pb.redirectError(errores);
        pb.start();
    }
}
