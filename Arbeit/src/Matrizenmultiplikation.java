import java.io.IOException;

public class Matrizenmultiplikation {
    public static void main(String[] args) throws IOException {
        System.out.println("Wie viele Zeilen?");
        int zeilen = IO.readInteger();
        System.out.println("Wie viele Spalten?");
        int spalten = IO.readInteger();
        int[] wert = new int[spalten];
        int wert1 = 0;
        int y = 0;
        System.out.println("matrize 1");
        int[][] matrize1 = IO.readIntArray2D(zeilen, spalten);
        System.out.println("matrize 2");
        int[][] matrize2 = IO.readIntArray2D(spalten, zeilen);
        int[][] endwert = new int[zeilen][zeilen];
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                wert[j] = matrize1[0][j] * matrize2[j][i];
                wert1 += wert[j];
            }
            endwert[0][y] = wert1;
            y++;
            wert1 = 0;
        }
        y = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                wert[j] = matrize1[1][j] * matrize2[j][i];
                wert1 += wert[j];
            }
            endwert[1][y] = wert1;
            y++;
            wert1 = 0;
        }
        IO.systemOutPrintIntArray2D(endwert);
    }
}
