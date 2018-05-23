package Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import venta_cigarrillos.Fabricante;

/**
 *
 * @author CJ
 */
public class ModelFabricante extends Model {

    protected ArrayList<Fabricante> fabricantes;

    public ModelFabricante() {
        this.fabricantes = new ArrayList();
    }

    public ModelFabricante(ArrayList<Fabricante> fabricantes) {
        this.fabricantes = fabricantes;
    }

    @Override
    public void read() throws SQLException {
        super.connect();
        statement = connection.createStatement();
        String cons;
        fabricantes = new ArrayList();
        try {
            cons = "SELECT * FROM FABRICANTE";
            ResultSet rs = statement.executeQuery(cons);
            while (rs.next()) {
                Fabricante fabricante = new Fabricante(rs.getInt("IDFAB"), rs.getString("NOMBRE"), rs.getString("PAIS"));
                fabricantes.add(fabricante);
            }
            System.out.println("LECTURA COMPLETA");
        } catch (Exception e) {
            System.err.println("ERROR_READ");
        }
        super.disconnect();
    }

    @Override
    public void write(Object o) throws SQLException {
        super.connect();
        Fabricante cw = (Fabricante) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "INSERT INTO FABRICANTE values (" + cw.getIdFabricante() + ", '" + cw.getNombre() + "', '" + cw.getSede() + "')";
            r = statement.executeUpdate(cadSQL);
            System.out.println("ESCRITURA COMPLETA");
        } catch (Exception e) {
            System.err.println("ERROR_WRITE");
        }
        super.disconnect();
    }

    @Override
    public void search() throws SQLException {
        super.connect();
        statement = connection.createStatement();
        String cons;
        fabricantes = new ArrayList();
        try {
            cons = "SELECT * FROM FABRICANTE WHERE ";
            ResultSet rs = statement.executeQuery(cons);
            while (rs.next()) {
                String cons2 = "SELECT * FROM EXPEN_ALMA WHERE NUM_EXP = '" + rs.getInt("NUM_EXP") + "'";
                Statement statement2 = connection.createStatement();
                ResultSet rs2 = statement2.executeQuery(cons2);
            }
            System.out.println("BUSQUEDA COMPLETA");
        } catch (Exception e) {
            System.err.println("ERROR_SEARCH");
        }
        super.disconnect();
    }

    @Override
    public void delete(int pos) throws SQLException {
        super.connect();
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "DELETE FROM FABRICANTE WHERE rownum = " + pos;
            r = statement.executeUpdate(cadSQL);
        } catch (Exception e) {
            System.err.println("ERROR_DELETE");
        }
        super.disconnect();
    }

    @Override
    public void update(Object o, int pos) throws SQLException {
        super.connect();
        Fabricante aw = (Fabricante) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "UPDATE FABRICANTE SET IDFAB = " + aw.getIdFabricante() + ", NOMBRE = '" + aw.getNombre() + "', PAIS = '" + aw.getSede() + "' WHERE rownum = " + pos;
            r = statement.executeUpdate(cadSQL);
            System.out.println("ACTUALIZACION COMPLETA");
        } catch (Exception e) {
            System.err.println("ERROR_UPDATE");
        }
    }

    public ArrayList<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(ArrayList<Fabricante> Fabricantes) {
        this.fabricantes = Fabricantes;
    }
}
