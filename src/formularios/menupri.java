/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * menu.java
 *
 * Created on 17-sep-2013, 18:18:41
 */
package formularios;
// 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import programas.ver_conex;

/**
 *
 * @author Eduardo Avila
 */
public class menupri extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menupri() {
        initComponents();
        lnombre.setText(acceso.usunom);
        lfecha.setText(acceso.fechasistema);
        // usunivel = acceso.pasarnivel();
        setExtendedState(menupri.MAXIMIZED_BOTH);
        Timer time = new Timer(250, new escucha());
        time.start();
        String codUser = acceso.usucod;
        usucodigo.setText(acceso.usucod);

    }

    class escucha implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Calendar ahora = Calendar.getInstance();
            int hor = ahora.get(Calendar.HOUR_OF_DAY);
            int min = ahora.get(Calendar.MINUTE);
            int seg = ahora.get(Calendar.SECOND);
            hora.setText(hor + ":" + min + ":" + seg);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        jPopupMenu6 = new javax.swing.JPopupMenu();
        jPopupMenu7 = new javax.swing.JPopupMenu();
        jPopupMenu8 = new javax.swing.JPopupMenu();
        jPopupMenu9 = new javax.swing.JPopupMenu();
        jPopupMenu10 = new javax.swing.JPopupMenu();
        jPopupMenu11 = new javax.swing.JPopupMenu();
        jMenu4 = new javax.swing.JMenu();
        jPopupMenu12 = new javax.swing.JPopupMenu();
        jPopupMenu13 = new javax.swing.JPopupMenu();
        jPopupMenu14 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lnombre = new javax.swing.JLabel();
        lfecha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        usucodigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        CambioPrecio = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        menusalir = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        conversiones = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemconfirmar = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu8.setText("jMenu8");

        jMenuItem15.setText("jMenuItem15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(173, 216, 230));
        setMinimumSize(new java.awt.Dimension(5, 10));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/calendario.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("Usuario:");

        lnombre.setBackground(new java.awt.Color(0, 153, 153));
        lnombre.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lnombre.setText("Nombre ");

        lfecha.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lfecha.setText("Fechasistema");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/reloj.png"))); // NOI18N

        hora.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        hora.setText("Hora sistema");

        usucodigo.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        usucodigo.setText("Cod.");

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Agregar texto.png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Referenciales");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenu5.setText("Referenciales Producto");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        CambioPrecio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CambioPrecio.setText("Cambio de Precios");
        CambioPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambioPrecioActionPerformed(evt);
            }
        });
        jMenu5.add(CambioPrecio);

        jMenu1.add(jMenu5);

        jMenu7.setText("Referenciales de Compra");
        jMenu7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jMenuItem11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem11.setText("Producto");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem12.setText("Proveedor");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem12);

        jMenu1.add(jMenu7);

        jMenu9.setText("Gestion Usuarios");
        jMenu9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jMenuItem13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem13.setText("Funcionarios");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem14.setText("Usuarios");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem14);

        jMenu1.add(jMenu9);

        jMenuBar1.add(jMenu1);

        menusalir.setForeground(new java.awt.Color(255, 255, 255));
        menusalir.setText("Gestion de compras");
        menusalir.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        menusalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusalirActionPerformed(evt);
            }
        });

        jMenuItem7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem7.setText("Registros de Compras");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menusalir.add(jMenuItem7);

        conversiones.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        conversiones.setText("Conversiones");
        conversiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversionesActionPerformed(evt);
            }
        });
        menusalir.add(conversiones);

        jMenuBar1.add(menusalir);

        jMenu12.setForeground(new java.awt.Color(255, 255, 255));
        jMenu12.setText("Gestion de Ventas");
        jMenu12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jMenu12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu12ActionPerformed(evt);
            }
        });

        jMenuItem16.setText("COBROS");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem16);

        jMenuItem19.setText("CAJAS");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem19);

        jMenuItem25.setText("APERTURA DE CAJAS");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem25);

        jMenuItem29.setText("CIERRE DE CAJAS");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem29);

        jMenuItem30.setText("ARQUEO");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem30);

        jMenuBar1.add(jMenu12);

        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setText("Informes");
        jMenu6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jMenu6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu6KeyPressed(evt);
            }
        });

        jMenuItem26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem26.setText("Reportes");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem26);

        jMenuItem27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem27.setText("Consulta Precios");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem27);

        jMenuItem28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem28.setText("Configurar Impresion");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem28);

        jMenuBar1.add(jMenu6);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Salir");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        itemconfirmar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        itemconfirmar.setText("Confirmar");
        itemconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemconfirmarActionPerformed(evt);
            }
        });
        jMenu3.add(itemconfirmar);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usucodigo)
                .addGap(12, 12, 12)
                .addComponent(lnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addGap(202, 202, 202)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lfecha)
                .addGap(61, 61, 61)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(hora)
                .addGap(226, 226, 226))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lfecha)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(lnombre)
                        .addComponent(usucodigo))
                    .addComponent(hora))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menusalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusalirActionPerformed

        salir();
}//GEN-LAST:event_menusalirActionPerformed

    private void itemconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemconfirmarActionPerformed
        // TODO add your handling code here:
        //salir();
        System.exit(0);
    }//GEN-LAST:event_itemconfirmarActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        // new bancos().setVisible(true);

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        //new compras().setVisible(true);
        if (acceso.usunivel.equals("1")) {
            new compras().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "USTED NO TIENE AUTORIZACION PARA UTILIZAR ESTE FORMULARIO");
            //  JOptionPane.showMessageDialog(null, "");
        }

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6KeyPressed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        if (acceso.usunivel.equals("1")) {
            new Proveedores().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "USTED NO TIENE AUTORIZACION PARA UTILIZAR ESTE FORMULARIO");
            //  JOptionPane.showMessageDialog(null, "");
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        if (acceso.usunivel.equals("1")) {
            new Productos().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "USTED NO TIENE AUTORIZACION PARA UTILIZAR ESTE FORMULARIO");
            //  JOptionPane.showMessageDialog(null, "");
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed

        if (acceso.usunivel.equals("1")) {
            new ReporteInventario().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "USTED NO TIENE AUTORIZACION PARA UTILIZAR ESTE FORMULARIO");
            //  JOptionPane.showMessageDialog(null, "");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        if (acceso.usunivel.equals("1") || acceso.usunivel.equals("2")) {
            try {
                BuscarDatosApertura();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(menupri.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(menupri.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(menupri.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "USTED NO TIENE AUTORIZACION PARA UTILIZAR ESTE FORMULARIO");
            //  JOptionPane.showMessageDialog(null, "");
        }


    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenu12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu12ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        if (acceso.usunivel.equals("1")) {
            new caja().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "USTED NO TIENE AUTORIZACION PARA UTILIZAR ESTE FORMULARIO");
            //  JOptionPane.showMessageDialog(null, "");
        }
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        // TODO add your handling code here:
        if (acceso.usunivel.equals("1") || acceso.usunivel.equals("2")) {
            try {
                new apertura_cierre().setVisible(true);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(menupri.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(menupri.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(menupri.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "USTED NO TIENE AUTORIZACION PARA UTILIZAR ESTE FORMULARIO");
            //  JOptionPane.showMessageDialog(null, "");
        }
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        // TODO add your handling code here:

        // TODO add your handling code here:
        if (acceso.usunivel.equals("1")) {
            try {
                new cierre().setVisible(true);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(menupri.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(menupri.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(menupri.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "USTED NO TIENE AUTORIZACION PARA UTILIZAR ESTE FORMULARIO");
            //  JOptionPane.showMessageDialog(null, "");
        }
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        // TODO add your handling code here:
        if (acceso.usunivel.equals("1")) {
            new Arqueo().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "USTED NO TIENE AUTORIZACION PARA UTILIZAR ESTE FORMULARIO");
            //  JOptionPane.showMessageDialog(null, "");
        }
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void CambioPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambioPrecioActionPerformed
        // TODO add your handling code here:
        if (acceso.usunivel.equals("1")) {
            new CostoArticulo().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "USTED NO TIENE AUTORIZACION PARA UTILIZAR ESTE FORMULARIO");
            //  JOptionPane.showMessageDialog(null, "");
        }
    }//GEN-LAST:event_CambioPrecioActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        if (acceso.usunivel.equals("1")) {
            new Funcionarios().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "USTED NO TIENE AUTORIZACION PARA UTILIZAR ESTE FORMULARIO");
            //  JOptionPane.showMessageDialog(null, "");
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        if (acceso.usunivel.equals("1")) {
            new usuarios().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "USTED NO TIENE AUTORIZACION PARA UTILIZAR ESTE FORMULARIO");
            //  JOptionPane.showMessageDialog(null, "");
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        // TODO add your handling code here:

        new ConsultaPrecios().setVisible(true);
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        // TODO add your handling code here:
        if (acceso.usunivel.equals("1")) {
            new Imprimir().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "USTED NO TIENE AUTORIZACION PARA UTILIZAR ESTE FORMULARIO");
            //  JOptionPane.showMessageDialog(null, "");
        }
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void conversionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversionesActionPerformed
        // TODO add your handling code here:
        if (acceso.usunivel.equals("1")) {
            new Conversiones().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "USTED NO TIENE AUTORIZACION PARA UTILIZAR ESTE FORMULARIO");
            //  JOptionPane.showMessageDialog(null, "");
        }
    }//GEN-LAST:event_conversionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menupri().setVisible(true);
            }
        });
    }
    public static String usunivel = "";
    public String verificador = "";
    public static String usucod = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CambioPrecio;
    private javax.swing.JMenuItem conversiones;
    private javax.swing.JLabel hora;
    private javax.swing.JMenuItem itemconfirmar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu10;
    private javax.swing.JPopupMenu jPopupMenu11;
    private javax.swing.JPopupMenu jPopupMenu12;
    private javax.swing.JPopupMenu jPopupMenu13;
    private javax.swing.JPopupMenu jPopupMenu14;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private javax.swing.JPopupMenu jPopupMenu6;
    private javax.swing.JPopupMenu jPopupMenu7;
    private javax.swing.JPopupMenu jPopupMenu8;
    private javax.swing.JPopupMenu jPopupMenu9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lfecha;
    private javax.swing.JLabel lnombre;
    private javax.swing.JMenu menusalir;
    public static javax.swing.JLabel usucodigo;
    // End of variables declaration//GEN-END:variables
    private void salir() {
        int respuesta = JOptionPane.showConfirmDialog(this, "DESEA SALIR", "CONFIRMAR", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }

    private void ingresarajustes() {
        try {
            // TODO add your handling code here:
            ver_conex conn = new ver_conex();//instanciamos
            conn.sentencia = conn.conexion.createStatement();
            //  usunivel = conn.resultado.getString("nivel");
            if (acceso.usunivel.equals("1")) {
                // new ajustes().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usted no puede utilizar el formulario de ajustes");
            }
        } catch (SQLException ex) {
            Logger.getLogger(menupri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ingresarmercaderias() {
        try {
            // TODO add your handling code here:
            ver_conex conn = new ver_conex();//instanciamos
            conn.sentencia = conn.conexion.createStatement();
            //  usunivel = conn.resultado.getString("nivel");
            if (acceso.usunivel.equals("1")) {
                // new mercaderia().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usted no puede utilizar el formulario de ajustes");
            }
        } catch (SQLException ex) {
            Logger.getLogger(menupri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void BuscarDatos55() throws ClassNotFoundException, InstantiationException, IllegalAccessException//throws IllegalAccessException,ClassNotFoundException,InstantiationException
    {
        try //throws IllegalAccessException,ClassNotFoundException,InstantiationException
        {
            ver_conex conn = new ver_conex();//instanciamos
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT COALESCE(COUNT(aper_cod),0) AS cantidad_apertura FROM aper_cierre_caja\n"
                    + " WHERE est_cod= 7  AND usu_cod='" + usucodigo.getText() + "' "); //OJO LE PASO LA SENTENCIA
            conn.resultado.next();
            // usucodigo = conn.resultado.getString("usu_cod");
            verificador = conn.resultado.getString("cantidad_apertura");

            if (verificador.equals("0")) {

                new apertura_cierre().setVisible(true);
                //  this.setVisible(false);
                //sino mensaje usuario bloqueado
                //System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Existe una Apertura Abierta");
                // System.exit(0):
            }
        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void BuscarDatosApertura() throws ClassNotFoundException, InstantiationException, IllegalAccessException//throws IllegalAccessException,ClassNotFoundException,InstantiationException
    {
        try //throws IllegalAccessException,ClassNotFoundException,InstantiationException
        {
            ver_conex conn = new ver_conex();//instanciamos
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT COALESCE(COUNT(id),0) AS cantidad_apertura\n"
                    + "                   FROM aper_cierre\n"
                    + "                   WHERE estado = 2\n"
                    + "                   AND usu_cod = " + usucodigo.getText() + ""); //OJO LE PASO LA SENTENCIA
            conn.resultado.next();
            // usucodigo = conn.resultado.getString("usu_cod");
            verificador = conn.resultado.getString("cantidad_apertura");

            if (verificador.equals("0")) {

                JOptionPane.showMessageDialog(null, "Debe realizar una Apertura para poder habilitar Cobros");

                int res = javax.swing.JOptionPane.showOptionDialog(this,
                        "Desea realizar la apertura de una caja?", "Sistema", javax.swing.JOptionPane.OK_CANCEL_OPTION,
                        javax.swing.JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Si", "No"}, "Si");
                if (res == javax.swing.JOptionPane.OK_OPTION) {
                    new apertura_cierre().setVisible(true);
                }

            } else {

                new cobros().setVisible(true);
                // System.exit(0):
            }
        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
