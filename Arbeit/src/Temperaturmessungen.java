import java.io.IOException;
import java.text.DecimalFormat;

public class Temperaturmessungen {
    public static void main(String[] args) throws IOException {
        boolean wiederholen;
        DecimalFormat f = new DecimalFormat("#0.00");
        do {
            System.out.println("Gib die Temerautren der wochen ein");
            System.out.print("Tag 1 :");
            double tag1 = IO.readDouble();
            System.out.print("Tag 2 :");
            double tag2 = IO.readDouble();
            System.out.print("Tag 3 :");
            double tag3 = IO.readDouble();
            System.out.print("Tag 4 :");
            double tag4 = IO.readDouble();
            System.out.print("Tag 5 :");
            double tag5 = IO.readDouble();
            System.out.print("Tag 6 :");
            double tag6 = IO.readDouble();
            System.out.print("Tag 7 :");
            double tag7 = IO.readDouble();

            double mittelwert = (tag1 + tag2 + tag3 + tag4 + tag5 + tag6 + tag7) / 7;
            double max = 0;
            if (tag1 > tag2 && tag1 > tag3 && tag1 > tag4 && tag1 > tag5 && tag1 > tag6 && tag1 > tag7) {
                max = tag1;
            } else if (tag2 > tag1 && tag2 > tag3 && tag2 > tag4 && tag2 > tag5 && tag2 > tag6 && tag2 > tag7) {
                max = tag2;
            } else if (tag3 > tag2 && tag3 > tag1 && tag3 > tag4 && tag3 > tag5 && tag3 > tag6 && tag3 > tag7) {
                max = tag3;
            } else if (tag4 > tag2 && tag4 > tag3 && tag4 > tag1 && tag4 > tag5 && tag4 > tag6 && tag4 > tag7) {
                max = tag4;
            } else if (tag5 > tag2 && tag5 > tag3 && tag5 > tag4 && tag5 > tag1 && tag5 > tag6 && tag5 > tag7) {
                max = tag5;
            } else if (tag6 > tag2 && tag6 > tag3 && tag6 > tag4 && tag6 > tag5 && tag6 > tag1 && tag6 > tag7) {
                max = tag6;
            } else if (tag7 > tag2 && tag7 > tag3 && tag7 > tag4 && tag7 > tag5 && tag7 > tag6 && tag7 > tag1) {
                max = tag7;
            }

            double x = 0;
            if (tag1 < tag2) {
                x = tag2;
            } else x = tag1;
            if (tag3 < x) {
                x = tag3;
            }
            if (tag4 < x) {
                x = tag4;
            }
            if (tag5 < x) {
                x = tag5;
            }
            if (tag6 < x) {
                x = tag6;
            }
            if (tag7 < x) {
                x = tag7;
            }
            double dif = -10000000;
            // tag 1
            if (tag2 - tag1 > tag1 - tag2) {
                dif = tag2 - tag1;
            }else if(tag1 - tag2 > tag2 - tag1){
                dif = tag1 -tag2;
            } else if (tag3 - tag2 > tag2 - tag3) {
                dif = tag3 - tag2;
            }else if(tag2 - tag3 > tag3 - tag2){
                dif = tag2 -tag3;
            }



            System.out.println("Der Mittelwert der temperarautren ist " + f.format(mittelwert));
            System.out.println("Der Maximale wert der temperaturen ist " + f.format(max));
            System.out.println("Der kleineste wert ist " + f.format(x));
            System.out.println("Die spanweite ist " + f.format(max - x));
            System.out.println("Die Maximale differnz ist " + f.format(dif));

            System.out.println("Willst du das programm wiederholen");
            wiederholen = IO.readBoolean();

        } while (wiederholen);


    }

}   //else if (tag2 - tag3 > tag3 - tag2) {
      //  dif = tag2 - tag3;
        //}else if(tag3 - tag2 > tag2 - tag3) {
        //dif = tag3 - tag2;
        //} else if (tag4 - tag3 > tag5 - tag4) {
        //dif = tag4 - tag3;
       // } else if (tag5 - tag6 > tag7 - tag6) {
      //  dif = tag5 - tag6;
      //  } else if (tag6 - tag7 > dif) {
      //  dif = tag6 - tag7;
      //  }else if (tag7-tag6 > dif){
      //  dif = tag7-tag6;}
