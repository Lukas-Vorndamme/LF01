public abstract class Ware {
    private String warenNr;
    private String bezeichnug;
    private double preis;
    private double mwst;

    public Ware(String warenNR, String bezeichnung, double mwst, double preis) {
        this.bezeichnug = bezeichnug;
        this.warenNr = warenNr;
        this.mwst = mwst;
        this.preis = preis;

    }


    public String getWarenNr() {
        return warenNr;
    }

    public String getBezeichnug() {
        return bezeichnug;
    }

    public void setBezeichnug(String bezeichnug) {
        this.bezeichnug = bezeichnug;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getMwst() {
        return mwst;
    }

    public void setMwst(double mwst) {
        this.mwst = mwst;
    }

    @Override
    public String toString() {
        return "Ware{" +
                "warenNr='" + warenNr + '\'' +
                ", bezeichnug='" + bezeichnug + '\'' +
                ", preis=" + preis +
                ", mwst=" + mwst +"%";

    }
}
