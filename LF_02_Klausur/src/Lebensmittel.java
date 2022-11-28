public class Lebensmittel {

    private int id;
    private String name;
    private int gewicht;
    private double preis;
    private String nuesse;
    private String milch;

    public Lebensmittel(String name,double preis, String nuesse,String milch) {

        this.name = name;
        this.preis = preis;
        this.nuesse = nuesse;
        this.milch = milch;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getNuesse() {
        return nuesse;
    }

    public void setNuesse(String nuesse) {
        this.nuesse = nuesse;
    }

    public String getMilch() {
        return milch;
    }

    public void setMilch(String milch) {
        this.milch = milch;
    }

    @Override
    public String toString() {
        return "Lebensmittel" +
                "\n name = " + name +
                "\n gewicht = " + gewicht +
                "\n preis = " + preis +
                "\n nuesse = " + nuesse +
                "\n milch = " + milch ;
    }
}

