import java.io.IOException;

public class Tonsignal {
    public static void main(String[] args) throws IOException {
        int[] ton = IO.readArrayInteger();
        int wert1 = (ton[0] + ton[1]) / 2;
        int wert2 = 0;
        int n = 0;
        System.out.println("Altes tonsignal");
        for (int i = 0; i < ton.length; i++){
            System.out.print("\t" + ton[i]);
        }
        System.out.println();
        System.out.println("Geglättetes signal ");

        int[] wert = new int[ton.length];
        System.out.print(" \t" + wert1);
        for (int i = 1; i < (ton.length - 1); i++) {
            wert[n] = (ton[i - 1] + ton[i] + ton[i + 1]) / 3;
            System.out.print("\t" + wert[n]);
            n++;
            wert2 = (ton[i] + ton[i - 1]) / 2;
        }
        System.out.print(" \t" + wert2);
    }
} 