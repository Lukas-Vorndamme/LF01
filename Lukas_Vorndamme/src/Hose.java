public class Hose extends Gegenstand{
    private int bundweite;
    private int laenge;


    public Hose(String nr,int bundweite, int laenge) {
        super(nr);
        this.bundweite = bundweite;
       this.laenge = laenge;
    }

    public int getBundweite() {
        return bundweite;
    }

    public int getLaenge() {
        return laenge;
    }

    @Override
    public String toString() {
        return "Hose{" +
                "bundweite=" + bundweite +
                ", laenge=" + laenge +
                '}';
    }
}
