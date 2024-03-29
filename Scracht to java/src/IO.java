import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    /**
     * Liest einen Text von der Konsole ein
     * return den eingegebenen Text
     * throws IOException
     */
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * String eingabe;
     * eingabe = br.readLine();
     *
     * @return eingabe;
     * @throws IOException eingabe
     */
    public static String readString() throws IOException {
        String eingabe;
        eingabe = br.readLine();
        return eingabe;

    }

    /**
     * Liest Ganzzahlen ein
     *
     * @return gibt diese zahl wieder aus
     * @throws IOException eingabe
     */
    public static int readInteger() throws IOException {
        while (true) {
            try {
                return Integer.parseInt(readString().trim());
            } catch (NumberFormatException nfe) {
                System.out.println("Keine Ganzzahl, Bitte erneut versuchen");

            }
        }
    }

    /**
     * liest kommazahlen ein
     * gibt die kommazahl wieder aus
     *
     * @return kommazahlen
     * @throws IOException eingabe
     */
    public static double readDouble() throws IOException {
        while (true) {
            try {
                return Double.parseDouble(readString().trim().replace(',', '.'));
            } catch (NumberFormatException nfe) {
                System.out.println("Keine Ganzenzahlen, nur kommazahlen. Bitte Nochmal versuchen");
            }
        }
    }

    /**
     * Ja oder nein
     *
     * @return ja oder nein
     * @throws IOException eingabe
     */
    public static boolean readBoolean() throws IOException {
        while (true) {
            String eingabe = readString();


            if (eingabe.equalsIgnoreCase("ja")
                    || (eingabe.equalsIgnoreCase("j"))
                    || (eingabe.equalsIgnoreCase("yes"))
                    || (eingabe.equalsIgnoreCase("jo"))
                    || (eingabe.equalsIgnoreCase("joo"))
                    || (eingabe.equalsIgnoreCase("Yeah"))
                    || (eingabe.equalsIgnoreCase("y"))) {
                return true;
            }
            if (eingabe.equalsIgnoreCase("Nein")
                    || (eingabe.equalsIgnoreCase("n")
                    || (eingabe.equalsIgnoreCase("nö")
                    || (eingabe.equalsIgnoreCase("no"))))) {
                return false;

            }
            System.out.println("Versuchen sie es nochmal mit einer normalen antwort");
        }
    }
}







