import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerMitEingabe {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die Erste Zahl an ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();

        double  zahl1 =  Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println(" Gib die Zweite Zahl ein ");
        eingabe = br.readLine();
        double zahl2 = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Gib die Rechenoperation an ");

        String rechenoperator = br.readLine();
        if (rechenoperator.equals("+")){
            System.out.println("Das Ergebnis ist " + (zahl1 + zahl2) );
        }
        else if (rechenoperator.equals("-")) {
            System.out.println( " Das Ergebnis ist " + (zahl1-zahl2 ));
        }
        else if (rechenoperator.equals("*")) {
            System.out.println("Das Ergebnis ist " +  (zahl1 * zahl2 ));
        }
        else if (rechenoperator.equals("/")) {
            System.out.println("Das Ergebnis ist " +  (zahl1 / zahl2 ));
        }


    }

}