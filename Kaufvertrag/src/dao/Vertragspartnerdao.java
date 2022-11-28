package dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;

import java.sql.*;
import java.util.ArrayList;

public class Vertragspartnerdao {

    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Kaufvertrag/src/data/Kaufvertrag.db";


    public Vertragspartnerdao() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    /**
     * Liest einen vertragsparner auf basis seiner asweisnummer
     * @param ausweisNr Die Ausweisnummer
     * @return Der Gewünschte Vertragspartner
     */
    Connection connection = null;

    public Vertragspartner read(String ausweisNr) {
        Vertragspartner vertragspartner = null;

        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank Herstellen

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * From vertragspartner WHERE ausweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ausweisNr);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            //Zeiger auf den ersten Datensatz setzen
            resultSet.next();

            //ResulSet auswerten
            vertragspartner = createObjects(resultSet);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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

        return vertragspartnerArrayList;

    }


    private Vertragspartner createObjects(ResultSet resultSet) throws SQLException {

        String nr = resultSet.getString("ausweisNr");
        String vorname = resultSet.getString("vorname");
        String nachname = resultSet.getString("nachname");
        String strasse = resultSet.getString("strasse");
        String hausNr = resultSet.getString("hausNr");
        String plz = resultSet.getString("plz");
        String ort = resultSet.getString("ort");

        Vertragspartner createObjects = new Vertragspartner(vorname, nachname);
        createObjects.setAusweisNr(nr);
        createObjects.setAdresse(new Adresse(strasse, hausNr, plz, ort));

        return createObjects;

    }


    public void delete(String ausweisNr) throws SQLException {
        try {

            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "DELETE FROM Vertragspartner where ausweisNr = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ausweisNr);
            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void insert(Vertragspartner vertragspartner) throws SQLException {
        connection = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "Insert into Vertragspartner values(?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, vertragspartner.getAusweisNr());
            preparedStatement.setString(2, vertragspartner.getVorname());
            preparedStatement.setString(3, vertragspartner.getNachname());
            preparedStatement.setString(4, vertragspartner.getAdresse().getStrasse());
            preparedStatement.setString(5, vertragspartner.getAdresse().getHausNr());
            preparedStatement.setString(6, vertragspartner.getAdresse().getPlz());
            preparedStatement.setString(7, vertragspartner.getAdresse().getOrt());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    public void update(String ausweisNr,Vertragspartner vertragspartner) throws SQLException{
        connection = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "Update Vertragspartner Set ausweisNr = ?,vorname = ?,nachname = ?,strasse = ?, hausNr = ?, plz = ?, ort = ?  WHERE ausweisNr = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, vertragspartner.getAusweisNr());
            preparedStatement.setString(2, vertragspartner.getVorname());
            preparedStatement.setString(3, vertragspartner.getNachname());
            preparedStatement.setString(4, vertragspartner.getAdresse().getStrasse());
            preparedStatement.setString(5, vertragspartner.getAdresse().getHausNr());
            preparedStatement.setString(6, vertragspartner.getAdresse().getPlz());
            preparedStatement.setString(7, vertragspartner.getAdresse().getOrt());
            preparedStatement.setString(8,ausweisNr);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}