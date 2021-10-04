import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kilometer {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die kilometer an");
      BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
      String eingabe = br.readLine();

      double kilometer = Double.parseDouble(eingabe.trim().replace(',', '.'));
      double ergebnis = kilometer * 0.62137;
        System.out.println("Die kilomerter sin din meilen \t" + ergebnis);


    }
}
