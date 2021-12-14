import java.io.IOException;

public class Maexchen {
    public static void main(String[] args) throws IOException {
        System.out.println("Dieses programm gibt dir 2 random gernerierte würfelzahlen");
        System.out.println("jede wurfzahl hat bestimtte punkte und die werden nach jedem spiel zusammen gerechnet");
        double punkte = 0;
        boolean wiederholen;
        do {
            double wurf1 = Math.round(Math.random() * 6);
            double wurf2 = Math.round(Math.random() * 6);
            System.out.println("wurf 1 ist = " + wurf1);
            System.out.println("wurf 2 ist = " + wurf2);
            wiederholen = false;
            if (wurf1 == 1 && wurf2 == 2 || wurf1 == 2 && wurf2 == 1) {
                System.out.println("Mäxchen");
                punkte = punkte + 1000;
            } else if (wurf1 == wurf2) {
                System.out.println("Pasch");
                punkte = punkte + (100 * wurf1);
            } else {
                System.out.println("Normaler wurf");
                punkte = punkte + (10 * Math.max(wurf1, wurf2) + Math.min(wurf1,wurf2));
            }
            System.out.println("Du hast" + punkte + "punkte ereicht");
            System.out.println("Willst du das Spiel wiederholen");
            System.out.println("Wenn ja das geben sie ja ein");
            String eingabe = IO.readString();
            if (eingabe.equals("ja")) {
                wiederholen = true;
            }
        } while (wiederholen);
    }
}
