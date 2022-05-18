package dao;

import businessObjects.Ware;

import java.sql.*;

public class Waredao {
    private final String CLASSNAME ="org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Kaufvertrag/src/data/Kaufvertrag.db";

    public Waredao () throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }
    public Ware read(String warenNr){
        Ware ware = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * From ware WHERE warenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,warenNr);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            //Zeiger auf den ersten Datensatz setzen
            resultSet.next();


            String nr = resultSet.getString("warenNr");
            String bezeichnung = resultSet.getString("bezeichnung");
            String beschreibung = resultSet.getString("beschreibung");
            double preis = resultSet.getDouble("preis");


            ware = new Ware(bezeichnung,preis);
            ware.setBeschreibung(beschreibung);
            ware.setBezeichnung(bezeichnung);
            ware.setPreis(preis);
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