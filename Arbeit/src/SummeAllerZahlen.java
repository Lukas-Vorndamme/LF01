import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummeAllerZahlen {
    public static void main(String[] args) throws IOException {
        System.out.println("Bitte gib n ein");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();
        double n = Double.parseDouble(eingabe.trim().replace(',', '.'));



int summe = 0;
// For schleife
        for (int m = 1; m <= n; m++)
        summe = summe + m;{
            System.out.println("das ergebnis ist " + summe  );
        }

        // Do Schleifen Variante

int summe2 = 0;
        int v= 1;

        double i = Double.parseDouble(eingabe.trim().replace(',', '.'));
        do
        {


            summe2 = summe2 + v;
            v = v+1;
        } while (v <= i);

        {
            System.out.println("das egebnis ist " + summe2);}


        // while schleife
int b = 1;
int summe3 = 0;
        double h = Double.parseDouble(eingabe.trim().replace(',', '.'));
        while (b <= h ) {

            summe3 = summe3 + b;
            b = b + 1;
        }
        {
            System.out.println("das ergebnis ist " + summe3);}




    }
}