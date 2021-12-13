import java.io.IOException;

public class LieferungMethodenNoah {
    public static void main(String[] args) throws IOException {

        int[][] matrize = erstellenMatrize();

        int[][] matrize2 = erstellenMatrize();

        zusammenRechnen(matrize, matrize2);

    }







    private static int[][] erstellenMatrize() throws IOException {

        System.out.println("Wie viele Kunden?");

        int kunden = IO.readInteger();

        System.out.println("Wie viele Artikel?");

        int artikel = IO.readInteger();

        System.out.println("Welcher Monat?");

        String monat = IO.readString();





        int[][] array = new int[artikel][kunden];

        for (int i = 0; i < array.length; i++){

            for (int j = 0; j < array[i].length; j++){

                array[i][j] = IO.readInteger();



            }

        }



        System.out.print(monat+ "\t" );

        for (int i = 0; i < kunden; i++) {

            System.out.print(" Kunde"+(i + 1) +"\t");

        }

        System.out.println();

        for (int i = 0; i < array.length; i++){

            System.out.print("Artikel"+(i+1)+ "\t");

            for (int j = 0; j < array[i].length; j++){

                System.out.print(array[i][j]+"\t\t");

            }

            System.out.println();

        }



        return array;

    }

    private static int[][] zusammenRechnen(int[][] array, int[][] array2){

        String monat = "Summe";

        int kunden = 0;
        int spalten = 0;

        for (int i = 0; i < array.length; i++){
spalten = i+1;
            for (int j = 0; j < array[i].length; j++){

                kunden = j + 1;

                array[i][j] += array2[i][j];

            }

        }

        System.out.print(monat+ "\t" );

        for (int i = 0; i < kunden; i++) {

            System.out.print(" Kunde"+(i + 1) +"\t");

        }

        System.out.println();

        for (int i = 0; i < array.length; i++){

            System.out.print("Artikel"+(i+1)+ "\t");

            for (int j = 0; j < array[i].length; j++){

                System.out.print(array[i][j]+"\t\t");

            }

            System.out.println();

        }





        System.out.println();

        int wert[] = new int[kunden];
        int wert2[] = new int[spalten];



        for (int i = 0; i < array.length; i++){

            for (int j = 0; j  < array[i].length; j++){

                wert[j] = wert[j] + array[i][j];
                wert2[j] = wert2[j] + array[j][i];


            }


        }



        System.out.print(monat+ "\t" );

        for (int i = 0; i < kunden; i++) {

            System.out.print("Zeilensumme"+(i + 1) +"\t");

        }

        System.out.println();

        for (int i = 0; i < wert.length; i++){

            System.out.print("Artikel"+(i+1)+ "\t");



                System.out.print(wert[i]+"\t\t");
            System.out.println(wert2[i] + "\t\t");

            }

            System.out.println();





        return array;

    }

}

