import java.util.ArrayList;

public class Etage {
    private String name;
    private ArrayList<Zimmer> zimmerListe;

    public Etage(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Zimmer> getZimmerListe() {
        return zimmerListe;
    }

    public int getAnzahlZimmer(){
        int z = zimmerListe.size();
        return z;
    }
    public int getAnzahlZimmerFrei(){
        int anzahlZimmerFrei = 0;
        for (Zimmer z : zimmerListe){
            if (z.getAnzahlGaeste() == 0){
                anzahlZimmerFrei ++;
            }
        }
        return anzahlZimmerFrei;
    }
    public int getAnzahlGaeste(){
        int gaeste = 0;
        for(Zimmer z : getZimmerListe()){
            gaeste += z.getAnzahlGaeste();
        }
        return gaeste;
    }

    @Override
    public String toString() {
        return "Etage{" +
                "name='" + name + '\'' +
                ", zimmerListe=" + zimmerListe +
                '}';
    }
}
