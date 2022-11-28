public class Aktie {

    private String unternehmen;
    private double wert;

    Aktie(String unternehmen, double wert){
        this.unternehmen = unternehmen;
        this.wert = wert;
    }

    public void setUnternehmen(String unternehmen) {
        this.unternehmen = unternehmen;
    }

    public String getUnternehmen() {
        return unternehmen;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public double getWert() {
        return wert;
    }

    @Override
    public String toString() {
        return "Aktie{" +
                "unternehmen='" + unternehmen + '\'' +
                ", wert=" + wert +
                '}';
    }
}

