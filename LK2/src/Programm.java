import java.util.ArrayList;

public class Programm  {
    public static void main(String[] args) throws WareNichtGefundenExeption {
        ArrayList<Ware> warenListe = new ArrayList<>();
        Adresse adresse = new Adresse("Weserstr.","215","28205","Brermen");
        Kunde kunde = new Kunde("Hans","Peter",adresse);
        Warenkorb warenkorb = new Warenkorb(kunde);
        Ware ware = new Dvd("254680","Kinderfilm",7,20.00,90);
        Ware ware1 = new Dvd("654365","Actionfilm",7,25.00,120);
        Ware ware2 = new Buch("482746","Malbuch",7,10,"24154");
        Ware ware3 = new Buch("497216","Zeichenbuch",7,12,"63843");
        System.out.println(warenkorb);
        warenkorb.removeware(ware3,"497216");
        System.out.println(warenkorb);
        warenkorb.getWare("497216");

    }





}
