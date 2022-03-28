public class Dvd extends Ware{
    private int spieldauer;

    public Dvd (String warenNr, String bezeichnung, double mwst, double preis, int spieldauer){
        super(warenNr,bezeichnung,mwst,preis);
        this.spieldauer = spieldauer;
    }

    public int getSpieldauer() {
        return spieldauer;
    }

    public void setSpieldauer(int spieldauer) {
        this.spieldauer = spieldauer;
    }

    @Override
    public String toString() {
        return "Dvd\n" +
                "spieldauer=" + spieldauer +"Minuten";
    }
}
