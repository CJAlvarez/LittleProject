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

    protected void disconnect() {
        try {
            connection.close();
            System.out.println("CONEXION CERRADA");
        } catch (SQLException e) {
            System.out.println("CONEXION NO CERRADA");
        }
    }

    public abstract void read() throws SQLException;

    public abstract void write(Object o) throws SQLException;

    public abstract void search() throws SQLException;

    public abstract void delete(int pos) throws SQLException;

    public abstract void update(Object o, int pos) throws SQLException;
}
