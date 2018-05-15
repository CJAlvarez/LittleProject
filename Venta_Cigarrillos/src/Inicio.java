
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

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_almacen = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_almacen = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jt_idFiscal3 = new javax.swing.JTextField();
        pop_tableAlmacen = new javax.swing.JPopupMenu();
        jm_borrar = new javax.swing.JMenuItem();
        jm_modificar = new javax.swing.JMenuItem();
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

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

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
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_localidad)
                                    .addComponent(jt_numExpendio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(js_numCigarrillo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(js_cantCigarrillo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(103, 103, 103))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jt_idFiscal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jb_agregarAlmacen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        javax.swing.GroupLayout jf_almacenLayout = new javax.swing.GroupLayout(jf_almacen.getContentPane());
        jf_almacen.getContentPane().setLayout(jf_almacenLayout);
        jf_almacenLayout.setHorizontalGroup(
            jf_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jf_almacenLayout.setVerticalGroup(
            jf_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_almacenLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

        jb_compra.setBackground(new java.awt.Color(0, 102, 102));
        jb_compra.setForeground(new java.awt.Color(255, 255, 255));
        jb_compra.setText("Compra");

        jb_distribuidor.setBackground(new java.awt.Color(0, 102, 102));
        jb_distribuidor.setForeground(new java.awt.Color(255, 255, 255));
        jb_distribuidor.setText("Distribuidores");

        jb_estanco.setBackground(new java.awt.Color(0, 102, 102));
        jb_estanco.setForeground(new java.awt.Color(255, 255, 255));
        jb_estanco.setText("Estancos");
        jb_estanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_estancoActionPerformed(evt);
            }
        });

        jb_fabricante.setBackground(new java.awt.Color(0, 102, 102));
        jb_fabricante.setForeground(new java.awt.Color(255, 255, 255));
        jb_fabricante.setText("Fabricantes");
        jb_fabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_fabricanteActionPerformed(evt);
            }
        });

        jb_marca.setBackground(new java.awt.Color(0, 102, 102));
        jb_marca.setForeground(new java.awt.Color(255, 255, 255));
        jb_marca.setText("Marcas");

        jb_pedido.setBackground(new java.awt.Color(0, 102, 102));
        jb_pedido.setForeground(new java.awt.Color(255, 255, 255));
        jb_pedido.setText("Pedidos");

        jb_venta.setBackground(new java.awt.Color(0, 102, 102));
        jb_venta.setForeground(new java.awt.Color(255, 255, 255));
        jb_venta.setText("Ventas");

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
                        .addComponent(jb_distribuidor, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_agregarAlmacen;
    private javax.swing.JButton jb_almacen;
    private javax.swing.JButton jb_cigarrillos;
    private javax.swing.JButton jb_compra;
    private javax.swing.JButton jb_distribuidor;
    private javax.swing.JButton jb_estanco;
    private javax.swing.JButton jb_fabricante;
    private javax.swing.JButton jb_marca;
    private javax.swing.JButton jb_pedido;
    private javax.swing.JButton jb_venta;
    private javax.swing.JFrame jf_almacen;
    private javax.swing.JMenuItem jm_borrar;
    private javax.swing.JMenuItem jm_modificar;
    private javax.swing.JSpinner js_cantCigarrillo;
    private javax.swing.JSpinner js_numCigarrillo;
    private javax.swing.JTable jt_almacen;
    private javax.swing.JTextField jt_idFiscal;
    private javax.swing.JTextField jt_idFiscal3;
    private javax.swing.JTextField jt_localidad;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_numExpendio;
    private javax.swing.JPopupMenu pop_tableAlmacen;
    // End of variables declaration//GEN-END:variables

}
