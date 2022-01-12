
public class Lotto {
    public static void main(String[] args) {
        double[] lottozahlen = new double[6];
        double zusatzzahl = Math.round(Math.random() * 48 + 0.5);

boolean l = true;

        for (int o = 0; l ; o++) {
            for (int i = 0; i < lottozahlen.length; i++) {
                l = false;
                lottozahlen[i] = Math.round(Math.random() * 48 + 0.5);


                if (lottozahlen[0] == lottozahlen[1] || lottozahlen[0] == lottozahlen[2] || lottozahlen[0] == lottozahlen[3] || lottozahlen[0] == lottozahlen[4] || lottozahlen[0] == lottozahlen[5]
                        || lottozahlen[1] == lottozahlen[2]  || lottozahlen[1] == lottozahlen[3]  || lottozahlen[1] == lottozahlen[4]  || lottozahlen[1] == lottozahlen[5]
                        || lottozahlen[2] == lottozahlen[3]    || lottozahlen[2] == lottozahlen[4]    || lottozahlen[2] == lottozahlen[5]
                        || lottozahlen[3] == lottozahlen[4]    || lottozahlen[3] == lottozahlen[5]
                        || lottozahlen[4] == lottozahlen[5])
                {
                    lottozahlen[i] = Math.round(Math.random() * 48 + 0.5);
                    l = true;
                }}
            }





        for (int i = 0; i < lottozahlen.length; i ++){

            System.out.println( "Lottozahl"  + (i+1) +  "\t" + lottozahlen[i]);

        }
        System.out.println("Zusatzzahl \t "  + zusatzzahl);
        }



}
