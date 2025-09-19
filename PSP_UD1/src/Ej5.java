import java.io.File;
import java.io.IOException;

public class Ej5 {
    public static void main(String[] args) throws IOException {
        File dirTrabajo = new File("C:\\Users\\149FA03\\Documents");
        ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "dir");
        processBuilder.inheritIO();
        processBuilder.directory(dirTrabajo);
        processBuilder.start();
    }
}
