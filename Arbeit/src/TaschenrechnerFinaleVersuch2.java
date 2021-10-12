import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerFinaleVersuch2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String wiederholen = null;
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

                System.out.println(" Gib denn Summanden an");
                String eingabe = br.readLine();
                double Summannd = Double.parseDouble(eingabe.trim().replace(',', '.'));
                System.out.println(" Gib denn zweiten Summanden an");
                eingabe = br.readLine();

                double Summannd2 = Double.parseDouble(eingabe.trim().replace(',', '.'));
                System.out.println(Summannd + Summannd2);

            } else if (rechenoperation.equals("-")) {
                System.out.println("Minuend");
                System.out.println("Subtrahend");
                String eingabe = br.readLine();
                double Minuend = Double.parseDouble(eingabe.trim().replace(',', '.'));
                double Subtrahend = Double.parseDouble(eingabe.trim().replace(',', '.'));

                System.out.println(Minuend - Subtrahend);

            } else if (rechenoperation.equals("*")) {
                System.out.println("1 Faktor");
                System.out.println("2 Faktor");
                String eingabe = br.readLine();
                double Faktor1 = Double.parseDouble(eingabe.trim().replace(',', '.'));
                double Faktor2 = Double.parseDouble(eingabe.trim().replace(',', '.'));
                System.out.println(Faktor1 * Faktor2);

            } else if (rechenoperation.equals("/")) {
                System.out.println("Dividend");
                System.out.println("Divisor");
                String eingabe = br.readLine();
                double Dividend = Double.parseDouble(eingabe.trim().replace(',', '.'));
                double Divisor = Double.parseDouble(eingabe.trim().replace(',', '.'));

                System.out.println(Dividend / Divisor);
            } else if (rechenoperation.equals("p")) {
                System.out.println("basis");
                System.out.println("exponent");
                String eingabe = br.readLine();
                double basis = Double.parseDouble(eingabe.trim().replace(',', '.'));
                double exponent = Double.parseDouble(eingabe.trim().replace(',', '.'));

                System.out.println(Math.pow(basis, exponent));
            } else if (rechenoperation.equals("w")) {
                System.out.println("Radikand ");
                String eingabe = br.readLine();
                double Radikand = Double.parseDouble(eingabe.trim().replace(',', '.'));

                System.out.println(Math.sqrt(Radikand));
            }
            System.out.println("Willst du das programm Wiederholen?");
            System.out.println("Ja für wiederholen");
            System.out.println("Nein für beenden ");
            System.out.println("1 für Ja und 2 für Nein");


        } while (wiederholen.equals("j"));
    }
}

