import java.io.IOException;

public class Lagerbestand {
    public static void main(String[] args) throws IOException {
        int anzahl =0;
        double preis =0;
                System.out.println("Wie Viele produkte haben sie?");
        int n = IO.readInteger();
        String[] l = IO.readStringArray(n);
        System.out.println("Erfassen sie jetzt die preise der Artikel");
        double[] p = IO.readArrayDouble(n);
        System.out.println("Erfassen sie jetzt noch die anzahl der artikel");
        int[] a = IO.readArrayInteger(n);
      for (int i = 0; i < n ; i++){
           preis = preis + (a[i] * p[i]);
         anzahl = anzahl + a[i];
      }
        System.out.println("Sie haben noch " +anzahl + " Artikel im lager");
        System.out.println("Die Artikel haben einen wert von " + preis + "€");



        }

    }

