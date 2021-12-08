import java.io.IOException;

public class Kino {
    public static void main(String[] args) throws IOException {
        String[][] saal = erzeugensaal();
        boolean w;
        do {
            System.out.println("Was möchten sie machen, Saal anzeigen(1) Plätze reservieren(2) oder plätze bstornieren(3)");
            int auswahl = IO.readInteger();
            if (auswahl == 1) {
                anzeigenSaal(saal);
                System.out.println();
            }
            if (auswahl == 2){
                reserviertenPlatz(saal);
                System.out.println();
            }
            if (auswahl == 3){
                stornieren(saal);
                System.out.println();
            }
            System.out.println("Möchten sie noch was machen?");
            w = IO.readBoolean();
        }while (w);



    }
    private static String[][] erzeugensaal() throws IOException {
        System.out.println("Wie viele reihgen hat der saal?");
        int reihe = IO.readInteger();
        System.out.println("Wie viele Plätze hat jede reihe?");
        int plätze = IO.readInteger();
        String[][] saal = new String[reihe][plätze];
        for (int i = 0; i < saal.length; i++) {
            for (int j = 0; j < saal[i].length; j++) {
                saal[i][j] = "O";
            }
        }
        return saal;

    }

    private static void anzeigenSaal(String[][] saal) throws IOException {
        IO.systemOutPrintStringArray2D(saal);
        System.out.println();


    }

    private static void reserviertenPlatz(String[][] saal) throws IOException {


            System.out.println("Welchen platz wollen sie reservieren ?");
            System.out.println("Welche reihe");
            int reservierteReihe = IO.readInteger();
            System.out.println("Welcher platz soll in der reihe reserviert werden?");
            int reservierenPlatz = IO.readInteger();
        if (saal[reservierteReihe][reservierenPlatz].equalsIgnoreCase("X")){
            System.out.println("Der Platz ist bereitz besetzt");
            anzeigenSaal(saal);
            System.out.println();

        } else saal[reservierteReihe ][reservierenPlatz] = "X";




    }
    private static void stornieren (String[][] saal )throws IOException{
        System.out.println("In welhcer reihe möchten sie denn platz stornieren?");
        int storniere = IO.readInteger();
        System.out.println("Welchen platz wollen sie storniueren");
        int stornirenplatz = IO.readInteger();

        saal[storniere][stornirenplatz] = "O";


    }
}