package formularios;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import programas.ver_conex;

public class acceso extends javax.swing.JFrame {

    // conexion conn =new conexion();//instanciamos
    //  ver_conex conn =new ver_conex();//instanciamos
    int movi = 0;
    int contador = 0;
    // private String b;

    /**
     * Creates new form Contrase
     */
    public acceso() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        initComponents();

        this.setLocationRelativeTo(null);
        //centrar
        ver_conex conn = new ver_conex();
        txtUsuario.setEnabled(true);
        txtUsuario.requestFocus();

    }

    public void BuscarDatos() throws ClassNotFoundException, InstantiationException, IllegalAccessException//throws IllegalAccessException,ClassNotFoundException,InstantiationException
    {
        try //throws IllegalAccessException,ClassNotFoundException,InstantiationException
        {
            String Contra = "";
            String Contra2 = "";
            ver_conex conn = new ver_conex();//instanciamos
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT *,CURDATE()AS fecha,CONCAT(CONCAT(funcionario.func_nom,' - ',funcionario.func_ape)) as personal FROM \n"
                    + "usuario,funcionario,cargo,sucursal  WHERE funcionario.carg_cod=cargo.carg_cod AND funcionario.suc_cod=sucursal.suc_cod AND \n"
                    + "usuario.func_cod=funcionario.func_cod AND usu_nomb ='" + txtUsuario.getText() + "'"); //OJO LE PASO LA SENTENCIA
            conn.resultado.next();//select * from personal as p inner join sucursal as s on p.suc_cod=s-suc_cod
            Contra = new String(JPContraseña.getPassword());
            Contra2 = conn.resultado.getString("usu_pass");
            usunivel = conn.resultado.getString("usu_nivel");
            usunombre = conn.resultado.getString("usu_nomb");
            fechasistema = conn.resultado.getString("fecha");
            usuestado = conn.resultado.getString("usu_estado");
            usunom = conn.resultado.getString("personal");
            usucod = conn.resultado.getString("usu_cod");

            if (Contra.trim().equals(Contra2.trim())) {
                //preguntar estado == A

                if (usuestado.equals("1")) {
                    btnAcepta.setEnabled(true);
                    btnAcepta.requestFocus();
                    new menupri().setVisible(true);
                    //  this.setVisible(false);
                    //sino mensaje usuario bloqueado
                    dispose();
                } else if (usuestado.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Este usuario esta inactivo");
                    Limpiar();
                    txtUsuario.requestFocus();
                    JPContraseña.setEnabled(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Usted esta bloqueado");
                    System.exit(0);

                }

            } else //mal
            {
                JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA");
                contador++;

                //System.out.println(contador);
                if (contador == 3) {
                    ///boquear el usuario(update)
                    // UPDATE usuarios SET estado = "B" WHERE USER = "cacho";
                    // ver_conex conn =new ver_conex();//instanciamos
                    conn.sentencia = conn.conexion.createStatement();
                    conn.sentencia.executeUpdate("UPDATE usuario SET usu_estado = '1' WHERE usu_nomb = '" + txtUsuario.getText() + "'");
                    // System.exit(0);
                    JOptionPane.showMessageDialog(null, "Usted ha sido Bloqueado pongase en contacto con el admnistrador del sistema");
                    System.exit(0);
                } else {
                    Limpiar();
                    txtUsuario.requestFocus();
                    JPContraseña.setEnabled(false);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Limpiar() {
        txtUsuario.setText("");
        JPContraseña.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAcepta = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcodsucur = new javax.swing.JTextField();
        txtsucursal = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        JPContraseña = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ACCESO AL SISTEMA");
        setBackground(new java.awt.Color(0, 102, 102));
        setBounds(new java.awt.Rectangle(250, 300, 0, 0));
        setForeground(new java.awt.Color(0, 153, 153));
        setResizable(false);

        btnAcepta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAcepta.setText("ACEPTAR");
        btnAcepta.setEnabled(false);
        btnAcepta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptaActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/SALIR.png"))); // NOI18N
        btnCancelar.setText("SALIR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login-usuario.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(173, 216, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Contraseña:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Usuario:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtcodsucur.setEditable(false);
        txtcodsucur.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtcodsucur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodsucurActionPerformed(evt);
            }
        });

        txtsucursal.setEditable(false);
        txtsucursal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtsucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsucursalActionPerformed(evt);
            }
        });

        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtUsuario.setEnabled(false);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        JPContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        JPContraseña.setEnabled(false);
        JPContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPContraseñaActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(txtUsuario, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .add(JPContraseña)))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(40, 40, 40)
                        .add(txtcodsucur, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(txtsucursal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(txtsucursal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(txtcodsucur, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jLabel9))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5))
                        .add(10, 10, 10)
                        .add(JPContraseña, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jLabel6))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(173, 216, 230));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("ACCESO AL SISTEMA");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(47, 47, 47)
                .add(jLabel4)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                    .add(btnAcepta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 122, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(btnCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 129, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 229, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1)
                .add(18, 18, 18)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnAcepta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptaActionPerformed
        try {
            BuscarDatos();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        //  new menupri().setVisible(true);

}//GEN-LAST:event_btnAceptaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        buscarusuario();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void JPContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPContraseñaActionPerformed
        // try {
        // TODO add your handling code here:
        btnAcepta.setEnabled(true);
        btnAcepta.requestFocus();
        btnAcepta.doClick();
//            BuscarDatos();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_JPContraseñaActionPerformed

    private void txtsucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsucursalActionPerformed

    private void txtcodsucurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodsucurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodsucurActionPerformed
//init se pone en vez de main

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new acceso().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    public static String usunivel = "";
    public static String sucurdescri = "";
    public static String usucod = "";
    public static String usunombre = "";
    public static String fechasistema = "";
    public static String usuestado = "";
    public static String usunom = "";

    // servidor ----
    public static String vhost = "localhost";
    public static String vuser = "root";
    public static String vpas = "admin";

// //cajas
//    public static String vhost = "DESKTOP-M5CEUG";
//    public static String vuser = "cajas";
//    public static String vpas = "Cajas1";
    public static String vbd = "producsys";

    public static String ususucur = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPContraseña;
    private javax.swing.JButton btnAcepta;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtcodsucur;
    private javax.swing.JTextField txtsucursal;
    // End of variables declaration//GEN-END:variables
    private void buscarusuario() {
        try {

            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT * FROM usuario,funcionario,sucursal WHERE usuario.func_cod=usuario.func_cod AND funcionario.suc_cod=sucursal.suc_cod AND usuario.usu_nomb='" + txtUsuario.getText() + "'");
            boolean encontro = conn.resultado.next();

            if (encontro == true) {
                JPContraseña.setEnabled(true);
                JPContraseña.requestFocus();
                ususucur = conn.resultado.getString("suc_cod");
                sucurdescri = conn.resultado.getString("suc_desc");
                txtcodsucur.setText(ususucur);
                txtsucursal.setText(sucurdescri);
            } else // no encontro
            {
                JOptionPane.showMessageDialog(null, "No existe el login ingresado!", "Atencion", JOptionPane.ERROR_MESSAGE);
                Limpiar();
                txtcodsucur.setText("");
                txtsucursal.setText("");
                txtUsuario.requestFocus();
            }

        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void validarServidor() {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("");
            boolean hayDatos = conn.resultado.next();
            if (hayDatos == true) {

            }

        } catch (Exception e) {
        }

    }
}
