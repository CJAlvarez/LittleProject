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
            cons = "SELECT * FROM CIGARRILLO;";
            ResultSet rs = statement.executeQuery(cons);
            while (rs.next()) {
                Cigarrillo cigarrillo = new Cigarrillo(rs.getInt("NUM_CIGA"), rs.getString("FILT").charAt(0), rs.getString("COLORH"), rs.getInt("ALQUITRAN"), rs.getInt("NICOTINA"), rs.getString("MARCA"), rs.getString("CLASE"), rs.getString("MENTOL").charAt(0), rs.getFloat("PREVENTA"), rs.getFloat("PRECOMPRA"));
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
        Cigarrillo cw = (Cigarrillo) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "INSERT INTO CIGARRILLO values (" + cw.getNumCigarrillo() + ", '" + cw.getFiltro() + "', '" + cw.getColorHoja() + "', '" + cw.getMentol() + "', '" + cw.getMarca() + "', " + cw.getAlquitran() + ", " + cw.getNicotina() + ", " + cw.getPrecio_v() + ", " + cw.getPrecio_c() + "', '" + cw.getClase() + "');";
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
            cons = "SELECT * FROM CIGARRILLO WHERE ";
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
            cadSQL = "DELETE FROM CIGARRILLO WHERE rownum = " + pos;
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
            cadSQL = "UPDATE CIGARRILLO SET NUM_CIGA = " + aw.getNumCigarrillo() + ", FILTRO = " + aw.getFiltro() + ", COLORHOJA = " + aw.getColorHoja() + ", MENTOL = " + aw.getMentol() + ", MARCA = " + aw.getMarca() + ", ALQUITRAN = " + aw.getAlquitran() + ", NICOTINA = " + aw.getNicotina() + ", PREVENTA = " + aw.getPrecio_v() + ", PRECOMPRA = " + aw.getPrecio_c() + ", CLASE = " + aw.getClase() + " WHERE rownum = " + pos + ";";
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
