public class schmuck {

    private String bezeichnung;

    public schmuck(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    @Override
    public String toString() {
        return "schmuck{" +
                "bezeichnung='" + bezeichnung + '\'' +
                '}';
    }
}
