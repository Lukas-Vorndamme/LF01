
public class Lotto {
    public static void main(String[] args) {
        double[] lottozahlen = new double[6];
        double zusatzzahl = Math.round(Math.random() * 48 + 0.5);
        for (int i = 0; i < lottozahlen.length; i++) {
            lottozahlen[i] = Math.round(Math.random() * 48 + 0.5);
        }
        for (int i = 0; i < lottozahlen.length ; i++) {
            for (int j = 0; j < lottozahlen.length; j++) {

                if (lottozahlen[j] == lottozahlen[i]) {
                    lottozahlen[j] = Math.round(Math.random() * 48 + 0.5);
                }
            }
        }


        for (int i = 0; i < lottozahlen.length; i++) {
            System.out.print(lottozahlen[i] + "\t");
        }
        System.out.println();
        System.out.println(zusatzzahl);
    }
}
