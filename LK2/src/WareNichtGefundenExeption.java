public class WareNichtGefundenExeption extends Exception{
    private String warenNr;


    public WareNichtGefundenExeption(String warenNr){
        this.warenNr =warenNr;
    }

    public String getWarenNr() {
        return warenNr;
    }

    @Override
    public String  getMessage()   {
        return "Ware ist nicht im warenkorb";
    }
}
