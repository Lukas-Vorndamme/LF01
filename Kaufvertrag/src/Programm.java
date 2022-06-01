import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import businessObjects.Ware;
import dao.Vertragspartnerdao;
import dao.Waredao;

import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

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


        Vertragspartner vertragspartner2 = new Vertragspartner("HANS","Köller");
        vertragspartner2.setAdresse(new Adresse("bgvfdubgv","iefh","hig","difjfv"));
        vertragspartner2.setAusweisNr("6969696969");
        vertragspartnerdao.update("69816",vertragspartner2);

        ArrayList<Vertragspartner> vertragspartnerArrayList = new ArrayList<>();
        vertragspartnerArrayList = vertragspartnerdao.read();
        System.out.println(vertragspartnerArrayList);


        ArrayList<Ware> wareArrayList = new ArrayList<>();
        wareArrayList = waredao.read();
        System.out.println(wareArrayList);


    }
}
