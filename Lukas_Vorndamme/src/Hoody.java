public class Hoody extends Gegenstand{
    private String  groesse;

    public Hoody(String nr,String groesse) {
        super(nr);
        this.groesse = groesse;
    }

    public String getGroesse() {
        return groesse;
    }

    @Override
    public String toString() {

        return
                "Hoody: \n" +
                "Größe:" + groesse +
                        super.toString();
    }
}
