import businessObjects.Vertragspartner;
import dao.Vertragspartnerdao;

public class Programm {
    public static void main(String[] args) throws ClassNotFoundException {

        Vertragspartnerdao vertragspartnerdao = new Vertragspartnerdao();
        Vertragspartner vertragspartner = vertragspartnerdao.read("396435436439");
        System.out.println(vertragspartner.getVorname());
    }
}
