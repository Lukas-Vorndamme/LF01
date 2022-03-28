import java.util.ArrayList;

public class Warenkorb {
    private Kunde kunde;
    private ArrayList<Ware> warenListe = new ArrayList<Ware>();
    private Ware ware;


    public Warenkorb(Kunde kunde) {
        this.kunde = kunde;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void addware(Ware ware) {
        warenListe.add(ware);
    }

    public void removeware(Ware ware, String warenNr) throws WareNichtGefundenExeption {
        WareNichtGefundenExeption e = new WareNichtGefundenExeption(ware.getWarenNr());
        if (ware.getWarenNr() == e.getWarenNr()) {
            warenListe.remove(ware);
        } else throw e;
    }

    public Ware getWare(String warenNr) {
        for (Ware w : warenListe) {
            if (warenNr == w.getWarenNr()) {
                System.out.println("Die gesuchte ware ist im warenkorb");
                return w;
            }else System.out.println("Die ware ist nicht im warenkorb");
        }
        return null;
    }

    public int getAnzahlwaren() {
        int anzahl = 0;
        for (int i = 0; i < warenListe.size(); i++) {
            anzahl += 1;
        }
        return anzahl;
    }

    public double getPreisGesamt(Ware ware) {
        double preis = 0;
        preis += ware.getPreis();
        return preis;
    }

    @Override
    public String toString() {
        return "Warenkorb\n" +
                "Kunde = " + kunde +
                "WarenListe = " + warenListe +
                "Ware = " + ware;
    }
}
