import java.io.IOException;

public class KonverterDezimal2Dual {
    public static void main(String[] args) throws IOException {

        System.out.println("Gib die Dezimalzahl ein");
        int eingabe = IO.readInteger();
        int[] binaer = new int[100];
        String[] binaerzahl = new String[100];


        for (int i = 0; i < binaer.length; i++) {
            binaer[i] = (int) Math.pow(2, i);
        }
        for (int j = 0; eingabe > 0; j++){
        for (int i = 0; i < binaer.length; i++) {

            if (eingabe >= binaer[99 - i]) {
                eingabe -= binaer[99 - i];
                binaerzahl[i] = "1";
            } else {
                binaerzahl[i] = "0";
            }
        }

        }
        for (int i = 0; i < binaerzahl.length; i++) {
            if (binaerzahl[i] == "0"){
                binaerzahl[i] = "";
            }else {
                i = binaerzahl.length;
            }
        }
        System.out.print("Binärzahl = ");
        for (int i = 0; i < binaerzahl.length; i++) {
            System.out.print(binaerzahl[i]);
        }

    }
}
