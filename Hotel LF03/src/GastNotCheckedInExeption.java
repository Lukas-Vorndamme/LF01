public class GastNotCheckedInExeption extends Throwable{
    private Gast gast;
    public GastNotCheckedInExeption(Gast gast){
        this.gast = gast;
    }

    @Override
    public String getMessage() {
        return gast.getVorname() +" " + gast.getNachname() + "Ist nich eingechecked";
    }
}

