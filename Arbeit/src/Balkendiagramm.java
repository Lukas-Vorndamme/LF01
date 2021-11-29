import java.io.IOException;

public class Balkendiagramm {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die werte ein");
        int[] p = IO.readArrayInteger();
        System.out.println("Ergebniss ");
        for (int i = 0; i < p.length; i++){
            System.out.println("Kandidat " + (i+1)+ ":\t");
            for (int n = 0; n < p[i]; n++ ){
                System.out.print("*");
            }
            System.out.print("\t" + p[i] + "%");
            System.out.println();
        }


    }
}

