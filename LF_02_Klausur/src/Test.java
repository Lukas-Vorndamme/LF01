import java.sql.SQLException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);

        Lebensmittel_DAO lebensmittel_dao = new Lebensmittel_DAO();
        Lebensmittel lebensmittel = null;
        String linie = "============================================================================================================================";


        System.out.println("Was möchten sie machen");
        System.out.println("\n1 Für Read" +
                "\n2 Für Read Arraylist" +
                "\n3 Für ReadAllergyFree Arraylist" +
                "\n4 Für Update " +
                "\n5 Für Delete\n"+ linie);


        String eingabe = scanner.nextLine();


        if (eingabe.equalsIgnoreCase("1")){
            System.out.println("Sie haben 1 Für Die Methode Read ausgewählt welche Waren id Hätten sie denn gerne ausgelesen");
            int id = scanner.nextInt();
            lebensmittel = lebensmittel_dao.read(id);
        }
        if (eingabe.equalsIgnoreCase("2")){
            System.out.println("Sie haben 2 für read arrraylist ausgewählt alle unsere waren werden nun aufgelistet");
            System.out.println(lebensmittel_dao.read());
        }
        if (eingabe.equalsIgnoreCase("3")){
            System.out.println("Sie haben 3 für ReadAllergyFree Arraylist ausgewählt ihnen werden jetzt alle produkte ohne milch und nüsse angezeigt");
            System.out.println(lebensmittel_dao.readAllergyFree());
        }
        if (eingabe.equalsIgnoreCase("4")){
            System.out.println("Sie haben 4 für update genommen welche waren id nummer möchten sie updaten");
            String id = scanner.nextLine();
            System.out.println("und welche infos möchten sie hinzufügen");
            Lebensmittel lebensmittel1 = new Lebensmittel(scanner.nextLine(),scanner.nextDouble(),scanner.nextLine(),scanner.nextLine());
            System.out.println("Möchten sie auch en gewicht hinzufügen \n ja oder nein");
            String boole = scanner.nextLine();
            if (boole.equalsIgnoreCase("ja")){
                System.out.println("welches gewicht hat das produkt");
              int gewicht = scanner.nextInt();
              lebensmittel.setGewicht(gewicht);
            }
        }
        if (eingabe.equalsIgnoreCase("5")){
            System.out.println("Sie haben 5 für delete gewählt welche waren id nummer möchten sie löschen?");
            int id = scanner.nextInt();
            lebensmittel_dao.delete(id);
        }
    }
}
