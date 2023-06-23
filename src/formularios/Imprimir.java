/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * marcas.java
 *
 * Created on 10-oct-2014, 15:46:55
 */
package formularios;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import programas.ver_conex;

/**
 *
 * @author mi
 */
public class Imprimir extends javax.swing.JFrame {

    javax.swing.table.DefaultTableModel cursor;
    ver_conex conn = new ver_conex();
    //javax.swing.table.DefaultTableModel cursor;
    private int posreg;
    private int band = 0;
    javax.swing.table.DefaultTableModel m;
    

    /**
     * Creates new form marcas
     */
    public Imprimir() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        hab_botones();
        cargarEstado();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lcodigo2 = new javax.swing.JLabel();
        chkActivo = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        beditar = new javax.swing.JButton();
        bgrabar = new javax.swing.JButton();
        bcancelar = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lcodigo2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lcodigo2.setText("Estado:");

        chkActivo.setText("Activo");
        chkActivo.setEnabled(false);
        chkActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lcodigo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkActivo)
                .addContainerGap(304, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcodigo2)
                    .addComponent(chkActivo))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Imprimir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        beditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        beditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/documentediting_editdocuments_text_documentedi_2820.png"))); // NOI18N
        beditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditarActionPerformed(evt);
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

        bcancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_icon-icons.com_73703.png"))); // NOI18N
        bcancelar.setEnabled(false);
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(beditar)
                        .addGap(18, 18, 18)
                        .addComponent(bgrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bcancelar)
                        .addGap(18, 18, 18)
                        .addComponent(bsalir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(beditar)
                    .addComponent(bgrabar)
                    .addComponent(bcancelar)
                    .addComponent(bsalir))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActivoActionPerformed
        // TODO add your handling code here:
        if (chkActivo.isSelected() == true) {
            estado = 1;
            bgrabar.setEnabled(true);
            bgrabar.requestFocus();
        }
        if (chkActivo.isSelected() == false) {
            estado = 0;
            bgrabar.setEnabled(true);
            bgrabar.requestFocus();
        }
    }//GEN-LAST:event_chkActivoActionPerformed

    private void beditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditarActionPerformed
        // TODO add your handling code here:
        botonEditar();
    }//GEN-LAST:event_beditarActionPerformed

    private void bgrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgrabarActionPerformed
        // TODO add your handling code here:

        grabar();
        hab_botones();
    }//GEN-LAST:event_bgrabarActionPerformed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        // TODO add your handling code here:
        borrar_text();
        hab_botones();
        des_text();
    }//GEN-LAST:event_bcancelarActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_bsalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Imprimir().setVisible(true);
            }
        });
    }
    public String bandera = "";
    public int estado = 0;
    public int valorBase;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton beditar;
    private javax.swing.JButton bgrabar;
    private javax.swing.JButton bsalir;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lcodigo2;
    // End of variables declaration//GEN-END:variables

    private void hab_botones() // metodo para hab botones
    {
        beditar.setEnabled(true);
        bgrabar.setEnabled(false);
        bsalir.setEnabled(true);
        bcancelar.setEnabled(false);
    }

    private void grabar() {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();

            if (chkActivo.isSelected() == true) {
                estado = 1;
            }
            conn.sentencia.executeUpdate("UPDATE IMPRIMIR SET ESTADO = " + estado + "");

        } catch (SQLException ex) {
            Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void salir() {
        int respuesta = JOptionPane.showConfirmDialog(this, "DESEA SALIR", "CONFIRMAR", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            dispose();

        }
    }

    private void botonEditar() //metodo para deshabilitar botones
    {
        beditar.setEnabled(false);

        bgrabar.setEnabled(true);
        bsalir.setEnabled(false);
        bcancelar.setEnabled(true);
        chkActivo.setEnabled(true);
        chkActivo.requestFocus();
    }

    private void borrar_text() {
        chkActivo.setSelected(false);
    }

    private void des_text() {
        chkActivo.setEnabled(false);
    }

    private void cargarEstado() {
        try {
            // Main.inicio = "no";
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT * "
                    + "\n"
                    + "FROM imprimir");
            boolean encontro = conn.resultado.next();

            if (encontro == true) {
                this.valorBase = (Integer.parseInt(conn.resultado.getString("estado")));
                if (valorBase == 1) {
                    chkActivo.setSelected(true);
                }
                if (valorBase == 0) {
                    chkActivo.setSelected(false);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

}
