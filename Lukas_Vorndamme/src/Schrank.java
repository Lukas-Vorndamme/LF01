import java.util.ArrayList;

public class Schrank extends Stauraum {

    private boolean hatTueren;
    private ArrayList<Box> boxListe;

    public Schrank(boolean hatTueren){
        this.hatTueren = hatTueren;
    }
    public Schrank(boolean hatTueren,double breite,double hoehe,double tiefe){
        super(breite,hoehe,tiefe);
        this.hatTueren = hatTueren;
    }


    public boolean isHatTueren() {
        return hatTueren;
    }

    public void setHatTueren(boolean hatTueren) {
        this.hatTueren = hatTueren;
    }

    public ArrayList<Box> getBoxListe() {
        return boxListe;
    }
    public int getAnzahlBoxen(){
        return boxListe.size();
    }
    public void hinzufuegenBox(Box box){
        boxListe.add(box);
    }
    public int getAnzahlGegenstaendeGesamt(){
        return (5);
        }


    @Override
    public String toString() {
        return "Schrank: \n" +
                "\tTüren:" + hatTueren +
                "\tBreite:" + getBreite()  +
                ", Höhe: "+ getHoehe()  +
                ", Tiefe:" + getTiefe() +
                "\n\tAnzahl Gegenstände:" + getAnzahlGegenstaende() +"\n"+
                "\n\tAnzahl Boxen:" + getAnzahlBoxen() + "\n"+
                "\n\tAnzahl Gegenstände gesamt:" + getAnzahlGegenstaendeGesamt() + "\n";

    }
}
