import java.io.IOException;

public class Zellwachstum {
    public static void main(String[] args) throws IOException {

        boolean wiederholen;
        do {
            System.out.println("Gib die dei aktuelle zallmenge an");
            double zellmengen = IO.readDouble();
            System.out.println("Gib den wachstumsfaktor am");
            double wachstumsfaktor = IO.readDouble();
            System.out.println("Wie viele tage sollen berechnet werden");
            int tage = IO.readInteger();
            double zellmenge = zellmengen;
            System.out.println("Sartzellen    \t \t \t" + zellmengen);
            System.out.println("Wachstumsfaktor\t\t\t " + wachstumsfaktor);
            System.out.println("Tage der wiederholung\t " + tage);
            System.out.println("Tag 0\t\t " + zellmengen);
            for (int n = 1; n <= tage; n++) {
                zellmenge = zellmenge *wachstumsfaktor;
                System.out.println("Tag " + n + "\t" + "\t " + zellmenge);
            }
            System.out.println("Möchten sie Weiter Wachstumsprozesse berechnen?");
            wiederholen = IO.readBoolean();
        } while (wiederholen);
    }
}
