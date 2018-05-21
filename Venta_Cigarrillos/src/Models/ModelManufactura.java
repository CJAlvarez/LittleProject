package Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import venta_cigarrillos.Manufactura;

/**
 *
 * @author CJ
 */
public class ModelManufactura extends Model {

    protected ArrayList<Manufactura> maufacturas;

    public ModelManufactura() {
        this.maufacturas = new ArrayList();
    }

    public ModelManufactura(ArrayList<Manufactura> manufacturas) {
        this.maufacturas = manufacturas;
    }

    @Override
    public void read() throws SQLException {
        super.connect();
        statement = connection.createStatement();
        String cons;
        maufacturas = new ArrayList();
        try {
            cons = "SELECT * FROM MANUFACTURA;";
            ResultSet rs = statement.executeQuery(cons);
            while (rs.next()) {
                Manufactura manufactura = new Manufactura(rs.getInt("IDFABRICANTE"), rs.getString("MARCA"), Integer.parseInt(rs.getString("CARTON")), Integer.parseInt(rs.getString("EMBALAJE")));
                maufacturas.add(manufactura);
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
        Manufactura cw = (Manufactura) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "INSERT INTO MANUFACTURA values (" + cw.getIdFabricante() + ", '" + cw.getMarca() + "', '" + cw.getCarton() + "', '" + cw.getEmbalaje() + "');";
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
        maufacturas = new ArrayList();
        try {
            cons = "SELECT * FROM MANUFACTURA WHERE ";
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
            cadSQL = "DELETE FROM MANUFACTURA WHERE rownum = " + pos;
            r = statement.executeUpdate(cadSQL);
        } catch (Exception e) {
            System.err.println("ERROR_DELETE");
        }
        super.disconnect();
    }

    @Override
    public void update(Object o, int pos) throws SQLException {
        super.connect();
        Manufactura aw = (Manufactura) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "UPDATE MANUFACTURA SET IDFABRICANTE = " + aw.getIdFabricante() + ", MARCA = '" + aw.getMarca() + "', CARTON = '" + aw.getCarton() + "', EMBALAJE = '" + aw.getEmbalaje() + "' WHERE rownum = " + pos + ";";
            r = statement.executeUpdate(cadSQL);
            System.out.println("ACTUALIZACION COMPLETA");
        } catch (Exception e) {
            System.err.println("ERROR_UPDATE");
        }
    }

    public ArrayList<Manufactura> getManufacturas() {
        return maufacturas;
    }

    public void setManufacturas(ArrayList<Manufactura> manufacturas) {
        this.maufacturas = manufacturas;
    }
}
