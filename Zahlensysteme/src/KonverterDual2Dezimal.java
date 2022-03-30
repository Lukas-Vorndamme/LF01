import java.io.IOException;
import java.util.Objects;

public class KonverterDual2Dezimal {
    public static void main(String[] args) throws IOException {


        boolean w = true;
        boolean k = true;
        do {
            k = true;
             w = true;
            int[] binaerzahl = IO.readArrayInteger();

        for (int i = 0; i < binaerzahl.length; i++){
            if(binaerzahl[i] > 1){
                k = false; w = false;
                System.out.println("Bei dieser zahl handelt es sich nicht um eine binärzahl also gibt eine binär zahl mit denn zahlen 1 oder 0 ein.");
                i = binaerzahl.length;
            }
        }
            if (w == false){
            System.out.println("Möchten sie das programm nochmal starten?");
                String eingabe = IO.readString();
                if (eingabe.equalsIgnoreCase("ja")){
                    w = true;
                }
        }
       while (k){
            int[] binaer = new int[binaerzahl.length];
            int dezimalzahl = 0;

            for (int i = 0; i < binaer.length; i++) {
                binaer[i] = (int) Math.pow(2, i);
            }
            for (int i = 0; i < binaerzahl.length; i++){
                if (binaerzahl[i] == 1){
                    dezimalzahl += binaer[(binaer.length-1)-i];
                }
            }
            System.out.println(dezimalzahl);
            k = false;
            w = false;
        }



        }while (w);
}
}
