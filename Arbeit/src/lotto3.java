import java.io.IOException;

public class lotto3 {
    public static void main(String[] args) throws IOException {
        long zahl1 = 0;
        long zahl2 = 0;
        long zahl3= 0;
        long zahl4= 0;
        long zahl5= 0;
        long zahl6= 0;
        long superzahl = 0;
        boolean w = false;
        boolean h = true;
        for (int i = 0; h ; i++){
            h = false;
            zahl1 = Math.round(Math.random() * 48 + 0.5);
            zahl2 = Math.round(Math.random() * 48 + 0.5);
            zahl3 = Math.round(Math.random() * 48 + 0.5);
            zahl4 = Math.round(Math.random() * 48 + 0.5);
            zahl5 = Math.round(Math.random() * 48 + 0.5);
            zahl6 = Math.round(Math.random() * 48 + 0.5);

            if (zahl1 == zahl2 || zahl1 == zahl3 || zahl1 == zahl4 || zahl1 == zahl5 || zahl1 == zahl6 ||
                    zahl2 == zahl3 || zahl2 == zahl4 || zahl2 == zahl5 || zahl2 == zahl6 ||
                    zahl3 == zahl4 || zahl3 == zahl5 || zahl3 == zahl6 ||
                    zahl4 == zahl5 || zahl4 == zahl6 ||
                    zahl5 == zahl6) {
                h = true;
            }
        }
        superzahl =  Math.round(Math.random() * 48 + 0.5);
        long[] zahlen  = new long[6];
        for (int  i = 0; i < zahlen.length; i++){
            zahlen[0] = zahl1;
            zahlen[1] = zahl2;
            zahlen[2] = zahl3;
            zahlen[3] = zahl4;
            zahlen[4] = zahl5;
            zahlen[5] = zahl6;
        }
        do {
            w = false;
            for (int i = 0; i < zahlen.length - 1; i++) {
                if (zahlen[i] > zahlen[i + 1]) {
                    long temp = zahlen[i];
                    zahlen[i] = zahlen[i + 1];
                    zahlen[i + 1] = temp;
                    w = true;
                }
            }
        } while (w);

        for (int i = 0; i < zahlen.length; i++){
            System.out.println( "Zahl" +  (i+1) + "\t " + zahlen[i]);

        }
        System.out.println("Superzahl \t" + superzahl);

    }

}


