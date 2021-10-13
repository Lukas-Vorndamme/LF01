import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BloeckeTaschenrechner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String wiederholung;
        boolean wiederholen;


        do {
            wiederholen = false;

            abfrage();

            String rechenoperation;
            rechenoperation = br.readLine().trim();
            if (rechenoperation.equals("+")) {
                plus();

            } else if (rechenoperation.equals("-")) {
                minus();

            } else if (rechenoperation.equals("*")) {
                mal();

            } else if (rechenoperation.equals("/")) {
                geteilt();

            } else if (rechenoperation.equalsIgnoreCase("p")) {
                potenzen();

            } else if (rechenoperation.equalsIgnoreCase("w")) {
                wurzel();
            }

            wiederholen();

            wiederholung = br.readLine().trim();
            if (wiederholung.equalsIgnoreCase("Ja")) wiederholen = true;
        } while (wiederholen);


    }

    private static void abfrage () {
        System.out.println("[+] Für Addition");
        System.out.println("[-] Für Subtraktion");
        System.out.println("[*] Für Multiplikation");
        System.out.println("[/] Für Divison");
        System.out.println("[p] Für Potenzieren");
        System.out.println("[w] Für Wurzel");
        System.out.println("Gib die gewünschte rechenoperation an ");
    }

    private static void plus() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Gib den Summanden an");
        String eingabe = br.readLine();
        double Summannd = Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println(" Gib den zweiten Summanden an");
        eingabe = br.readLine();
        double Summannd2 = Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println(Summannd + Summannd2);
    }

    private static void minus() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bitte gib den Minuend ein");
        String eingabe = br.readLine();
        double Minuend = Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println("Bitte gib den Subtrahend ein");
        eingabe = br.readLine();
        double Subtrahend = Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println(Minuend - Subtrahend);
    }

    private static void mal() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bitte gib den 1. Faktor ein");
        String eingabe = br.readLine();
        double Faktor1 = Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println("Bitte gib den 2. Faktor ein");
        eingabe = br.readLine();
        double Faktor2 = Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println(Faktor1 * Faktor2);

    }

    private static void geteilt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Bitte gib den Dividend ein");
        String eingabe = br.readLine();
        double Dividend = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Bitte gib den Divisor ein");
        eingabe = br.readLine();
        double Divisor = Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println(Dividend / Divisor);

    }

    private static void potenzen() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bitte gib die basis an");
        String eingabe = br.readLine();
        double basis = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Bitte gib den exponent ein");
        eingabe = br.readLine();
        double exponent = Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println(Math.pow(basis, exponent));
        System.out.println(Math.pow(basis, exponent));
    }

    private static void wurzel() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bitte gib den Radikand ein");
        String eingabe = br.readLine();
        double Radikand = Double.parseDouble(eingabe.trim().replace(',', '.'));
        System.out.println(Math.sqrt(Radikand));
    }

    private static void wiederholen() {
        System.out.println("Möchten sie das programm Wiederholen?");
        System.out.println("Ja für Wiederholen");
        System.out.println("Nein für beenden ");


    }


}
