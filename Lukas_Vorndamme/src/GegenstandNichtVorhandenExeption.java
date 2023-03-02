public class GegenstandNichtVorhandenExeption extends Exception{
    public String getMessage(){
        return "Der zu Löschende Gegenstand ist nicht Vorhanden";
    }
}
