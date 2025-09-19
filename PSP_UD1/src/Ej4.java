import java.io.*;

public class Ej4 {
    public static void main(String[] args) throws IOException {
        //Con ProcessBuilder
        ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "dir");
        processBuilder.inheritIO();
        processBuilder.start();

        ProcessBuilder processBuilder2 = new ProcessBuilder("cmd", "/c", "dir");
        processBuilder2.redirectOutput(new File("salidaPB.txt"));
        processBuilder2.start();

        //Con Runtime
        String cmd = "CMD /C DIR";
        Process process = Runtime.getRuntime().exec(cmd);
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }

        Process process2 = Runtime.getRuntime().exec(cmd);
        byte[] buffer = process.getInputStream().readAllBytes();
        File fichero2 = new File("salidaRuntime.txt");
        OutputStream output = new FileOutputStream(fichero2);
        output.write(buffer);
    }
}