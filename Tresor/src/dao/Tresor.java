package dao;

import java.util.ArrayList;
import java.util.Objects;

public class Tresor {

    double summe = 0;
    private ArrayList<Gegenstand> gegenstaende = new ArrayList<>();


    public void addGegenstand(Gegenstand gegenstand) {
        gegenstaende.add(gegenstand);
    }


    public void getGegenstand(int id, String Bezeichnung) throws GegenstandNichtGefundenException {
        GegenstandNichtGefundenException e = new GegenstandNichtGefundenException(id);
        for (Gegenstand g : gegenstaende) {
            if (Objects.equals(g.getId(), id)) {
                System.out.println("Der Gegenstand mit der Gescuhten ID ist im Tresor vorhanden");
                System.out.println("Die Gesuchte ID gehört zum gegenstand " + Bezeichnung);
            } else {
                System.out.println(e.getMessage());
            }
        }
    }

    public void removeGegenstand(Gegenstand gegenstand) throws GegenstandNichtGefundenException {
        gegenstaende.remove(gegenstand);
    }

    public double berechnenGesamtwert() {
        for (int i = 0; i < gegenstaende.size(); i++)
            summe += gegenstaende.get(i).getWert();
        return summe;
    }
    @Override
    public String toString() {
        return super.toString() + "Tresor" +
                "\nSumme = " + berechnenGesamtwert() +
                "\nGegenstaende = " + gegenstaende +
                "\nGegenstand = " + gegenstaende;

    }
}