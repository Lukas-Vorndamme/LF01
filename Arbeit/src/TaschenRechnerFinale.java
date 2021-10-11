import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenRechnerFinale {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String rechenoperation = br.readLine();
        String eingabe = br.readLine();


        double Summannd = Double.parseDouble(eingabe.trim().replace(',', '.'));
        double Summannd2 = Double.parseDouble(eingabe.trim().replace(',', '.'));
        double Minuend = Double.parseDouble(eingabe.trim().replace(',', '.'));
        double Subtrahend = Double.parseDouble(eingabe.trim().replace(',', '.'));
        double Faktor1 = Double.parseDouble(eingabe.trim().replace(',', '.'));
        double Faktor2 = Double.parseDouble(eingabe.trim().replace(',', '.'));
        double Dividend = Double.parseDouble(eingabe.trim().replace(',', '.'));
        double Divisor = Double.parseDouble(eingabe.trim().replace(',', '.'));
        double basis = Double.parseDouble(eingabe.trim().replace(',', '.'));
        double exponent = Double.parseDouble(eingabe.trim().replace(',', '.'));
        double Radikand = Double.parseDouble(eingabe.trim().replace(',', '.'));

        do {
            System.out.println("[+] Für Addition");
            System.out.println("[-] Für Subtraktion");
            System.out.println("[*] Für Multiplikation");
            System.out.println("[/] Für Divison");
            System.out.println("[p] Für Potenzieren");
            System.out.println("[w] Für Wurzel");
            System.out.println("Gib die gewünschte rechenoperation an ");


            if (rechenoperation.equals("+")) {
                System.out.println(" Gib denn Summanden an");
                System.out.println(" Gib denn zweiten Summanden an");
            } else if (rechenoperation.equals("-")) {
                System.out.println("Minuend");
                System.out.println("Subtrahend");
            } else if (rechenoperation.equals("*")) {
                System.out.println("1 Faktor");
                System.out.println("2 Faktor");
            } else if (rechenoperation.equals("/")) {
                System.out.println("Dividend");
                System.out.println("Divisor");
            } else if (rechenoperation.equals("p")) {
                System.out.println("basis");
                System.out.println("exponent");
            } else if (rechenoperation.equals("w")) {
                System.out.println("Radikand ");
            }


            if (rechenoperation.equals("+")) {
                System.out.println((Summannd + Summannd2)); }
            else if (rechenoperation.equals("-")){
                System.out.println((Minuend-Subtrahend));}
            else if (rechenoperation.equals("*")){
                System.out.println((Faktor1*Faktor2 ));}
            else if (rechenoperation.equals("/")){
                System.out.println((Dividend/Divisor));}



        }while ();
    }
}