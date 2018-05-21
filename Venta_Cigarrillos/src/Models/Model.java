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

    public String read() throws SQLException {
        return null;
    }

}
