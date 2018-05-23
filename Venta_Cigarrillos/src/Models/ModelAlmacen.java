package Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import venta_cigarrillos.Almacen;

/**
 *
 * @author CJ
 */
public class ModelAlmacen extends Model {

    protected ArrayList<Almacen> almacenes;

    public ModelAlmacen() {
        this.almacenes = new ArrayList();
    }

    public ModelAlmacen(ArrayList<Almacen> almacenes) {
        this.almacenes = almacenes;
    }

    @Override
    public void read() throws Exception {
        super.connect();
        statement = connection.createStatement();
        String cons;
        almacenes = new ArrayList();
        try {
            cons = "SELECT * FROM ALMACEN;";
            ResultSet rs = statement.executeQuery(cons);
            while (rs.next()) {
                Almacen almacen = new Almacen(rs.getInt("ID_FISCAL"), rs.getInt("NUM_CIG"), rs.getInt("CANT_CIG"));
                almacenes.add(almacen);
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
        Almacen aw = (Almacen) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "INSERT INTO ALMACEN values (" + aw.getIdFiscal() + ", " + aw.getNumCigarrillo() + ", " + aw.getCantCigarrillo() + ");";
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
        almacenes = new ArrayList();
        try {
            cons = "SELECT * FROM ALMACEN WHERE ";
            ResultSet rs = statement.executeQuery(cons);
            while (rs.next()) {
                Almacen almacen = new Almacen(rs.getInt("ID_FISCAL"), rs.getInt("NUM_CIG"), rs.getInt("CANT_CIG"));
                almacenes.add(almacen);
            }
            System.out.println("BUSQUEDA COMPLETA");
        } catch (Exception e) {
            System.err.println("ERROR_SEARCH");
        }
        super.disconnect();
    }

    @Override
    public void delete(int pos) throws Exception {
        super.connect();
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "DELETE FROM ALMACEN WHERE rownum = " + pos + ";";
            r = statement.executeUpdate(cadSQL);
        } catch (Exception e) {
            System.err.println("ERROR_DELETE");
        }
        super.disconnect();
    }

    @Override
    public void update(Object o, int pos) throws Exception {
        super.connect();
        Almacen aw = (Almacen) o;
        statement = connection.createStatement();
        String cadSQL;
        int r;
        try {
            cadSQL = "UPDATE ALMACEN SET ID_FISCAL = " + aw.getIdFiscal() + ", NUM_CIG = " + aw.getNumCigarrillo() + ", CANT_CIG = " + aw.getCantCigarrillo() + " WHERE rownum = " + pos + ";";
            r = statement.executeUpdate(cadSQL);
            System.out.println("ACTUALIZACION COMPLETA");
        } catch (Exception e) {
            System.err.println("ERROR_UPDATE");
        }
    }

    public ArrayList<Almacen> getAlmacenes() {
        return almacenes;
    }

    public void setAlmacenes(ArrayList<Almacen> almacenes) {
        this.almacenes = almacenes;
    }

}
