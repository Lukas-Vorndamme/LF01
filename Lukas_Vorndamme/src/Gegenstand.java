public abstract class Gegenstand {

    private String nr;

    public Gegenstand(String nr) {
        this.nr = nr;
    }

    public String getNr() {
        return nr;
    }

    @Override
    public String toString() {
        return "\tNr: " + nr;
    }
}
