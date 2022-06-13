package Objects;



public class Konsolen {
    private String produktionsnummer;
    private String name;
    private String marke;
    private String spiele;
    private String zubehör;
    private double preis;

    public Konsolen(String name,double preis){
     this.name = name;
        this.preis = preis;

    }

    public String getProduktionsnummer() {
        return produktionsnummer;
    }

    public void setProduktionsnummer(String produktionsnummer) {
        this.produktionsnummer = produktionsnummer;
    }

    public String getZubehör() {
        return zubehör;
    }

    public double getPreis() {
        return preis;
    }

    public String getMarke() {
        return marke;
    }

    public String getName() {
        return name;
    }

    public String getSpiele() {
        return spiele;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void setSpiele(String spiele) {
        this.spiele = spiele;
    }

    public void setZubehör(String zubehör) {
        this.zubehör = zubehör;
    }

    @Override
    public String toString() {
        return "Konsolen{" +
                "produktionsnummer='" + produktionsnummer + '\'' +
                ", name='" + name + '\'' +
                ", marke='" + marke + '\'' +
                ", spiele='" + spiele + '\'' +
                ", zubehör='" + zubehör + '\'' +
                ", preis=" + preis +
                '}';
    }
}
