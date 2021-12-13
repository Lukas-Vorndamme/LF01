import java.io.IOException;

public class LieferbeziehungMethoden {
    public static void main(String[] args) throws IOException {

        System.out.print("Was ist der erste Monat");
        String monat1 = IO.readString();

        System.out.print("Was ist der zwete Monat");
        String monat2 = IO.readString();

        System.out.print("Wie viele Kunden gibt es ?");
        int kunden = IO.readInteger();
        System.out.print("wie viele Artikel gibt es ?");
        int artikel = IO.readInteger();

        int[][] matrize1 = erstellenMatrize(kunden, artikel, monat1);

        int[][] matrize2 = erstellenMatrize(kunden, artikel, monat2);

        int[][] matrizenSumme = new int[kunden][artikel];

        int[][] spaltensumatrix = new int[1][kunden];

        int[][] zellensumatrix = new int[1][artikel];

        boolean ok;
        do {

            System.out.println("Was möchten sie tun anzeigen [1], summenrechnung [2]");
            int auswahl = IO.readInteger();

            if (auswahl == 1) {
                anzeigenmatrize(matrize1, monat1);
                System.out.println();
                anzeigenmatrize(matrize2, monat2);
            } else if (auswahl == 2) {
                anzeigenSummenRechnung(matrizenSumme, matrize1, matrize2, spaltensumatrix, spaltensumatrix);
            }
            System.out.println();
            System.out.println("möchten sie noch etwas machen ?");
            ok = IO.readBoolean();

        } while (ok);
    }

    private static int[][] erstellenMatrize(int kunden, int artikel, String monat) throws IOException {
        System.out.print("Daten für Monat " + monat + " eingeben ");

        int[][] matrize = new int[kunden][artikel];

        for (int i = 0; i < matrize.length; i++) {
            for (int j = 0; j < matrize[i].length; j++) {
                System.out.print("Menge der Artikel für Kunde" + (i + 1) + " und der Artikel" + (j + 1));
                matrize[i][j] = IO.readInteger();
            }
        }
        return matrize;
    }

    private static void anzeigenmatrize(int[][] matrize, String monat) throws IOException {

        System.out.print(monat + "\t");
        for (int i = 0; i < matrize[0].length; i++) {
            System.out.print("\t\tKunde" + (i + 1));
        }
        System.out.println();

        for (int i = 0; i < matrize.length; i++) {
            System.out.print("Artikel" + (i + 1) + "\t");
            for (int j = 0; j < matrize[i].length; j++) {
                System.out.print(matrize[i][j] + "\t\t\t");
            }
            System.out.println();
        }
    }

    private static void anzeigenSummenRechnung(int[][] matrizenSumme, int[][] matrize1, int[][] matrize2, int[][] spaltensumatrix, int[][] zellensumatrix) throws IOException {

        int wert = 0;
        int zaehler = 0;

        System.out.print("summe");
        for (int i = 0; i < matrizenSumme[0].length; i++) {
            System.out.print("\t\tKunde" + (i + 1));
        }
        System.out.println();

        for (int i = 0; i < matrizenSumme.length; i++) {
            System.out.print("Artikel" + (i + 1) + "\t");
            for (int j = 0; j < matrizenSumme[i].length; j++) {
                matrizenSumme[i][j] = (matrize1[i][j] + matrize2[i][j]);
                System.out.print(matrizenSumme[i][j] + "\t\t\t");
            }
            System.out.println();
        }

        for (int i = 0; i < matrizenSumme.length; i++) {
            for (int j = 0; j + 1 < matrizenSumme[i].length; j++) {
                wert = matrizenSumme[i][j] + matrizenSumme[i][j + 1];
            }
            spaltensumatrix[0][zaehler] = wert;
            zaehler++;
        }
        for (int i = 0; i < spaltensumatrix.length; i++) {
            for (int j = 0; j < spaltensumatrix[i].length; j++) {
                System.out.print("\t" + spaltensumatrix[i][j] + "\t");

            }
            System.out.println();
        }

    }
}