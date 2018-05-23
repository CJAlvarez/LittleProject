package Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import venta_cigarrillos.Estanco;

/**
 *
 * @author CJ
 */
public class ModelEstanco extends Model {

    protected ArrayList<Estanco> estancos;

    public ModelEstanco() {
        this.estancos = new ArrayList();
    }

    public ModelEstanco(ArrayList<Estanco> estancos) {
        this.estancos = estancos;
    }

    @Override
    public void read() throws SQLException {
        super.connect();
        statement = connection.createStatement();
        String cons;
        estancos = new ArrayList();
        try {
            cons = "SELECT * FROM ESTANCOS";
            ResultSet rs = statement.executeQuery(cons);
            while (rs.next()) {
                Estanco estanco = new Estanco(rs.getInt("ID_FISCAL"), rs.getInt("NUM_EXPENDIO"), rs.getString("LOCALIDAD"), rs.getString("NOMBRE_ESTANCO"), rs.getString("PROVINCIA"));
                estancos.add(estanco);
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
        Estanco cw = (Estanco) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "INSERT INTO ESTANCOS values (" + cw.getIdFiscal() + ", " + cw.getNumExpendio() + ", '" + cw.getNombre() + "', '" + cw.getLocalidad() + "', '" + cw.getProvincia() + "')";
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
        estancos = new ArrayList();
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
            cadSQL = "DELETE FROM ESTANCOS WHERE rownum = " + pos;
            r = statement.executeUpdate(cadSQL);
        } catch (Exception e) {
            System.err.println("ERROR_DELETE");
        }
        super.disconnect();
    }

    @Override
    public void update(Object o, int pos) throws SQLException {
        super.connect();
        Estanco aw = (Estanco) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "UPDATE ESTANCOS SET ID_FISCAL = " + aw.getIdFiscal() + ", NUM_EXPENDIO = " + aw.getNumExpendio() + ", NOMBRE_ESTANCO = '" + aw.getNombre() + "', LOCALIDAD = '" + aw.getLocalidad() + "', PROVINCIA = '" + aw.getProvincia() + "' WHERE rownum = " + pos;
            r = statement.executeUpdate(cadSQL);
            System.out.println("ACTUALIZACION COMPLETA");
        } catch (Exception e) {
            System.err.println("ERROR_UPDATE");
        }
    }

    public ArrayList<Estanco> getEstancos() {
        return estancos;
    }

    public void setEstancos(ArrayList<Estanco> estancos) {
        this.estancos = estancos;
    }
}
