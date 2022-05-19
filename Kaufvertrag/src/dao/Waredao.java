package dao;

import businessObjects.Ware;

import java.sql.*;
import java.util.ArrayList;

public class Waredao {
    private final String CLASSNAME ="org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Kaufvertrag/src/data/Kaufvertrag.db";

    public Waredao () throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }
    public Ware read(int warenNr){
        Ware ware = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * From ware WHERE warenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,warenNr);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            //Zeiger auf den ersten Datensatz setzen
            resultSet.next();


            int nr = resultSet.getInt("warenNr");
            String bezeichnung = resultSet.getString("bezeichnung");
            String beschreibung = resultSet.getString("beschreibung");
            double preis = resultSet.getDouble("preis");
            String maengel = resultSet.getString("maengel");
            String besonderheiten = resultSet.getString("besonderheiten");

            ware = new Ware(bezeichnung,preis);
            ware.setWarenNr(nr);
            ware.setBeschreibung(beschreibung);
            ware.setBezeichnung(bezeichnung);
            ware.setPreis(preis);
            ware.setBesonderheitenListe(ware.getBesonderheitenListe());
            ware.setMaengelListe(ware.getMaengelListe());

            if (besonderheiten != null){
                String[] besonderheitenarray = besonderheiten.split(";");
            for (String b : besonderheitenarray) {
                ware.getBesonderheitenListe().add(b.trim());
            }}

            if (maengel != null){
                String[] maengelarray = maengel.split(";");
            for (String m : maengelarray){
                ware.getMaengelListe().add(m.trim());
            }}




        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         return ware;
        }
}