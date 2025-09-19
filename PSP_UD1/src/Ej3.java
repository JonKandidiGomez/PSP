import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ej3 {
        public static void main(String[] args) throws IOException {
            ProcessBuilder pb = new ProcessBuilder("whoami");
            Process p1 = pb.start();
            InputStream is = p1.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String salida;
            StringBuilder res = new StringBuilder();
            while ((salida = br.readLine()) != null) {
                res.append(salida);
            }
            System.out.println(res);
        }
}