import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    /**
     * Ruta del primer archivo
     */
    private static String ruta = "/home/dam/Documentos/Copycaracteres/texto1.txt";
    /**
     * Ruta del segundo archivo
     */
    private static String ruta2 = "/home/dam/Documentos/Copycaracteres/texto2.txt";

    /**
     * Metodo main
     * @param args
     */
    public static void main(String[] args) {
        copycaracteres();
    }
    /**
     * Metodo que copia los caracteres de un archivo a otro
     */
    public static void copycaracteres() {
        {
            try (
                    FileReader fr = new FileReader(ruta);
                    FileWriter fw = new FileWriter(ruta2);
            ) {
                int caracter = fr.read();
                while (caracter != -1) {
                    fw.write(caracter);
                    caracter = fr.read();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
