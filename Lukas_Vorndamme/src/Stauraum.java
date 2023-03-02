import java.util.ArrayList;

public abstract class  Stauraum {
    private double breite;
    private double hoehe;
    private double tiefe;

    private ArrayList<Gegenstand> gegenstandListe;

    public Stauraum() {

    }

    public Stauraum(double breite, double hoehe, double tiefe){
        this.breite = breite;
        this.hoehe = hoehe;
        this.tiefe = tiefe;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public double getTiefe() {
        return tiefe;
    }

    public void setTiefe(double tiefe) {
        this.tiefe = tiefe;
    }
    public ArrayList<Gegenstand> getGegenstandListe() {
        return gegenstandListe;
    }

   public int getAnzahlGegenstaende(){
        return gegenstandListe.size();
    }
    public void hinzufuegenGegenstaende(Gegenstand gegenstand){
        gegenstandListe.add(gegenstand);
    }
    public void entfernenGegenstand(String nr){
        gegenstandListe.remove(nr);
    }

    @Override
    public String toString() {
        return "Stauraum";
    }
}
