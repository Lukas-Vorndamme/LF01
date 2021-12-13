import java.io.IOException;

public class Lieferungen {
    public static void main(String[] args) throws IOException {
        System.out.print("Wie viele artikel haben sie? ");
        int artikel = IO.readInteger();
        System.out.print("wie viel kunden haben sie? ");
        int kundenmenge = IO.readInteger();
        System.out.print("In welchen monat sind sie : ");
        String monat = IO.readString();
        String[] artiekl = new String[artikel];
        for (int i = 0; i < artiekl.length; i++) {
            artiekl[i] = "Artikel";
        }
        String[] kunden = new String[kundenmenge+1];
        for (int i = 1; i < kunden.length; i++) {
            kunden[0] = monat;
            kunden[i] = "Kunde ";
        }
        int[][] anzahl = new int[artikel][kundenmenge];
        for (int i = 0; i < anzahl.length; i++) {

            for (int j = 0; j < anzahl[i].length; j++) {
                System.out.print("Wie viele artikel hat Kunde  " + i +  " von artikel " + j + " Erhalten?");

                anzahl[i][j] = IO.readInteger();
            }
        }

        for (int u = 0; u <= 3; u++){
            System.out.println();
        }
        System.out.print(kunden[0]);
        for (int i = 1; i < anzahl.length +1; i++) {
                System.out.print("\t\t\t" +kunden[i] + i);
        }
        for (int i = 0; i < anzahl.length ; i++) {
            System.out.println();
            System.out.print(artiekl[i] +(i+1)+ "\t");
            for (int j = 0; j < anzahl[i].length; j++) {
                System.out.print("\t\t\t" +anzahl[i][j]  );


            }
        }
        System.out.println();
        System.out.println("Möchten sie noch einen monat angeben ?");
        System.out.println("ja für Ja");
        String einabe = IO.readString();



        if (einabe.equalsIgnoreCase("ja")){
            System.out.print("In welchen monat sind sie : ");
            String monat2 = IO.readString();
            String[] artiekl2 = new String[artikel];
            for (int i = 0; i < artiekl.length; i++) {
                artiekl2[i] = "Artikel";
            }
            String[] kunden2 = new String[kundenmenge+1];
            for (int i = 1; i < kunden2.length; i++) {
                kunden2[0] = monat2;
                kunden2[i] = "Kunde ";
            }
            int[][] anzahl2 = new int[artikel][kundenmenge];
            for (int i = 0; i < anzahl2.length; i++) {

                for (int j = 0; j < anzahl2[i].length; j++) {
                    System.out.print("Wie viele artikel hat Kunde  " + i +  " von artikel " + j + " Erhalten?");

                    anzahl2[i][j] = IO.readInteger();
                }
            }

            for (int u = 0; u <= 3; u++){
                System.out.println();
            }
            System.out.print(kunden2[0]);
            for (int i = 1; i < anzahl2.length +1; i++) {
                System.out.print("\t\t\t" +kunden2[i] + i);
            }
            for (int i = 0; i < anzahl2.length ; i++) {
                System.out.println();
                System.out.print(artiekl2[i] +(i+1)+ "\t");
                for (int j = 0; j < anzahl2[i].length; j++) {
                    System.out.print("\t\t\t" +anzahl2[i][j]  );


                }
            }

            System.out.println();
            System.out.println("Möchten sie die summe der angegebene monate haben?");
            String einabe2 = IO.readString();
            if(einabe2.equalsIgnoreCase("ja")){
                int[][] summe = new int[artikel][kundenmenge];
                for (int i = 0; i < anzahl.length; i++){
                    for (int j = 0; j < anzahl[i].length;j++ ){
                        summe[i][j] = anzahl[i][j] + anzahl2[i][j];

                    }
                }
                for (int i = 0; i < anzahl.length; i++){
                    for (int j = 0; j < anzahl[i].length; j++){
                    }
                    }
                int[] zeilensumme = new int[anzahl.length];
                int[] spaltensumme = new int[anzahl.length] ;
                for (int i = 0; i < anzahl.length; i++){
                    for (int j = 0; j < anzahl[i].length; j++){
                    zeilensumme[j] = zeilensumme[j] + summe[i][j];
                    spaltensumme[j] = spaltensumme[j] + summe[j][i];


                }}

                kunden[0] = "Summe";
                System.out.print(kunden[0]);
                for (int i = 1; i < anzahl.length +1; i++) {
                    System.out.print("\t\t\t" +kunden[i] + i);
                }
                for (int i = 0; i < anzahl.length ; i++) {
                    System.out.println();
                    System.out.print(artiekl[i] +(i+1)+ "\t");
                    for (int j = 0; j < anzahl[i].length; j++) {
                        System.out.print("\t\t\t" +summe[i][j]  );

                    } System.out.print( "\t\t" + spaltensumme[i]);
                }
                System.out.println();
                System.out.print("\t\t\t");
                for (int i = 0; i < anzahl.length; i++){
                    System.out.print("\t \t\t"+zeilensumme[i]);
                }







            }

        }

        }



}
