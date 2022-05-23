import businessObjects.Vertragspartner;
import businessObjects.Ware;
import dao.Vertragspartnerdao;
import dao.Waredao;

import java.sql.SQLException;
import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Vertragspartnerdao vertragspartnerdao = new Vertragspartnerdao();
        Vertragspartner vertragspartner = vertragspartnerdao.read("396435436439");
        System.out.println(vertragspartner.getVorname());

        vertragspartnerdao.delete("396435436439");

        Waredao waredao = new Waredao();
        Ware ware = waredao.read(3);
        System.out.println(ware.getPreis() + "€");
        System.out.println(ware.getBesonderheitenListe());


        ArrayList<Vertragspartner> vertragspartnerArrayList = new ArrayList<>();
        vertragspartnerArrayList = vertragspartnerdao.read();
        System.out.println(vertragspartnerArrayList);

        ArrayList<Ware> wareArrayList = new ArrayList<>();
        wareArrayList = waredao.read();
        System.out.println(wareArrayList);



    }
}
