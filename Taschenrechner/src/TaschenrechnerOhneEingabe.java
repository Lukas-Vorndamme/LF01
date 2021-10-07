

public class TaschenrechnerOhneEingabe {
    public static void main(String[] args) {
         double kommazahl = 9;
         double kommazahl2 = 3.5;
         double summe = kommazahl+kommazahl2;
         double differenz = kommazahl-kommazahl2;
         double produkt = kommazahl*kommazahl2;
         double quotientGerundet = Math.round(kommazahl/kommazahl2*100);
         quotientGerundet = quotientGerundet/100;
         double qoutient = kommazahl/kommazahl2;

         System.out.println("Zahl 1 ist "+kommazahl);
        System.out.println("Zahl 2 ist \t"+kommazahl2);
        System.out.println("Die Summe der beiden zahlen ist \t" +summe );
        System.out.println("Die Differenz der beiden zahlen ist \t "+differenz);
        System.out.println("Das Produkt der beiden zahlen ist \t " +produkt);
        System.out.println("Der Gerundete Quotient der beiden zahlen ist  \t"+quotientGerundet);
        System.out.println("Der ungerundete Qoutient ist \t" +qoutient);

    }
}
