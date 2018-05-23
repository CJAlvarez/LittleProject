package Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import venta_cigarrillos.Compra;

/**
 *
 * @author CJ
 */
public class ModelCompra extends Model {

    protected ArrayList<Compra> compras;

    public ModelCompra() {
        this.compras = new ArrayList();
    }

    public ModelCompra(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    @Override
    public void read() throws SQLException {
        super.connect();
        statement = connection.createStatement();
        String cons;
        compras = new ArrayList();
        try {
            cons = "SELECT * FROM COMPRAS";
            ResultSet rs = statement.executeQuery(cons);
            while (rs.next()) {
                Compra compra = new Compra(rs.getInt("IDCOMPRA"), rs.getInt("IDFISCAL"), rs.getInt("NUM_CIGA"), rs.getInt("CANT_CIGA"), rs.getDate("FECHACOMPRA"));
                compras.add(compra);
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
        Compra cw = (Compra) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "INSERT INTO COMPRAS values (" + cw.getIdCompra() + ", " + cw.getNumCigarrillo() + ", " + cw.getDate() + ", " + cw.getTotalNumCigarrillo() + ", " + cw.getIdFiscal() + ")";
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
        compras = new ArrayList();
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
            cadSQL = "DELETE FROM COMPRAS WHERE rownum = " + pos;
            r = statement.executeUpdate(cadSQL);
        } catch (Exception e) {
            System.err.println("ERROR_DELETE");
        }
        super.disconnect();
    }

    @Override
    public void update(Object o, int pos) throws SQLException {
        super.connect();
        Compra aw = (Compra) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "UPDATE COMPRAS SET IDCOMPRA = " + aw.getIdCompra() + ", NUM_CIGA = " + aw.getNumCigarrillo() + ", FECHACOMPRA = " + aw.getDate() + ", CANT_CIGA = " + aw.getTotalNumCigarrillo() + ", IDFISCAL = " + aw.getIdFiscal() + " WHERE rownum = " + pos;
            r = statement.executeUpdate(cadSQL);
            System.out.println("ACTUALIZACION COMPLETA");
        } catch (Exception e) {
            System.err.println("ERROR_UPDATE");
        }
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> almacenes) {
        this.compras = almacenes;
    }
}
