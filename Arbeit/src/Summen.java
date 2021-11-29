import java.io.IOException;

public class Summen {
    public static void main(String[] args) throws IOException {
        int[] m = IO.readArrayInteger();
        int d = 0;
        int dd = 0;
        int e = 0;
        int f = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] % 2 == 0) {
                d++;
                dd += m[i];
            } else {
                e++;
                f += m[i];} }
                System.out.println("Gerade zahlen");
                System.out.println("Anzahl =  " + d);
                System.out.println("Summe = " + dd);

                System.out.println("Ungerade");
                System.out.println("Anzahl = " + e);
                System.out.println("Summe = " + f);



        }
    }