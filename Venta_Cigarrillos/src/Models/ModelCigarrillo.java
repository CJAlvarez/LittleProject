package Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import venta_cigarrillos.Cigarrillo;

/**
 *
 * @author CJ
 */
public class ModelCigarrillo extends Model {

    protected ArrayList<Cigarrillo> cigarrillos;

    public ModelCigarrillo() {
        this.cigarrillos = new ArrayList();
    }

    public ModelCigarrillo(ArrayList<Cigarrillo> almacenes) {
        this.cigarrillos = almacenes;
    }

    @Override
    public void read() throws SQLException {
        super.connect();
        statement = connection.createStatement();
        String cons;
        cigarrillos = new ArrayList();
        try {
            cons = "SELECT * FROM CIGARRILLO";
            ResultSet rs = statement.executeQuery(cons);
            while (rs.next()) {
                Cigarrillo cigarrillo = new Cigarrillo();
                cigarrillos.add(cigarrillo);
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
        Cigarrillo aw = (Cigarrillo) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "INSERT INTO ALMACEN values (" + aw.getIdFiscal() + ", " + aw.getNumCigarrillo() + ", " + aw.getCantCigarrillo() + ", " + aw.getNumExpendio() + ")";
            r = statement.executeUpdate(cadSQL);
            statement = connection.createStatement();
            cadSQL = "INSERT INTO EXPEN_ALMA values (" + aw.getNumExpendio() + ", '" + aw.getLocalidad() + "', '" + aw.getNombre() + "')";
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
        cigarrillos = new ArrayList();
        try {
            cons = "SELECT * FROM ALMACEN WHERE ";
            ResultSet rs = statement.executeQuery(cons);
            while (rs.next()) {
                String cons2 = "SELECT * FROM EXPEN_ALMA WHERE NUM_EXP = '" + rs.getInt("NUM_EXP") + "'";
                Statement statement2 = connection.createStatement();
                ResultSet rs2 = statement2.executeQuery(cons2);
                Cigarrillo almacen = new Cigarrillo(rs.getInt("ID_FISCAL"), rs.getInt("NUM_CIG"), rs.getInt("CANT_CIG"), rs.getInt("NUM_EXP"), rs2.getString("LOCALIDAD"), rs2.getString("NOMBRE"));
                cigarrillos.add(almacen);
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
            cadSQL = "DELETE FROM ALMACEN WHERE rownum = " + pos;
            r = statement.executeUpdate(cadSQL);
            statement = connection.createStatement();
            cadSQL = "DELETE FROM EXPEN_ALMA WHERE rownum = " + pos;
            r = statement.executeUpdate(cadSQL);
        } catch (Exception e) {
            System.err.println("ERROR_DELETE");
        }
        super.disconnect();
    }

    @Override
    public void update(Object o, int pos) throws SQLException {
        super.connect();
        Cigarrillo aw = (Cigarrillo) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "UPDATE ALMACEN SET ID_FISCAL = " + aw.getIdFiscal() + ", NUM_CIG = " + aw.getNumCigarrillo() + ", CANT_CIG = " + aw.getCantCigarrillo() + ", NUM_EXP = " + aw.getNumExpendio() + " WHERE rownum = " + pos;
            r = statement.executeUpdate(cadSQL);
            statement = connection.createStatement();
            cadSQL = "UPDATE EXPEN_ALMA SET NUM_EXP = " + aw.getNumExpendio() + ", LOCALIDAD = '" + aw.getLocalidad() + "', NOMBRE = '" + aw.getNombre() + "' WHERE rownum = " + pos;
            r = statement.executeUpdate(cadSQL);
            System.out.println("ACTUALIZACION COMPLETA");
        } catch (Exception e) {
            System.err.println("ERROR_UPDATE");
        }
    }

    public ArrayList<Cigarrillo> getCigarrilloes() {
        return cigarrillos;
    }

    public void setCigarrilloes(ArrayList<Cigarrillo> almacenes) {
        this.cigarrillos = almacenes;
    }
}
