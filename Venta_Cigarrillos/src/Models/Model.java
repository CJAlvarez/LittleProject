package Models;

import java.sql.*;

/**
 *
 * @author CJ
 *
 * Clase Padre para los modelos.
 */
public abstract class Model {

    protected String user;
    protected String password;
    protected String url;
    protected Connection connection;
    protected Statement statement;

    public Model() {
        user = "C##CIGADMIN";
        password = "1234";
        url = "jdbc:oracle:thin:@localhost:1521:xe";
        connection = null;
        statement = null;

    }

    public void connect() {
        try {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("CONEXION ESTABLECIDA");
        } catch (Exception e) {
            System.err.println("CONEXION NO ESTABLECIDA");
        }
    }

    public abstract String read() throws SQLException;
    /*
        statement = connection.createStatement();
        String cadSQL;
        try {
            cadSQL = "SELECT * FROM #######";
            ResultSet rs = statement.executeQuery(cadSQL);
            String data = "";
            while (rs.next()) {
                data += (rs.getString("ID") + "");
            }
            System.out.println("LECTURA COMPLETA");
            return data;
        } catch (Exception e) {
            System.err.println("ERROR_READ");
        }
        return null;
    */

    public abstract void write() throws SQLException;
        /*
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "INSERT INTO ####### values ('" + "', '" + "')";
            r = statement.executeUpdate(cadSQL);
            System.out.println("ESCRITURA COMPLETA");
        } catch (Exception e) {
            System.err.println("ERROR_WRITE");
        }
    */

    public abstract String search() throws SQLException;
            /*
        statement = connection.createStatement();
        String cadSQL;
        try {
            cadSQL = "SELECT * FROM ####### WHERE ID = '" + "'";
            ResultSet rs = statement.executeQuery(cadSQL);
            String data = "";
            while (rs.next()) {
                data += (rs.getString("ID") + "");
            }
            System.out.println("BUSQUEDA COMPLETA");
            return data;
        } catch (Exception e) {
            System.err.println("ERROR_SEARCH");
        }
        return null;
    */
    
    public abstract void delete() throws SQLException;
        /*
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "DELETE FROM ####### WHERE ID = '" + "'";
            r = statement.executeUpdate(cadSQL);
            
        } catch (Exception e) {
            System.err.println("ERROR_DELETE");
        }
        */
}
