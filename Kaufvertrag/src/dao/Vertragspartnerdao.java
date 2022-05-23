package dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;

import java.sql.*;
import java.util.ArrayList;

public class Vertragspartnerdao {

    private final String CLASSNAME ="org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Kaufvertrag/src/data/Kaufvertrag.db";


    public Vertragspartnerdao () throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    /**
     * Liest einen vertragsparner auf basis seiner asweisnummer
     * @param ausweisNr Die Ausweisnummer
     * @return Der Gewünschte Vertragspartner
     */
     Connection connection = null;
    public Vertragspartner read(String ausweisNr){
        Vertragspartner vertragspartner = null;

        PreparedStatement preparedStatement = null;

            // Verbindung zu Datenbank Herstellen

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * From vertragspartner WHERE ausweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,ausweisNr);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            //Zeiger auf den ersten Datensatz setzen
            resultSet.next();

            //ResulSet auswerten
           vertragspartner = createObjects(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
       return vertragspartner;



    }
    public ArrayList<Vertragspartner> read() {

        ArrayList<Vertragspartner> vertragspartnerArrayList = new ArrayList<>();
        connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank Herstellen

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * From vertragspartner ";
            preparedStatement = connection.prepareStatement(sql);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            //Zeiger auf den ersten Datensatz setzen
            while (resultSet.next()) {
                //ResulSet auswerten
                vertragspartnerArrayList.add(createObjects(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return vertragspartnerArrayList ;

    }
    public Vertragspartner createObjects(ResultSet resultSet) throws SQLException {

        String nr = resultSet.getString("ausweisNr");
        String vorname = resultSet.getString("vorname");
        String nachname = resultSet.getString("nachname");
        String strasse = resultSet.getString("strasse");
        String hausNr = resultSet.getString("hausNr");
        String plz = resultSet.getString("plz");
        String ort = resultSet.getString("ort");

        Vertragspartner createObjects= new Vertragspartner(vorname, nachname);
        createObjects.setAusweisNr(nr);
        createObjects.setAdresse(new Adresse(strasse, hausNr, plz, ort));
        return createObjects;
    }


}
