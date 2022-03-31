import java.io.IOException;

public class lehrerloesung {
        public static void main(String[] args) throws IOException {
            System.out.print("Wie viele Stellen haben die Bin�rzahlen maximal? ");
            int anzahl = IO.readInteger();

            // Eingabe der Zahlen mit Validit�tscheck
            int[] zahl1 = new int[anzahl];
            System.out.println("Gib die erste Zahl ziffernweise von rechts ein: ");
            for (int i = 0; i < zahl1.length; i++) {
                zahl1[i] = IO.readInteger();
                while (zahl1[i] != 0 && zahl1[i] != 1) {
                    System.out.println("Falsche Eingabe!");
                    zahl1[i] = IO.readInteger();
                }
            }
            System.out.println("Gib die zweite Zahl ziffernweise von rechts ein: ");
            int[] zahl2 = new int[zahl1.length];
            for (int i = 0; i < zahl2.length; i++) {
                zahl2[i] = IO.readInteger();
                while (zahl2[i] != 0 && zahl2[i] != 1) {
                    System.out.println("Falsche Eingabe!");
                    zahl2[i] = IO.readInteger();
                }
            }

            // Ausgabe der Eingaben
            System.out.print("Zahl 1: \t0");
            for (int i = zahl1.length - 1; i >= 0; i--) {
                System.out.print(zahl1[i]);
            }
            System.out.println();
            System.out.print("Zahl 2: \t0");
            for (int i = zahl2.length - 1; i >= 0; i--) {
                System.out.print(zahl2[i]);
            }
            System.out.println();

            // Addition der Bin�rzahlen
            int ergebnis[] = new int[zahl1.length + 1];
            int uebertrag = 0;
            for (int i = 0; i < zahl1.length; i++) {
                if (zahl1[i] + zahl2[i] + uebertrag == 3) {
                    ergebnis[i] = 1;
                    uebertrag = 1;
                } else if (zahl1[i] + zahl2[i] + uebertrag == 2) {
                    ergebnis[i] = 0;
                    uebertrag = 1;
                } else if (zahl1[i] + zahl2[i] + uebertrag == 1) {
                    ergebnis[i] = 1;
                    uebertrag = 0;
                } else {
                    ergebnis[i] = 0;
                    uebertrag = 0;
                }
            }
            ergebnis[ergebnis.length - 1] = uebertrag;

            // Ausgabe des Ergebnisses
            System.out.print("Ergebnis: \t");
            for (int i = ergebnis.length - 1; i >= 0; i--) {
                System.out.print(ergebnis[i]);
            }
            System.out.println();
        }

    }


