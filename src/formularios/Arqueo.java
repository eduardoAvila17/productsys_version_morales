
/*
 * Arqueo.java
 *
 * Created on 19/09/2016, 03:53:18 PM
 */
package formularios;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import programas.ver_conex;

/**
 *
 * @author lorena
 */
public class Arqueo extends javax.swing.JFrame {

    ver_conex conn = new ver_conex();

    /**
     * Creates new form Arqueo
     */
    public Arqueo() {
        initComponents();
        this.suc_cod.setText(acceso.ususucur);//codigo de sucursal
        this.suc_nom.setText(acceso.sucurdescri); // sucursal 
        this.usu_cod.setText(acceso.usucod);
        this.per_nom.setText(acceso.usunombre);
        this.setLocationRelativeTo(null);//para centrar
        traer_hora();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnarqueo = new javax.swing.JButton();
        btngrabar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btndatos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        per_ape = new javax.swing.JTextField();
        suc_nom = new javax.swing.JTextField();
        usu_cod = new javax.swing.JTextField();
        per_nom = new javax.swing.JTextField();
        suc_cod = new javax.swing.JTextField();
        ar_nro = new javax.swing.JTextField();
        caj_cod = new javax.swing.JTextField();
        caj_descri = new javax.swing.JTextField();
        apcie_nro = new javax.swing.JTextField();
        ar_fecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ar_hora = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        efectivo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnarqueo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1486485588-add-create-new-math-sign-cross-plus_81186.png"))); // NOI18N
        btnarqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnarqueoActionPerformed(evt);
            }
        });

        btngrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savedisk_floppydisk_guardar_1543.png"))); // NOI18N
        btngrabar.setEnabled(false);
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_icon-icons.com_73703.png"))); // NOI18N
        btncancelar.setEnabled(false);
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout_90894.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btndatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_locate_find_icon-icons.com_67287.png"))); // NOI18N
        btndatos.setEnabled(false);
        btndatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatosActionPerformed(evt);
            }
        });
        btndatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btndatosKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(173, 216, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel11.setText("Arqueo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jPanel3.setBackground(new java.awt.Color(173, 216, 230));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Sucursal:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Usuario");

        per_ape.setEditable(false);
        per_ape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per_apeActionPerformed(evt);
            }
        });

        suc_nom.setEditable(false);

        usu_cod.setEditable(false);

        per_nom.setEditable(false);

        suc_cod.setEditable(false);
        suc_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suc_codActionPerformed(evt);
            }
        });

        ar_nro.setEditable(false);

        caj_cod.setEnabled(false);

        caj_descri.setEnabled(false);
        caj_descri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caj_descriActionPerformed(evt);
            }
        });

        apcie_nro.setEnabled(false);
        apcie_nro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apcie_nroActionPerformed(evt);
            }
        });
        apcie_nro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apcie_nroKeyTyped(evt);
            }
        });

        ar_fecha.setEditable(false);
        ar_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ar_fechaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("N°:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Apertura:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Caja");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Fecha:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Hora:");

        ar_hora.setEditable(false);
        ar_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ar_horaActionPerformed(evt);
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
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usu_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(per_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(per_ape, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(suc_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(suc_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apcie_nro))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caj_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caj_descri)))
                        .addGap(342, 342, 342))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ar_nro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ar_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ar_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usu_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(per_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(per_ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(suc_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suc_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ar_nro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ar_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ar_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(apcie_nro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(caj_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caj_descri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        efectivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        efectivo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "EFECTIVO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        efectivo.setEnabled(false);
        efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efectivoActionPerformed(evt);
            }
        });
        efectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                efectivoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnarqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btndatos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btngrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btngrabar)
                    .addComponent(btncancelar)
                    .addComponent(btnsalir)
                    .addComponent(btndatos)
                    .addComponent(btnarqueo))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void suc_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suc_codActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_suc_codActionPerformed

    private void ar_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ar_horaActionPerformed
       
    }//GEN-LAST:event_ar_horaActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        int mensaje = JOptionPane.showConfirmDialog(this, "Deseas salir?", "Salida", JOptionPane.YES_NO_OPTION);

        if (mensaje == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        hab_botones();
        des_tex();
        clear_text();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnarqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnarqueoActionPerformed
        operacion = "arqueo";
     //   hab_text();
        des_botones();
        // traer_fecha();
        // traer_hora();
           gen_codigo();
        this.btndatos.setEnabled(true);
        this.btndatos.requestFocus();
    }//GEN-LAST:event_btnarqueoActionPerformed

    private void ar_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ar_fechaActionPerformed

    }//GEN-LAST:event_ar_fechaActionPerformed

    private void apcie_nroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apcie_nroActionPerformed
        this.btndatos.setEnabled(false);
        try {
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT AC.ID_CAJA,\n" +
"                    C.DESCRIPTION,\n" +
"                      AC.ID,\n" +
"                    U.USU_COD,\n" +
"                     DATE_FORMAT(AC.FECHA_APER,'%d-%m-%Y') AS FECHA\n" +
"                    FROM APER_CIERRE AC \n" +
"                    INNER JOIN CAJAS C ON C.ID = AC.ID_CAJA \n" +
"                    INNER JOIN USUARIO U ON U.USU_COD = AC.USU_COD\n" +
"                    WHERE AC.ESTADO = '3'\n" +
"                    AND AC.ID = "+apcie_nro.getText()+" ");

            boolean encontro = conn.resultado.next();
            if (encontro == true) {//encontro
                caj_cod.setText(conn.resultado.getString("ID_CAJA"));
                caj_descri.setText(conn.resultado.getString("DESCRIPTION"));
                usu_cod.setText(conn.resultado.getString("USU_COD"));
                ar_fecha.setText(conn.resultado.getString("FECHA"));

                //   calcular_tarjeta();
                  efectivo.setEnabled(true);
                  efectivo.requestFocus(); 
                  apcie_nro.setEnabled(false);
                 //  calcular_cheque();
                //  cal_total();

               

            } else {
                JOptionPane.showMessageDialog(null, "El personal responsable de esta caja tiene que hacer el arqueo", "Atencion", JOptionPane.ERROR_MESSAGE);

                this.apcie_nro.setText("");
                this.apcie_nro.setEnabled(true);
                this.btndatos.setEnabled(true);
                this.apcie_nro.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Arqueo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_apcie_nroActionPerformed

    private void caj_descriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caj_descriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caj_descriActionPerformed

    private void apcie_nroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apcie_nroKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_apcie_nroKeyTyped

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
        grabar();
        hab_botones();
        des_tex();
        clear_text();
    }//GEN-LAST:event_btngrabarActionPerformed

    private void btndatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btndatosKeyPressed
       
    }//GEN-LAST:event_btndatosKeyPressed

    private void btndatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatosActionPerformed
        // TODO add your handling code here:
        ventanaBuscar();
    }//GEN-LAST:event_btndatosActionPerformed

    private void efectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efectivoActionPerformed
        // TODO add your handling code here:
         this.btngrabar.setEnabled(true);
         this.btngrabar.requestFocus();
    }//GEN-LAST:event_efectivoActionPerformed

    private void efectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_efectivoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_efectivoKeyTyped

    private void per_apeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per_apeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_per_apeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arqueo().setVisible(true);
            }
        });
    }
    private String operacion = "";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apcie_nro;
    private javax.swing.JTextField ar_fecha;
    private javax.swing.JTextField ar_hora;
    private javax.swing.JTextField ar_nro;
    private javax.swing.JButton btnarqueo;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btndatos;
    private javax.swing.JButton btngrabar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JTextField caj_cod;
    private javax.swing.JTextField caj_descri;
    private javax.swing.JTextField efectivo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField per_ape;
    private javax.swing.JTextField per_nom;
    private javax.swing.JTextField suc_cod;
    private javax.swing.JTextField suc_nom;
    private javax.swing.JTextField usu_cod;
    // End of variables declaration//GEN-END:variables

    ////////////////////////////////////////////////////////////////////////////////
    private void hab_botones() {
        this.btnarqueo.setEnabled(true);
        this.btncancelar.setEnabled(false);
        this.btngrabar.setEnabled(false);
        this.btnsalir.setEnabled(true);
        this.btndatos.setEnabled(false);
    }
////////////////////////////////////////////////////////////////////////////////

    private void des_botones() {
        this.btnarqueo.setEnabled(false);
        this.btncancelar.setEnabled(true);
        this.btngrabar.setEnabled(false);
        this.btnsalir.setEnabled(false);
        this.btndatos.setEnabled(false);
    }
////////////////////////////////////////////////////////////////////////////////

    private void hab_text() {
        this.ar_hora.setEnabled(true);
        this.ar_hora.requestFocus();
    }
////////////////////////////////////////////////////////////////////////////////

    private void des_tex() {
        this.apcie_nro.setEnabled(false);
        this.ar_fecha.setEnabled(false);
        this.ar_hora.setEnabled(false);
        this.apcie_nro.setEnabled(false);
        this.caj_cod.setEnabled(false);
        this.caj_descri.setEnabled(false);
        this.efectivo.setEnabled(false);

    }
////////////////////////////////////////////////////////////////////////////////

    private void clear_text() {
        this.apcie_nro.setText("");
        this.ar_fecha.setText("");
        this.ar_hora.setText("");
        this.apcie_nro.setText("");
        this.caj_cod.setText("");
        this.caj_descri.setText("");
        this.efectivo.setText("");

        // this.per_cod.setText("");
        this.ar_nro.setText("");
    }
////////////////////////////////////////////////////////////////////////////////

    private void traer_fecha() {
        try {
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("select date_format(current_date(),'%d/%m/%Y') as fecha");
            conn.resultado.next();
            ar_fecha.setText(conn.resultado.getString("fecha"));
        } catch (SQLException ex) {
            Logger.getLogger(Arqueo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
////////////////////////////////////////////////////////////////////////////////

    private void traer_hora() {
        try {
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT CURTIME() AS hora");
            conn.resultado.next();
            ar_hora.setText(conn.resultado.getString("hora"));
        } catch (SQLException ex) {
            Logger.getLogger(Arqueo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
////////////////////////////////////////////////////////////////////////////////

    private void gen_codigo() {
        try {
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(id),0)+1 AS newcod FROM arqueo");
            conn.resultado.next();

            ar_nro.setText(conn.resultado.getString("newcod"));

        } catch (SQLException exceptionSql) {
            JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

////////////////////////////////////////////////////////////////////////////////
// private void calcular_tarjeta(){
//     try {
//           String f=ar_fecha.getText();
//           String dd=f.substring(0,2);
//           String mm=f.substring(3,5);
//           String aa=f.substring(6,10);
//           String fech=aa+"/"+mm+"/"+dd;
//           DateFormat df=new SimpleDateFormat(fech);
//
//       ver_conex  conn2 = new ver_conex();
//        conn2.sentencia = conn2.conexion.createStatement();
//        conn2.resultado = conn2.sentencia.executeQuery("SELECT * FROM  cobro co WHERE  co.caja_cod='"+this.caj_cod.getText()+"' AND co.suc_cod= "+this.suc_cod.getText());
//
//        boolean encontro3 = conn2.resultado.next();
//        if (encontro3==true)
//        {
//        ver_conex  conn3 = new ver_conex();
//
//    conn3.sentencia = conn3.conexion.createStatement();
//    conn3.resultado = conn3.sentencia.executeQuery("SELECT SUM(t.tarj_monto) AS tarjeta FROM detalle_tarjeta t LEFT JOIN cobro c ON(t.cobr_cod=c.cobr_cod) WHERE c.caja_cod="+this.caj_cod.getText());
//
//          while(conn3.resultado.next())
//           {
//             this.tarjeta.setText(conn3.resultado.getString("tarjeta"));
//             if (tarjeta.getText().equals("")){
////                 int valor=0;
//                tarjeta.setText(String.valueOf(0));
//             }
//           }
//         }
//        else{
//                JOptionPane.showMessageDialog(null,"No se ha realizado cobros", "No hay montos",
//                JOptionPane.INFORMATION_MESSAGE);
//                int valor=0;
//                tarjeta.setText(String.valueOf(0));
//            }
//
//        }
//    catch(SQLException e)
//            {
//		JOptionPane.showMessageDialog(null, e.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
//            }
//  }
////////////////////////////////////////////////////////////////////////////////
    private void calcular_efectivo() {
        try {
            String f = ar_fecha.getText();
            String dd = f.substring(0, 2);
            String mm = f.substring(3, 5);
            String aa = f.substring(6, 10);
            String fech = aa + "/" + mm + "/" + dd;
            DateFormat df = new SimpleDateFormat(fech);

            ver_conex conn1 = new ver_conex();
            conn1.sentencia = conn1.conexion.createStatement();
            conn1.resultado = conn1.sentencia.executeQuery("SELECT * FROM  cobro co WHERE  co.caja_cod='" + this.caj_cod.getText() + "' AND co.suc_cod= " + this.suc_cod.getText());

            boolean encontro4 = conn1.resultado.next();
            if (encontro4 == true) {
                ver_conex conn4 = new ver_conex();

                conn4.sentencia = conn4.conexion.createStatement();
                conn4.resultado = conn4.sentencia.executeQuery("SELECT SUM(e.monto) AS efectivo FROM detalle_efectivo e LEFT JOIN cobro c ON(e.cobr_cod=c.cobr_cod) WHERE c.caja_cod=" + caj_cod.getText() + "");

                while (conn4.resultado.next()) {
                    this.efectivo.setText(conn4.resultado.getString("efectivo"));
                    if (efectivo.getText().equals("")) {
//                 int valor=0;
                        efectivo.setText(String.valueOf(0));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se ha realizado cobros", "No hay montos",
                        JOptionPane.INFORMATION_MESSAGE);
                int valor = 0;
                efectivo.setText(String.valueOf(0));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
        }
    }
////////////////////////////////////////////////////////////////////////////////
//private void calcular_cheque(){
//     try {
//           String f=ar_fecha.getText();
//           String dd=f.substring(0,2);
//           String mm=f.substring(3,5);
//           String aa=f.substring(6,10);
//           String fech=aa+"/"+mm+"/"+dd;
//           DateFormat df=new SimpleDateFormat(fech);
//
//        ver_conex  conn6 = new ver_conex();
//        conn6.sentencia = conn6.conexion.createStatement();
//        conn6.resultado = conn6.sentencia.executeQuery("SELECT * FROM  cobro co WHERE  co.caja_cod='"+this.caj_cod.getText()+"' AND co.suc_cod= "+this.suc_cod.getText());
//
//        boolean encontro7 = conn6.resultado.next();
//        if (encontro7==true)
//        {
//        ver_conex  conn7 = new ver_conex();
//
//    conn7.sentencia = conn7.conexion.createStatement();
//    conn7.resultado = conn7.sentencia.executeQuery("SELECT SUM(ch.cheq_mont) AS cheque FROM detalle_cheque ch LEFT JOIN cobro c ON(ch.cobr_cod=c.cobr_cod) WHERE c.caja_cod="+caj_cod.getText()+"");
//
//          while(conn7.resultado.next())
//           {
//             this.cheque.setText(conn7.resultado.getString("cheque"));
//             if (cheque.getText().equals("")){
//                int valor=0;
//                cheque.setText(String.valueOf(0));
//             }
//           }
//         }
//        else{
//                JOptionPane.showMessageDialog(null,"No se ha realizado cobros", "No hay montos",
//                JOptionPane.INFORMATION_MESSAGE);
//                int valor=0;
//                cheque.setText(String.valueOf(0));
//            }
//
//        }
//    catch(SQLException e)
//            {
//		JOptionPane.showMessageDialog(null, e.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
//            }
//  }
////////////////////////////////////////////////////////////////////////////////
//private void cal_total()
//{
//    int subtotal;
//    subtotal = Integer.parseInt(efectivo.getText()) + Integer.parseInt(cheque.getText()) + Integer.parseInt(tarjeta.getText());
//    total.setText(String.valueOf(subtotal));
//}
////////////////////////////////////////////////////////////////////////////////

    private void grabar() {
        int res = javax.swing.JOptionPane.showOptionDialog(this,
                "Desea realizar el ARQUEO?", "Arqueo", javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Si", "No"}, "Si");
        if (res == javax.swing.JOptionPane.OK_OPTION) {
            try {
                validarCampos();
                String f = ar_fecha.getText();
                String dd = f.substring(0, 2);
                String mm = f.substring(3, 5);
                String aa = f.substring(6, 10);

                String fech = aa + "/" + mm + "/" + dd;
                DateFormat df = new SimpleDateFormat(fech);

                String SQL = null;
                if (operacion.equals("arqueo")) {
                    {
                        SQL = "INSERT INTO arqueo (id,aper_cod,caja_cod,fecha,hora,efectivo,usu_cod,sucu_cod) VALUES ("
                                + ar_nro.getText() + "," + apcie_nro.getText() + ",'" + caj_cod.getText() + "','" + fech + "','" + ar_hora.getText() + "','" + efectivo.getText() + "'," + usu_cod.getText() + "," + suc_cod.getText() + ")";
                    }
                    ver_conex c = new ver_conex();
                    c.sentencia = c.conexion.createStatement();
                    c.sentencia.executeUpdate(SQL);

                    c.sentencia = c.conexion.createStatement();
                    c.sentencia.executeUpdate("UPDATE aper_cierre SET estado = '4'  WHERE id = " + apcie_nro.getText());
                }
                JOptionPane.showMessageDialog(this, "EL ARQUEO FUE REALIZADO SATISFACTORIAMENTE", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "ERROR DE CONEXION" + e, "AVISO", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }
/////////////////////////////////////////////////////////////////////////////////

    private void validarCampos() {
        String ar = ar_nro.getText();
        String fe = ar_fecha.getText();
        String ho = ar_hora.getText();
        String ape = apcie_nro.getText();
        String caj = caj_cod.getText();
        String efe = efectivo.getText();
//    String che = cheque.getText();
//    String tar = tarjeta.getText();
//    String to = total.getText();

        if (ar.equals("")) {
            mensajeValidar(this, "\"Arqueo nro\"");
            ar_nro.requestFocus();
        } else if (fe.equals("")) {
            mensajeValidar(this, "\"Fecha\"");
            apcie_nro.requestFocus();
        } else if (ho.equals("")) {
            mensajeValidar(this, "\"Hora\"");
            ar_hora.requestFocus();
        } else if (ape.equals("")) {
            mensajeValidar(this, "\"Apertura nro\"");
            apcie_nro.requestFocus();
        } else if (caj.equals("")) {
            mensajeValidar(this, "\"Caja codigo\"");
            apcie_nro.requestFocus();
        } else if (efe.equals("")) {
            mensajeValidar(this, "\"Efectivo\"");
            apcie_nro.requestFocus();
//     } else if (che.equals("")) {
//        mensajeValidar(this, "\"Cheque\"");
//        apcie_nro.requestFocus();
//     } else if (tar.equals("")) {
//        mensajeValidar(this, "\"Tarjeta\"");
//        apcie_nro.requestFocus();
//     } else if (to.equals("")) {
//        mensajeValidar(this, "\"Total\"");
//        apcie_nro.requestFocus();
        }
    }
///////////////////////////////////////////////////////////////////////////////

    private static void mensajeValidar(JFrame x, String campo) {
        JOptionPane.showMessageDialog(x, "El campo " + campo + " no puede estar vacío", "Campos incompletos", JOptionPane.INFORMATION_MESSAGE);
    }
////////////////////////////////////////////////////////////////////////////////
    
    private void ventanaBuscar(){
           JTextField[] tfParam = new JTextField[1];
            tfParam[0] = this.apcie_nro;
            //  tfParam[1] = this.per_cod;

            String sql = "SELECT \n"
                    + "  AC.ID,\n"
                    + "  U.USU_COD,\n"
                    + "  AC.ID_CAJA,\n"
                    + "  C.DESCRIPTION,\n"
                    + "  DATE_FORMAT(AC.FECHA_APER,'%d/%m/%Y') AS FECHA\n"
                    + "FROM APER_CIERRE AC\n"
                    + "INNER JOIN CAJAS C ON C.ID = AC.ID_CAJA\n"
                    + "INNER JOIN USUARIO U ON U.USU_COD = AC.USU_COD\n"
                    + "WHERE AC.ESTADO = 3\n"
                    + "AND AC.SUCU_COD = " + this.suc_cod.getText() + " AND AC.ID LIKE";
            Buscador pp = new Buscador(sql, new String[]{"N° Apertura", "Usuario", "Nro Caja", "Descripcion", "Fecha"}, 5, tfParam);
            pp.setTitle("Buscar Apertura");
            pp.setVisible(true);
            this.apcie_nro.setEnabled(true);
            this.apcie_nro.requestFocus();
    }
}
