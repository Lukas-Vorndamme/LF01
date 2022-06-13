package dao;

import Objects.Konsolen;

import java.net.ConnectException;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.ArrayList;

public class Konsolendao {


    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Konsolen/src/data/Kaufvertrag.db";


    public ArrayList<Konsolen> read() {

        ArrayList<Konsolen> konsolenArrayList = new ArrayList<>();
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
                konsolenArrayList.add(createObject(resultSet));
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

        return konsolenArrayList;

    }
    public Konsolendao() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    Connection connection = null;
    PreparedStatement preparedStatement = null;

    public Konsolen read(String produktionsnummer) throws SQLException {

        Konsolen konsolen = null;

try {


        String sql = "Select * From konsole where produktionsnummer = ?";

        connection = DriverManager.getConnection(CONNECTIONSTRING);
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,produktionsnummer);


        ResultSet resultSet = preparedStatement.executeQuery();

        resultSet.next();

        konsolen = createObject(resultSet);

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        return konsolen;

    }

    public void update(String produktionsnummer,Konsolen konsolen) throws SQLException{
        connection = null;
        preparedStatement =null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "Update Konsole Set name = ?,marke = ?, spiel = ?, zubehör = ?, preis = ?  ";
            preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setString(1, konsolen.getName());
            preparedStatement.setString(2, konsolen.getMarke());
            preparedStatement.setString(3, konsolen.getSpiele());
            preparedStatement.setString(4, konsolen.getZubehör());
            preparedStatement.setDouble(5, konsolen.getPreis());

            preparedStatement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delete(String produktionsnummer)throws SQLException {
        connection = null;
        preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "Delete  From Konsole WHERE produktionsnummer = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,produktionsnummer);
            preparedStatement.executeUpdate();

        }catch (SQLException e ){
            e.printStackTrace();
        }
    }

    public void insert(Konsolen konsolen) throws SQLException{
        connection = null;
        preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "Insert Into Konsole(name,marke,spiel,zubehör,preis)"+
            " Values(?,?,?,?,?)";

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, konsolen.getName());
            preparedStatement.setString(2, konsolen.getMarke());
            preparedStatement.setString(3, konsolen.getSpiele());
            preparedStatement.setString(4, konsolen.getZubehör());
            preparedStatement.setDouble(5, konsolen.getPreis());

          ResultSet resultSet =   preparedStatement.getGeneratedKeys();
              resultSet.next();
              konsolen.setProduktionsnummer(resultSet.getString("Last_insert_rowid()"));

            preparedStatement.executeUpdate();


        }catch (SQLException e){
            e.printStackTrace();
        }
    }


    private Konsolen createObject(ResultSet resultSet) throws SQLException{

        String nr = resultSet.getString("produktionsnummer");
        String name = resultSet.getString("name");
        String marke = resultSet.getString("marke");
        String spiel = resultSet.getString("spiel");
        String zubehör = resultSet.getString("zubehör");
        double preis = resultSet.getDouble("preis");

        Konsolen createObject = new Konsolen(nr,preis);
        createObject.setProduktionsnummer(nr);
        createObject.setName(name);
        createObject.setMarke(marke);
        createObject.setSpiele(spiel);
        createObject.setZubehör(zubehör);
        createObject.setPreis(preis);

        return createObject;
    }
}
