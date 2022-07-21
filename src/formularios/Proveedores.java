/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.net.URL;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import programas.ver_conex;

/**
 *
 * @author User
 */
public class Proveedores extends javax.swing.JFrame {

    /**
     * Creates new form Productos
     */
      ver_conex conn = new ver_conex();
 javax.swing.table.DefaultTableModel cursor;
  private int posreg;
    private int band = 0;
    public int id_stock;
       javax.swing.table.DefaultTableModel m;
    public Proveedores() {
        initComponents();
        
           cursor = (javax.swing.table.DefaultTableModel)grilla.getModel();
       // des_text();
         this.setLocationRelativeTo(null);
        // hab_botones();
         // mardesc.setEnabled(false);
         // beditar.setEnabled(false);
       // tipdesc.setEnabled(false);
         cargar_grilla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bcancelar = new javax.swing.JButton();
        bgrabar = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();
        bagregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lcodigo = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        lcodigo1 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        lcodigo3 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        lcosto = new javax.swing.JLabel();
        txtruc = new javax.swing.JTextField();
        lcosto1 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        lcodigo2 = new javax.swing.JLabel();
        chkActivo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(173, 216, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setText("Proveedor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bcancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_icon-icons.com_73703.png"))); // NOI18N
        bcancelar.setEnabled(false);
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });

        bgrabar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bgrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savedisk_floppydisk_guardar_1543.png"))); // NOI18N
        bgrabar.setEnabled(false);
        bgrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgrabarActionPerformed(evt);
            }
        });

        bsalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout_90894.png"))); // NOI18N
        bsalir.setToolTipText("");
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });

        bagregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1486485588-add-create-new-math-sign-cross-plus_81186.png"))); // NOI18N
        bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bgrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bcancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(bagregar)
                .addGap(27, 27, 27)
                .addComponent(bgrabar)
                .addGap(38, 38, 38)
                .addComponent(bcancelar)
                .addGap(35, 35, 35)
                .addComponent(bsalir)
                .addGap(41, 41, 41))
        );

        grilla.setBackground(new java.awt.Color(153, 255, 255));
        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Direccion", "RUC", "Telefono", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grilla);
        if (grilla.getColumnModel().getColumnCount() > 0) {
            grilla.getColumnModel().getColumn(0).setResizable(false);
            grilla.getColumnModel().getColumn(1).setResizable(false);
            grilla.getColumnModel().getColumn(2).setResizable(false);
            grilla.getColumnModel().getColumn(3).setResizable(false);
            grilla.getColumnModel().getColumn(4).setResizable(false);
            grilla.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel3.setBackground(new java.awt.Color(173, 216, 230));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lcodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lcodigo.setText("Codigo :");

        txtcodigo.setEnabled(false);
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigoKeyPressed(evt);
            }
        });

        lcodigo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lcodigo1.setText("Nombre");

        txtdescripcion.setEnabled(false);
        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });
        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyPressed(evt);
            }
        });

        lcodigo3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lcodigo3.setText("Direccion");

        txtdireccion.setEnabled(false);
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });

        lcosto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lcosto.setText("RUC:");

        txtruc.setEnabled(false);
        txtruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrucActionPerformed(evt);
            }
        });
        txtruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrucKeyTyped(evt);
            }
        });

        lcosto1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lcosto1.setText("Telefono:");

        txttelefono.setEnabled(false);
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        lcodigo2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lcodigo2.setText("Estado:");

        chkActivo.setText("Activo");
        chkActivo.setEnabled(false);
        chkActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lcodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lcodigo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkActivo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lcosto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lcosto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lcodigo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdireccion))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lcodigo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcodigo)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcodigo1)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcodigo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcosto)
                    .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcosto1)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcodigo2)
                    .addComponent(chkActivo))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
        // buscar();
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyPressed
        // TODO add your handling code here:
        //  buscar();
    }//GEN-LAST:event_txtcodigoKeyPressed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        // TODO add your handling code here:
        borrar_text();
        hab_botones();
        des_text();

    }//GEN-LAST:event_bcancelarActionPerformed

    private void bgrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgrabarActionPerformed
        // TODO add your handling code here:
        grabar();
        borrar_text();
        hab_botones();
        des_text();
     
        // bmarcas.setEnabled(false);
        //  bgrupos.setEnabled(false);

    }//GEN-LAST:event_bgrabarActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_bsalirActionPerformed

    private void bagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregarActionPerformed
        // TODO add your handling code here:
        bandera="agregar";
        gencod();
        gencodStock();
        des_botones();
        txtdescripcion.setEnabled(true);
        txtdescripcion.requestFocus();

        // boton_agregar();
    }//GEN-LAST:event_bagregarActionPerformed

    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
        // TODO add your handling code here:
        txtdireccion.setEnabled(true);
        txtdireccion.requestFocus();
      
    }//GEN-LAST:event_txtdescripcionActionPerformed

    private void txtdescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionKeyPressed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
       txtruc.setEnabled(true);
       txtruc.requestFocus();
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void chkActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActivoActionPerformed
        // TODO add your handling code here:
        if(chkActivo.isSelected()==true)
        {
            estado = 1;
            bgrabar.setEnabled(true);
            bgrabar.requestFocus();
        }
    }//GEN-LAST:event_chkActivoActionPerformed

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked
        // TODO add your handling code here:}
     
        this.bcancelar.setEnabled(true);
      //  this.beditar.setEnabled(true);
        this.bagregar.setEnabled(false);
    }//GEN-LAST:event_grillaMouseClicked

    private void txtrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrucActionPerformed
        // TODO add your handling code here:
      txttelefono.setEnabled(true);
      txttelefono.requestFocus();
    }//GEN-LAST:event_txtrucActionPerformed

    private void txtrucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrucKeyTyped
        // TODO add your handling code here:
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if(((caracter < '0') ||
            (caracter > '9')) &&
        (caracter != evt.VK_BACK_SPACE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtrucKeyTyped

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
        chkActivo.setEnabled(true);
        
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoKeyTyped

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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }
public String bandera="";
public String viva="";
public int estado = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagregar;
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton bgrabar;
    private javax.swing.JButton bsalir;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JTable grilla;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lcodigo;
    private javax.swing.JLabel lcodigo1;
    private javax.swing.JLabel lcodigo2;
    private javax.swing.JLabel lcodigo3;
    private javax.swing.JLabel lcosto;
    private javax.swing.JLabel lcosto1;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtruc;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

private void des_text(){
    txtdescripcion.setEnabled(false);
    txtdireccion.setEnabled(true);
    txtruc.setEnabled(true);
    txttelefono.setEnabled(true);
    chkActivo.setEnabled(true);
    
}
private void boton_agregar(){
 //   txtpreciomay.setEnabled(false);
  //  txtcod.setEnabled(false);
 //   txtcodigo.setEnabled(false);
 //   txtcodmarca.setEnabled(false);
   // txtcosto.setEnabled(false);
   // txtnombre.setEnabled(false);
//    txtiva.setEnabled(false);
   // txtprecioventa.setEnabled(false);
  //  diez.setEnabled(false);
  //  cinco.setEnabled(false);
  //  excenta.setEnabled(false);
}
private void hab_text(){
    // txtpreciomay.setEnabled(true);
   // barr_cod.setEnabled(true);
   // txtcodmarca.setEnabled(true);
  
   // txtcod2.setEnabled(true);
   // txtcod3.setEnabled(true);
    txtdireccion.setEnabled(true);
   // txtprecioventa.setEnabled(true);


}
private void borrar_text(){
    txtcodigo.setText("");
     txtdescripcion.setText("");
     txtdireccion.setText("");
     
      txtruc.setText("");
     txttelefono.setText("");
     chkActivo.setSelected(false);
   

}
 private void des_botones() //metodo para deshabilitar botones
     {
         bagregar.setEnabled(false);
      //   bborrar.setEnabled(false);
     //    beditar.setEnabled(false);
         bgrabar.setEnabled(false);
         bsalir.setEnabled(false);
	 bcancelar.setEnabled(true);
     }

     private void hab_botones()	// metodo para hab botones
     {
         bagregar.setEnabled(true);
	// bborrar.setEnabled(true);
      //   beditar.setEnabled(false);
         bgrabar.setEnabled(false);
         bsalir.setEnabled(true);
	 bcancelar.setEnabled(false);
     }
      private void gencod()
    {
        try {
            //       Main.inicio = "no";
                   ver_conex conn = new ver_conex();
                   conn.sentencia = conn.conexion.createStatement();
                   conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(id),0)+ 1 AS xxx FROM proveedores");
                   conn.resultado.next();
                  this.txtcodigo.setText(conn.resultado.getString("xxx"));
        } catch (SQLException ex) {
            Logger.getLogger(mercaderia.class.getName()).log(Level.SEVERE, null, ex);
     //   } catch (SQLException ex)
        {
            Logger.getLogger(mercaderia.class.getName()).log(Level.SEVERE, null, ex);
        }



        }
      }
       private void grabar()
    {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();

            if(bandera.equals("agregar"))
             {
                gencod();// sirve para que no se dupliquen los codigos y no de error cuando se trabaja en redes///////////////////////////////////////////////////prd_cod,////////////////tip_prd_cod,/////////presen_cod,/////////////mar_cod,/////////////unid_cod,/////////////prd_nom,//////////////////prd_costo,/////////////iva,////matp_est,//////   grup_cod
               conn.sentencia.executeUpdate("INSERT INTO proveedores(id,descripcion,direccion,ruc,telefono,estado)VALUES("+txtcodigo.getText()+",'"+txtdescripcion.getText()+"','"+txtdireccion.getText()+"','"+txtruc.getText()+"','"+txttelefono.getText()+"',"+estado+")");
               cargar_grilla();
             }
               if(bandera.equals("editar"))
             {
               //conn.sentencia.executeUpdate("UPDATE mercaderia SET mar_cod ='"+txtcod2txtcod2.getText()+"',gru_cod='"+txtcod.getText()+"', mer_nom='"+txtnombre.getText()+"' ,mer_cost='"+txtcosto.getText()+"',precioventa='"+txtprecioventa.getText()+"','"+viva+"' WHERE mer_cod ="+txtcodigo.getText());
              cargar_grilla();
             }

         JOptionPane.showMessageDialog(null, "REGISTRO GRABADO","CONFIRMACION",JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(mercaderia.class.getName()).log(Level.SEVERE, null, ex);
        }



    }
       private void salir (){
     int respuesta = JOptionPane.showConfirmDialog
         (this,"DESEA SALIR","CONFIRMAR",JOptionPane.YES_NO_OPTION);
       if(respuesta == JOptionPane.YES_OPTION)
       {
	   dispose();

       }

}
 private void buscar()
    {
        try {
           // Main.inicio = "no";
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery
       ("SELECT * FROM mercaderia as m inner join marcas as mar on m.mar_cod=mar.mar_cod inner join grupos as g on m.gru_cod=g.gru_cod WHERE m.mer_cod = "+txtcodigo.getText());
            boolean encontro = conn.resultado.next();

            if(encontro == true)
            {
                 
              
                txtdireccion.setText(conn.resultado.getString("mer_nom"));
             //   txtpreciomay.setText(conn.resultado.getString("preciomay"));
                txtdireccion.setText(conn.resultado.getString("mer_cost"));
             
            //    txtprecioventa.setText(conn.resultado.getString("precioventa"));
               // txtiva.setText(conn.resultado.getString("mer_iva"));
                 viva=conn.resultado.getString("mer_iva");
                if (viva.equals("5")){
                
                }else{
                    if (viva.equals("10")){
                    
                    }else{
                       // if(vestado.equals("bloqueado")){
                         
                    }
                }
                if(bandera.equals("borrar"))
                {
                    int mensaje = JOptionPane.showConfirmDialog(this,"Deseas Borrar-->"+txtdireccion.getText(),"Confirmar",JOptionPane.YES_NO_OPTION);
                     if(mensaje == JOptionPane.YES_OPTION)//si quiere borrar
                     {
                           conn.sentencia = conn.conexion.createStatement();
                           conn.sentencia.executeUpdate("UPDATE producto SET prd_est ='Borrado' Where prd_cod= "+txtcodigo.getText()+"");
                          JOptionPane.showMessageDialog(null, "El registro ha sido borrado satisfactoriamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                      cargar_grilla();
                     }
                     else
                     {
                        JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                     }
                     this.bcancelar.doClick();

                }
                 if(bandera.equals("editar"))
                 {
                   
                     txtdireccion.setEnabled(true);
                    // txtpreciomay.setEnabled(true);
                     txtdireccion.setEnabled(true);
                   //  txtprecioventa.setEnabled(true);
                   //  txtiva.setEnabled(true);
                  
                 }



       // catch (SQLException ex) {
         //   Logger.getLogger(personal.class.getName()).log(Level.SEVERE, null, ex);
        
            }
            else // no encontro
            {
              JOptionPane.showMessageDialog(null, "No existe un registro con este codigo!", "Atencion", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(mercaderia.class.getName()).log(Level.SEVERE, null, ex);
        }

 }
  
 
 public void genreporte() //throws JRException, Exception
    {
        try //throws JRException, Exception
        {
            ver_conex conn = new ver_conex();    
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT mer_cant,mer_nom FROM mercaderia"); //OJO LE PASO LA SENTENCIA
            JRResultSetDataSource jrRS = new JRResultSetDataSource(conn.resultado);

            HashMap parameters = new HashMap();
            URL urlMaestro = getClass().getClassLoader().getResource("reportes/mercaderia1.jasper");

            // Cargamos el reporte
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport, parameters, jrRS);
            JasperViewer ventana = new JasperViewer(masterPrint, false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(mercaderia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mercaderia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
  public void genreporte1() //throws JRException, Exception
    {
        try //throws JRException, Exception
        {
            ver_conex conn = new ver_conex();    
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT * FROM mercaderia"); //OJO LE PASO LA SENTENCIA
            JRResultSetDataSource jrRS = new JRResultSetDataSource(conn.resultado);

            HashMap parameters = new HashMap();
            URL urlMaestro = getClass().getClassLoader().getResource("reportes/mercaderia.jasper");

            // Cargamos el reporte
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport, parameters, jrRS);
            JasperViewer ventana = new JasperViewer(masterPrint, false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(mercaderia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mercaderia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
  private void cargar_grilla()
  {
      try
      {
           for (int i = grilla.getRowCount()-1; i>=0; i--)
            {
                cursor.removeRow(i);
            }
 
          
          
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT * from proveedores");
           
            while(conn.resultado.next())
            {
                Object[] datos = {
                  conn.resultado.getString("id"),
                  conn.resultado.getString("descripcion"),
                  conn.resultado.getString("direccion"),
                  conn.resultado.getString("ruc"),
                  conn.resultado.getString("telefono"),
                  conn.resultado.getString("estado"),
                };
               
               
                cursor.addRow(datos);  
            }

        } catch (SQLException ex) {
            Logger.getLogger(mercaderia.class.getName()).log(Level.SEVERE, null, ex);
        }
 
 
 
  }
   private void gencodStock()
    {
        try {
            //       Main.inicio = "no";
                   ver_conex conn = new ver_conex();
                   conn.sentencia = conn.conexion.createStatement();
                   conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(id),0)+ 1 AS xxx FROM stock_productos");
                   conn.resultado.next();
                   
               id_stock = (Integer.parseInt(conn.resultado.getString("xxx")));
                  
                  
        } catch (SQLException ex) {
            Logger.getLogger(mercaderia.class.getName()).log(Level.SEVERE, null, ex);
     //   } catch (SQLException ex)
        {
            Logger.getLogger(mercaderia.class.getName()).log(Level.SEVERE, null, ex);
        }



        }
      }

}
