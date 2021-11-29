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

    /**
     * Array länge einlesen
     *
     * @return new double [arraay]
     * @throws IOException .
     */
    public static double[] readArrayDouble() throws IOException {
        System.out.println("Wie lange soll das Array sein  (Nur ganz zaheln)");
        int n = IO.readInteger();
        double[] array = readArrayDouble(n);

        return array;

    }
// n muss vorher im programm existieren !!
    public static double[] readArrayDouble(int n) throws IOException {
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Gib den wert ein der an stelle " + (i + 1) + " stehen soll :");
            array[i] = IO.readDouble();
        }

        return array;

    }

    /**
     * Array einlesen
     *
     * @return new int [array]
     * @throws IOException .
     */
    public static int[] readArrayInteger() throws IOException {
        System.out.println("Wie lange soll das Array sein  (Nur ganz zahlen)");
        int n = IO.readInteger();
        int[] array = IO.readArrayInteger(n);

        return array;

    }
    // n muss vorher im programm existieren !!
    public static int[] readArrayInteger(int n) throws IOException {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Gib den wert ein der an stelle " + (i + 1) + " stehen soll :");
            array[i] = IO.readInteger();
        }

        return array;
    }

    /**
     * Array länge einlesen
     *
     * @return new string [array]
     * @throws IOException .
     */

    public static String[] readStringArray() throws IOException {
        System.out.println("Wie lange soll das Array sein  (Nur ganz zaheln)");
        int n = readInteger();
        String[] array = readStringArray(n);

        return array;
    }
    // n muss vorher im programm existieren !!
    public static String[] readStringArray(int n) throws IOException {
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Gib den wert ein der an stelle " + (i + 1) + " stehen soll :");
            array[i] = IO.readString();
        }
        return array;


    }


}
