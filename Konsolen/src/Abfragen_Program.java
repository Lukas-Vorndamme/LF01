import Objects.Konsolen;
import dao.Konsolendao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Abfragen_Program {
    private static String ausgabe() throws IOException {
            System.out.println("Was möchten sie im Verzeichnis Games Tun?");
            System.out.println("1 für Das anzeigen der Liste");
            System.out.println("2 für das löschen eines Eintrags");
            System.out.println("3 für das Hinzufügen einer Konsole");
            System.out.println("4 für das Aktualisieren eines Eintrags");
            System.out.println("5 für beenden");
            String eingabe = IO.readString();
            return eingabe;
        }

        public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

            Konsolendao konsolendao = new Konsolendao();
            ArrayList<Konsolen> konsolendaoArrayList = new ArrayList<>();
            String line = "========================================================";
            konsolendaoArrayList = null;

            String eingabe = ausgabe();
            while (true) {
                if (eingabe.equalsIgnoreCase("1")) {
                    System.out.println("Hier ist die ganze Liste");
                    konsolendaoArrayList = konsolendao.read();
                    System.out.println(konsolendaoArrayList);
                    System.out.println(line);

                } else {
                    if (eingabe.equalsIgnoreCase( "2")) {
                        System.out.println("Welchen eintag möchten sie löschen?");
                        System.out.println(konsolendao.read(""));
                        System.out.println(line);
                        konsolendao.delete(IO.readString());
                        System.out.println("Eintrag gelöscht");
                        System.out.println(line);

                    } else {
                        if (eingabe.equalsIgnoreCase( "3")) {
                            String produktionsnummer;
                            String name = "";
                            String marke;
                            String spiele;
                            String zubehör;
                            double preis;
                            System.out.println("Welche Nummer hat die Konsole?");
                            produktionsnummer = IO.readString();
                            System.out.println("Wie heißt die Konsole?");
                            name = IO.readString();
                            System.out.println("Welche Spiele hat die Konsole?");
                            marke = IO.readString();
                            System.out.println("Welches Zubehör hat die Konsole");
                            zubehör = IO.readString();
                            System.out.println("Wieviel € kostet die Konsole?");
                            preis = IO.readDouble();
                            Konsolen konsolen = new Konsolen(name,preis);
                            konsolendao.insert(konsolen);
                            System.out.println(line);

                        } else {
                            if (eingabe.equalsIgnoreCase( "4")) {
                                String produktionsnummer;
                                String name = "";
                                String marke;
                                String spiele;
                                String zubehör;
                                double preis;
                                System.out.println("Welchen Eintrag möchten sie Aktualisieren?");
                                produktionsnummer = IO.readString();
                                System.out.println(konsolendao.read(produktionsnummer));
                                System.out.println("Welche Marke hat die Konsole?");
                                marke = IO.readString();
                                System.out.println("Welche Spiele Gibt es?");
                               spiele = IO.readString();
                                System.out.println("Welches Zubehör Hat die konsole?");
                               zubehör = IO.readString();
                                System.out.println("Wieviel € kostet die neue Konsole?");
                                preis = IO.readDouble();
                                Konsolen konsolen = new Konsolen(name,preis);
                                konsolendao.update(produktionsnummer,konsolen);
                                System.out.println(line);

                            } else {
                                if (eingabe.equalsIgnoreCase( "5")) {
                                    System.out.println("Wird beendet");
                                    break;
                                }
                            }
                        }
                    }
                }
                System.out.println(line);
                System.out.println("Treffen sie eine andere eingabe");
                eingabe = ausgabe();
                System.out.println(line);
            }
        }
    }


