
import java.io.IOException;

public class Bestellung {
    public static void main(String[] args) throws IOException {
        int preismuttern = 3;
        int preisschrauebn = 5;
        int preisunterlegscheiben = 1;
        do {
            System.out.println("Wie viele schrauben wollen sie bestellen");
            int schrauben = IO.readInteger();
            System.out.println("Wie viele muttern wollen sie bestellen");
            int muttern = IO.readInteger();
            if (schrauben == muttern) {
                System.out.println("möchten sie noch unterlegscheiben bestellen?");

                if (IO.readBoolean() == true) {
                    System.out.println("Wie viele unterlegscheiben möchten sie bestellen ?");
                    int untrtlegscheiben = IO.readInteger();
                    double rechnung = (muttern * preismuttern) + (schrauben * preisschrauebn) + (untrtlegscheiben * preisunterlegscheiben);
                    rechnung = rechnung / 100;
                    System.out.println("Für die ausgewählten sachen müssen " + rechnung + "€ zahlen");
                }


            }
            if (schrauben == muttern && (IO.readBoolean() == true)){
                double rechnung;
                rechnung = (muttern * preismuttern) + (schrauben * preisschrauebn);
                rechnung = rechnung / 100;

                System.out.println("Für die ausgewählten sachen müssen " + rechnung + "€ zahlen");
            }


            if (muttern != schrauben) {
                System.out.println("Es müssen gleich viele muttern wie schrauben bestellt werden");
                System.out.println("Möchten sie das programm wiederholen?");
            }

        } while (IO.readBoolean());


    }
}