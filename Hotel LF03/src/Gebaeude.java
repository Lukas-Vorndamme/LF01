import java.util.ArrayList;

public class Gebaeude {
    private String name;
    private Adresse adresse;
    private ArrayList<Etage> etagenListe;

    public Gebaeude(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Etage> getEtagenListe() {
        return etagenListe;
    }

    public int getAnzahlEtagen(){
        return etagenListe.size();
    }
    public int getAnzahlZimmer(){
        int anzahlZimmer = 0;
        for(Etage e : etagenListe){
            anzahlZimmer += e.getAnzahlZimmer();
        }
        return anzahlZimmer;
    }
   public int getAzahlZimmerFrei(){
       int anzahlZimerFrei = 0;
       for (Etage e : etagenListe){
           if (e.getAnzahlGaeste() == 0){
               anzahlZimerFrei++;
           }
       }
       return anzahlZimerFrei;
   }

    public int getAnzahlGaeste(){
        int gaeste = 0;
        for(Etage e : etagenListe){
            gaeste += e.getAnzahlGaeste();
        }
        return gaeste;
    }

    @Override
    public String toString() {
        return "Gebaeude{" +
                "name='" + name + '\'' +
                ", adresse=" + adresse +
                ", etagenListe=" + etagenListe +
                '}';
    }
}
