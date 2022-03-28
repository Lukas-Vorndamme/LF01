public class Adresse {
    private String strasse;
    private String hausNR;
    private String plz;
    private String ort;


    public Adresse (String strasse, String hausNR, String plz, String ort){
        this.strasse = strasse;
        this.hausNR = hausNR;
        this.plz = plz;
        this.ort =ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausNR() {
        return hausNR;
    }

    public void setHausNR(String hausNR) {
        this.hausNR = hausNR;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "strasse='" + strasse + '\'' +
                ", hausNR='" + hausNR + '\'' +
                ", plz='" + plz + '\'' +
                ", ort='" + ort + '\'' +
                '}';
    }
}
