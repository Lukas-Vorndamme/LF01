import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import businessObjects.Ware;
import dao.Vertragspartnerdao;
import dao.Waredao;

import java.sql.SQLException;
import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

       Vertragspartnerdao vertragspartnerdao = new Vertragspartnerdao();
       Vertragspartner vertragspartner = vertragspartnerdao.read("3484314638484");
       System.out.println(vertragspartner.getVorname());

        vertragspartnerdao.delete("215");

        Waredao waredao = new Waredao();
        Ware ware = waredao.read(3);
        System.out.println(ware.getPreis() + "€");
        System.out.println(ware.getBesonderheitenListe());

        Vertragspartner vertragspartner1 = new Vertragspartner("Hans","peter");
        vertragspartner1.setAusweisNr("215");
        vertragspartner1.setAdresse(new Adresse("Hurensohn allee","69","42069","Bumshausen"));
        vertragspartnerdao.insert(vertragspartner1);

        ArrayList<Vertragspartner> vertragspartnerArrayList = new ArrayList<>();
        vertragspartnerArrayList = vertragspartnerdao.read();
        System.out.println(vertragspartnerArrayList);

        ArrayList<Ware> wareArrayList = new ArrayList<>();
        wareArrayList = waredao.read();
        System.out.println(wareArrayList);


    }
}
