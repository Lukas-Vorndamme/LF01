import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerMitEingabe {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die erste zahl an ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();

        double  zahl1 =  Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println(" Gib die zweite zahl ein ");
        eingabe = br.readLine();
        double zahl2 = Double.parseDouble(eingabe.trim().replace(',', '.'));
        double zahl3 = zahl1-zahl2;


        System.out.println("Gib die rechenoperation an ");


        String rechenoperator = br.readLine();
        if (rechenoperator.equals("+")){
            System.out.println("Das ergebnis ist " + zahl1+zahl2);
        }
        else if (rechenoperator.equals("-")) {
            System.out.println( " Das ergebnis ist " + zahl3);
        }
        else if (rechenoperator.equals("*")) {
            System.out.println("Das ergebnis ist " + zahl1 * zahl2);
        }
        else if (rechenoperator.equals("/")) {
            System.out.println("Das ergebnis ist " + zahl1 / zahl2);
        }


    }
}