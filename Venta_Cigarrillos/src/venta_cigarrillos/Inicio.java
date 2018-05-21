package venta_cigarrillos;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suyapa
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        jt_almacen.setComponentPopupMenu(pop_tableAlmacen);
        jt_cigarrillo.setComponentPopupMenu(pop_tableCigarrillo);
        jt_compras.setComponentPopupMenu(pop_tableCompra);
        jt_distribuidor.setComponentPopupMenu(pop_tableDistribuidor);
        jt_estanco.setComponentPopupMenu(pop_tableEstanco);
        jt_fabricante.setComponentPopupMenu(pop_tableFabricante);
        jt_marcaa.setComponentPopupMenu(pop_tableMarca);
        jt_pedido.setComponentPopupMenu(pop_tablePedido);
        jt_venta.setComponentPopupMenu(pop_tableVenta);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_almacen = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_almacen = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jt_idFiscal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jt_localidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        js_numCigarrillo = new javax.swing.JSpinner();
        js_cantCigarrillo = new javax.swing.JSpinner();
        jb_agregarAlmacen = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jt_numExpendio = new javax.swing.JTextField();
        jt_idFiscal3 = new javax.swing.JTextField();
        pop_tableAlmacen = new javax.swing.JPopupMenu();
        jm_borrar = new javax.swing.JMenuItem();
        jm_modificar = new javax.swing.JMenuItem();
        jf_cigarrillos = new javax.swing.JFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        js_numCigarrillo1 = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jt_marca = new javax.swing.JTextField();
        jb_agregarCigarrillo = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jc_filtro = new javax.swing.JComboBox<>();
        jc_color = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jc_mentol = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        js_nicotina = new javax.swing.JSpinner();
        js_alquitran = new javax.swing.JSpinner();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jt_preciov = new javax.swing.JTextField();
        jt_precioc = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_cigarrillo = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        pop_tableCigarrillo = new javax.swing.JPopupMenu();
        jm_modCigarrillo = new javax.swing.JMenuItem();
        jm_deletCigarrillo = new javax.swing.JMenuItem();
        jf_compra = new javax.swing.JFrame();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        js_idcompra = new javax.swing.JSpinner();
        js_idfiscal = new javax.swing.JSpinner();
        js_numCigarrillo2 = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jb_agregarcompra = new javax.swing.JButton();
        js_diac = new javax.swing.JSpinner();
        js_totalnum = new javax.swing.JSpinner();
        js_mesc = new javax.swing.JSpinner();
        js_yearc = new javax.swing.JSpinner();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_compras = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jf_estanco = new javax.swing.JFrame();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jt_localidade = new javax.swing.JTextField();
        jt_nombree = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jb_agregarEstanco = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        js_idfiscale = new javax.swing.JSpinner();
        js_expendio = new javax.swing.JSpinner();
        jPanel12 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt_estanco = new javax.swing.JTable();
        pop_tableCompra = new javax.swing.JPopupMenu();
        pop_modificarc = new javax.swing.JMenuItem();
        pop_eliminarc = new javax.swing.JMenuItem();
        jf_distribuidores = new javax.swing.JFrame();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        js_numCigarrillod = new javax.swing.JSpinner();
        js_idcomprad = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        jb_agregardistribuidor = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_distribuidor = new javax.swing.JTable();
        pop_tableDistribuidor = new javax.swing.JPopupMenu();
        jm_eliminard = new javax.swing.JMenuItem();
        jm_modificarm = new javax.swing.JMenuItem();
        pop_tableEstanco = new javax.swing.JPopupMenu();
        jm_eliminare = new javax.swing.JMenuItem();
        jm_modificare = new javax.swing.JMenuItem();
        jf_fabricantes = new javax.swing.JFrame();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        js_idfabricante = new javax.swing.JSpinner();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jt_sede = new javax.swing.JTextField();
        jt_nombref = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jb_agregarfabricante = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jt_fabricante = new javax.swing.JTable();
        pop_tableFabricante = new javax.swing.JPopupMenu();
        jm_eliminarf = new javax.swing.JMenuItem();
        jm_modificarf = new javax.swing.JMenuItem();
        jf_marca = new javax.swing.JFrame();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        js_idfabricantem = new javax.swing.JSpinner();
        jt_nombrem = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jb_agregarMarca = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jt_marcaa = new javax.swing.JTable();
        jf_pedido = new javax.swing.JFrame();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        js_idfiscalp = new javax.swing.JSpinner();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        js_idcomprap = new javax.swing.JSpinner();
        jb_agregarpedido = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jt_pedido = new javax.swing.JTable();
        jf_venta = new javax.swing.JFrame();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel19 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        js_numCigarrillov = new javax.swing.JSpinner();
        js_totalnumv = new javax.swing.JSpinner();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        js_diav = new javax.swing.JSpinner();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        js_mesv = new javax.swing.JSpinner();
        js_yearv = new javax.swing.JSpinner();
        jb_agregarventa = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        js_idventa = new javax.swing.JSpinner();
        js_idfiscalv = new javax.swing.JSpinner();
        jLabel60 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jt_venta = new javax.swing.JTable();
        jLabel59 = new javax.swing.JLabel();
        pop_tableMarca = new javax.swing.JPopupMenu();
        jm_eliminarm = new javax.swing.JMenuItem();
        jm_modificarma = new javax.swing.JMenuItem();
        pop_tablePedido = new javax.swing.JPopupMenu();
        jm_eliminarp = new javax.swing.JMenuItem();
        jm_modificarp = new javax.swing.JMenuItem();
        pop_tableVenta = new javax.swing.JPopupMenu();
        jm_eliminarv = new javax.swing.JMenuItem();
        jm_modificarv = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jb_almacen = new javax.swing.JButton();
        jb_cigarrillos = new javax.swing.JButton();
        jb_compra = new javax.swing.JButton();
        jb_distribuidor = new javax.swing.JButton();
        jb_estanco = new javax.swing.JButton();
        jb_fabricante = new javax.swing.JButton();
        jb_marca = new javax.swing.JButton();
        jb_pedido = new javax.swing.JButton();
        jb_venta = new javax.swing.JButton();

        jf_almacen.setSize(new Dimension((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()/3), (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2)));

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jt_almacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Fiscal", "Num. Cigarrillos", "Cant. Cigarrillos", "Num. Expendio", "Localidad", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(jt_almacen);
        if (jt_almacen.getColumnModel().getColumnCount() > 0) {
            jt_almacen.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel10.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel10.setText("Eliminar/Listar/Modificar almacén");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel10)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar/Listar/Modificar", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel3.setText("Agregar Almacén");

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel4.setText("ID Fiscal: ");

        jt_idFiscal.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel5.setText("Num. de cigarrillo");

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad de cigarrillos");

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel7.setText("Num. de Expendio");

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel8.setText("Localidad");

        jt_localidad.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel9.setText("Nombre");

        jt_nombre.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N

        jb_agregarAlmacen.setBackground(new java.awt.Color(204, 204, 0));
        jb_agregarAlmacen.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jb_agregarAlmacen.setText("Agregar");
        jb_agregarAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarAlmacenMouseClicked(evt);
            }
        });

        jButton2.setText("jButton2");

        jt_numExpendio.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jt_localidad)
                                .addComponent(jt_numExpendio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(js_numCigarrillo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(js_cantCigarrillo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jt_idFiscal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jb_agregarAlmacen)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jt_idFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(js_numCigarrillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(js_cantCigarrillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jt_numExpendio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jt_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jb_agregarAlmacen)
                .addGap(10, 10, 10)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agregar", jPanel3);

        javax.swing.GroupLayout jf_almacenLayout = new javax.swing.GroupLayout(jf_almacen.getContentPane());
        jf_almacen.getContentPane().setLayout(jf_almacenLayout);
        jf_almacenLayout.setHorizontalGroup(
            jf_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jf_almacenLayout.setVerticalGroup(
            jf_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_almacenLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jt_idFiscal3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jt_idFiscal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_idFiscal3ActionPerformed(evt);
            }
        });

        jm_borrar.setText("Eliminar");
        jm_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jm_borrarMouseClicked(evt);
            }
        });
        jm_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_borrarActionPerformed(evt);
            }
        });
        pop_tableAlmacen.add(jm_borrar);

        jm_modificar.setText("Modificar");
        jm_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_modificarActionPerformed(evt);
            }
        });
        pop_tableAlmacen.add(jm_modificar);

        jf_cigarrillos.setSize(new Dimension((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()/3), (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2)));

        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel11.setText("Agregar Cigarrillo");

        jLabel13.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel13.setText("Num. de cigarrillo");

        jLabel14.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel14.setText("Filtro");

        jLabel15.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel15.setText("Color de Hoja");

        jLabel16.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel16.setText("Nicotina");

        jLabel17.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel17.setText("Marca");

        jt_marca.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jt_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_marcaActionPerformed(evt);
            }
        });

        jb_agregarCigarrillo.setBackground(new java.awt.Color(102, 102, 255));
        jb_agregarCigarrillo.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jb_agregarCigarrillo.setText("Agregar");
        jb_agregarCigarrillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarCigarrilloMouseClicked(evt);
            }
        });

        jButton3.setText("jButton2");

        jc_filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "con filtro", "sin filtro" }));

        jc_color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "negra", "rubia" }));

        jLabel26.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel26.setText("Mentol");

        jc_mentol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "con mentol", "sin mentol" }));

        jLabel27.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel27.setText("Alquitran");

        jLabel61.setText("Precio de Venta");

        jLabel62.setText("Precio de Compra");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jc_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js_numCigarrillo1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js_nicotina, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jb_agregarCigarrillo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc_mentol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js_alquitran, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_preciov)
                            .addComponent(jt_precioc))))
                .addGap(0, 412, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(779, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(js_numCigarrillo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jc_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jc_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(js_nicotina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(js_alquitran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jc_mentol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_preciov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jt_precioc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jb_agregarCigarrillo)
                .addGap(6, 6, 6)
                .addComponent(jButton3)
                .addGap(12, 12, 12))
        );

        jTabbedPane2.addTab("Agregar", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jt_cigarrillo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. Cigarrillo", "Filtro", "Color de Hoja", "Nicotina", "Alquitran", "Marca", "Mentol", "PrecioVenta", "PrecioCompra"
            }
        ));
        jScrollPane2.setViewportView(jt_cigarrillo);

        jLabel12.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel12.setText("Eliminar/Listar/Modificar cigarrillo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Eliminar/Listar/Modificar", jPanel5);

        javax.swing.GroupLayout jf_cigarrillosLayout = new javax.swing.GroupLayout(jf_cigarrillos.getContentPane());
        jf_cigarrillos.getContentPane().setLayout(jf_cigarrillosLayout);
        jf_cigarrillosLayout.setHorizontalGroup(
            jf_cigarrillosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_cigarrillosLayout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addGap(0, 0, 0))
        );
        jf_cigarrillosLayout.setVerticalGroup(
            jf_cigarrillosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jm_modCigarrillo.setText("Modificar");
        jm_modCigarrillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_modCigarrilloActionPerformed(evt);
            }
        });
        pop_tableCigarrillo.add(jm_modCigarrillo);

        jm_deletCigarrillo.setText("Eliminar");
        jm_deletCigarrillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_deletCigarrilloActionPerformed(evt);
            }
        });
        pop_tableCigarrillo.add(jm_deletCigarrillo);

        jf_compra.setSize(new Dimension((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()/3), (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2)));

        jTabbedPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane3MouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel18.setText("Agregar Compra");

        jPanel8.setBackground(new java.awt.Color(255, 153, 102));

        jLabel19.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel19.setText("ID Compra");

        jLabel20.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel20.setText("ID Fiscal");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(js_idcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(js_idfiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(js_idcompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(js_idfiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel21.setText("Num. de cigarrillo");

        jLabel24.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel24.setText("Total num. de cigarrillo");

        jLabel25.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel25.setText("Día");

        jb_agregarcompra.setBackground(new java.awt.Color(102, 102, 255));
        jb_agregarcompra.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jb_agregarcompra.setText("Agregar");
        jb_agregarcompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarcompraMouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel28.setText("Mes");

        jLabel29.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel29.setText("Año");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel18))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(js_mesc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addGap(148, 148, 148)
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(js_diac, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel28)
                                    .addGap(47, 47, 47)))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel29)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(js_yearc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGap(88, 88, 88)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel21)
                                .addComponent(jLabel24))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(js_numCigarrillo2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(js_totalnum, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGap(224, 224, 224)
                            .addComponent(jb_agregarcompra))))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(js_numCigarrillo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(js_totalnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(js_diac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(js_mesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(js_yearc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_agregarcompra)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Agregar", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jt_compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDCompra", "IDFiscal", "NumCigarrillo", "TotalNumCigarrillo", "Día", "Mes", "Año"
            }
        ));
        jScrollPane3.setViewportView(jt_compras);

        jLabel22.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel22.setText("Eliminar/Listar/Modificar Compra");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel22)
                .addContainerGap(205, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Eliminar/Modificar/Listar", jPanel7);

        javax.swing.GroupLayout jf_compraLayout = new javax.swing.GroupLayout(jf_compra.getContentPane());
        jf_compra.getContentPane().setLayout(jf_compraLayout);
        jf_compraLayout.setHorizontalGroup(
            jf_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jf_compraLayout.setVerticalGroup(
            jf_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jf_estanco.setSize(new Dimension((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()/3), (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2)));

        jTabbedPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane5MouseClicked(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel33.setText("ID Fiscal: ");

        jLabel34.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel34.setText("Num. de Expendio");

        jLabel35.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel35.setText("Localidad");

        jt_localidade.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N

        jt_nombree.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N

        jLabel36.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel36.setText("Nombre");

        jb_agregarEstanco.setBackground(new java.awt.Color(204, 204, 0));
        jb_agregarEstanco.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jb_agregarEstanco.setText("Agregar");
        jb_agregarEstanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarEstancoMouseClicked(evt);
            }
        });

        jButton4.setText("jButton2");

        jLabel37.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel37.setText("Agregar Estanco");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel37))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(js_idfiscale, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js_expendio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_localidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_nombree, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_agregarEstanco))))
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(400, 400, 400)
                    .addComponent(jButton4)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(js_idfiscale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(js_expendio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jt_localidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jt_nombree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jb_agregarEstanco)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap(399, Short.MAX_VALUE)
                    .addComponent(jButton4)
                    .addContainerGap()))
        );

        jTabbedPane5.addTab("Agregar", jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel38.setText("Eliminar/Listar/Modificar Estanco");

        jt_estanco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Fiscal", "Num. Expendio", "Localidad", "Nombre"
            }
        ));
        jScrollPane5.setViewportView(jt_estanco);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel38))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Eliminar/Listar/Modificar", jPanel12);

        javax.swing.GroupLayout jf_estancoLayout = new javax.swing.GroupLayout(jf_estanco.getContentPane());
        jf_estanco.getContentPane().setLayout(jf_estancoLayout);
        jf_estancoLayout.setHorizontalGroup(
            jf_estancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );
        jf_estancoLayout.setVerticalGroup(
            jf_estancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );

        pop_modificarc.setText("Modificar");
        pop_modificarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pop_modificarcActionPerformed(evt);
            }
        });
        pop_tableCompra.add(pop_modificarc);

        pop_eliminarc.setText("Eliminar");
        pop_eliminarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pop_eliminarcActionPerformed(evt);
            }
        });
        pop_tableCompra.add(pop_eliminarc);

        jf_distribuidores.setSize(new Dimension((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()/3), (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2)));

        jTabbedPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane4MouseClicked(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel23.setText("Agregar Distribuidor");

        jLabel30.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel30.setText("Num. de cigarrillo");

        jLabel31.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel31.setText("ID Compra");

        jb_agregardistribuidor.setBackground(new java.awt.Color(102, 102, 255));
        jb_agregardistribuidor.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jb_agregardistribuidor.setText("Agregar");
        jb_agregardistribuidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregardistribuidorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel23))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(js_numCigarrillod, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel31)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(js_idcomprad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jb_agregardistribuidor)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(38, 38, 38)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(js_numCigarrillod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(js_idcomprad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(34, 34, 34)
                .addComponent(jb_agregardistribuidor)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Agregar", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel32.setText("Eliminar/Listar/Modificar Distribuidor");

        jt_distribuidor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDCompra", "Num. de Cigarrillo"
            }
        ));
        jScrollPane4.setViewportView(jt_distribuidor);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel32))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Eliminar/Listar/Modificar", jPanel10);

        javax.swing.GroupLayout jf_distribuidoresLayout = new javax.swing.GroupLayout(jf_distribuidores.getContentPane());
        jf_distribuidores.getContentPane().setLayout(jf_distribuidoresLayout);
        jf_distribuidoresLayout.setHorizontalGroup(
            jf_distribuidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        jf_distribuidoresLayout.setVerticalGroup(
            jf_distribuidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jm_eliminard.setText("Eliminar");
        jm_eliminard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_eliminardActionPerformed(evt);
            }
        });
        pop_tableDistribuidor.add(jm_eliminard);

        jm_modificarm.setText("Modificar");
        jm_modificarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_modificarmActionPerformed(evt);
            }
        });
        pop_tableDistribuidor.add(jm_modificarm);

        jm_eliminare.setText("Eliminar");
        jm_eliminare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_eliminareActionPerformed(evt);
            }
        });
        pop_tableEstanco.add(jm_eliminare);

        jm_modificare.setText("Modificar");
        jm_modificare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_modificareActionPerformed(evt);
            }
        });
        pop_tableEstanco.add(jm_modificare);

        jf_fabricantes.setSize(new Dimension((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()/3), (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2)));

        jTabbedPane6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane6MouseClicked(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel39.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel39.setText("Agregar Fabricante");

        jLabel40.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel40.setText("ID Fabricante");

        jLabel41.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel41.setText("Sede");

        jt_sede.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N

        jt_nombref.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N

        jLabel42.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel42.setText("Nombre");

        jb_agregarfabricante.setBackground(new java.awt.Color(204, 204, 0));
        jb_agregarfabricante.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jb_agregarfabricante.setText("Agregar");
        jb_agregarfabricante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarfabricanteMouseClicked(evt);
            }
        });

        jButton5.setText("jButton2");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel39))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jb_agregarfabricante)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(js_idfabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_sede, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_nombref, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addContainerGap())))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addGap(16, 16, 16)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(js_idfabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_nombref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addComponent(jb_agregarfabricante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(49, 49, 49))
        );

        jTabbedPane6.addTab("Agregar", jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel43.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel43.setText("Eliminar/Listar/Modificar Fabricante");

        jt_fabricante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Fabricante", "Sede", "Nombre"
            }
        ));
        jScrollPane6.setViewportView(jt_fabricante);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel43))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Eliminar/Listar/Modificar", jPanel14);

        javax.swing.GroupLayout jf_fabricantesLayout = new javax.swing.GroupLayout(jf_fabricantes.getContentPane());
        jf_fabricantes.getContentPane().setLayout(jf_fabricantesLayout);
        jf_fabricantesLayout.setHorizontalGroup(
            jf_fabricantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );
        jf_fabricantesLayout.setVerticalGroup(
            jf_fabricantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );

        jm_eliminarf.setText("Eliminar");
        jm_eliminarf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_eliminarfActionPerformed(evt);
            }
        });
        pop_tableFabricante.add(jm_eliminarf);

        jm_modificarf.setText("Modificar");
        jm_modificarf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_modificarfActionPerformed(evt);
            }
        });
        pop_tableFabricante.add(jm_modificarf);

        jTabbedPane7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane7MouseClicked(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel44.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel44.setText("Agregar Marca");

        jLabel45.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel45.setText("ID Fabricante");

        jt_nombrem.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N

        jLabel46.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel46.setText("Nombre");

        jb_agregarMarca.setBackground(new java.awt.Color(204, 204, 0));
        jb_agregarMarca.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jb_agregarMarca.setText("Agregar");
        jb_agregarMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarMarcaMouseClicked(evt);
            }
        });
        jb_agregarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarMarcaActionPerformed(evt);
            }
        });

        jButton6.setText("jButton2");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel44))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel45))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(js_idfabricantem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jt_nombrem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jb_agregarMarca)))))
                        .addGap(0, 128, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(js_idfabricantem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jt_nombrem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jb_agregarMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(25, 25, 25))
        );

        jTabbedPane7.addTab("Agregar", jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel47.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel47.setText("Eliminar/Listar/Modificar Marca");

        jt_marcaa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Fabricante", "Nombre"
            }
        ));
        jScrollPane7.setViewportView(jt_marcaa);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel47)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Eliminar/Listar/Modificar", jPanel16);

        javax.swing.GroupLayout jf_marcaLayout = new javax.swing.GroupLayout(jf_marca.getContentPane());
        jf_marca.getContentPane().setLayout(jf_marcaLayout);
        jf_marcaLayout.setHorizontalGroup(
            jf_marcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane7)
        );
        jf_marcaLayout.setVerticalGroup(
            jf_marcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane7)
        );

        jTabbedPane8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane8MouseClicked(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel48.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel48.setText("ID Fiscal");

        jLabel49.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel49.setText("ID Compra");

        jb_agregarpedido.setBackground(new java.awt.Color(102, 102, 255));
        jb_agregarpedido.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jb_agregarpedido.setText("Agregar");
        jb_agregarpedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarpedidoMouseClicked(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel50.setText("Agregar Pedido");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel48)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(js_idfiscalp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel49)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(js_idcomprap, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jb_agregarpedido))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel50)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addGap(38, 38, 38)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(js_idfiscalp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(js_idcomprap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addGap(34, 34, 34)
                .addComponent(jb_agregarpedido)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Agregar", jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel51.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel51.setText("Eliminar/Listar/Modificar Pedido");

        jt_pedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Fiscal", "ID Compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jt_pedido);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel51))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane8.addTab("Eliminar/Listar/Modificar", jPanel18);

        javax.swing.GroupLayout jf_pedidoLayout = new javax.swing.GroupLayout(jf_pedido.getContentPane());
        jf_pedido.getContentPane().setLayout(jf_pedidoLayout);
        jf_pedidoLayout.setHorizontalGroup(
            jf_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane8)
        );
        jf_pedidoLayout.setVerticalGroup(
            jf_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane8)
        );

        jTabbedPane9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane9MouseClicked(evt);
            }
        });

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel52.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel52.setText("Agregar Venta");

        jLabel53.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel53.setText("Total num. de cigarrillo");

        jLabel54.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel54.setText("Num. de cigarrillo");

        jLabel55.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel55.setText("Día");

        jLabel56.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel56.setText("Mes");

        jb_agregarventa.setBackground(new java.awt.Color(102, 102, 255));
        jb_agregarventa.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jb_agregarventa.setText("Agregar");
        jb_agregarventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarventaMouseClicked(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(255, 153, 102));

        jLabel57.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel57.setText("ID Venta");

        jLabel58.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel58.setText("ID Fiscal");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel58)
                    .addComponent(jLabel57))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(js_idventa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(js_idfiscalv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(js_idventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(js_idfiscalv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel60.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel60.setText("Año");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel53))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(js_numCigarrillov, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js_totalnumv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(jb_agregarventa))
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(js_mesv, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                                    .addComponent(jLabel55)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(js_diav, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel56)
                                    .addGap(47, 47, 47)))
                            .addGap(26, 26, 26)
                            .addComponent(jLabel60)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(js_yearv, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jLabel52)
                    .addContainerGap(124, Short.MAX_VALUE)))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(js_numCigarrillov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(js_totalnumv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(js_diav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(js_mesv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(js_yearv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addGap(18, 18, 18)
                .addComponent(jb_agregarventa)
                .addGap(137, 137, 137))
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel52)
                    .addContainerGap(432, Short.MAX_VALUE)))
        );

        jTabbedPane9.addTab("Agregar", jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jt_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDVenta", "IDFiscal", "NumCigarrillo", "TotalNumCigarrillo", "Día", "Mes", "Año"
            }
        ));
        jScrollPane9.setViewportView(jt_venta);

        jLabel59.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel59.setText("Eliminar/Listar/Modificar Venta");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel59)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel59)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );

        jTabbedPane9.addTab("Eliminar/Listar/Modificar", jPanel20);

        javax.swing.GroupLayout jf_ventaLayout = new javax.swing.GroupLayout(jf_venta.getContentPane());
        jf_venta.getContentPane().setLayout(jf_ventaLayout);
        jf_ventaLayout.setHorizontalGroup(
            jf_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jf_ventaLayout.setVerticalGroup(
            jf_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane9)
        );

        jm_eliminarm.setText("Eliminar");
        jm_eliminarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_eliminarmActionPerformed(evt);
            }
        });
        pop_tableMarca.add(jm_eliminarm);

        jm_modificarma.setText("Modificar");
        jm_modificarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_modificarmaActionPerformed(evt);
            }
        });
        pop_tableMarca.add(jm_modificarma);

        jm_eliminarp.setText("Eliminar");
        jm_eliminarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_eliminarpActionPerformed(evt);
            }
        });
        pop_tablePedido.add(jm_eliminarp);

        jm_modificarp.setText("Modificar");
        jm_modificarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_modificarpActionPerformed(evt);
            }
        });
        pop_tablePedido.add(jm_modificarp);

        jm_eliminarv.setText("Eliminar");
        pop_tableVenta.add(jm_eliminarv);

        jm_modificarv.setText("Modificar");
        jm_modificarv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_modificarvActionPerformed(evt);
            }
        });
        pop_tableVenta.add(jm_modificarv);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO-VENTA DE CIGARRILLOS");
        setBackground(new java.awt.Color(153, 0, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Papyrus", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Venta de Cigarrillos");

        jLabel2.setFont(new java.awt.Font("Papyrus", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione el menú al que desea ingresar:");

        jb_almacen.setBackground(new java.awt.Color(0, 102, 102));
        jb_almacen.setForeground(new java.awt.Color(255, 255, 255));
        jb_almacen.setText("Almacen");
        jb_almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_almacenMouseClicked(evt);
            }
        });

        jb_cigarrillos.setBackground(new java.awt.Color(0, 102, 102));
        jb_cigarrillos.setForeground(new java.awt.Color(255, 255, 255));
        jb_cigarrillos.setText("Cigarrillos");
        jb_cigarrillos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cigarrillosMouseClicked(evt);
            }
        });

        jb_compra.setBackground(new java.awt.Color(0, 102, 102));
        jb_compra.setForeground(new java.awt.Color(255, 255, 255));
        jb_compra.setText("Compra");
        jb_compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_compraMouseClicked(evt);
            }
        });

        jb_distribuidor.setBackground(new java.awt.Color(0, 102, 102));
        jb_distribuidor.setForeground(new java.awt.Color(255, 255, 255));
        jb_distribuidor.setText("Distribuidores");
        jb_distribuidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_distribuidorMouseClicked(evt);
            }
        });

        jb_estanco.setBackground(new java.awt.Color(0, 102, 102));
        jb_estanco.setForeground(new java.awt.Color(255, 255, 255));
        jb_estanco.setText("Estancos");
        jb_estanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_estancoMouseClicked(evt);
            }
        });
        jb_estanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_estancoActionPerformed(evt);
            }
        });

        jb_fabricante.setBackground(new java.awt.Color(0, 102, 102));
        jb_fabricante.setForeground(new java.awt.Color(255, 255, 255));
        jb_fabricante.setText("Fabricantes");
        jb_fabricante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_fabricanteMouseClicked(evt);
            }
        });
        jb_fabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_fabricanteActionPerformed(evt);
            }
        });

        jb_marca.setBackground(new java.awt.Color(0, 102, 102));
        jb_marca.setForeground(new java.awt.Color(255, 255, 255));
        jb_marca.setText("Marcas");
        jb_marca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_marcaMouseClicked(evt);
            }
        });

        jb_pedido.setBackground(new java.awt.Color(0, 102, 102));
        jb_pedido.setForeground(new java.awt.Color(255, 255, 255));
        jb_pedido.setText("Pedidos");
        jb_pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_pedidoMouseClicked(evt);
            }
        });

        jb_venta.setBackground(new java.awt.Color(0, 102, 102));
        jb_venta.setForeground(new java.awt.Color(255, 255, 255));
        jb_venta.setText("Ventas");
        jb_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ventaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jb_compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jb_cigarrillos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jb_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jb_distribuidor)
                                    .addComponent(jb_estanco, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_distribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jb_marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jb_almacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cigarrillos)
                    .addComponent(jb_estanco)
                    .addComponent(jb_pedido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_compra)
                    .addComponent(jb_fabricante)
                    .addComponent(jb_venta))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_fabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_fabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_fabricanteActionPerformed

    private void jb_estancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_estancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_estancoActionPerformed

    private void jb_almacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_almacenMouseClicked
        //ABRIR MENÚ DEL ALMACÉN
        jf_almacen.setLocationRelativeTo(this);
        jf_almacen.setVisible(true);
    }//GEN-LAST:event_jb_almacenMouseClicked

    private void jt_idFiscal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_idFiscal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_idFiscal3ActionPerformed

    private void jb_agregarAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarAlmacenMouseClicked
        // AGREGAR ALMACÉN
        int idFiscal = 0, numCigarrillo, cantCigarrillo, numExpendio = 0;
        String nombre, localidad;
        Almacen a;

        idFiscal = Integer.parseInt(jt_idFiscal.getText());
        numCigarrillo = (Integer) js_numCigarrillo.getValue();
        cantCigarrillo = (Integer) js_cantCigarrillo.getValue();
        numExpendio = Integer.parseInt(jt_numExpendio.getText());
        nombre = jt_nombre.getText();
        localidad = jt_localidad.getText();

        if (idFiscal == 0 || numExpendio == 0 || nombre.equals("") || localidad.equals("")) {

            JOptionPane.showMessageDialog(this, "Hay campos vacios, por favor ingrese la información necesaria");
        } else {
            a = new Almacen(idFiscal, numCigarrillo, cantCigarrillo, numExpendio, localidad, nombre);
            almacen.add(a);
            JOptionPane.showMessageDialog(jf_almacen, "Almacén agregado!");

        }

        jt_idFiscal.setText("");
        jt_numExpendio.setText("");
        js_numCigarrillo.setValue(0);
        js_cantCigarrillo.setValue(0);
        jt_nombre.setText("");
        jt_localidad.setText("");
    }//GEN-LAST:event_jb_agregarAlmacenMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        //LISTAR EN TABLA ALMACÉN

        DefaultTableModel model = (DefaultTableModel) jt_almacen.getModel();

        int rows = model.getRowCount();

        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (int i = 0; i < almacen.size(); i++) {
            Object[] newRow = new Object[]{almacen.get(i).getIdFiscal(), almacen.get(i).getNumCigarrillo(), almacen.get(i).getCantCigarrillo(), almacen.get(i).getNumExpendio(), almacen.get(i).getLocalidad(), almacen.get(i).getNombre()};
            model.addRow(newRow);
            jt_almacen.setModel(model);
        }


    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jm_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jm_borrarMouseClicked


    }//GEN-LAST:event_jm_borrarMouseClicked

    private void jm_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_borrarActionPerformed
        //BORRAR UN ALMACÉN

        DefaultTableModel model = (DefaultTableModel) jt_almacen.getModel();
        if (jt_almacen.getSelectedRow() >= 0) {
            almacen.remove(jt_almacen.getSelectedRow());
            model.removeRow(jt_almacen.getSelectedRow());

            jt_almacen.updateUI();
            JOptionPane.showMessageDialog(jf_almacen, "¡Almacén eliminado exitosamente!");

        } else {
            JOptionPane.showMessageDialog(this, "¡Seleccione un almacén primero!");
        }
    }//GEN-LAST:event_jm_borrarActionPerformed

    private void jm_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_modificarActionPerformed
        // MODIFICAR UN ALMACÉN

        int idFiscal = 0, numCigarrillo, cantCigarrillo, numExpendio = 0;
        String nombre, localidad;
        Almacen a;
        DefaultTableModel model = (DefaultTableModel) jt_almacen.getModel();
        if (jt_almacen.getSelectedRow() >= 0) {
            nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del almacén: ");
            idFiscal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID Fiscal: "));
            numCigarrillo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cigarrillo: "));
            cantCigarrillo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cigarrillos: "));
            numExpendio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de expendio : "));
            localidad = JOptionPane.showInputDialog("Ingrese la localidad del almacén: ");

            almacen.get(jt_almacen.getSelectedRow()).setNombre((nombre));
            almacen.get(jt_almacen.getSelectedRow()).setIdFiscal(idFiscal);
            almacen.get(jt_almacen.getSelectedRow()).setNumCigarrillo(numCigarrillo);
            almacen.get(jt_almacen.getSelectedRow()).setCantCigarrillo(cantCigarrillo);
            almacen.get(jt_almacen.getSelectedRow()).setNumExpendio(numExpendio);
            almacen.get(jt_almacen.getSelectedRow()).setLocalidad(localidad);

            model.setValueAt(idFiscal, jt_almacen.getSelectedRow(), 0);
            model.setValueAt(numCigarrillo, jt_almacen.getSelectedRow(), 1);
            model.setValueAt(cantCigarrillo, jt_almacen.getSelectedRow(), 2);
            model.setValueAt(numExpendio, jt_almacen.getSelectedRow(), 3);
            model.setValueAt(localidad, jt_almacen.getSelectedRow(), 4);
            model.setValueAt(nombre, jt_almacen.getSelectedRow(), 5);

            JOptionPane.showMessageDialog(jf_almacen, "¡Campo modificado exitosamente!");

        } else {
            JOptionPane.showMessageDialog(jf_almacen, "¡Seleccione un almacén primero!");
        }
    }//GEN-LAST:event_jm_modificarActionPerformed

    private void jb_agregarCigarrilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarCigarrilloMouseClicked
        //AGREGAR CIGARRILLO

        int numCigarrillo, nicotina, alquitran;
        char filtro, mentol;
        float precio_v, precio_c;
        String colorHoja, marca;
        Cigarrillo c;

        marca = jt_marca.getText();
        if (jc_filtro.getSelectedIndex() == 0) {
            filtro = 'v';
        } else {
            filtro = 'f';
        }

        if (jc_color.getSelectedIndex() == 0) {
            colorHoja = "negra";
        } else {
            colorHoja = "rubia";
        }

        if (jc_mentol.getSelectedIndex() == 0) {
            mentol = 'v';
        } else {
            mentol = 'f';
        }

        if (marca.equals("")) {

            JOptionPane.showMessageDialog(jf_cigarrillos, "Hay campos vacios, por favor ingrese la información necesaria");
        } else {
            try {
                numCigarrillo = (Integer) js_numCigarrillo1.getValue();
                nicotina = (Integer) js_nicotina.getValue();
                alquitran = (Integer) js_alquitran.getValue();
                precio_v = Float.parseFloat(jt_preciov.getText());
                precio_c = Float.parseFloat(jt_precioc.getText());
                c = new Cigarrillo(numCigarrillo, filtro, colorHoja, alquitran, nicotina, marca, "", mentol, precio_v, precio_c);
                cigarrillo.add(c);
                JOptionPane.showMessageDialog(jf_cigarrillos, "Cigarrillo agregado!");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(jf_cigarrillos, "¡Ha ingresado un valor invalido");
            }

        }

        jt_marca.setText("");
        js_numCigarrillo1.setValue(0);
        js_alquitran.setValue(0);
        js_nicotina.setValue(0);
        jt_preciov.setText("");
        jt_precioc.setText("");


    }//GEN-LAST:event_jb_agregarCigarrilloMouseClicked

    private void jt_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_marcaActionPerformed

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        //LISTAR EN TABLA CIGARRILLOS

        DefaultTableModel model = (DefaultTableModel) jt_cigarrillo.getModel();

        int rows = model.getRowCount();

        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (int i = 0; i < cigarrillo.size(); i++) {
            Object[] newRow = new Object[]{cigarrillo.get(i).getNumCigarrillo(), cigarrillo.get(i).getFiltro(), cigarrillo.get(i).getColorHoja(), cigarrillo.get(i).getNicotina(), cigarrillo.get(i).getAlquitran(), cigarrillo.get(i).getMarca(), cigarrillo.get(i).getMentol(), cigarrillo.get(i).getPrecio_v(), cigarrillo.get(i).getPrecio_c()};
            model.addRow(newRow);
            jt_cigarrillo.setModel(model);
        }


    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void jm_deletCigarrilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_deletCigarrilloActionPerformed
        //BORRAR UN CIGARRILLO

        DefaultTableModel model = (DefaultTableModel) jt_cigarrillo.getModel();
        if (jt_cigarrillo.getSelectedRow() >= 0) {
            cigarrillo.remove(jt_cigarrillo.getSelectedRow());
            model.removeRow(jt_cigarrillo.getSelectedRow());

            jt_cigarrillo.updateUI();
            JOptionPane.showMessageDialog(jf_cigarrillos, "¡Cigarrillo eliminado exitosamente!");

        } else {
            JOptionPane.showMessageDialog(jf_cigarrillos, "¡Seleccione un cigarrillo primero!");
        }

    }//GEN-LAST:event_jm_deletCigarrilloActionPerformed

    private void jm_modCigarrilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_modCigarrilloActionPerformed
        // MODIFICAR UN CIGARRILLO

        int numCigarrillo = 0, nicotina = 0, alquitran = 0;
        String opc;
        char filtro, mentol;
        float precio_v = 0, precio_c = 0;
        boolean a; //Para saber si los datos fueron correctos o no
        String colorHoja, marca;

        DefaultTableModel model = (DefaultTableModel) jt_cigarrillo.getModel();
        if (jt_cigarrillo.getSelectedRow() >= 0) {

            opc = JOptionPane.showInputDialog("Ingrese \n1.Si tiene filtro \n2.Si no tiene filtro: ");

            if (opc == "1") {
                filtro = 'v';
            } else {
                filtro = 'f';
            }
            opc = JOptionPane.showInputDialog("Ingrese color de hoja \n1.Negra \n2.Rubia: ");

            if (opc == "1") {
                colorHoja = "negra";
            } else {
                colorHoja = "rubia";
            }
            opc = JOptionPane.showInputDialog("Ingrese \n1.Si tiene mentol \n2.No tiene mentol ");
            if (opc == "1") {
                mentol = 'v';
            } else {
                mentol = 'f';
            }

            marca = JOptionPane.showInputDialog("Ingrese la marca: ");

            try {
                numCigarrillo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del cigarrillo: "));
                nicotina = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de nicotina: "));
                alquitran = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alquitran: "));
                precio_v = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de VENTA: "));
                precio_c = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de COMPRA: "));
                a = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(jf_cigarrillos, "¡Ha ingresado un valor invalido");
                a = false;
            }

            if (a == true) {
                cigarrillo.get(jt_cigarrillo.getSelectedRow()).setNumCigarrillo(numCigarrillo);
                cigarrillo.get(jt_cigarrillo.getSelectedRow()).setNicotina(nicotina);
                cigarrillo.get(jt_cigarrillo.getSelectedRow()).setAlquitran(alquitran);
                cigarrillo.get(jt_cigarrillo.getSelectedRow()).setMentol(mentol);
                cigarrillo.get(jt_cigarrillo.getSelectedRow()).setColorHoja(colorHoja);
                cigarrillo.get(jt_cigarrillo.getSelectedRow()).setFiltro(filtro);
                cigarrillo.get(jt_cigarrillo.getSelectedRow()).setMarca(marca);
                cigarrillo.get(jt_cigarrillo.getSelectedRow()).setPrecio_v(precio_v);
                cigarrillo.get(jt_cigarrillo.getSelectedRow()).setPrecio_c(precio_c);
                JOptionPane.showMessageDialog(jf_cigarrillos, "¡Campo modificado exitosamente, para ver tus cambios refresca la tabla!");
            } else {
                JOptionPane.showMessageDialog(jf_cigarrillos, "¡El campo no ha sido modificado!");
            }

        } else {
            JOptionPane.showMessageDialog(jf_cigarrillos, "¡Seleccione un cigarrillo primero!");
        }
    }//GEN-LAST:event_jm_modCigarrilloActionPerformed

    private void jb_cigarrillosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cigarrillosMouseClicked
        // MOSTRAR MENÚ CIGARRILLOS
        jf_cigarrillos.setLocationRelativeTo(this);
        jf_cigarrillos.setVisible(true);
    }//GEN-LAST:event_jb_cigarrillosMouseClicked

    private void jb_agregarcompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarcompraMouseClicked
        // AGREGAR COMPRAS

        int idCompra, idFiscal, numCigarrillo, totalNumCigarrillo, dia, mes, year;

        Compra c;

        numCigarrillo = (Integer) js_numCigarrillo2.getValue();
        idFiscal = (Integer) js_idfiscal.getValue();
        idCompra = (Integer) js_idcompra.getValue();
        totalNumCigarrillo = (Integer) js_totalnum.getValue();
        dia = (Integer) js_diac.getValue();
        mes = (Integer) js_mesc.getValue();
        year = (Integer) js_yearc.getValue();

        c = new Compra(idCompra, idFiscal, numCigarrillo, totalNumCigarrillo, dia, mes, year);
        compra.add(c);

        js_numCigarrillo2.setValue(0);
        js_idfiscal.setValue(0);
        js_idcompra.setValue(0);
        js_diac.setValue(1);
        js_mesc.setValue(1);
        js_yearc.setValue(2018);
        js_totalnum.setValue(0);
        JOptionPane.showMessageDialog(jf_compra, "¡Compra agregada exitosamente!");
    }//GEN-LAST:event_jb_agregarcompraMouseClicked

    private void jTabbedPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane3MouseClicked
        // LISTAR COMPRAS

        DefaultTableModel model = (DefaultTableModel) jt_compras.getModel();

        int rows = model.getRowCount();

        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (int i = 0; i < compra.size(); i++) {
            Object[] newRow = new Object[]{compra.get(i).getIdCompra(), compra.get(i).getIdFiscal(), compra.get(i).getNumCigarrillo(), compra.get(i).getTotalNumCigarrillo(), compra.get(i).getDiaCompra(), compra.get(i).getMesCompra(), compra.get(i).getMesCompra()};
            model.addRow(newRow);
            jt_compras.setModel(model);
        }
    }//GEN-LAST:event_jTabbedPane3MouseClicked

    private void pop_eliminarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pop_eliminarcActionPerformed
        // ELIMINAR COMPRA

        DefaultTableModel model = (DefaultTableModel) jt_compras.getModel();
        if (jt_compras.getSelectedRow() >= 0) {
            compra.remove(jt_compras.getSelectedRow());
            model.removeRow(jt_compras.getSelectedRow());

            jt_compras.updateUI();
            JOptionPane.showMessageDialog(jf_cigarrillos, "¡Compra eliminada exitosamente!");

        } else {
            JOptionPane.showMessageDialog(jf_cigarrillos, "¡Seleccione una compra primero!");
        }
    }//GEN-LAST:event_pop_eliminarcActionPerformed

    private void pop_modificarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pop_modificarcActionPerformed
        // MODIFICAR COMPRA

        int idCompra = 0, idFiscal = 0, numCigarrillo = 0, totalNumCigarrillo = 0, dia = 0, mes = 0, year = 0;
        boolean a;

        if (jt_compras.getSelectedRow() >= 0) {

            try {
                idCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la compra: "));
                idFiscal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID fiscal: "));
                numCigarrillo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cigarrillo: "));
                totalNumCigarrillo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de cigarrillos de su compra: "));
                dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de la compra: "));
                mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de compra: "));
                year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la compra: "));
                a = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(jf_cigarrillos, "¡Ha ingresado un valor invalido");
                a = false;
            }

            if (a == true) {
                compra.get(jt_compras.getSelectedRow()).setIdCompra(idCompra);
                compra.get(jt_compras.getSelectedRow()).setIdFiscal(idFiscal);
                compra.get(jt_compras.getSelectedRow()).setNumCigarrillo(numCigarrillo);
                compra.get(jt_compras.getSelectedRow()).setDiaCompra(dia);
                compra.get(jt_compras.getSelectedRow()).setMesCompra(mes);
                compra.get(jt_compras.getSelectedRow()).setAñoCompra(year);
                compra.get(jt_compras.getSelectedRow()).setTotalNumCigarrillo(totalNumCigarrillo);

                JOptionPane.showMessageDialog(jf_compra, "¡Campo modificado exitosamente, para ver tus cambios refresca la tabla!");
            } else {
                JOptionPane.showMessageDialog(jf_compra, "¡El campo no ha sido modificado!");
            }

        } else {
            JOptionPane.showMessageDialog(jf_compra, "¡Seleccione una compra primero!");
        }
    }//GEN-LAST:event_pop_modificarcActionPerformed

    private void jb_compraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_compraMouseClicked
        // ABRIR MENÚ COMPRAS

        jf_compra.setLocationRelativeTo(this);
        jf_compra.setVisible(true);
    }//GEN-LAST:event_jb_compraMouseClicked

    private void jb_agregardistribuidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregardistribuidorMouseClicked
        // AGREGAR DISTRIBUIDOR

        int idCompra, numCigarrillo;
        Distribuidor d;

        numCigarrillo = (Integer) js_numCigarrillod.getValue();
        idCompra = (Integer) js_idcomprad.getValue();
        d = new Distribuidor(idCompra, numCigarrillo);
        distribuidor.add(d);

        js_numCigarrillod.setValue(0);
        js_idcomprad.setValue(0);
        JOptionPane.showMessageDialog(jf_distribuidores, "¡Distribuidor agregado exitosamente!");

    }//GEN-LAST:event_jb_agregardistribuidorMouseClicked

    private void jTabbedPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane4MouseClicked
        // LISTAR DISTRIBUIDORES

        DefaultTableModel model = (DefaultTableModel) jt_distribuidor.getModel();

        int rows = model.getRowCount();

        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (int i = 0; i < distribuidor.size(); i++) {
            Object[] newRow = new Object[]{distribuidor.get(i).getIdCompra(), distribuidor.get(i).getNumCigarrillo()};
            model.addRow(newRow);
            jt_distribuidor.setModel(model);
        }
    }//GEN-LAST:event_jTabbedPane4MouseClicked

    private void jm_eliminardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_eliminardActionPerformed
        // ELIMINAR DISTRIBUIDORES
        DefaultTableModel model = (DefaultTableModel) jt_distribuidor.getModel();
        if (jt_distribuidor.getSelectedRow() >= 0) {
            distribuidor.remove(jt_distribuidor.getSelectedRow());
            model.removeRow(jt_distribuidor.getSelectedRow());

            jt_distribuidor.updateUI();
            JOptionPane.showMessageDialog(jf_distribuidores, "¡Distribuidor eliminado exitosamente!");

        } else {
            JOptionPane.showMessageDialog(jf_cigarrillos, "¡Seleccione un distribuidor primero!");
        }
    }//GEN-LAST:event_jm_eliminardActionPerformed

    private void jm_modificarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_modificarmActionPerformed
        // MODIFICAR DISTRIBUIDORES

        int idCompra = 0, numCigarrillo = 0;
        boolean a;

        if (jt_distribuidor.getSelectedRow() >= 0) {

            try {
                idCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la compra: "));
                numCigarrillo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cigarrillo: "));
                a = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(jf_cigarrillos, "¡Ha ingresado un valor invalido");
                a = false;
            }

            if (a == true) {
                distribuidor.get(jt_distribuidor.getSelectedRow()).setIdCompra(idCompra);
                distribuidor.get(jt_distribuidor.getSelectedRow()).setNumCigarrillo(numCigarrillo);

                JOptionPane.showMessageDialog(jf_distribuidores, "¡Campo modificado exitosamente, para ver tus cambios refresca la tabla!");
            } else {
                JOptionPane.showMessageDialog(jf_distribuidores, "¡El campo no ha sido modificado!");
            }

        } else {
            JOptionPane.showMessageDialog(jf_distribuidores, "¡Seleccione un distribuidor primero!");
        }
    }//GEN-LAST:event_jm_modificarmActionPerformed

    private void jb_distribuidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_distribuidorMouseClicked
        // MOSTRAR MENÚ DISTRIBUIDORES
        jf_distribuidores.setLocationRelativeTo(this);
        jf_distribuidores.setVisible(true);
    }//GEN-LAST:event_jb_distribuidorMouseClicked

    private void jb_agregarEstancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarEstancoMouseClicked
        // AGREGAR ESTANCO

        int idFiscal, numExpendio;
        String localidad, nombre;
        Estanco e;

        idFiscal = (Integer) js_idfiscale.getValue();
        numExpendio = (Integer) js_expendio.getValue();
        localidad = jt_localidade.getText();
        nombre = jt_nombree.getText();
        e = new Estanco(idFiscal, numExpendio, localidad, nombre);
        estanco.add(e);

        js_idfiscale.setValue(0);
        js_expendio.setValue(0);
        jt_localidad.setText("");
        jt_nombree.setText("");
        JOptionPane.showMessageDialog(jf_estanco, "¡Estanco agregado exitosamente!");
    }//GEN-LAST:event_jb_agregarEstancoMouseClicked

    private void jTabbedPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane5MouseClicked
        // Listar Estanco
        DefaultTableModel model = (DefaultTableModel) jt_estanco.getModel();

        int rows = model.getRowCount();

        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (int i = 0; i < estanco.size(); i++) {
            Object[] newRow = new Object[]{estanco.get(i).getIdFiscal(), estanco.get(i).getNumExpendio(), estanco.get(i).getLocalidad(), estanco.get(i).getNombre()};
            model.addRow(newRow);
            jt_estanco.setModel(model);
        }
    }//GEN-LAST:event_jTabbedPane5MouseClicked

    private void jm_eliminareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_eliminareActionPerformed
        // ELIMINAR ESTANCO

        DefaultTableModel model = (DefaultTableModel) jt_estanco.getModel();
        if (jt_estanco.getSelectedRow() >= 0) {
            estanco.remove(jt_estanco.getSelectedRow());
            model.removeRow(jt_estanco.getSelectedRow());

            jt_estanco.updateUI();
            JOptionPane.showMessageDialog(jf_estanco, "¡Estanco eliminado exitosamente!");

        } else {
            JOptionPane.showMessageDialog(jf_estanco, "¡Seleccione un estanco primero!");
        }
    }//GEN-LAST:event_jm_eliminareActionPerformed

    private void jm_modificareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_modificareActionPerformed
        // MODIFICAR ESTANCO

        int idFiscal = 0, numExpendio = 0;
        String localidad, nombre;
        boolean a; //Para saber si los datos fueron correctos o no
        if (jt_estanco.getSelectedRow() >= 0) {

            localidad = JOptionPane.showInputDialog("Ingrese localidad del estanco: ");
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del estanco: ");

            try {
                idFiscal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID fiscal del estanco: "));
                numExpendio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de expendio: "));
                a = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(jf_cigarrillos, "¡Ha ingresado un valor invalido");
                a = false;
            }

            if (a == true) {
                estanco.get(jt_estanco.getSelectedRow()).setIdFiscal(idFiscal);
                estanco.get(jt_estanco.getSelectedRow()).setNumExpendio(numExpendio);
                estanco.get(jt_estanco.getSelectedRow()).setLocalidad(localidad);
                estanco.get(jt_estanco.getSelectedRow()).setNombre(nombre);

                JOptionPane.showMessageDialog(jf_estanco, "¡Campo modificado exitosamente, para ver tus cambios refresca la tabla!");
            } else {
                JOptionPane.showMessageDialog(jf_estanco, "¡El campo no ha sido modificado!");
            }

        } else {
            JOptionPane.showMessageDialog(jf_estanco, "¡Seleccione un cigarrillo primero!");
        }
    }//GEN-LAST:event_jm_modificareActionPerformed

    private void jb_estancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_estancoMouseClicked
        // MOSTRAR MENÚ ESTANCO
        jf_estanco.setLocationRelativeTo(this);
        jf_estanco.setVisible(true);

    }//GEN-LAST:event_jb_estancoMouseClicked

    private void jb_agregarfabricanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarfabricanteMouseClicked
        // AGREGAR FABRICANTE

        int idFabricante;
        String sede, nombre;
        Fabricante f;

        idFabricante = (Integer) js_idfabricante.getValue();
        sede = jt_sede.getText();
        nombre = jt_nombref.getText();
        f = new Fabricante(idFabricante, nombre, sede);
        fabricante.add(f);

        js_idfabricante.setValue(0);
        jt_sede.setText("");
        jt_nombref.setText("");
        JOptionPane.showMessageDialog(jf_fabricantes, "¡Fabricante agregado exitosamente!");
    }//GEN-LAST:event_jb_agregarfabricanteMouseClicked

    private void jTabbedPane6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane6MouseClicked
        // LISTAR FABRICANTES       
        DefaultTableModel model = (DefaultTableModel) jt_fabricante.getModel();

        int rows = model.getRowCount();

        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (int i = 0; i < fabricante.size(); i++) {
            Object[] newRow = new Object[]{fabricante.get(i).getIdFabricante(), fabricante.get(i).getSede(), fabricante.get(i).getNombre()};
            model.addRow(newRow);
            jt_fabricante.setModel(model);
        }
    }//GEN-LAST:event_jTabbedPane6MouseClicked

    private void jm_eliminarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_eliminarfActionPerformed
        //ELIMINAR FABRICANTE

        DefaultTableModel model = (DefaultTableModel) jt_fabricante.getModel();
        if (jt_fabricante.getSelectedRow() >= 0) {
            fabricante.remove(jt_fabricante.getSelectedRow());
            model.removeRow(jt_fabricante.getSelectedRow());

            jt_fabricante.updateUI();
            JOptionPane.showMessageDialog(jf_fabricantes, "¡Fabricante eliminado exitosamente!");

        } else {
            JOptionPane.showMessageDialog(jf_fabricantes, "¡Seleccione un fabricante primero!");
        }
    }//GEN-LAST:event_jm_eliminarfActionPerformed

    private void jm_modificarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_modificarfActionPerformed
        // MODIFICAR FABRICANTE
        int idFabricante = 0;
        String sede, nombre;
        boolean a; //Para saber si los datos fueron correctos o no
        if (jt_fabricante.getSelectedRow() >= 0) {

            sede = JOptionPane.showInputDialog("Ingrese sede del fabricante: ");
            nombre = JOptionPane.showInputDialog("Ingrese nombre del fabricante: ");

            try {
                idFabricante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del fabricante: "));
                a = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(jf_cigarrillos, "¡Ha ingresado un valor invalido");
                a = false;
            }

            if (a == true) {
                fabricante.get(jt_fabricante.getSelectedRow()).setIdFabricante(idFabricante);
                fabricante.get(jt_fabricante.getSelectedRow()).setSede(sede);
                fabricante.get(jt_fabricante.getSelectedRow()).setNombre(nombre);

                JOptionPane.showMessageDialog(jf_fabricantes, "¡Campo modificado exitosamente, para ver tus cambios refresca la tabla!");
            } else {
                JOptionPane.showMessageDialog(jf_fabricantes, "¡El campo no ha sido modificado!");
            }

        } else {
            JOptionPane.showMessageDialog(jf_fabricantes, "¡Seleccione un fabricante primero!");
        }
    }//GEN-LAST:event_jm_modificarfActionPerformed

    private void jb_fabricanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_fabricanteMouseClicked
        // Mostrar menú fabricantes
        jf_fabricantes.setLocationRelativeTo(this);
        jf_fabricantes.setVisible(true);
    }//GEN-LAST:event_jb_fabricanteMouseClicked

    private void jb_agregarMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarMarcaMouseClicked
        // AGREGAR MARCA
        int idFabricante;
        String nombre;
        Marca m;

        idFabricante = (Integer) js_idfabricantem.getValue();
        nombre = jt_nombrem.getText();
        m = new Marca(idFabricante, nombre);
        marca.add(m);

        js_idfabricantem.setValue(0);
        jt_nombrem.setText("");
        JOptionPane.showMessageDialog(jf_marca, "¡Marca agregada exitosamente!");
    }//GEN-LAST:event_jb_agregarMarcaMouseClicked

    private void jb_agregarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_agregarMarcaActionPerformed

    private void jTabbedPane7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane7MouseClicked
        // LISTAR MARCAS
        DefaultTableModel model = (DefaultTableModel) jt_marcaa.getModel();

        int rows = model.getRowCount();

        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (int i = 0; i < marca.size(); i++) {
            Object[] newRow = new Object[]{marca.get(i).getIdFabricante(), marca.get(i).getMarca()};
            model.addRow(newRow);
            jt_marcaa.setModel(model);
        }
    }//GEN-LAST:event_jTabbedPane7MouseClicked

    private void jm_eliminarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_eliminarmActionPerformed
        // ELIMINAR MARCA
        DefaultTableModel model = (DefaultTableModel) jt_marcaa.getModel();
        if (jt_marcaa.getSelectedRow() >= 0) {
            marca.remove(jt_marcaa.getSelectedRow());
            model.removeRow(jt_marcaa.getSelectedRow());

            jt_marcaa.updateUI();
            JOptionPane.showMessageDialog(jf_marca, "¡Marca eliminada exitosamente!");

        } else {
            JOptionPane.showMessageDialog(jf_marca, "¡Seleccione una marca primero!");
        }
    }//GEN-LAST:event_jm_eliminarmActionPerformed

    private void jm_modificarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_modificarmaActionPerformed
        // MODIFICAR MARCA  
        int idFabricante = 0;
        String nombre;
        boolean a; //Para saber si los datos fueron correctos o no
        if (jt_marcaa.getSelectedRow() >= 0) {

            nombre = JOptionPane.showInputDialog("Ingrese nombre de la marca: ");

            try {
                idFabricante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del fabricante: "));
                a = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(jf_cigarrillos, "¡Ha ingresado un valor invalido");
                a = false;
            }

            if (a == true) {
                marca.get(jt_marcaa.getSelectedRow()).setIdFabricante(idFabricante);
                marca.get(jt_marcaa.getSelectedRow()).setMarca(nombre);

                JOptionPane.showMessageDialog(jf_marca, "¡Campo modificado exitosamente, para ver tus cambios refresca la tabla!");
            } else {
                JOptionPane.showMessageDialog(jf_marca, "¡El campo no ha sido modificado!");
            }

        } else {
            JOptionPane.showMessageDialog(jf_marca, "¡Seleccione una marca primero!");
        }

    }//GEN-LAST:event_jm_modificarmaActionPerformed

    private void jb_marcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_marcaMouseClicked
        // MOSTRAR MENU MARCA
        jf_marca.setLocationRelativeTo(this);
        jf_marca.setVisible(true);
    }//GEN-LAST:event_jb_marcaMouseClicked

    private void jb_pedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_pedidoMouseClicked
        // MOSTRAR MENU PEDIDOS
        jf_pedido.setLocationRelativeTo(this);
        jf_pedido.setVisible(true);
    }//GEN-LAST:event_jb_pedidoMouseClicked

    private void jb_ventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ventaMouseClicked
        // MOSTRAR MENU VENTAS
        jf_venta.setLocationRelativeTo(this);
        jf_venta.setVisible(true);
    }//GEN-LAST:event_jb_ventaMouseClicked

    private void jb_agregarpedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarpedidoMouseClicked
        // AGREGAR PEDIDO
        int idCompra, idFiscal;
        Pedido p;

        idFiscal = (Integer) js_idfiscalp.getValue();
        idCompra = (Integer) js_idcomprap.getValue();
        p = new Pedido(idFiscal, idCompra);
        pedido.add(p);

        js_idfiscalp.setValue(0);
        js_idcomprap.setValue(0);
        JOptionPane.showMessageDialog(jf_pedido, "¡Pedido agregado exitosamente!");
    }//GEN-LAST:event_jb_agregarpedidoMouseClicked

    private void jTabbedPane8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane8MouseClicked
        // LISTAR PEDIDOS
        DefaultTableModel model = (DefaultTableModel) jt_pedido.getModel();

        int rows = model.getRowCount();

        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (int i = 0; i < pedido.size(); i++) {
            Object[] newRow = new Object[]{pedido.get(i).getIdFiscal(), pedido.get(i).getIdCompra()};
            model.addRow(newRow);
            jt_pedido.setModel(model);
        }
    }//GEN-LAST:event_jTabbedPane8MouseClicked

    private void jm_eliminarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_eliminarpActionPerformed
        // ELIMINAR PEDIDO
        DefaultTableModel model = (DefaultTableModel) jt_pedido.getModel();
        if (jt_pedido.getSelectedRow() >= 0) {
            pedido.remove(jt_pedido.getSelectedRow());
            model.removeRow(jt_pedido.getSelectedRow());

            jt_pedido.updateUI();
            JOptionPane.showMessageDialog(jf_pedido, "¡Pedido eliminado exitosamente!");

        } else {
            JOptionPane.showMessageDialog(jf_pedido, "¡Seleccione un pedido primero!");
        }
    }//GEN-LAST:event_jm_eliminarpActionPerformed

    private void jm_modificarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_modificarpActionPerformed
        // MODIFICAR PEDIDO
        int idCompra = 0, idFiscal = 0;
        boolean a;

        if (jt_pedido.getSelectedRow() >= 0) {

            try {
                idCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la compra: "));
                idFiscal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID fiscal: "));
                a = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(jf_pedido, "¡Ha ingresado un valor invalido");
                a = false;
            }

            if (a == true) {
                pedido.get(jt_pedido.getSelectedRow()).setIdCompra(idCompra);
                pedido.get(jt_pedido.getSelectedRow()).setIdFiscal(idFiscal);

                JOptionPane.showMessageDialog(jf_pedido, "¡Campo modificado exitosamente, para ver tus cambios refresca la tabla!");
            } else {
                JOptionPane.showMessageDialog(jf_pedido, "¡El campo no ha sido modificado!");
            }

        } else {
            JOptionPane.showMessageDialog(jf_pedido, "¡Seleccione un pedido primero!");
        }
    }//GEN-LAST:event_jm_modificarpActionPerformed

    private void jb_agregarventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarventaMouseClicked
        // AGREGAR VENTA
        int idVenta, idFiscal, numCigarrillo, totalNumCigarrillo, dia, mes, year;

        Venta v;

        numCigarrillo = (Integer) js_numCigarrillov.getValue();
        idFiscal = (Integer) js_idfiscalv.getValue();
        idVenta = (Integer) js_idventa.getValue();
        totalNumCigarrillo = (Integer) js_totalnumv.getValue();
        dia = (Integer) js_diav.getValue();
        mes = (Integer) js_mesv.getValue();
        year = (Integer) js_yearv.getValue();

        v = new Venta(idVenta, idFiscal, totalNumCigarrillo, numCigarrillo, dia, mes, year);
        venta.add(v);

        js_numCigarrillov.setValue(0);
        js_idfiscalv.setValue(0);
        js_idventa.setValue(0);
        js_diav.setValue(1);
        js_mesv.setValue(1);
        js_yearv.setValue(2018);
        js_totalnumv.setValue(0);
        JOptionPane.showMessageDialog(jf_venta, "¡Venta agregada exitosamente!");
    }//GEN-LAST:event_jb_agregarventaMouseClicked

    private void jm_modificarvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_modificarvActionPerformed
        // MODIFICAR PEDIDOS
        int idVenta = 0, idFiscal = 0, numCigarrillo = 0, totalNumCigarrillo = 0, dia = 0, mes = 0, year = 0;
        boolean a;

        if (jt_venta.getSelectedRow() >= 0) {

            try {
                idVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la venta: "));
                idFiscal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID fiscal: "));
                numCigarrillo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cigarrillo: "));
                totalNumCigarrillo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de cigarrillos de la venta: "));
                dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de la venta: "));
                mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la venta: "));
                year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la venta: "));
                a = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(jf_venta, "¡Ha ingresado un valor invalido");
                a = false;
            }

            if (a == true) {
                venta.get(jt_venta.getSelectedRow()).setIdVenta(idVenta);
                venta.get(jt_venta.getSelectedRow()).setIdFiscal(idFiscal);
                venta.get(jt_venta.getSelectedRow()).setNumCigarrillo(numCigarrillo);
                venta.get(jt_venta.getSelectedRow()).setDiaVenta(dia);
                venta.get(jt_venta.getSelectedRow()).setMesVenta(mes);
                venta.get(jt_venta.getSelectedRow()).setAñoVenta(year);
                venta.get(jt_venta.getSelectedRow()).setTotalNumCigarrillo(totalNumCigarrillo);

                JOptionPane.showMessageDialog(jf_venta, "¡Campo modificado exitosamente, para ver tus cambios refresca la tabla!");
            } else {
                JOptionPane.showMessageDialog(jf_venta, "¡El campo no ha sido modificado!");
            }

        } else {
            JOptionPane.showMessageDialog(jf_venta, "¡Seleccione una venta primero!");
        }
    }//GEN-LAST:event_jm_modificarvActionPerformed

    private void jTabbedPane9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane9MouseClicked
        // LISTAR VENTAS

        DefaultTableModel model = (DefaultTableModel) jt_venta.getModel();

        int rows = model.getRowCount();

        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (int i = 0; i < venta.size(); i++) {
            Object[] newRow = new Object[]{venta.get(i).getIdVenta(), venta.get(i).getIdFiscal(), venta.get(i).getNumCigarrillo(), venta.get(i).getTotalNumCigarrillo(), venta.get(i).getDiaVenta(), venta.get(i).getMesVenta(), venta.get(i).getMesVenta()};
            model.addRow(newRow);
            jt_venta.setModel(model);
        }
    }//GEN-LAST:event_jTabbedPane9MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    ArrayList<Almacen> almacen = new ArrayList();
    ArrayList<Cigarrillo> cigarrillo = new ArrayList();
    ArrayList<Compra> compra = new ArrayList();
    ArrayList<Distribuidor> distribuidor = new ArrayList();
    ArrayList<Estanco> estanco = new ArrayList();
    ArrayList<Fabricante> fabricante = new ArrayList();
    ArrayList<Marca> marca = new ArrayList();
    ArrayList<Pedido> pedido = new ArrayList();
    ArrayList<Venta> venta = new ArrayList();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JButton jb_agregarAlmacen;
    private javax.swing.JButton jb_agregarCigarrillo;
    private javax.swing.JButton jb_agregarEstanco;
    private javax.swing.JButton jb_agregarMarca;
    private javax.swing.JButton jb_agregarcompra;
    private javax.swing.JButton jb_agregardistribuidor;
    private javax.swing.JButton jb_agregarfabricante;
    private javax.swing.JButton jb_agregarpedido;
    private javax.swing.JButton jb_agregarventa;
    private javax.swing.JButton jb_almacen;
    private javax.swing.JButton jb_cigarrillos;
    private javax.swing.JButton jb_compra;
    private javax.swing.JButton jb_distribuidor;
    private javax.swing.JButton jb_estanco;
    private javax.swing.JButton jb_fabricante;
    private javax.swing.JButton jb_marca;
    private javax.swing.JButton jb_pedido;
    private javax.swing.JButton jb_venta;
    private javax.swing.JComboBox<String> jc_color;
    private javax.swing.JComboBox<String> jc_filtro;
    private javax.swing.JComboBox<String> jc_mentol;
    private javax.swing.JFrame jf_almacen;
    private javax.swing.JFrame jf_cigarrillos;
    private javax.swing.JFrame jf_compra;
    private javax.swing.JFrame jf_distribuidores;
    private javax.swing.JFrame jf_estanco;
    private javax.swing.JFrame jf_fabricantes;
    private javax.swing.JFrame jf_marca;
    private javax.swing.JFrame jf_pedido;
    private javax.swing.JFrame jf_venta;
    private javax.swing.JMenuItem jm_borrar;
    private javax.swing.JMenuItem jm_deletCigarrillo;
    private javax.swing.JMenuItem jm_eliminard;
    private javax.swing.JMenuItem jm_eliminare;
    private javax.swing.JMenuItem jm_eliminarf;
    private javax.swing.JMenuItem jm_eliminarm;
    private javax.swing.JMenuItem jm_eliminarp;
    private javax.swing.JMenuItem jm_eliminarv;
    private javax.swing.JMenuItem jm_modCigarrillo;
    private javax.swing.JMenuItem jm_modificar;
    private javax.swing.JMenuItem jm_modificare;
    private javax.swing.JMenuItem jm_modificarf;
    private javax.swing.JMenuItem jm_modificarm;
    private javax.swing.JMenuItem jm_modificarma;
    private javax.swing.JMenuItem jm_modificarp;
    private javax.swing.JMenuItem jm_modificarv;
    private javax.swing.JSpinner js_alquitran;
    private javax.swing.JSpinner js_cantCigarrillo;
    private javax.swing.JSpinner js_diac;
    private javax.swing.JSpinner js_diav;
    private javax.swing.JSpinner js_expendio;
    private javax.swing.JSpinner js_idcompra;
    private javax.swing.JSpinner js_idcomprad;
    private javax.swing.JSpinner js_idcomprap;
    private javax.swing.JSpinner js_idfabricante;
    private javax.swing.JSpinner js_idfabricantem;
    private javax.swing.JSpinner js_idfiscal;
    private javax.swing.JSpinner js_idfiscale;
    private javax.swing.JSpinner js_idfiscalp;
    private javax.swing.JSpinner js_idfiscalv;
    private javax.swing.JSpinner js_idventa;
    private javax.swing.JSpinner js_mesc;
    private javax.swing.JSpinner js_mesv;
    private javax.swing.JSpinner js_nicotina;
    private javax.swing.JSpinner js_numCigarrillo;
    private javax.swing.JSpinner js_numCigarrillo1;
    private javax.swing.JSpinner js_numCigarrillo2;
    private javax.swing.JSpinner js_numCigarrillod;
    private javax.swing.JSpinner js_numCigarrillov;
    private javax.swing.JSpinner js_totalnum;
    private javax.swing.JSpinner js_totalnumv;
    private javax.swing.JSpinner js_yearc;
    private javax.swing.JSpinner js_yearv;
    private javax.swing.JTable jt_almacen;
    private javax.swing.JTable jt_cigarrillo;
    private javax.swing.JTable jt_compras;
    private javax.swing.JTable jt_distribuidor;
    private javax.swing.JTable jt_estanco;
    private javax.swing.JTable jt_fabricante;
    private javax.swing.JTextField jt_idFiscal;
    private javax.swing.JTextField jt_idFiscal3;
    private javax.swing.JTextField jt_localidad;
    private javax.swing.JTextField jt_localidade;
    private javax.swing.JTextField jt_marca;
    private javax.swing.JTable jt_marcaa;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_nombree;
    private javax.swing.JTextField jt_nombref;
    private javax.swing.JTextField jt_nombrem;
    private javax.swing.JTextField jt_numExpendio;
    private javax.swing.JTable jt_pedido;
    private javax.swing.JTextField jt_precioc;
    private javax.swing.JTextField jt_preciov;
    private javax.swing.JTextField jt_sede;
    private javax.swing.JTable jt_venta;
    private javax.swing.JMenuItem pop_eliminarc;
    private javax.swing.JMenuItem pop_modificarc;
    private javax.swing.JPopupMenu pop_tableAlmacen;
    private javax.swing.JPopupMenu pop_tableCigarrillo;
    private javax.swing.JPopupMenu pop_tableCompra;
    private javax.swing.JPopupMenu pop_tableDistribuidor;
    private javax.swing.JPopupMenu pop_tableEstanco;
    private javax.swing.JPopupMenu pop_tableFabricante;
    private javax.swing.JPopupMenu pop_tableMarca;
    private javax.swing.JPopupMenu pop_tablePedido;
    private javax.swing.JPopupMenu pop_tableVenta;
    // End of variables declaration//GEN-END:variables

}
