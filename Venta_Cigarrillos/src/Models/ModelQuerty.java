package Models;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import venta_cigarrillos.Almacen;

/**
 *
 * @author CJ
 */
public class ModelQuerty extends Model {

    protected ArrayList<String[]> objects;

    public ModelQuerty() {
        this.objects = new ArrayList();
    }

    public ModelQuerty(ArrayList<String[]> objects) {
        this.objects = objects;
    }

    public void consult(int i, JTable t) throws Exception {
        super.connect();
        statement = connection.createStatement();
        objects = new ArrayList();
        String[] names = new String[]{};
        boolean[] edit = new boolean[]{};

        try {
            switch (i) {
                case 0: {
                    ResultSet rs = statement.executeQuery("SELECT man.marca , fab.pais FROM MANUFACTURA man INNER JOIN  fabricante fab ON fab.IDFAB = man.IDFABRICANTE WHERE fab.pais <> 'España'");
                    names = new String[]{"Marca", "Pais"};
                    edit = new boolean[]{false, false};
                    while (rs.next()) {
                        objects.add(new String[]{rs.getString(1), rs.getString(2)});
                    }
                    break;
                }
                case 1: {
                    ResultSet rs = statement.executeQuery("select sum(cig.precompra*comp.cant_ciga) from compras comp inner join cigarrillo cig on comp.NUM_CIGA = cig.NUM_CIGA WHERE  comp.IDFISCAL = 11111 and cig.marca = 'Camel' and comp.fechacompra >= to_date('1-01-1996' , 'DD/MM/YYYY')");
                    names = new String[]{"Suma Compras"};
                    edit = new boolean[]{false};
                    while (rs.next()) {
                        objects.add(new String[]{rs.getInt(1) + ""});
                    }
                    break;
                }
                case 2: {
                    ResultSet rs = statement.executeQuery("select sum(ven.total_cig* cig.preventa) as Importe_de_Venta from ventas ven inner join CIGARRILLO cig on cig.num_ciga = ven.num_cig inner join ESTANCOS est on ven.ID_FISCAL1 = est.ID_FISCAL WHERE cig.marca = 'Ducados' and EST.PROVINCIA = 'Madrid'");
                    names = new String[]{"Suma Ventas"};
                    edit = new boolean[]{false};
                    while (rs.next()) {
                        objects.add(new String[]{rs.getInt(1) + ""});
                    }
                    break;
                }
                case 3: {
                    ResultSet rs = statement.executeQuery("select * from (select sum(VEN.TOTAL_CIG) , cig.marca from ventas ven inner join cigarrillo cig on ven.num_cig = CIG.NUM_CIGA inner join MANUFACTURA man on MAN.MARCA = CIG.MARCA inner join fabricante fab on FAB.IDFAB = MAN.IDFABRICANTE where FAB.PAIS='USA' group by cig.marca order by sum(ven.total_cig) desc) where rownum= 1");
                    names = new String[]{"Suma Ventas", "Marca"};
                    edit = new boolean[]{false, false};
                    while (rs.next()) {
                        objects.add(new String[]{rs.getInt(1) + "", rs.getString(2)});
                    }
                    break;
                }
                case 4: {
                    ResultSet rs = statement.executeQuery("select sum(VEN.TOTAL_CIG*cig.preventa) , cig.marca from ventas ven inner join cigarrillo cig on ven.num_cig = CIG.NUM_CIGA where cig.marca = 'Winston' and VEN.FECHAVENTA = to_date('22-08-1995' , 'DD/MM/YYYY') group by cig.marca");
                    names = new String[]{"Suma Ventas", "Marca"};
                    edit = new boolean[]{false, false};
                    while (rs.next()) {
                        objects.add(new String[]{rs.getInt(1) + "", rs.getString(2)});
                    }
                    break;
                }
                case 5: {
                    try {
                        statement.executeUpdate("ALTER TABLE CIGARRILLO ADD  MED_CALIDAD NUMBER");
                        if (JOptionPane.showConfirmDialog(null, "Deshacer cambios?") == 0) {
                            statement.executeUpdate("ALTER TABLE CIGARRILLO drop COLUMN  MED_CALIDAD");
                        }
                    } catch (Exception e) {
                    }
                    break;
                }
                case 6: {
                    try {
                        statement.executeUpdate("alter table Estancos add constraint RESTRICCION check(id_fiscal < 100000000000)");
                        if (JOptionPane.showConfirmDialog(null, "Deshacer cambios?") == 0) {
                            statement.executeUpdate("alter table Estancos drop constraint RESTRICCION");
                        }
                    } catch (Exception e) {
                    }
                    break;
                }
                case 7: {
                    try {
                        statement.executeUpdate("alter table ALMACEN modify Total_cig number(5, 0)");
                        if (JOptionPane.showConfirmDialog(null, "Deshacer cambios?") == 0) {
                            statement.executeUpdate("alter table Estancos drop constraint RESTRICCION");
                        }
                    } catch (Exception e) {
                    }
                    break;
                }
                case 8: {
                    ResultSet rs = statement.executeQuery("select est.id_fiscal as IDFISCAL , EST.NOMBRE_ESTANCO as Nombre_Estanco from estancos est inner join almacen al on EST.ID_FISCAL = AL.ID_FISCAL inner join CIGARRILLO cig on CIG.NUM_CIGA = AL.NUM_CIG where EST.PROVINCIA= 'Madrid' and CIG.MENTOL = 'N' and CIG.MARCA !='Winston' and CIG.MARCA ='Celtas' and CIG.FILTRO = 'N'");
                    names = new String[]{"IDFiscal", "Nombre"};
                    edit = new boolean[]{false, false};
                    while (rs.next()) {
                        objects.add(new String[]{rs.getString(1), rs.getString(2)});
                    }
                    break;
                }
                case 9: {
                    try {
                        CallableStatement cst = connection.prepareCall("{call MENOS_VENDIDAS1 (?,?)}");
                        int flag = 0;
                        int idAlmacen = 0;
                        int cant = 0;
                        do {
                            try {
                                idAlmacen = almacenes.get(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese IdFiscal", ""))).getIdFiscal();
                                flag = 1;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Dato inválido", "Error", 0);
                                flag = 0;
                            }
                        } while (flag == 0);
                        flag = 0;
                        do {
                            try {
                                cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad límite", ""));
                                flag = 1;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Dato inválido", "Error", 0);
                                flag = 0;
                            }
                        } while (flag == 0);
                        cst.setInt(1, idAlmacen);
                        cst.setInt(2, cant);
                        cst.execute();
                    } catch (Exception e) {
                        System.out.println("ERROR_PROCEDURE");
                        e.printStackTrace();
                    }
                    break;
                }
                default: {
                    break;
                }
            }
            final boolean[] editable = edit;

            // DECLARACIÓN DE LA TABLA
            DefaultTableModel model = new javax.swing.table.DefaultTableModel(new Object[][]{}, names) {
                boolean[] canEdit;

                {
                    this.canEdit = editable;
                }

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            for (int j = 0; j < objects.size(); j++) {
                model.addRow(objects.get(j));
            }
            t.setModel(model);

        } catch (Exception e) {
            System.out.println("ERROR_QUERTIES");
            //e.printStackTrace();
        }
        super.disconnect();
    }

    @Override
    public void read() throws Exception {
    }

    @Override
    public void write(Object o) throws Exception {
    }

    @Override
    public void search() throws Exception {
    }

    @Override
    public void delete(int pos) throws Exception {
    }

    @Override
    public void update(Object o, int pos) throws Exception {
    }

    public ArrayList<String[]> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<String[]> objects) {
        this.objects = objects;
    }
    protected ArrayList<Almacen> almacenes;

    public ArrayList<Almacen> getAlmacenes() {
        return almacenes;
    }

    public void setAlmacenes(ArrayList<Almacen> almacenes) {
        this.almacenes = almacenes;
    }
}
