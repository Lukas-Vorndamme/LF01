import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenRechnerFinale {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String antwort;
        do {
            System.out.println("[+] Für Addition");
            System.out.println("[-] Für Subtraktion");
            System.out.println("[*] Für Multiplikation");
            System.out.println("[/] Für Divison");
            System.out.println("[p] Für Potenzieren");
            System.out.println("[w] Für Wurzel");
            System.out.println("Gib die gewünschte rechenoperation an ");



            String rechenoperation;
            rechenoperation = br.readLine();
            if (rechenoperation.equals("+")) {

                System.out.println(" Gib den Summanden an");
                String eingabe = br.readLine();
                double Summannd = Double.parseDouble(eingabe.trim().replace(',', '.'));
                System.out.println(" Gib den zweiten Summanden an");
                eingabe = br.readLine();
                double Summannd2 = Double.parseDouble(eingabe.trim().replace(',', '.'));
                System.out.println(Summannd + Summannd2);

            } else if (rechenoperation.equals("-")) {
                System.out.println("Bitte gib den Minuend ein");

                String eingabe = br.readLine();
                double Minuend = Double.parseDouble(eingabe.trim().replace(',', '.'));
                System.out.println("Bitte gib den Subtrahend ein");
                eingabe = br.readLine();
                double Subtrahend = Double.parseDouble(eingabe.trim().replace(',', '.'));
                System.out.println(Minuend - Subtrahend);

            } else if (rechenoperation.equals("*")) {
                System.out.println("Bitte gib den 1. Faktor ein");
                String eingabe = br.readLine();
                double Faktor1 = Double.parseDouble(eingabe.trim().replace(',', '.'));
                System.out.println("Bitte gib den 2. Faktor ein");
                eingabe = br.readLine();
                double Faktor2 = Double.parseDouble(eingabe.trim().replace(',', '.'));
                System.out.println(Faktor1 * Faktor2);

            } else if (rechenoperation.equals("/")) {
                System.out.println(" Bitte gib den Dividend ein");
                String eingabe = br.readLine();
                double Dividend = Double.parseDouble(eingabe.trim().replace(',', '.'));

                System.out.println("Bitte gib den Divisor ein");
                eingabe = br.readLine();
                double Divisor = Double.parseDouble(eingabe.trim().replace(',', '.'));
                System.out.println(Dividend / Divisor);

            } else if (rechenoperation.equals("p")) {
                System.out.println("Bitte gib die basis an");
                String eingabe = br.readLine();
                double basis = Double.parseDouble(eingabe.trim().replace(',', '.'));

                System.out.println("Bitte gib den exponent ein");
                eingabe = br.readLine();
                 double exponent = Double.parseDouble(eingabe.trim().replace(',', '.'));
                System.out.println(Math.pow(basis, exponent));
                System.out.println(Math.pow(basis, exponent));
            } else if (rechenoperation.equals("w")) {
                System.out.println("Bitte gib den Radikand ein");
                String eingabe = br.readLine();
                double Radikand = Double.parseDouble(eingabe.trim().replace(',', '.'));
                System.out.println(Math.sqrt(Radikand));
            }
            {
                System.out.println("Möchten sie das programm Wiederholen?");
                System.out.println("Ja für Wiederholen");
                System.out.println("Nein für beenden ");

                antwort = br.readLine().replace("J","Ja").replace("j","Ja");
        }
        } while (antwort.equalsIgnoreCase("Ja"));
    }
}