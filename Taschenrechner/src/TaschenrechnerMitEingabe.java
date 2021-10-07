import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerMitEingabe {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die erste zahl an ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();
        char eingabe9 = (char)br.read();

        double zahl1 = Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println(" Gib die zweite zahl ein ");
        eingabe = br.readLine();
        double zahl2 = Double.parseDouble(eingabe.trim().replace(',', '.'));


        System.out.println("Gib die rechenoperation an ");
        eingabe9 = (char)br.read();
        char eingabe2 = '/';
        eingabe9 = (char)br.read();
        char eingabe3 = '*';
        eingabe9 = (char)br.read();
        char eingabe4 = '+';
        eingabe9 = (char)br.read();
        char eingabe5 = '-';


        if


    }
}