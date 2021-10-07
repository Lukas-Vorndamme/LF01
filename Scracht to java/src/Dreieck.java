import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dreieck {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die höghe an ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();

        int hoehe = (int) Double.parseDouble(eingabe.trim().replace(',','.'));
        System.out.println("Gib die grundlinie an");
        eingabe = br.readLine();
        float grundlinie = (int) Double.parseDouble(eingabe.trim().replace(',','.'));

        double ergebnis;

        ergebnis = grundlinie*hoehe / 2;
        System.out.println("Das Ergebnis lautet "+ergebnis);} }
