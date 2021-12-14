import java.io.IOException;

public class Kreiszahl {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die gewünschte zahl für n ein");
        int n = IO.readInteger();
        double berechnung = 0;
        for (int i = 1; i <= n; i++) {
            berechnung = Math.pow((-1), i) / (2 * i + 1);
        }berechnung *= 4;
        double div = Math.PI-berechnung;
        System.out.println(berechnung);
        System.out.println(div);
        System.out.println(Math.PI);

    }
}
