import java.util.ArrayList;

public class Zimmer{
    private int nr;
    private ArrayList<Gast> gastList;

    public Zimmer(int nr){
        this.nr = nr;
    }

    public ArrayList<Gast> getGastList() {
        return gastList;
    }
    public int getAnzahlGaeste(){
        int g = gastList.size();
        return g;
    }

    public void checkIn(Gast gast) throws GastAlreadyCheckedInExeption{
        gastList.add(gast);
    }
    public void checkout(Gast gast) throws GastNotCheckedInExeption{
        gastList.remove(gast);
    }
}
