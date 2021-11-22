import java.io.IOException;
import java.text.DecimalFormat;

public class Array {
    public static void main(String[] args) throws IOException {
        double[] tag = new double[7];

        double addition = 0;

        double max = 0;

        double min = 100000;

        double diff = -100000;

        DecimalFormat f = new DecimalFormat("#0.00");

        for (int i = 0; i < tag.length; i++) {


            System.out.print("gib die Temperatur von tag " + (i + 1) + ":");

            tag[i] = IO.readDouble();

            addition += tag[i];

            if (tag[i] > max) {

                max = tag[i];

            }
            if (tag[i] < min) {

                min = tag[i];

            }

        }

        if (tag[0] - tag[1] > tag[2] - tag[3]) {

            diff = tag[0] - tag[1];

        } else if (tag[1] - tag[2] > tag[2] - tag[3]) {

            diff = tag[1] - tag[2];

        } else if (tag[2] - tag[3] > tag[3] - tag[4]) {

            diff = tag[2] - tag[3];

        } else if (tag[3] - tag[4] > tag[4] - tag[5]) {

            diff = tag[3] - tag[4];

        } else if (tag[4] - tag[5] > tag[5] - tag[6]){

            diff = tag[4] - tag[5];

        }else if (tag[5] - tag[6] > diff){
            diff = tag[5]- tag[6];

        }else if (tag[6] - tag[5] > diff){
            diff = tag[6] - tag[5];}

        System.out.println("Der Mittelwer ist " + f.format(addition / tag.length));

        System.out.println("Maximal wert " + f.format(max));

        System.out.println("Min " + f.format(min));

        System.out.println("Spannweite von " + f.format(max - min));

        System.out.println("max differenz " + f.format(diff));
    }
}