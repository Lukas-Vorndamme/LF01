import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Meilen {
    public static void main(String[] args) throws IOException {
        System.out.println("geben sie die  meilen ein");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();

        double meilen = Double.parseDouble(eingabe.trim().replace(',', '.'));
        double ergebnis = meilen * 1.609344;
        System.out.println("Die angebenen meilen sind in kilomer \t" + ergebnis);
    }
}