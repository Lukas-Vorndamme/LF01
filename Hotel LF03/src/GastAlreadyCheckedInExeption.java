public class GastAlreadyCheckedInExeption  extends Exception{
    private Gast gast;

    public GastAlreadyCheckedInExeption(Gast gast){
        this.gast = gast;
    }

    @Override
    public String getMessage() {
        return gast.getVorname() + " " + gast.getNachname() + "ist Bereits eingechecked";
    }
}
