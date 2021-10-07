import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerMitZahlEingabe {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die erste zahl an ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();

        double zahl1 = Double.parseDouble(eingabe.trim().replace(',','.'));
        System.out.println(" Gib die zweite zahl ein ");
        eingabe = br.readLine();
        double zahl2 = Double.parseDouble(eingabe.trim().replace(',','.'));


        double summe = zahl1+zahl2;
        double produkt = zahl1* zahl2;
        double qoutient = zahl1 / zahl2;
        double differenz = zahl1-zahl2;

        System.out.println("Zahl 1 ist \t\t\t\t\t\t\t\t\t\t\t"+zahl1);
        System.out.println("Zahl 2 ist \t\t\t\t\t\t\t\t\t\t\t"+zahl2);
        System.out.println("Die Summe der beiden zahlen ist \t\t\t\t\t" +summe );
        System.out.println("Die Differenz der beiden zahlen ist \t\t\t\t "+differenz);
        System.out.println("Das Produkt der beiden zahlen ist \t\t\t\t\t "+produkt);
        System.out.println("Der ungerundete Qoutient ist \t\t\t\t\t\t" +qoutient);

    }
}
