package formularios;

import java.awt.event.KeyEvent;
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

public class caja extends javax.swing.JFrame {

    javax.swing.table.DefaultTableModel cursor;

    public caja() {
        initComponents();
//        cursor = (javax.swing.table.DefaultTableModel)griciudad.getModel();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLciudad = new javax.swing.JLabel();
        jLcodciudad = new javax.swing.JLabel();
        jTcodcaja = new javax.swing.JTextField();
        jLdescripcion = new javax.swing.JLabel();
        jTdescripcion = new javax.swing.JTextField();
        jBagregar = new javax.swing.JButton();
        jBeditar = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();
        jBgrabar = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLcodciudad1 = new javax.swing.JLabel();
        timbcod = new javax.swing.JTextField();
        timbnum = new javax.swing.JTextField();
        inicial = new javax.swing.JLabel();
        numeroinicial = new javax.swing.JTextField();
        jLdescripcion2 = new javax.swing.JLabel();
        numerofinal = new javax.swing.JTextField();
        jLdescripcion3 = new javax.swing.JLabel();
        numeroactual = new javax.swing.JTextField();
        jLdescripcion4 = new javax.swing.JLabel();
        sucursalexpedicion = new javax.swing.JTextField();
        jLdescripcion5 = new javax.swing.JLabel();
        bocaexpedicion = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLciudad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLciudad.setText("Formulario de Caja");

        jLcodciudad.setText("Codigo:");

        jTcodcaja.setEnabled(false);
        jTcodcaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcodcajaActionPerformed(evt);
            }
        });
        jTcodcaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTcodcajaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcodcajaKeyTyped(evt);
            }
        });

        jLdescripcion.setText("descripcion");

        jTdescripcion.setEnabled(false);
        jTdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdescripcionActionPerformed(evt);
            }
        });
        jTdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTdescripcionKeyTyped(evt);
            }
        });

        jBagregar.setText("Agregar");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });

        jBeditar.setText("Editar");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });

        jBborrar.setText("Borrar");
        jBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBborrarActionPerformed(evt);
            }
        });

        jBgrabar.setText("Grabar");
        jBgrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgrabarActionPerformed(evt);
            }
        });

        jBcancelar.setText("Cancelar");
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLcodciudad1.setText("Timbrado:");

        timbcod.setEnabled(false);
        timbcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timbcodActionPerformed(evt);
            }
        });
        timbcod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timbcodKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                timbcodKeyTyped(evt);
            }
        });

        timbnum.setEnabled(false);
        timbnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timbnumActionPerformed(evt);
            }
        });
        timbnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timbnumKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                timbnumKeyTyped(evt);
            }
        });

        inicial.setText("Numero de Factura Inicial:");

        numeroinicial.setEnabled(false);
        numeroinicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroinicialActionPerformed(evt);
            }
        });
        numeroinicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroinicialKeyTyped(evt);
            }
        });

        jLdescripcion2.setText("Numero de Facura Final:");

        numerofinal.setEnabled(false);
        numerofinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerofinalActionPerformed(evt);
            }
        });
        numerofinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numerofinalKeyTyped(evt);
            }
        });

        jLdescripcion3.setText("Numero de Facura Actual:");

        numeroactual.setEnabled(false);
        numeroactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroactualActionPerformed(evt);
            }
        });
        numeroactual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroactualKeyTyped(evt);
            }
        });

        jLdescripcion4.setText("Sucursal de Expedicion:");

        sucursalexpedicion.setEnabled(false);
        sucursalexpedicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalexpedicionActionPerformed(evt);
            }
        });
        sucursalexpedicion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sucursalexpedicionKeyTyped(evt);
            }
        });

        jLdescripcion5.setText("Boca de Expedicion:");

        bocaexpedicion.setEnabled(false);
        bocaexpedicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bocaexpedicionActionPerformed(evt);
            }
        });
        bocaexpedicion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bocaexpedicionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLcodciudad1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timbcod, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timbnum, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLcodciudad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTcodcaja, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inicial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numeroinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLdescripcion2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numerofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLdescripcion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTdescripcion))
                                    .addComponent(jLdescripcion4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sucursalexpedicion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLdescripcion5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bocaexpedicion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLdescripcion3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroactual, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLciudad))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBagregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBeditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBborrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBgrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBcancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLciudad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcodciudad)
                    .addComponent(jTcodcaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcodciudad1)
                    .addComponent(timbcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timbnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLdescripcion)
                    .addComponent(jTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLdescripcion4)
                    .addComponent(sucursalexpedicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLdescripcion5)
                    .addComponent(bocaexpedicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLdescripcion3)
                    .addComponent(numeroactual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numerofinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLdescripcion2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inicial)
                        .addComponent(numeroinicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBagregar)
                    .addComponent(jBeditar)
                    .addComponent(jBborrar)
                    .addComponent(jBgrabar)
                    .addComponent(jBcancelar)
                    .addComponent(jBsalir))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        hab_text();
        des_botones();
        operacion = "agregar";
        gencod();
        timbcod.setEnabled(true);
        timbcod.requestFocus();

        // this.jTcodcaja.setEnabled(false);
    }//GEN-LAST:event_jBagregarActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed

        operacion = "editar";
        des_botones();
        this.jTcodcaja.setEnabled(true);
        this.jTcodcaja.requestFocus();
    }//GEN-LAST:event_jBeditarActionPerformed

    private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed
        operacion = "borrar";
        des_botones();
        this.jTcodcaja.setEnabled(true);
        this.jTcodcaja.requestFocus();

    }//GEN-LAST:event_jBborrarActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        hab_botones();
        des_text();
        clear_text();
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        salir();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jTdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdescripcionActionPerformed
        sucursalexpedicion.setEnabled(true);
        sucursalexpedicion.requestFocus();
    }//GEN-LAST:event_jTdescripcionActionPerformed

    private void jTcodcajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcodcajaActionPerformed
        buscar();
        hab_text();
    }//GEN-LAST:event_jTcodcajaActionPerformed

    private void jBgrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgrabarActionPerformed
        grabar();
        this.jBcancelar.doClick();

    }//GEN-LAST:event_jBgrabarActionPerformed

    private void jTcodcajaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcodcajaKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
            // JOptionPane.showMessageDialog(null,"No puede Ingresar Letras");
        }
    }//GEN-LAST:event_jTcodcajaKeyTyped

    private void jTdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdescripcionKeyTyped

    }//GEN-LAST:event_jTdescripcionKeyTyped

    private void jTcodcajaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcodcajaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcodcajaKeyReleased

    private void timbcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timbcodActionPerformed
        // TODO add your handling code here:
        buscar_timbrado();
        jTdescripcion.setEnabled(true);
        jTdescripcion.requestFocus();
    }//GEN-LAST:event_timbcodActionPerformed

    private void timbcodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timbcodKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_timbcodKeyReleased

    private void timbcodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timbcodKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_timbcodKeyTyped

    private void timbnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timbnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timbnumActionPerformed

    private void timbnumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timbnumKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_timbnumKeyReleased

    private void timbnumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timbnumKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_timbnumKeyTyped

    private void numeroinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroinicialActionPerformed
        // TODO add your handling code here:
        this.numerofinal.setEnabled(true);
        numerofinal.requestFocus();

    }//GEN-LAST:event_numeroinicialActionPerformed

    private void numeroinicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroinicialKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroinicialKeyTyped

    private void numerofinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerofinalActionPerformed
        // TODO add your handling code here
        this.numeroactual.setEnabled(true);
        numeroactual.requestFocus();
    }//GEN-LAST:event_numerofinalActionPerformed

    private void numerofinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numerofinalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_numerofinalKeyTyped

    private void numeroactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroactualActionPerformed
        // TODO add your handling code here:

        jBgrabar.setEnabled(true);
        jBgrabar.requestFocus();
    }//GEN-LAST:event_numeroactualActionPerformed

    private void numeroactualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroactualKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroactualKeyTyped

    private void sucursalexpedicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalexpedicionActionPerformed
        // TODO add your handling code here
        this.bocaexpedicion.setEnabled(true);
        bocaexpedicion.requestFocus();
    }//GEN-LAST:event_sucursalexpedicionActionPerformed

    private void sucursalexpedicionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sucursalexpedicionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_sucursalexpedicionKeyTyped

    private void bocaexpedicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bocaexpedicionActionPerformed
        // TODO add your handling code here:
        this.numeroinicial.setEnabled(true);
        numeroinicial.requestFocus();
    }//GEN-LAST:event_bocaexpedicionActionPerformed

    private void bocaexpedicionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bocaexpedicionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_bocaexpedicionKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see ttp://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caja().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bocaexpedicion;
    private javax.swing.JLabel inicial;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBborrar;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBgrabar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLciudad;
    private javax.swing.JLabel jLcodciudad;
    private javax.swing.JLabel jLcodciudad1;
    private javax.swing.JLabel jLdescripcion;
    private javax.swing.JLabel jLdescripcion2;
    private javax.swing.JLabel jLdescripcion3;
    private javax.swing.JLabel jLdescripcion4;
    private javax.swing.JLabel jLdescripcion5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTcodcaja;
    private javax.swing.JTextField jTdescripcion;
    private javax.swing.JTextField numeroactual;
    private javax.swing.JTextField numerofinal;
    private javax.swing.JTextField numeroinicial;
    private javax.swing.JTextField sucursalexpedicion;
    private javax.swing.JTextField timbcod;
    private javax.swing.JTextField timbnum;
    // End of variables declaration//GEN-END:variables

    public void clear_text() {
        jTcodcaja.setText("");
        jTdescripcion.setText("");
    }

    public void hab_text() {
        jTcodcaja.setEnabled(false);
        jTdescripcion.setEnabled(true);
    }

    public void des_text() {
        jTcodcaja.setEnabled(false);
        jTdescripcion.setEnabled(false);
    }

    public void hab_botones() {
        jBagregar.setEnabled(true);
        jBeditar.setEnabled(true);
        jBborrar.setEnabled(true);
        jBgrabar.setEnabled(false);
        jBcancelar.setEnabled(false);
        jBsalir.setEnabled(true);
    }

    public void des_botones() {
        jBagregar.setEnabled(false);
        jBeditar.setEnabled(false);
        jBborrar.setEnabled(false);
        jBgrabar.setEnabled(false);
        jBcancelar.setEnabled(true);
        jBsalir.setEnabled(false);

    }

    private void salir() {
        int respuesta = JOptionPane.showConfirmDialog(this, "DESEA SALIR", "CONFIRMAR", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            dispose();

        }
    }

    private void gencod() {
        try {
            //       Main.inicio = "no";
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(id),0)+1 AS newcodigo FROM cajas");
            conn.resultado.next();
            jTcodcaja.setText(conn.resultado.getString("newcodigo"));
        } catch (SQLException ex) {
            Logger.getLogger(caja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void grabar() {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();

            if (operacion.equals("agregar")) {
                //gencod();         ///////                                                                                                                  caja_cod,             est_cod  ,timb_cod,                caja_desc,                   num_fa_ini                     ,num_fa_fin,                    num_fa_ac,               suc_exp ,                       suc_boca
                conn.sentencia.executeUpdate("INSERT INTO CAJAS (ID,ID_TIMBRADO,DESCRIPTION,COD_ESTABLECIMIENTO,PUNTO_EXPEDICION,NRO_FACT_ACTUAL,NRO_FACT_INICIAL,NRO_FACT_FINAL,ESTADO)VALUES("
                        + "" + jTcodcaja.getText() + "," + timbcod.getText() + ",'" + jTdescripcion.getText() + "','" + sucursalexpedicion.getText() + "','" + bocaexpedicion.getText() + "',"
                        + "'" + numeroactual.getText() + "','" + numeroinicial.getText() + "','" + numerofinal.getText() + "'," + 1 + ")");
            }

            if (operacion.equals("editar")) {
                conn.sentencia.executeUpdate("UPDATE cajas SET description ='" + jTdescripcion.getText() + "' WHERE id =" + jTcodcaja.getText());
            }

            JOptionPane.showMessageDialog(null, "REGISTRO GRABADO", "CONFIRMACION", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(caja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void buscar() {
        try {
            // Main.inicio = "no";
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT * FROM cajas WHERE id = " + jTcodcaja.getText());
            boolean encontro = conn.resultado.next();

            if (encontro == true) {
                jTdescripcion.setText(conn.resultado.getString("description"));

                if (operacion.equals("borrar")) {
                    int mensaje = JOptionPane.showConfirmDialog(this, "Deseas Borrar-->" + jTdescripcion.getText(), "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (mensaje == JOptionPane.YES_OPTION)//si quiere borrar
                    {
                        conn.sentencia = conn.conexion.createStatement();
                        conn.sentencia.executeUpdate("delete from  cajas where  id = " + jTcodcaja.getText());
                        JOptionPane.showMessageDialog(null, "El registro ha sido borrado satisfactoriamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    this.jBcancelar.doClick();

                }

                if (operacion.equals("editar")) {
                    jTdescripcion.setEnabled(true);
                    jTdescripcion.requestFocus();
                }

            } else // no encontro
            {
                JOptionPane.showMessageDialog(null, "No existe un registro con este codigo!", "Atencion", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(caja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void genreporte() //throws JRException, Exception
    {
        try //throws JRException, Exception
        {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT id,description FROM cajas"); //OJO LE PASO LA SENTENCIA
            JRResultSetDataSource jrRS = new JRResultSetDataSource(conn.resultado);

            HashMap parameters = new HashMap();
            URL urlMaestro = getClass().getClassLoader().getResource("reportes/reporcaja.jasper");

            // Cargamos el reporte
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport, parameters, jrRS);
            JasperViewer ventana = new JasperViewer(masterPrint, false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(caja.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(caja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String operacion = "";

    private void buscar_timbrado() {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT * FROM timbrado where id =" + this.timbcod.getText());

            if (conn.resultado.next())//si encontro
            {
                this.timbnum.setText(conn.resultado.getString("nro_timbrado"));
                this.jTdescripcion.setEnabled(true);
                this.jTdescripcion.requestFocus();

            } else//no encontro
            {
                JOptionPane.showMessageDialog(null, "CODIGO DE TIMBRADO NO EXISTE", "MENSAJE",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException exceptionSql) {
            JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

}
