public class Kopfhoehrer extends Gegenstand{
    private String hersteller;
    private String modell;

    public Kopfhoehrer(String nr,String hersteller,String modell) {
        super(nr);
        this.hersteller = hersteller;
        this.modell = modell;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModell() {
        return modell;
    }

    @Override
    public String toString() {
        return "Kopfhoehrer:\n" +
                "\tHersteller:" + hersteller +
                "\tModell:" + modell
                + super.toString();
    }
}
