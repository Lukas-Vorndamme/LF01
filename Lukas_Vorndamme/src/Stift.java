public class Stift extends Gegenstand{
    private String farbe;

    public Stift(String nr,String farbe) {
        super(nr);
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }

    @Override
    public String toString() {
        return
                "Stift: \n" +
                "\tFarbe:'" + farbe+
                super.toString();
    }
}
