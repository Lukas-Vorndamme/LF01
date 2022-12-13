import dao.Aktie;
import dao.GegenstandNichtGefundenException;
import dao.Schmuck;
import dao.Tresor;

public class Programm {
    public static void main(String[] args) {

        Tresor tresor = new Tresor();
        Aktie aktie = new Aktie(12, 100.00, "Deine Mutter", 150.00);
        Aktie aktie1 = new Aktie(13, 10.00, "Dein Vater", 15.00);

        Schmuck schmuck = new Schmuck(51, 250.00, "Diamant Ring");

        tresor.addGegenstand(aktie);
        tresor.addGegenstand(aktie1);
        tresor.addGegenstand(schmuck);

    }
}
