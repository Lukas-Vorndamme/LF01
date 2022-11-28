package dao;

public class Aktie extends Gegenstand {

    private String unternehmen;
    private double nennwert;

        public Aktie(int id,double wert,String unternehmen, double nennwert){
        super(id,wert);
        this.unternehmen = unternehmen;
        this.nennwert = nennwert;
    }

    public void setUnternehmen(String unternehmen) {
        this.unternehmen = unternehmen;
    }

    public String getUnternehmen() {
        return unternehmen;
    }

    public void setWert(double nennwert) {
        this.nennwert = nennwert;
    }

    public double getWert() {
        return nennwert;
    }

    @Override
    public String toString() {
        return "dao.Aktie{" +
                "unternehmen='" + unternehmen + '\'' +
                ", wert=" + nennwert +
                '}';
    }
}

