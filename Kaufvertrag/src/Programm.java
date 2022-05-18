import businessObjects.Vertragspartner;
import businessObjects.Ware;
import dao.Vertragspartnerdao;
import dao.Waredao;

public class Programm {
    public static void main(String[] args) throws ClassNotFoundException {

        Vertragspartnerdao vertragspartnerdao = new Vertragspartnerdao();
        Vertragspartner vertragspartner = vertragspartnerdao.read("396435436439");
        System.out.println(vertragspartner.getVorname());

        Waredao waredao = new Waredao();
        Ware ware = waredao.read("1");
        System.out.println(ware.getPreis()+"€");
    }
}
