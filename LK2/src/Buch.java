public class Buch extends Ware {
    private String isbn;

    public Buch (String warenNr, String bezeichnung, double mwst, double preis, String isbn){
        super(warenNr,bezeichnung,mwst,preis);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Buch\n" +
                "isbn = " + isbn + "\n";
    }
}
