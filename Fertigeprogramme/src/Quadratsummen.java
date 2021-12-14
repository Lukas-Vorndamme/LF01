import java.io.IOException;

public class Quadratsummen {
    public static void main(String[] args) throws IOException {
        System.out.println("gib die startzahl ein");
        int zahl = IO.readInteger();
        System.out.println("Gib die endzahl ein");
        int ende = IO.readInteger();
        double quadratsumme = 0;
        for (int quadrat = zahl; quadrat <= ende; quadrat += 1) {
            double ergebnis = Math.pow(quadrat, 2);
            double abweichung = ergebnis - quadrat;
            quadratsumme = quadratsumme + ergebnis;
            System.out.println(quadrat);
            System.out.println("das ergebnis ist " + ergebnis);
            System.out.println("Die diefferenz ist " + abweichung);
            System.out.println("Die summe aus allen ergebnisen ist "+quadratsumme);



        }
    }
}