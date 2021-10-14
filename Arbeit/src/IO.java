import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    /**
     * Liest einen Text von der Konsole ein
     * @return den eingegebenen Text
     * @throws IOException
     */
  private static   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String readString() throws IOException {
        String eingabe;
        eingabe = br.readLine();
        return eingabe;
/**
 * String eingabe;
 *         eingabe = br.readLine();
 *         return eingabe;
 */
    }
}
