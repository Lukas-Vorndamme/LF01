public class GegenstandVorhandenExeption extends Exception{


    public String getMessage(){
       return "Der hinzuzufügende Gegenstand ist bereits Vorhanden";
    }
}
