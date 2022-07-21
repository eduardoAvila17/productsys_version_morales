package formularios;

import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import programas.ver_conex;

public class apertura_cierre extends javax.swing.JFrame {

    private String operacion;
    private String op;
    public int monto_cierre;

    public apertura_cierre() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        initComponents();
        this.codusu.setText(acceso.usucod);
        this.tusuarionom.setText(acceso.usunombre);
        this.sucu_cod.setText(acceso.ususucur);//codigo de sucursal
        this.sucu_desc.setText(acceso.sucurdescri); // sucursal
        // controlar_apert();

//        try {
//            combocajaabierta();
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        apertura_monto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        codusu = new javax.swing.JTextField();
        tusuarionom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        combcaja = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sucu_cod = new javax.swing.JTextField();
        sucu_desc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txthora = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nuevo = new javax.swing.JButton();
        grabar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GESTIONAR CAJA");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        apertura_monto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        apertura_monto.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "MONTO APERTURA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        apertura_monto.setEnabled(false);
        apertura_monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apertura_montoActionPerformed(evt);
            }
        });
        apertura_monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apertura_montoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(apertura_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(apertura_monto, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(173, 216, 230));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nº APERTURA:");

        codusu.setEditable(false);
        codusu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tusuarionom.setEditable(false);
        tusuarionom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("FECHA:");

        fecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fecha.setText("FECHA");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("USUARIO:");

        combcaja.setEnabled(false);
        combcaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combcajaActionPerformed(evt);
            }
        });
        combcaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combcajaKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("CAJA:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("SUCURSAL:");

        sucu_cod.setEditable(false);
        sucu_cod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        sucu_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucu_codActionPerformed(evt);
            }
        });

        sucu_desc.setEditable(false);
        sucu_desc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("HORA:");

        txthora.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txthora.setText("HORA");

        num.setEditable(false);
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combcaja, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sucu_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(sucu_desc))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(codusu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tusuarionom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tusuarionom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txthora))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(fecha)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combcaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sucu_desc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(sucu_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("FORMULARIO DE APERTURA DE CAJA");

        nuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder-lock-open-4341301_120523.png"))); // NOI18N
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        grabar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savedisk_floppydisk_guardar_1543.png"))); // NOI18N
        grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grabarActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_icon-icons.com_73703.png"))); // NOI18N
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout_90894.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grabar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nuevo, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(23, 23, 23))
        );

        setSize(new java.awt.Dimension(754, 386));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        op = "A";
        bandera = "agregar";
        des_boton();
        facturar();

        try {
            combocaja();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
        }

        combcaja.setEnabled(true);
        combcaja.requestFocus();

        this.codusu.setText(acceso.usucod);
        //   monto_cierre.setText("0");

    }//GEN-LAST:event_nuevoActionPerformed

    private void grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabarActionPerformed

        // System.out.println(grabar_abrir);
        if (op.equals("A")) {
            try {
                click_grabar();
                //  grabarnumcajas();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (op.equals("C")) {
          click_cerrar();
        }
        if (bandera.equals("agregar")) {
            grabarnumcajas();
        }
    }//GEN-LAST:event_grabarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        salir();
}//GEN-LAST:event_salirActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        limpiar_text();
        cancelar();
        hab_boton();
}//GEN-LAST:event_cancelarActionPerformed

    private void combcajaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combcajaKeyPressed
        if (evt.getKeyCode() == 10) {
//            this.monto_cierre.setEnabled(true);
//            this.monto_cierre.requestFocus();
//            this.monto_cierre.setText("");
        }
    }//GEN-LAST:event_combcajaKeyPressed

    private void sucu_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucu_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sucu_codActionPerformed

    private void combcajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combcajaActionPerformed
        // TODO add your handling code here:
        this.apertura_monto.setEnabled(true);
        this.apertura_monto.requestFocus();
        this.apertura_monto.setText("");
    }//GEN-LAST:event_combcajaActionPerformed

    private void apertura_montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apertura_montoActionPerformed
        // TODO add your handling code here:
        this.grabar.setEnabled(true);
    }//GEN-LAST:event_apertura_montoActionPerformed

    private void apertura_montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apertura_montoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_apertura_montoKeyTyped

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
        buscarAperturas();
        op = "C";
        apertura_monto.setEditable(false);
        fecha();
        Hora1();
    }//GEN-LAST:event_numActionPerformed

    private void numKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_numKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new apertura_cierre().setVisible(true);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public static String pasarnumapertura() {
        return numaper;
    }
    private static String numaper;

//     public String grabar_arqueo="";
    public String montoapertura = "";
    public ResultSet resu;
    public String num_apertura = "";
    public String opcion = "";

    private void click_grabar() throws ClassNotFoundException {
        int res = javax.swing.JOptionPane.showOptionDialog(this,
                "Desea grabar el monto de Apertura?", "Sistema", javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Si", "No"}, "Si");
        if (res == javax.swing.JOptionPane.OK_OPTION) {
            String SQL = null;
            String SQL2 = null;
            try {
                //     if (grabar_abrir.equals("abrir")) {                                                                                                              aper_cod,     est_cod, suc_cod,              caja_cod                       ,usu_cod,                ape_fec,          ape_hor,               monto_efe,                 monto_tar,              monto_che,              monto_aper
                SQL = "INSERT INTO aper_cierre"
                        + "(id,fecha_aper,hora_aper,id_caja,monto_aper,monto_cierre,usu_cod,sucu_cod,estado,fecha_cierre,hora_cierre)values "
                        + "(" + num.getText() + ",'" + fecha.getText() + "','" + txthora.getText() + "','" + combcaja.getSelectedItem() + "',"
                        + "" + apertura_monto.getText() + "," + 0 + "," + codusu.getText() + "," + sucu_cod.getText() + ","
                        + "" + 2 + "," + null + "," + null + ")";

                SQL2 = "UPDATE CAJAS SET ESTADO = 2 WHERE ID = '" + combcaja.getSelectedItem() + "'";

                ver_conex conn = new ver_conex();//instanciamos
                conn.sentencia = conn.conexion.createStatement();

                conn.sentencia.executeUpdate(SQL);
                conn.sentencia.executeUpdate(SQL2);
//                 conn.sentencia.executeUpdate(SQL1);
                // conn.sentencia.close();
                int resp = javax.swing.JOptionPane.showOptionDialog(this,
                        "La Caja Ha Sido Abierta.¿Desea Cobrar?", "Responda", javax.swing.JOptionPane.OK_CANCEL_OPTION,
                        javax.swing.JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Si", "No"}, "Si");
                if (resp == javax.swing.JOptionPane.OK_OPTION) {
                    new cobros().setVisible(true);
                    limpiar_text();
                    dispose();
                } else {
                    limpiar_text();
                    dispose();

                    combcaja.setEnabled(false);
                    //     monto_cierre.setEnabled(false);
                    nuevo.setEnabled(false);
//                    salir1.setEnabled(true);
                    cancelar.setEnabled(true);
                    grabar.setEnabled(false);
                    salir.setEnabled(false);
                    // consultar.setEnabled(true);

                }
                // }

            } catch (SQLException exceptionSql) {
                JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void click_cerrar() {
        int res = javax.swing.JOptionPane.showOptionDialog(this,
                "Desea Realizar el cierre de caja ?", "Sistema", javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Si", "No"}, "Si");
        if (res == javax.swing.JOptionPane.OK_OPTION) {
            String SQL = null;
            String SQL1 = null;

            SQL1 = "update aper_cierre set fecha_cierre = '" + fecha.getText() + "',hora_cierre = '" + txthora.getText() + "' ,estado=  '3' where id_caja= '" + combcaja.getSelectedItem() + "' and id= " + num.getText() + "";
            SQL = "update cajas set estado = 1 where id = '" + combcaja.getSelectedItem() + "'";

            ver_conex conn = new ver_conex();//instanciamos
            try {
                conn.sentencia = conn.conexion.createStatement();
                conn.sentencia.executeUpdate(SQL1);
            } catch (SQLException ex) {
                Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.sentencia.executeUpdate(SQL);
            } catch (SQLException ex) {
                Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "La Caja Ha Sido Cerrada", "Aviso", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void facturar() {
        generacod();
        fecha();
        Hora1();
    }

    private void combocajaabierta() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        try {
            ver_conex conn = new ver_conex();//instanciamos
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT usuario.usu_cod,\n"
                    + "                    usuario.usu_nomb,\n"
                    + "                    aper_cierre.id,\n"
                    + "                    aper_cierre.monto_aper AS importe_efectivo_apertura,\n"
                    + "                    CONCAT(CONCAT('CAJA ',cajas.description)) AS caja\n"
                    + "                    FROM usuario,aper_cierre,cajas\n"
                    + "                    WHERE cajas.id=aper_cierre.id_caja\n"
                    + "                    AND usuario.usu_cod=aper_cierre.usu_cod\n"
                    + "                    AND aper_cierre.estado = 2 \n"
                    + "       ");
            //  combcaja.removeAllItems();
            while (conn.resultado.next()) {
                combcaja.addItem(conn.resultado.getString("caja"));
                num_apertura = conn.resultado.getString("id");
                num.setText(conn.resultado.getString("id"));

                this.codusu.setText(acceso.usucod);
                this.tusuarionom.setText(acceso.usunombre);
                // codsucu.setText(conn.resultado.getString("sucu_nomb"));
                //    monto_cierre.setText(conn.resultado.getString("importe_efectivo_apertura"));
     //           salir1.setEnabled(true);
                // consultar.setEnabled(true);
                nuevo.setEnabled(false);
                grabar.setEnabled(true);
                fecha();

            }

        } catch (SQLException ex) {
            //Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void generacod() {
        try {
            ver_conex conn = new ver_conex();//instanciamos
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(id),0)+1 AS newcod ,CURDATE() AS fecha FROM aper_cierre");
            conn.resultado.next();
            num.setText(conn.resultado.getString("newcod"));

        } catch (SQLException exceptionSql) {
            JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }//fin generar

    private void buscarAperturas() {
        try {
            ver_conex conn = new ver_conex();//instanciamos
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT AC.ID AS APERTURA_ID,\n"
                    + "  AC.ID_CAJA AS ID_CAJA,\n"
                    + "  C.DESCRIPTION AS NUMERO_CAJA,\n"
                    + "  U.USU_COD AS USUARIO,\n"
                    + "  AC.HORA_APER AS HORA_APERTURA,\n"
                    + "  DATE_FORMAT(AC.FECHA_APER,'%d-%m-%Y') AS FECHA,\n"
                    + "  AC.MONTO_APER AS MONTO_APERTURA,\n"
                    + "  U.USU_NOMB AS NOMBRE_USUARIO,\n"
                    + "  SU.SUC_DESC AS SUCURSAL,\n"
                    + "  AC.SUCU_COD AS ID_LOCAL\n"
                    + "FROM APER_CIERRE AC \n"
                    + "INNER JOIN CAJAS C ON C.ID = AC.ID_CAJA \n"
                    + "INNER JOIN USUARIO U ON U.USU_COD = AC.USU_COD\n"
                    + "INNER JOIN SUCURSAL SU ON SU.SUC_COD = AC.SUCU_COD\n"
                    + "WHERE AC.ESTADO = '2'\n"
                    + "AND AC.ID = " + num.getText() + "");
            conn.resultado.next();
//            fecha.setText(conn.resultado.getString("FECHA"));
//            txthora.setText(conn.resultado.getString("HORA_APERTURA"));
            codusu.setText(conn.resultado.getString("USUARIO"));
            tusuarionom.setText(conn.resultado.getString("NOMBRE_USUARIO"));
            sucu_cod.setText(conn.resultado.getString("ID_LOCAL"));
            sucu_desc.setText(conn.resultado.getString("SUCURSAL"));
            combcaja.addItem(conn.resultado.getString("NUMERO_CAJA"));
            apertura_monto.setText(conn.resultado.getString("MONTO_APERTURA"));

        } catch (SQLException exceptionSql) {
            JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }//fin generar
//fin generar

    private void hora() {
        try {
            ver_conex conn = new ver_conex();//instanciamos current_date()  (curdate())
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("select curtime() as hora");
            conn.resultado.next();
//                hora.setText(conn.resultado.getString("hora"));

        } catch (SQLException exceptionSql) {
            JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }//fin generar

    private void des_boton() {
        cancelar.setEnabled(true);
        nuevo.setEnabled(false);
        salir.setEnabled(false);
//        salir1.setEnabled(false);
        grabar.setEnabled(false);
//        consultar.setEnabled(false);

    }

    private void consultar_todo_cobrado() {
        try {
            ver_conex conn = new ver_conex();//instanciamos current_date()  (curdate())
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("");
            conn.resultado.next();

            monto_total = Integer.parseInt(conn.resultado.getString("monto_cheque"));

        } catch (SQLException exceptionSql) {
            JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }//fin generar

    private void combocaja() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        try {

            ver_conex conn = new ver_conex();//instanciamos
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("select * from cajas where estado = 1");
            combcaja.removeAllItems();
            while (conn.resultado.next()) {
                combcaja.addItem(conn.resultado.getString("description"));
            }
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "No hay Cajas disponibles, Verifique si hay cajas abiertas!");
        }
    }

    private void consultar_arqueo() {
        try {
            ver_conex conn = new ver_conex();//instanciamos current_date()  (curdate())
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(SUM(monto_tarjeta),0) AS monto_tarjetas, IFNULL(SUM(monto_cheque),0)monto_cheque, IFNULL(SUM(monto_efectivo),0)monto_efectivo, IFNULL(MAX(nro_arqueo),0)+1 AS nuevocod FROM arqueo WHERE cod_apertura=" + num.getText());//OJO LE PASO LA SENTENCIA");
            conn.resultado.next();

//                monto_efectivo_arqueo=Integer.parseInt(conn.resultado.getString("monto_efectivo"));
//                monto_tarjeta_arqueo=Integer.parseInt(conn.resultado.getString("monto_tarjetas"));
//                monto_cheque_arqueo=Integer.parseInt(conn.resultado.getString("monto_cheque"));
//                num_arqueo=Integer.parseInt(conn.resultado.getString("nuevocod"));
            resta();

        } catch (SQLException exceptionSql) {
            JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }//fin generar

    private void resta() {
        int efectivo_restado = 0;
        int tajeta_restado = 0;
        int cheque_restado = 0;

//        efectivo_restado= monto_efectivototal-monto_efectivo_arqueo;
//        tajeta_restado=monto_tarjeta_total-monto_tarjeta_arqueo;
//        cheque_restado=monto_cheque_total-monto_cheque_arqueo;
//         arq_efectivo.setText(String.valueOf(efectivo_restado));
//         arq_cheque.setText(String.valueOf(cheque_restado));
//         arq_tarjeta.setText(String.valueOf(tajeta_restado));
    }

    private void fecha() {
        try {
            ver_conex conn = new ver_conex();//instanciamos current_date()  (curdate())
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("select date_format(current_date(),'%Y/%m/%d') as fecha");
            conn.resultado.next();
            fecha.setText(conn.resultado.getString("fecha"));
            Hora1();

        } catch (SQLException exceptionSql) {
            JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }//fin generar

    private void limpiar_text() {
        //   num.setText("");

        //    monto_cierre.setText("");
        //  arq_efectivo.setText("");
        //  arq_cheque.setText("");
        // arq_tarjeta.setText("");
        //  monto_cierre.setEnabled(false);
        // combocaja.setEnabled(false);
        //combocaja.removeAllItems();
        cancelar.setEnabled(false);
        nuevo.setEnabled(true);

//        salir1.setEnabled(false);
        salir.setEnabled(true);
        grabar.setEnabled(false);
        /// consultar.setEnabled(false);

    }

    private void cancelar() {

        //consultar.setEnabled(false);
        //    monto_cierre.setEnabled(false);
        //    combocaja.setEnabled(false);
        // combocaja.removeAllItems();
    }

    private void hab_boton() {
        cancelar.setEnabled(false);
        nuevo.setEnabled(true);

//        salir1.setEnabled(false);
        salir.setEnabled(true);
        grabar.setEnabled(false);
//      consultar.setEnabled(true);
    }

    private void salir() {
        int mensaje = JOptionPane.showConfirmDialog(this, "¿Deseas salir?", "Salida", JOptionPane.YES_NO_OPTION);

        if (mensaje == JOptionPane.YES_OPTION) {
            //System.exit(0);
            dispose();
        }
    }

    private void consulta_arqueo() {
        consultar_todo_cobrado();
        consultar_arqueo();

    }

    public void genreporte() //throws JRException, Exception
    {
        try //throws JRException, Exception
        {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            String aux = "";
            aux = aux + "SELECT CONCAT(CONCAT(usuarios.usu_cod,'-',usuarios.usu_nom)) AS usuario,fecha,monto_cierre_efect,monto_cierre_tarj,monto_cierre_cheq,";
            aux = aux + "aper_cierre_caja.ap_nro, CONCAT(CONCAT(caja.caj_cod,'-',caja.caj_descri)) AS caja, aper_cierre_caja.montoinicio";
            aux = aux + " FROM usuarios,aper_cierre_caja,caja";
            aux = aux + " WHERE aper_cierre_caja.caj_cod=caja.caj_cod AND aper_cierre_caja.usu_cod=usuarios.usu_cod AND aper_cierre_caja.estado='Cerrado' AND aper_cierre_caja.ap_nro" + num.getText();

            conn.resultado = conn.sentencia.executeQuery(aux); //OJO LE PASO LA SENTENCIA
            JRResultSetDataSource jrRS = new JRResultSetDataSource(conn.resultado);

            HashMap parameters = new HashMap();
            URL urlMaestro = getClass().getClassLoader().getResource("reportes/aperturacierrecaja.jasper");

            // Cargamos el reporte
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport, parameters, jrRS);
            JasperViewer ventana = new JasperViewer(masterPrint, false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void genreportearqueos() {
        try {
            ver_conex conn = new ver_conex();//instanciamos
            conn.sentencia = conn.conexion.createStatement();
            resu = conn.sentencia.executeQuery("select (select date_format(current_date(),'%d/%m/%Y'))as fecha, (select curtime()) as hora, (select concat(emple_nom,' ',emple_ape) from empleado as e, apertura_cierre as ac where e.emple_ci=ac.emple_ci and aper_cie_num=" + num.getText() + ") as empleado, (select emp_nom from empresa as e, apertura_cierre as ac where e.emp_cod=ac.emp_cod and aper_cie_num=" + num.getText() + ") as empresa, (select suc_nom from sucursal as s, apertura_cierre as ac where s.suc_cod=ac.suc_cod and aper_cie_num=" + num.getText() + ") as sucursal, (select caj_des from caja as c, apertura_cierre as ac where ac.caj_num=c.caj_num and aper_cie_num=" + num.getText() + ") as caja, (select max(nro_arqueo) as nuevocod from arqueo where aper_cie_num=" + num.getText() + ") as nro_arqueo, (select aper_cie_num from apertura_cierre where aper_cie_num=" + num.getText() + ") as numero");
            //         resu = conn.sentencia.executeQuery("select (select cc.cta_ven from cuentas_cobrar cc where cc.cta_num=(select max(cta_num) from cuentas_cobrar where fac_cab_num="+facturasp.getSelectedItem()+" and cta_saldo < (select cta_saldo from cuentas_cobrar where fac_cab_num="+facturasp.getSelectedItem()+" and cta_num = (select max(cta_num) from cuentas_cobrar where fac_cab_num="+facturasp.getSelectedItem()+")))) as venc, (select c.cob_cab_fecha from cobros_cab c where c.cob_cab_num="+a+") as fecha,(select max(cta_num) from cuentas_cobrar where fac_cab_num="+facturasp.getSelectedItem()+") as total_cuotas, (select max(cta_num) from cuentas_cobrar where fac_cab_num="+facturasp.getSelectedItem()+" and cta_saldo < (select cta_saldo from cuentas_cobrar where fac_cab_num="+facturasp.getSelectedItem()+" and cta_num = (select max(cta_num) from cuentas_cobrar where fac_cab_num="+facturasp.getSelectedItem()+"))) total_pagado");

        } catch (Exception ex) {
            System.exit(0);
        }

        JRResultSetDataSource jrRS = new JRResultSetDataSource(resu);
        HashMap parameters = new HashMap();

//        String monto_tarjeta=arq_tarjeta.getText();
//        String monto_cheque=arq_cheque.getText();
//        String monto_efectivo=arq_efectivo.getText();
//        String monto_apertura=aper_monto.getText();
//parameters.put("monto_cheque",monto_cheque);
//parameters.put("monto_efectivo",monto_efectivo);
//parameters.put("monto_apertura",monto_apertura);
        try {
            URL urlMaestro = getClass().getClassLoader().getResource("reportes/arqueo_de_control.jasper");
            // Cargamos el reporte
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport, parameters, jrRS);

            JasperViewer ventana = new JasperViewer(masterPrint, false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);

        } catch (JRException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + e.toString(), "ATENCION ", JOptionPane.INFORMATION_MESSAGE);
        }

    }

//     public String montoapertura="";
//     public ResultSet resu;
//     public String num_apertura="";
//     public String opcion="";
    public String fact = "";
    public String bandera = "";
    public String viva = "";
    public int monto_total = 0;//,monto_efectivo_arqueo=0,monto_tarjeta_arqueo=0,monto_cheque_arqueo=0,num_arqueo=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apertura_monto;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField codusu;
    private javax.swing.JComboBox combcaja;
    private javax.swing.JLabel fecha;
    javax.swing.JButton grabar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    javax.swing.JButton nuevo;
    private javax.swing.JTextField num;
    private javax.swing.JButton salir;
    private javax.swing.JTextField sucu_cod;
    private javax.swing.JTextField sucu_desc;
    private javax.swing.JTextField tusuarionom;
    private javax.swing.JLabel txthora;
    // End of variables declaration//GEN-END:variables

    private void Hora1() {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("select curtime() as hora");
            conn.resultado.next();
            txthora.setText(conn.resultado.getString("hora"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error" + e, "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //SELECT IFNULL(MAX(num_fa_ac),0)+10 AS newnum FROM caja WHERE caja_desc=
    private void gencod3() {
        try {
            //       Main.inicio = "no";
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(num_fa_ac),0)+1 AS newnum FROM caja WHERE caja_cod ='" + combcaja.getSelectedItem() + "'");
            conn.resultado.next();
//                   this.jLabel2.setText(conn.resultado.getString("newnum"));
            viva = (conn.resultado.getString("newnum"));
        } catch (SQLException ex) {
            Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
            //   } catch (SQLException ex)

        }
    }

    private void grabarnumcajas() {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();

            if (bandera.equals("agregar")) {

                String newViva = String.format("%07d", Integer.parseInt(viva));
                // gencod();  // sirve para que no se dupliquen los codigos y no de error cuando se trabaja en redes
                conn.sentencia.executeUpdate("update caja set num_fa_ac ='" + newViva + "' WHERE caja_desc =" + combcaja.getSelectedItem());
                // cargar_grilla();
                //  this.Bborrar.doClick();
            }

            if (bandera.equals("editar")) {
                //   conn.sentencia.executeUpdate("UPDATE marca SET mar_desc ='"+txtdescripcion.getText()+"' WHERE mar_cod ="+txtcod.getText());
                // cargar_grilla();
            }

            //   JOptionPane.showMessageDialog(null, "REGISTRO GRABADO","CONFIRMACION",JOptionPane.INFORMATION_MESSAGE);
            //  this.Bborrar.doClick();
        } catch (SQLException ex) {
            Logger.getLogger(apertura_cierre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
