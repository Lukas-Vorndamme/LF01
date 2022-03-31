import java.io.IOException;

public class Binaeraddition {
    public static void main(String[] args) throws IOException {
        System.out.println("Gib die Binaerzahlen von links aus ein");
        int[] binaerzahl = IO.readArrayInteger();
        int[] binaerzahl2 = IO.readArrayInteger();
        int[] binaerzahlr = new int[binaerzahl.length+1];
        int[] binaerzahl2r = new int[binaerzahl2.length+1];
        for (int i = 0; i < binaerzahl.length; i++){
            binaerzahlr[i] = binaerzahl[(binaerzahl.length-1)-i];
        }
        for (int i = 0; i < binaerzahl2.length; i++){
            binaerzahl2r[i] = binaerzahl2[(binaerzahl2.length-1)-i];
        }
        int dezimalzahl = 0;
        int[] binaer = new int[binaerzahl.length];
        for (int i = 0; i < binaer.length; i++) {
            binaer[i] = (int) Math.pow(2, i);
        }
        for (int i = 0; i < binaerzahl.length; i++){
            if (binaerzahlr[i] == 1){
                dezimalzahl = dezimalzahl + binaer[i];
            }
        }
        for (int i = 0; i < binaerzahl2r.length; i++){
            if (binaerzahl2r[i] == 1){
                dezimalzahl = dezimalzahl + binaer[i];
            }
        }
        int eingabe = dezimalzahl;

        String[] binaerzahlende = new String[100];

        for (int j = 0; eingabe > 0; j++) {
            for (int i = 0; i < binaer.length; i++) {

                if (eingabe >= binaer[(binaer.length-1) -i]) {
                    eingabe -= binaer[(binaer.length-1) - i];
                    binaerzahlende[i] = "1";
                } else {
                    binaerzahlende[i] = "0";
                }
            }
        }
        for (int i = 0; i < binaerzahlende.length; i++) {
            if (binaerzahlende[i] == "0") {
                binaerzahlende[i] = "";
            } else {
                i = binaerzahlende.length;
            }
        }
        System.out.print("Binärzahl = ");
        for (int i = 0; i < binaerzahlende.length; i++) {
            if (binaerzahlende[i] == null){
                i = binaerzahlende.length;
            }
            else {
                System.out.print(binaerzahlende[i]);
            }
        }
    }
}
