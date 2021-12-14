import java.io.IOException;
import java.util.ArrayList;

public class Selectionsort {
    public static void main(String[] args) throws IOException {
        int laenge = IO.readInteger();


        ArrayList<Integer> eingabe = new ArrayList<>();
        for (int i = 0; i < laenge; i++) {
            System.out.println(" Gib werte ein");
            int m = IO.readInteger();
            eingabe.add(m);

        }
        int min = eingabe.get(0);
        int löschen = 0;
        boolean ok;
        int[] sortiert = new int[laenge];
        do {

            ok = false;

            for (int i = 0; i < laenge; i++) {

                if (eingabe.get(i) < min) {
                    min = eingabe.get(i);
                    löschen = i;
                    ok = true;

                }
                if (i + 1 == laenge) {
                    sortiert[i] = min;
                    eingabe.remove(löschen);
                }
            }


        } while (ok);
        for (int i = 0; i < laenge; i++) {
            System.out.println(sortiert[i]);
        }


    }
}
