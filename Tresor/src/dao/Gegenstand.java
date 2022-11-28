package dao;

public abstract class Gegenstand {

    private int id;
    private double wert;

        public Gegenstand(int id, double wert){
        this.id = id;
        this.wert = wert;

    }



    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public double getWert() {
        return wert;
    }

    @Override
    public String toString() {
        return "dao.Gegenstand{" +
                "id=" + id +
                ", wert=" + wert +
                '}';
    }
}
