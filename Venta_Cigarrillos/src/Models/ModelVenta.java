package Models;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import venta_cigarrillos.Venta;

/**
 *
 * @author CJ
 */
public class ModelVenta extends Model {

    protected ArrayList<Venta> ventas;

    public ModelVenta() {
        this.ventas = new ArrayList();
    }

    public ModelVenta(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    @Override
    public void read() throws Exception {
        super.connect();
        statement = connection.createStatement();
        String cons;
        ventas = new ArrayList();
        try {
            cons = "SELECT * FROM VENTAS";
            ResultSet rs = statement.executeQuery(cons);
            while (rs.next()) {
                Venta venta = new Venta(rs.getInt("ID_VENTA"), rs.getInt("ID_FISCAL1"), rs.getInt("TOTAL_CIG"), rs.getInt("NUM_CIG"), rs.getDate("FECHAVENTA"));
                ventas.add(venta);
            }
            System.out.println("LECTURA COMPLETA");
        } catch (Exception e) {
            System.err.println("ERROR_READ");
        }
        super.disconnect();
    }

    @Override
    public void write(Object o) throws Exception {
        super.connect();
        Venta cw = (Venta) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "INSERT INTO VENTAS values (" + cw.getIdVenta() + ", " + cw.getIdFiscal() + ", " + cw.getDate() + ", " + cw.getNumCigarrillo() + ", " + cw.getTotalNumCigarrillo() + ")";
            r = statement.executeUpdate(cadSQL);
            System.out.println("ESCRITURA COMPLETA");
        } catch (Exception e) {
            System.err.println("ERROR_WRITE");
        }
        super.disconnect();
    }

    @Override
    public void search() throws Exception {
        super.connect();
        statement = connection.createStatement();
        String cons;
        ventas = new ArrayList();
        try {
            cons = "SELECT * FROM VENTAS WHERE ";
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
    public void delete(int pos) throws Exception {
        pos += 1;
        super.connect();
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "DELETE FROM VENTAS WHERE rownum = " + pos;
            r = statement.executeUpdate(cadSQL);
        } catch (Exception e) {
            System.err.println("ERROR_DELETE");
        }
        super.disconnect();
    }

    @Override
    public void update(Object o, int pos) throws Exception {
        pos += 1;
        super.connect();
        Venta aw = (Venta) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "UPDATE VENTAS SET ID_VENTA = " + aw.getIdVenta() + ", ID_FISCAL1 = " + aw.getIdFiscal() + ", FECHAVENTA = " + aw.getDate() + ", NUM_CIG = " + aw.getNumCigarrillo() + ", TOTAL_CIG = " + aw.getTotalNumCigarrillo() + " WHERE rownum = " + pos;
            r = statement.executeUpdate(cadSQL);
            System.out.println("ACTUALIZACION COMPLETA");
        } catch (Exception e) {
            System.err.println("ERROR_UPDATE");
        }
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
}
