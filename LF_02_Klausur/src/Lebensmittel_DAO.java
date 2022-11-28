import javax.xml.parsers.SAXParser;
import java.sql.*;
import java.util.ArrayList;

public class Lebensmittel_DAO {

    Connection connection = null;
    PreparedStatement preparedStatement = null;

    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:Waren.db";

    public Lebensmittel_DAO() throws ClassNotFoundException{
        Class.forName(CLASSNAME);
    }


    public Lebensmittel create(Lebensmittel lebensmittel) throws SQLException{
        connection = DriverManager.getConnection(CONNECTIONSTRING);
        String sql = "Insert Into Lebensmittel (name,gewicht,preis,nuesse,milch)" +
                "Values ?,?,?,?,?";
        preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,lebensmittel.getName());
        preparedStatement.setInt(2,lebensmittel.getGewicht());
        preparedStatement.setDouble(3,lebensmittel.getPreis());
        preparedStatement.setString(4, lebensmittel.getNuesse());
        preparedStatement.setString(5,lebensmittel.getMilch());

        return lebensmittel;
    }


    public Lebensmittel read(int id) throws SQLException {
        Lebensmittel lebensmittel = null;
        preparedStatement = null;
        connection =null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "Select * From Lebensmittel WHERE id = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

             lebensmittel = read(id);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return read(id);
    }



    public ArrayList<Lebensmittel> read() throws SQLException{
        ArrayList<Lebensmittel> lebensmittel = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "Select * From Lebensmittel";
            preparedStatement = connection.prepareStatement(sql);

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
            return lebensmittel;
        }



    public ArrayList<Lebensmittel> readAllergyFree() {

        connection = null;
        preparedStatement = null;
        ArrayList<Lebensmittel> lebensmittel = new ArrayList<>();

       try {

           connection = DriverManager.getConnection(CONNECTIONSTRING);
           String sql = "Select * From Lebensmittel WHERE nuesse and milch is like 'nein'";
           preparedStatement = connection.prepareStatement(sql);



       }catch (Exception e){
           e.printStackTrace();
       }
       finally {
           try {
               connection.close();
           } catch (SQLException e) {
               e.printStackTrace();
           } finally {
               try {
                   preparedStatement.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
           }

       }

return lebensmittel;
    }



    public void update(Lebensmittel lebensmittel) {
        connection = null;
        preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "Update Lebensmitte set name = ?, gewicht = ?, preis = ?, nuesse = ?, milch = ?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, lebensmittel.getName());
            preparedStatement.setInt   (2, lebensmittel.getGewicht());
            preparedStatement.setDouble(3, lebensmittel.getPreis());
            preparedStatement.setString(4, lebensmittel.getNuesse());
            preparedStatement.setString(5, lebensmittel.getMilch());
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
            }



            public void delete(int id){

        connection = null;
        preparedStatement = null;

        try {


            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "Delete From Lebensmittel WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);



        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
            }
}

