/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * registrar_ingredientes.java
 *
 * Created on 15-nov-2015, 16:24:51
 */

package formularios;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
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
 * @author CLAU LORE
 */
public class registrar_ingredientes extends javax.swing.JFrame {

    /** Creates new form registrar_ingredientes */

    ver_conex conn = new ver_conex();
    javax.swing.table.DefaultTableModel cursor; //tabla
    javax.swing.table.DefaultTableModel cursor2; //grilla
    String operacion="";
    int c;
    int cc;
    private int band = 0;
ver_conex miconex =new ver_conex();


    public registrar_ingredientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        t_cod_personal.setText(acceso.usucod);
        t_nombre.setText(acceso.usunom);
        t_cod_sucursal.setText(acceso.ususucur);
        t_sucursal.setText(acceso.sucurdescri);
//        t_cod_sucursal.setText(acceso.ususucur());//codigo de sucursal
//        t_sucursal.setText(acceso.sucurdescri()); // sucursal
//        t_cod_personal.setText(acceso.percod());//codigo usuario
//        t_nombre.setText(acceso.pernom());    //nombre de usuario
//        t_apellido.setText(acceso.perapell());  //apellido de usuario
        cursor = (javax.swing.table.DefaultTableModel)tabla.getModel();
        cursor2 = (javax.swing.table.DefaultTableModel)grilla.getModel();
        setResizable(false);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        t_numero_receta = new javax.swing.JTextField();
        t_fecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t_descripcion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t_cod_unidad = new javax.swing.JTextField();
        t_unidad = new javax.swing.JTextField();
        t_cod_producto = new javax.swing.JTextField();
        t_producto = new javax.swing.JTextField();
        t_tipo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t_presentacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t_marca = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        t_cantidad = new javax.swing.JTextField();
        t_grupo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        b_producto = new javax.swing.JButton();
        b_unidad = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        t_cod_deposito = new javax.swing.JTextField();
        t_deposito = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        t_cod_personal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        t_nombre = new javax.swing.JLabel();
        t_cod_sucursal = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        t_sucursal = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        b_borrar_items = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        t_etapa = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        b_borrar_items1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        b_anular = new javax.swing.JButton();
        b_grabar = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        b_nuevo = new javax.swing.JButton();
        b_editar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "RECETAS", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        t_numero_receta.setEnabled(false);
        t_numero_receta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_numero_recetaActionPerformed(evt);
            }
        });
        t_numero_receta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_numero_recetaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_numero_recetaKeyTyped(evt);
            }
        });

        t_fecha.setEnabled(false);
        t_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_fechaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("DESCRIPCION:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("FECHA:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("NUMERO:");

        t_descripcion.setEnabled(false);
        t_descripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_descripcionMouseClicked(evt);
            }
        });
        t_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_descripcionActionPerformed(evt);
            }
        });
        t_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_descripcionKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel15.setText("BUSCAR CON F12 ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(t_numero_receta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(t_descripcion, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(t_fecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_numero_receta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel15))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "INGREDIENTES", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("PRODUCTO:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("UNIDAD:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("TIPO:");

        t_cod_unidad.setEnabled(false);
        t_cod_unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cod_unidadActionPerformed(evt);
            }
        });
        t_cod_unidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_cod_unidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cod_unidadKeyTyped(evt);
            }
        });

        t_unidad.setEnabled(false);

        t_cod_producto.setEnabled(false);
        t_cod_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cod_productoActionPerformed(evt);
            }
        });
        t_cod_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_cod_productoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cod_productoKeyTyped(evt);
            }
        });

        t_producto.setEnabled(false);

        t_tipo.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("PRESENTACION:");

        t_presentacion.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("MARCA:");

        t_marca.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("DEPOSITO:");

        t_cantidad.setEnabled(false);
        t_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cantidadActionPerformed(evt);
            }
        });
        t_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cantidadKeyTyped(evt);
            }
        });

        t_grupo.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("GRUPO:");

        b_producto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_producto.setText("ADD PRODUCTO");
        b_producto.setEnabled(false);
        b_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_productoActionPerformed(evt);
            }
        });

        b_unidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_unidad.setText("ADD UNIDAD");
        b_unidad.setEnabled(false);
        b_unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_unidadActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel16.setText("BUSCAR CON F12 ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel17.setText(" BUSCAR CON F12 ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("CANTIDAD:");

        t_cod_deposito.setEnabled(false);
        t_cod_deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cod_depositoActionPerformed(evt);
            }
        });
        t_cod_deposito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_cod_depositoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cod_depositoKeyTyped(evt);
            }
        });

        t_deposito.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(70, 70, 70)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t_grupo)
                            .addComponent(t_marca)
                            .addComponent(t_presentacion)
                            .addComponent(t_tipo)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t_cod_producto)
                                    .addComponent(t_cod_unidad, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t_unidad)
                                    .addComponent(t_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(t_cod_deposito, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(t_deposito, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(b_unidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_producto))
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(t_cantidad)
                        .addGap(139, 139, 139))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(b_producto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_unidad))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_cod_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(t_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_cod_unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(t_unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(t_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(t_cod_deposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t_deposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(20, 20, 20))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true)));

        t_cod_personal.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("FUNCIONARIO:");

        t_nombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t_nombre.setText("NOMBRE");

        t_cod_sucursal.setEnabled(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("SUCURSAL:");

        t_sucursal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t_sucursal.setText("NOMBRE");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("RECETAS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(t_cod_personal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(t_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(22, 22, 22)
                .addComponent(t_cod_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t_cod_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(t_sucursal))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(t_nombre)
                        .addComponent(t_cod_personal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "ETAPAS PARA LA PREPARACION", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº ETAPAS", "PREPARACION", "ITEMS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        b_borrar_items.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_borrar_items.setText("BORRAR ITEM");
        b_borrar_items.setEnabled(false);
        b_borrar_items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_borrar_itemsActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Etapas:");

        t_etapa.setEnabled(false);
        t_etapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_etapaActionPerformed(evt);
            }
        });
        t_etapa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_etapaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t_etapa, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_borrar_items)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_etapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(b_borrar_items))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true)));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEMS", "CODIGO", "PRODUCTO", "COD UNIDAD", "UNIDAD", "TIPO PRODUCTO", "PRESENTACION", "MARCA", "GRUPO", "CANTIDAD", "DEPOSITO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        b_borrar_items1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_borrar_items1.setText("BORRAR ITEM");
        b_borrar_items1.setEnabled(false);
        b_borrar_items1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_borrar_items1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_borrar_items1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(b_borrar_items1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true)));

        b_anular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_anular.setText("ANULAR");
        b_anular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_anularActionPerformed(evt);
            }
        });

        b_grabar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_grabar.setText("GRABAR");
        b_grabar.setEnabled(false);
        b_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_grabarActionPerformed(evt);
            }
        });

        b_salir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_salir.setText("SALIR");
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });

        b_nuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_nuevo.setText("NUEVO");
        b_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nuevoActionPerformed(evt);
            }
        });

        b_editar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_editar.setText("EDITAR");
        b_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editarActionPerformed(evt);
            }
        });

        b_cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_cancelar.setText("CANCELAR");
        b_cancelar.setEnabled(false);
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b_anular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_anular, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_salir))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nuevoActionPerformed
        // TODO add your handling code here:
         operacion = "nuevo";
        gencodigo();
        des_botones();
        hab_text();
        mostrar_fecha();
    }//GEN-LAST:event_b_nuevoActionPerformed

    private void t_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_fechaActionPerformed
        // TODO add your handling code here:
        if(t_fecha.getText().equals("")||t_fecha.getText().trim().length()==0){
        JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);
        this.t_descripcion.setEnabled(false);
        this.t_fecha.setEnabled(true);
        this.t_fecha.requestFocus();
        }
        else{
        this.t_fecha.setEnabled(false);
        this.t_descripcion.setEnabled(true);
        this.t_descripcion.requestFocus();          
        }
    }//GEN-LAST:event_t_fechaActionPerformed

    private void t_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_descripcionActionPerformed

         if(t_descripcion.getText().equals("") ||t_descripcion.getText().trim().length()==0 ){
          JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);
        this.t_cod_producto.setEnabled(false);
        this.t_descripcion.setEnabled(true);
        this.t_descripcion.requestFocus();
         }
        else{
        String ValidarDuplicados;
        String TextoValidar = t_descripcion.getText().trim();
        TextoValidar.toUpperCase();
        ValidarDuplicados = "SELECT rece_desc FROM cabecera_recet "
                        + "WHERE trim(rece_desc) ='"+TextoValidar+"' ";
        try
        {
            if(operacion.equals("nuevo")){
                   conn.sentencia = conn.conexion.createStatement();
        conn.resultado =conn.sentencia.executeQuery(ValidarDuplicados);
        if (conn.resultado.next() && band != 2) /*Esta validacion se aplica cuand*/
        {
          int Msn = JOptionPane.showOptionDialog(
           rootPane,
          "EXISTE LA RECETA CON ESTA "
          + "DESCRIPCIÓN. ¿DESEA CANCELAR LA OPERACIÓN?",
          "INFORMACIÓN",
          JOptionPane.YES_NO_OPTION,
          JOptionPane.QUESTION_MESSAGE,
          null,
          new Object[] {"Si","No"},
           "Si");
           switch (Msn + 1)
                {
                 case 1:{
                  b_cancelar.doClick();} break;
                 case 2: {
                 t_descripcion.requestFocus();} break;
                }
                }
            else
            {
        this.t_cod_producto.setEnabled(true);
        this.t_cod_producto.requestFocus();
            }
            }
             if(operacion.equals("editar")){

        this.t_cod_producto.setEnabled(true);
        this.t_cod_producto.requestFocus();
        this.t_etapa.setEnabled(true);
             }

            }
            catch(SQLException SqlError)
            {
                JOptionPane.showMessageDialog(null,"No se ejecuto la consulta verifique parametros. "+SqlError);
            }
            }




    }//GEN-LAST:event_t_descripcionActionPerformed

    private void t_cod_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cod_productoActionPerformed
        buscar_producto();
    }//GEN-LAST:event_t_cod_productoActionPerformed

    private void t_cod_productoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cod_productoKeyPressed
      if (t_cod_producto.getText().equals("") &&evt.getKeyCode()==123)
        { // presiona F12
            JTextField[] tfParam = new JTextField[6];

            tfParam[0] = this.t_cod_producto;
            tfParam[1] = this.t_producto;
            tfParam[2] = this.t_marca;
            tfParam[3] = this.t_presentacion;
            tfParam[4] = this.t_tipo;
            tfParam[5] = this.t_grupo;


            String sql = "SELECT p.prd_cod,p.prd_nom, ma.mar_desc, pe.presen_des,ti.tip_prd_dec,g.grup_descri FROM producto p, tipo_producto ti,marcas ma, presentacion pe,grupo g WHERE g.grup_cod=p.grup_cod AND ma.mar_cod=p.mar_cod AND p.presen_cod=pe.presen_cod AND ti.tip_prd_cod=p.tip_prd_cod AND p.prd_nom LIKE ";
            Buscador pp = new Buscador(sql , new String[]{"Codigo", "Descripcion","Marca","Presentacion","Tipo de Producto","Grupo"},6, tfParam);
            pp.setTitle("Buscar Productos");
            pp.setVisible(true);
        }
        else if (evt.getKeyCode() ==KeyEvent.VK_ENTER  &&   t_cod_producto.getText().equals("") ){

          JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);

            this.t_cod_producto.setEnabled(true);
            this.t_cod_producto.requestFocus();
        }
    }//GEN-LAST:event_t_cod_productoKeyPressed

    private void t_cod_productoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cod_productoKeyTyped
          char caracter = evt.getKeyChar();
        if(((caracter < '0') ||
                (caracter > '9')) &&
                (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_t_cod_productoKeyTyped

    private void t_cod_unidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cod_unidadKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < '0') ||
                (caracter > '9')) &&
                (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
          
        }
    }//GEN-LAST:event_t_cod_unidadKeyTyped

    private void t_cod_unidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cod_unidadKeyPressed

            if (t_cod_unidad.getText().equals("") &&evt.getKeyCode()==123)
            { // presiona F12
            JTextField[] tfParam = new JTextField[2];

            tfParam[0] = this.t_cod_unidad;
            tfParam[1] = this.t_unidad;
            String sql = "SELECT unid_cod,unid_desc FROM unidad_medida WHERE unid_desc LIKE  ";
            Buscador pp = new Buscador(sql , new String[]{"Codigo", "Descripcion"},2, tfParam);
            pp.setTitle("Buscar unidad");
            pp.setVisible(true);
            }
             else if (evt.getKeyCode() ==KeyEvent.VK_ENTER  &&   t_cod_unidad.getText().equals("") ){

          JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);

            this.t_cod_unidad.setEnabled(true);
            this.t_cod_unidad.requestFocus();
        }

    }//GEN-LAST:event_t_cod_unidadKeyPressed

    private void t_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cantidadActionPerformed
            try {
            String cant;
            cant = t_cantidad.getText();
            int multnum = 0;
            multnum = Integer.parseInt(cant);
            if (multnum <= 0) {
            JOptionPane.showMessageDialog(null, "TIENE QUE SER UN N° POSITIVO Y UN NUMERO MAYOR A CERO");
            t_cantidad.requestFocus();
            } else {
            tirar_grilla();
            }
            } catch (Exception e) {
            getToolkit().beep();
            }
    }//GEN-LAST:event_t_cantidadActionPerformed

    private void t_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cantidadKeyTyped
      char caracter = evt.getKeyChar();
        if(((caracter < '0') ||
                (caracter > '9')) &&
                (caracter != evt.VK_BACK_SPACE)) {
            evt.consume(); 
        }
    }//GEN-LAST:event_t_cantidadKeyTyped

    private void b_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_grabarActionPerformed
        validarGrilla();
        this.t_numero_receta.setEnabled(false);
    }//GEN-LAST:event_b_grabarActionPerformed

    private void b_anularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_anularActionPerformed
         operacion="anular";
        this.t_numero_receta.setEnabled(true);
        this.t_numero_receta.requestFocus();
        des_botones();
    }//GEN-LAST:event_b_anularActionPerformed

    private void b_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editarActionPerformed
      operacion="editar";
      des_botones();
      this.t_numero_receta.setEnabled(true);
      this.t_numero_receta.requestFocus();
      this.b_grabar.setEnabled(true);
    }//GEN-LAST:event_b_editarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        hab_botones();
        des_text();
        clear_text();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
         int mensaje = JOptionPane.showConfirmDialog(this, "¿DESEA SALIR?", "CONFIRMAR", JOptionPane.YES_NO_OPTION);
        if (mensaje == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_b_salirActionPerformed

    private void t_numero_recetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_numero_recetaActionPerformed
        buscar_detalle_receta();
    }//GEN-LAST:event_t_numero_recetaActionPerformed

    private void t_numero_recetaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_numero_recetaKeyPressed
          if (t_numero_receta.getText().equals("") &&evt.getKeyCode()==123)
        { // presiona F12
            JTextField[] tfParam = new JTextField[3];

            tfParam[0] = this.t_numero_receta;
            tfParam[1] = this.t_descripcion;
            tfParam[2] = this.t_fecha;

            String sql = "SELECT rece_cod, rece_desc,rece_fecha FROM cabecera_recet WHERE rece_est='pendiente' AND rece_desc LIKE  ";
            Buscador pp = new Buscador(sql , new String[]{"NUMERO", "DESCRIPCION","FECHA"},3, tfParam);
            pp.setTitle("Buscar Recetas");
            pp.setVisible(true);
        }
          else if (evt.getKeyCode() ==KeyEvent.VK_ENTER  &&   t_numero_receta.getText().equals("") ){

          JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);

            this.t_numero_receta.setEnabled(true);
            this.t_numero_receta.requestFocus();
        }
    }//GEN-LAST:event_t_numero_recetaKeyPressed

    private void t_numero_recetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_numero_recetaKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < '0') ||
                (caracter > '9')) &&
                (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_t_numero_recetaKeyTyped

    private void b_borrar_itemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_borrar_itemsActionPerformed
        cursor2.removeRow(grilla.getSelectedRow());
        this.b_borrar_items.setEnabled(false);
    }//GEN-LAST:event_b_borrar_itemsActionPerformed

    private void t_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_descripcionKeyTyped
          int letra = (int) evt.getKeyChar();
        if (letra > 47 && letra < 58)
        {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();///el sonido del error
            evt.consume();////mantiene el pulsor al presionar espacio
            JOptionPane.showMessageDialog(null,"NO PUEDES INGRESAR NUMEROS");
            t_descripcion.requestFocus();
        }
        if (letra == 10) // enter
        {
           //transfiere el foco si presionas enter
           t_cod_producto.setEnabled(true);
           t_cod_producto.requestFocus();
        }
    }//GEN-LAST:event_t_descripcionKeyTyped

    private void b_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_productoActionPerformed
//    new mercaderia().setVisible(true);
    }//GEN-LAST:event_b_productoActionPerformed

    private void b_unidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_unidadActionPerformed
//           new unidad_medida().setVisible(true);
    }//GEN-LAST:event_b_unidadActionPerformed

    private void t_cod_unidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cod_unidadActionPerformed
     buscar_unidad();
    }//GEN-LAST:event_t_cod_unidadActionPerformed

    private void t_descripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_descripcionMouseClicked

    }//GEN-LAST:event_t_descripcionMouseClicked

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked
        this.b_borrar_items.setEnabled(true);
    }//GEN-LAST:event_grillaMouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
             
        this.b_borrar_items1.setEnabled(true);
    }//GEN-LAST:event_tablaMouseClicked

    private void b_borrar_items1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_borrar_items1ActionPerformed
        // TODO add your handling code here:

         cursor.removeRow(tabla.getSelectedRow());
        this.b_borrar_items1.setEnabled(false);
    }//GEN-LAST:event_b_borrar_items1ActionPerformed

    private void t_etapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_etapaActionPerformed

      if(t_etapa.getText().equals("")||t_etapa.getText().trim().length()==0){
        JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);

        this.t_etapa.setEnabled(true);
        this.t_etapa.requestFocus();
        }
        else{
        tirar_grilla_etapa();
        }


}//GEN-LAST:event_t_etapaActionPerformed

    private void t_etapaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_etapaKeyTyped
       int letra = (int) evt.getKeyChar();
        if (letra > 47 && letra < 58)
        {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();///el sonido del error
            evt.consume();////mantiene el pulsor al presionar espacio
            JOptionPane.showMessageDialog(null,"NO PUEDES INGRESAR NUMEROS");
            t_etapa.requestFocus();
        }

    }//GEN-LAST:event_t_etapaKeyTyped

    private void t_cod_depositoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cod_depositoKeyTyped
          char caracter = evt.getKeyChar();
        if(((caracter < '0') ||
                (caracter > '9')) &&
                (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();

        }
    }//GEN-LAST:event_t_cod_depositoKeyTyped

    private void t_cod_depositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cod_depositoActionPerformed
      buscar_deposito();
    }//GEN-LAST:event_t_cod_depositoActionPerformed

    private void t_cod_depositoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cod_depositoKeyPressed

            if (t_cod_deposito.getText().equals("") &&evt.getKeyCode()==123)
            { // presiona F12
            JTextField[] tfParam = new JTextField[2];

            tfParam[0] = this.t_cod_deposito;
            tfParam[1] = this.t_deposito;
            String sql = "SELECT depo_cod,depo_desc FROM deposito WHERE depo_desc LIKE  ";
            Buscador pp = new Buscador(sql , new String[]{"Codigo", "Descripcion"},2, tfParam);
            pp.setTitle("Buscar Deposito");
            pp.setVisible(true);
            }
             else if (evt.getKeyCode() ==KeyEvent.VK_ENTER  &&   t_cod_deposito.getText().equals("") ){

          JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);

            this.t_cod_deposito.setEnabled(true);
            this.t_cod_deposito.requestFocus();
        }

    }//GEN-LAST:event_t_cod_depositoKeyPressed

public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new registrar_ingredientes().setVisible(true);
 }
 });
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_anular;
    private javax.swing.JButton b_borrar_items;
    private javax.swing.JButton b_borrar_items1;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_editar;
    private javax.swing.JButton b_grabar;
    private javax.swing.JButton b_nuevo;
    private javax.swing.JButton b_producto;
    private javax.swing.JButton b_salir;
    private javax.swing.JButton b_unidad;
    private javax.swing.JTable grilla;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField t_cantidad;
    private javax.swing.JTextField t_cod_deposito;
    private javax.swing.JTextField t_cod_personal;
    private javax.swing.JTextField t_cod_producto;
    private javax.swing.JTextField t_cod_sucursal;
    private javax.swing.JTextField t_cod_unidad;
    private javax.swing.JTextField t_deposito;
    private javax.swing.JTextField t_descripcion;
    private javax.swing.JTextField t_etapa;
    private javax.swing.JTextField t_fecha;
    private javax.swing.JTextField t_grupo;
    private javax.swing.JTextField t_marca;
    private javax.swing.JLabel t_nombre;
    private javax.swing.JTextField t_numero_receta;
    private javax.swing.JTextField t_presentacion;
    private javax.swing.JTextField t_producto;
    private javax.swing.JLabel t_sucursal;
    private javax.swing.JTextField t_tipo;
    private javax.swing.JTextField t_unidad;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

     private void des_botones()
   {
      this.b_nuevo.setEnabled(false);
      this.b_anular.setEnabled(false);
      this.b_editar.setEnabled(false);
      this.b_salir.setEnabled(false);
      this.b_cancelar.setEnabled(true);
      this.b_grabar.setEnabled(false);
      this.b_producto.setEnabled(true);
      this.b_unidad.setEnabled(true);
   }
  private void hab_text()
   {
      this.t_fecha.setEnabled(true);
      this.t_fecha.requestFocus();
   }
  private void limpiar_grilla()
   {
   DefaultTableModel dt2;
   dt2 = (DefaultTableModel) tabla.getModel();
   while (tabla.getRowCount() > 0) {
   cursor.removeRow(0);
   }
   }
    private void limpiar_grilla2()
   {
   DefaultTableModel dt;
   dt = (DefaultTableModel) grilla.getModel();
   while (grilla.getRowCount() > 0) {
    cursor2.removeRow(0);
   }
   }
private void hab_botones()
   {
      this.b_nuevo.setEnabled(true);
      this.b_anular.setEnabled(true);
      this.b_salir.setEnabled(true);
      this.b_cancelar.setEnabled(false);
      this.b_grabar.setEnabled(false);
      this.b_editar.setEnabled(true);
      this.b_producto.setEnabled(false);
      this.b_unidad.setEnabled(false);
   }
  private void des_text()
   {
      this.t_numero_receta.setEnabled(false);
     this.t_fecha.setEnabled(false);
     this.t_descripcion.setEnabled(false);
     this.t_cod_producto.setEnabled(false);
     this.t_producto.setEnabled(false);
     this.t_marca.setEnabled(false);
     this.t_tipo.setEnabled(false);
     this.t_presentacion.setEnabled(false);
     this.t_cod_unidad.setEnabled(false);
     this.t_unidad.setEnabled(false);
     this.t_cantidad.setEnabled(false);
     this.t_grupo.setEnabled(false);
     this.t_etapa.setEnabled(false);
     t_cod_deposito.setEnabled(false);
   }

    private void clear_text()
   {
       this.t_numero_receta.setText("");
       this.t_fecha.setText("");
       this.t_descripcion.setText("");
       this.t_cantidad.setText("");
       this.t_unidad.setText("");
       this.t_cod_unidad.setText("");
       this.t_cod_producto.setText("");
       this.t_producto.setText("");
       this.t_tipo.setText("");
       this.t_marca.setText("");
       this.t_presentacion.setText("");
       this.t_grupo.setText("");
       this.t_etapa.setText("");
        t_cod_deposito.setText("");
        t_deposito.setText("");


       limpiar_grilla();
       limpiar_grilla2();
   }
 private void gencodigo(){
   try {
    conn.sentencia = conn.conexion.createStatement();
    conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(rece_cod),0)+1 AS newcod FROM cabecera_recet");
    conn.resultado.next();
    t_numero_receta.setText(conn.resultado.getString("newcod"));
         } catch (SQLException ex) {
            Logger.getLogger(registrar_ingredientes.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
         private void mostrar_fecha() {
        try {
        ver_conex c=new ver_conex();
        c.sentencia=c.conexion.createStatement();
        c.resultado=c.sentencia.executeQuery("select date_format(current_date(),'%d/%m/%Y') as fecha");
        while (c.resultado.next()) {
        t_fecha.setText(c.resultado.getString("fecha"));
            }
            } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            }
private void buscar_producto() {
try
{
conn.sentencia = conn.conexion.createStatement();
conn.resultado = conn.sentencia.executeQuery("SELECT p.prd_cod,p.prd_nom, ma.mar_desc,g.grup_descri, pe.presen_des,ti.tip_prd_dec FROM grupo g,producto p, tipo_producto ti,marcas ma, presentacion pe WHERE g.grup_cod=p.grup_cod AND  ma.mar_cod=p.mar_cod AND p.presen_cod=pe.presen_cod AND ti.tip_prd_cod=p.tip_prd_cod AND p.prd_cod="+this.t_cod_producto.getText());

        if(conn.resultado.next())//si encontro
        {
          this.t_cod_producto.setText(conn.resultado.getString("prd_cod"));
          this.t_producto.setText(conn.resultado.getString("prd_nom"));
          this.t_marca.setText(conn.resultado.getString("mar_desc"));
          this.t_presentacion.setText(conn.resultado.getString("presen_des"));
          this.t_tipo.setText(conn.resultado.getString("tip_prd_dec"));
          this.t_grupo.setText(conn.resultado.getString("grup_descri"));
          this.t_cod_unidad.setEnabled(true);
          this.t_cod_unidad.requestFocus();
     if(t_cod_producto.getText().equals("") ||t_cod_producto.getText().trim().length()==0 )
     {
         JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);
         this.t_cod_producto.setEnabled(true);
         this.t_cod_producto.requestFocus();
        }
        }
       else//no encontro
        {
     JOptionPane.showMessageDialog(null,"NO EXISTE EL PRODUCTO", "MENSAJE",
     JOptionPane.INFORMATION_MESSAGE);
      this.t_cod_producto.setEnabled(true);
      this.t_cod_producto.requestFocus();
        }
 	}
	catch (SQLException exceptionSql)
	{
//	JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "ERROR DE CONEXION CON LA BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
	}
        }

private void buscar_unidad() {
try
{
conn.sentencia = conn.conexion.createStatement();
conn.resultado = conn.sentencia.executeQuery("SELECT unid_cod,unid_desc FROM unidad_medida WHERE unid_cod="+this.t_cod_unidad.getText());

        if(conn.resultado.next())//si encontro
        {
          this.t_cod_unidad.setText(conn.resultado.getString("unid_cod"));
          this.t_unidad.setText(conn.resultado.getString("unid_desc"));

          this.t_cod_deposito.setEnabled(true);
          this.t_cod_deposito.requestFocus();

         if(t_cod_unidad.getText().equals("") ||t_cod_unidad.getText().trim().length()==0 ){
        JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);
         this.t_cod_unidad.setEnabled(true);
         this.t_cod_unidad.requestFocus();
        }
           }
       else//no encontro
        {
        JOptionPane.showMessageDialog(null,"NO EXISTE LA UNIDAD DE MEDIDA", "MENSAJE",
        JOptionPane.INFORMATION_MESSAGE);
        this.t_cod_unidad.setEnabled(true);
        this.t_cod_unidad.requestFocus();
        }
 	}
	catch (SQLException exceptionSql)
	{
//	JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "ERROR DE CONEXION CON LA BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
	}
        }


private void buscar_deposito() {
try
{
conn.sentencia = conn.conexion.createStatement();
conn.resultado = conn.sentencia.executeQuery("SELECT depo_cod,depo_desc FROM deposito WHERE depo_cod="+this.t_cod_deposito.getText());

        if(conn.resultado.next())//si encontro
        {
          this.t_cod_deposito.setText(conn.resultado.getString("depo_cod"));
          this.t_deposito.setText(conn.resultado.getString("depo_desc"));

          this.t_cantidad.setEnabled(true);
          this.t_cantidad.requestFocus();

         if(t_cod_deposito.getText().equals("") ||t_cod_deposito.getText().trim().length()==0 ){
        JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);
         this.t_cod_deposito.setEnabled(true);
         this.t_cod_deposito.requestFocus();
        }
           }
       else//no encontro
        {
        JOptionPane.showMessageDialog(null,"NO EXISTE  EL DEPOSITO", "MENSAJE",
        JOptionPane.INFORMATION_MESSAGE);
        this.t_cod_deposito.setEnabled(true);
        this.t_cod_deposito.requestFocus();
        }
 	}
	catch (SQLException exceptionSql)
	{
//	JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "ERROR DE CONEXION CON LA BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
	}
        }

private void buscar_detalle_receta(){

     try{

     conn.sentencia = conn.conexion.createStatement();
     conn.resultado = conn.sentencia.executeQuery("SELECT * FROM cabecera_recet WHERE  rece_est='pendiente' AND  rece_cod=" + t_numero_receta.getText());
     boolean encontro = conn.resultado.next();
     if (encontro==true)//encontrog
            {

        this.t_numero_receta.setText(conn.resultado.getString("rece_cod"));
        this.t_fecha.setText(conn.resultado.getString("rece_fecha"));
        this.t_descripcion.setText(conn.resultado.getString("rece_desc"));

ver_conex conn = new ver_conex();
conn.sentencia = conn.conexion.createStatement();
conn.resultado = conn.sentencia.executeQuery("SELECT r.rece_cod,d.depo_cod,r.rece_desc,r.rece_fecha,su.suc_desc,d.prd_cod,d.det_item,d.cantidad,po.prd_nom,d.unid_cod,u.unid_desc,ti.tip_prd_dec,pe.presen_des,ma.mar_desc,g.grup_descri FROM grupo g,sucursal su, detalle_recetas d,cabecera_recet r,producto po,presentacion pe,marcas ma,tipo_producto ti,unidad_medida u WHERE g.grup_cod=po.grup_cod and su.suc_cod=r.suc_cod AND d.rece_cod=r.rece_cod AND po.prd_cod=d.prd_cod AND d.unid_cod=u.unid_cod AND ti.tip_prd_cod=po.tip_prd_cod AND pe.presen_cod=po.presen_cod AND ma.mar_cod=po.mar_cod AND d.rece_cod="+t_numero_receta.getText()); //OJO LE PASO LA SENTENCIA=" + t_numero_receta.getText());
        while(conn.resultado.next())
         {

           conn.sentencia = conn.conexion.createStatement();
           String registro[] = new String[] {conn.resultado.getString("det_item"),conn.resultado.getString("prd_cod"),conn.resultado.getString("prd_nom"),conn.resultado.getString("unid_cod"),conn.resultado.getString("unid_desc"),conn.resultado.getString("tip_prd_dec"),conn.resultado.getString("presen_des"),conn.resultado.getString("mar_desc"),conn.resultado.getString("grup_descri"),conn.resultado.getString("cantidad"),conn.resultado.getString("depo_cod")};
           cursor.addRow(registro);

          }
ver_conex conn2 = new ver_conex();
conn2.sentencia = conn2.conexion.createStatement();
conn2.resultado = conn2.sentencia.executeQuery("SELECT etap_cod,etap_desc,rece_cod,item FROM control_etapas WHERE rece_cod="+t_numero_receta.getText()); //OJO LE PASO LA SENTENCIA=" + t_numero_receta.getText());



  //  t_numero_receta.setText(conn.resultado.getString("newcod"));


while(conn2.resultado.next())
         {
           conn2.sentencia = conn2.conexion.createStatement();
           String registro[] = new String[] {conn2.resultado.getString("etap_cod"),conn2.resultado.getString("etap_desc"),conn2.resultado.getString("item")};
           cursor2.addRow(registro);

          }
            if(operacion.equals("editar")){
            this.t_numero_receta.setEnabled(false) ;
            this.t_fecha.setEnabled(true) ;
            this.t_fecha.requestFocus();
                  }

            if(operacion.equals("anular")){
            this.t_numero_receta.setEnabled(false) ;
            this.b_grabar.setEnabled(true);
            this.b_grabar.requestFocus();

                   }
                   }
          else{
          JOptionPane.showMessageDialog(null, "NO EXISTE LA RECETA CON ESTE NUMERO", "ATENCION", JOptionPane.ERROR_MESSAGE);
          this.t_numero_receta.setEnabled(true);
          this.t_numero_receta.requestFocus();
               }
     ver_conex conn2 = new ver_conex();
     conn2.sentencia = conn2.conexion.createStatement();
     conn2.resultado = conn2.sentencia.executeQuery("SELECT * FROM cabecera_recet WHERE  rece_est='Anulado' AND  rece_cod=" + t_numero_receta.getText());
     boolean encontro2 = conn2.resultado.next();
     if (encontro2==true)//encontrog
            {
         JOptionPane.showMessageDialog(null, "ESTA RECETA ESTA ANULADA", "ATENCION", JOptionPane.ERROR_MESSAGE);
          this.t_numero_receta.setEnabled(true);
          this.t_numero_receta.requestFocus();
             }
            
               } catch(SQLException e){
              // JOptionPane.showMessageDialog(null,e.getMessage(), "ERROR DE CONEXION", JOptionPane.ERROR_MESSAGE);
               }
               }

private void tirar_grilla() {
try {
   do{
   cc++;
      DefaultTableModel dt;
      dt = (DefaultTableModel) tabla.getModel();
      String campos2[] = new String[]{String.valueOf(cc),t_cod_producto.getText(), t_producto.getText(), t_cod_unidad.getText(), t_unidad.getText(), t_tipo.getText(), t_presentacion.getText(), t_marca.getText(), t_grupo.getText(), t_cantidad.getText(),t_cod_deposito.getText()};
      cursor.addRow(campos2);

   }while(conn.resultado.next());
   } catch (Exception e) {
   JOptionPane.showMessageDialog(this, "ERROR" + e, "AVISO", JOptionPane.INFORMATION_MESSAGE);
   }
          t_cantidad.setEnabled(false);
          t_cantidad.setText("");
          t_cod_producto.setText("");
          t_producto.setText("");
          t_marca.setText("");
          t_tipo.setText("");
          t_presentacion.setText("");
          t_cod_unidad.setText("");
          t_unidad.setText("");
          t_grupo.setText("");
          t_cod_deposito.setText("");
          t_deposito.setText("");
          t_cod_deposito.setEnabled(false);
          t_cod_unidad.setEnabled(false);
          t_descripcion.setEnabled(false);
          t_cod_producto.setEnabled(true);     
          t_etapa.setEnabled(true);
          t_etapa.requestFocus();

     }


int cant=2;
int cant2=4;
int cant3=5;
private void tirar_grilla_etapa() {
try {
   do{

   c++;
   cant=cant + 1;
cant2=cant2 +1 ;
cant3=cant3 +1 ;

   if(operacion.equals("nuevo")){
//
          DefaultTableModel dt2;
           dt2 = (DefaultTableModel) grilla.getModel();
           String registro[] = new String[] {String.valueOf(c),t_etapa.getText(),String.valueOf(cant)};
           cursor2.addRow(registro);
  }
 if(operacion.equals("editar")){

             DefaultTableModel dt2;
           dt2 = (DefaultTableModel) grilla.getModel();
           String registro[] = new String[] {String.valueOf(cant3),t_etapa.getText(),String.valueOf(cant2)};
           cursor2.addRow(registro);
     
 }




   }while(conn.resultado.next());
   } catch (Exception e) {
   JOptionPane.showMessageDialog(this, "ERROR" + e, "AVISO", JOptionPane.INFORMATION_MESSAGE);
   }

          t_etapa.setText("");
          t_etapa.setEnabled(true);
          t_etapa.requestFocus();
          b_grabar.setEnabled(true);

     }
private void validarGrilla(){
    int tabla2= tabla.getRowCount();
    int tabla3= grilla.getRowCount();

    if(tabla2==0)
    {
       JOptionPane.showMessageDialog(null,"CARGAR GRILLA DE PRODUCTO PARA CONTINUAR","AVISO",JOptionPane.INFORMATION_MESSAGE);
       t_numero_receta.requestFocus();
    }
   if(tabla3==0)
    {
       JOptionPane.showMessageDialog(null,"CARGAR GRILLA DE ETAPA PARA CONTINUAR","AVISO",JOptionPane.INFORMATION_MESSAGE);
       t_etapa.requestFocus();
    }  

    else
    {
      grabar();
    }
    }
private void grabar()
{
    try
    {

String f=t_fecha.getText();
String dd=f.substring(0,2);
String mm=f.substring(3,5);
String aa=f.substring(6,10);
String fech=aa+"/"+mm+"/"+dd;
DateFormat df=new SimpleDateFormat(fech);
String SQL = null;

        if(operacion.equals("nuevo"))
      {
           miconex.sentencia = miconex.conexion.createStatement();
           String insercionSQL1="insert into cabecera_recet (rece_cod,rece_desc,rece_est,rece_fecha,suc_cod,func_cod)"
+ " values ("+t_numero_receta.getText()+",'"+t_descripcion.getText()+"','pendiente','"+fech+"',"+t_cod_sucursal.getText()+","+t_cod_personal.getText()+")";
miconex.sentencia.executeUpdate(insercionSQL1);
//      {
//      SQL = "INSERT INTO cabecera_recet VALUES ("+t_numero_receta.getText()+",'"+t_descripcion.getText()+"','pendiente','"+fech+"',"+t_cod_sucursal.getText()+","+t_cod_personal.getText()+")";
//      }  
     

for(int o=0;o<tabla.getRowCount();o++)
{
miconex.sentencia = miconex.conexion.createStatement();
String insercionSQL5 = "INSERT INTO detalle_recetas(rece_cod,prd_cod,unid_cod,cantidad,det_item,depo_cod) VALUES ("+t_numero_receta.getText()+","+tabla.getValueAt(o,1)+","+tabla.getValueAt(o,3)+","+tabla.getValueAt(o,9)+","+tabla.getValueAt(o,0)+","+tabla.getValueAt(o,10)+")";
miconex.sentencia.executeUpdate(insercionSQL5);
}
for(int b=0;b<grilla.getRowCount();b++)
{
String insercionSQL3 = "INSERT INTO control_etapas(etap_cod,etap_desc,rece_cod,estado,item) VALUES ("+grilla.getValueAt(b,0)+",'"+grilla.getValueAt(b,1)+"',"+t_numero_receta.getText()+",'pendiente',"+grilla.getValueAt(b,2)+")";
miconex.sentencia.executeUpdate(insercionSQL3);
}      

        JOptionPane.showMessageDialog(this,"LA RECETA FUE GUARDADA","OPERACION",JOptionPane.INFORMATION_MESSAGE);
        genreporte();
        limpiar_grilla();
        limpiar_grilla2();
        hab_botones();
        des_text();
        clear_text();
     
     }

     }
    catch(Exception e)
    {
    }
    try{
    if(operacion.equals("anular"))
    {
    anular();
    }
    if (operacion.equals("editar"))
    {
     editar();
    }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(this,"ERROR DE CONEXION33"+e,"AVISO",JOptionPane.INFORMATION_MESSAGE);
    }
    }


private void anular()
{
  int res = javax.swing.JOptionPane.showOptionDialog(this,
  "DESEA ANULAR LA RECETA?","RECETA",javax.swing.JOptionPane.OK_CANCEL_OPTION,
   javax.swing.JOptionPane.QUESTION_MESSAGE,null,
   new Object[] { "Si", "No"},"Si");
     if (res == javax.swing.JOptionPane.OK_OPTION)
        {
    try {
        ver_conex conn= new ver_conex();
        conn.sentencia = conn.conexion.createStatement();
        conn.sentencia.executeUpdate("UPDATE cabecera_recet SET rece_est='Anulado' WHERE rece_cod = " + t_numero_receta.getText());

        JOptionPane.showMessageDialog(null, "LA RECETA FUE ANULADA EXITOSAMENTE", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        }catch (SQLException ex) {
        Logger.getLogger(registrar_ingredientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else
        {
        JOptionPane.showMessageDialog(null, "OPERACIÓN CANCELADA", "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        limpiar_grilla();
        limpiar_grilla2();
        hab_botones();
        des_text();
        clear_text();
        }


private void editar()
{
try {

ver_conex co= new ver_conex();
co.sentencia = co.conexion.createStatement();
co.sentencia.executeUpdate("UPDATE cabecera_recet SET rece_fecha= '"+ t_fecha.getText()+ "',rece_desc='"+ t_descripcion.getText()+ "' WHERE rece_cod = " + t_numero_receta.getText());



}catch (SQLException ex) {
 Logger.getLogger(registrar_ingredientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    //Object codigo = tabla.getValueAt(a, 1);
//Object codunidad = tabla.getValueAt(a,3);
//Object cantidad = tabla.getValueAt(a,9);
//Object items = tabla.getValueAt(a,0);
try {

//ver_conex co= new ver_conex();

eliminar_detalle_receta();
for(int o=0;o<tabla.getRowCount();o++)
{
//co.sentencia = co.conexion.createStatement();
//co.sentencia.executeUpdate("INSERT INTO detalle_recetas(rece_cod,prd_cod,unid_cod,cantidad,det_item) VALUES ("+ t_numero_receta.getText() +","+ codigo +","+ codunidad + "," + cantidad + ","+items + ")");

miconex.sentencia = miconex.conexion.createStatement();
String insercionSQL5 = "INSERT INTO detalle_recetas(rece_cod,prd_cod,unid_cod,cantidad,det_item,depo_cod) VALUES ("+t_numero_receta.getText()+","+tabla.getValueAt(o,1)+","+tabla.getValueAt(o,3)+","+tabla.getValueAt(o,9)+","+tabla.getValueAt(o,0)+","+tabla.getValueAt(o,10)+")";
miconex.sentencia.executeUpdate(insercionSQL5);
}

    }catch (SQLException ex)
    {
 //Logger.getLogger(registrar_ingredientes.class.getName()).log(Level.SEVERE, null, ex);
    }

try {

//ver_conex co= new ver_conex();

eliminar_etapa();


for(int b=0;b<grilla.getRowCount();b++)
{
miconex.sentencia = miconex.conexion.createStatement();
String insercionSQL3 = "INSERT INTO control_etapas(etap_cod,etap_desc,rece_cod,estado,item) VALUES ("+grilla.getValueAt(b,0)+",'"+grilla.getValueAt(b,1)+"',"+t_numero_receta.getText()+",'pendiente',"+grilla.getValueAt(b,2)+")";
miconex.sentencia.executeUpdate(insercionSQL3);
}


    }catch (SQLException ex)
    {
 //Logger.getLogger(registrar_ingredientes.class.getName()).log(Level.SEVERE, null, ex);
    }


JOptionPane.showMessageDialog(null, "SE HA MODIFICADO LA RECETA", "AVISO",
JOptionPane.INFORMATION_MESSAGE);
genreporte();

 //Logger.getLogger(registrar_ingredientes.class.getName()).log(Level.SEVERE, null, ex);
 
        limpiar_grilla();
        limpiar_grilla2();
        hab_botones();
        des_text();
        clear_text();
}


private void eliminar_detalle_receta(){
    try{

            ver_conex conn2= new ver_conex();
            conn2.sentencia = conn2.conexion.createStatement();
            String consultaSQL=("SELECT * FROM detalle_recetas  WHERE  rece_cod= " +t_numero_receta.getText());
            conn2.resultado = conn2.sentencia.executeQuery(consultaSQL);

 boolean encontro2 = conn2.resultado.next();
if (encontro2==true)//encontrog
{
for (int a = 0; a < tabla.getRowCount(); a++)
{
 String insercionSQLb="DELETE FROM detalle_recetas WHERE rece_cod = "+t_numero_receta.getText ()+" AND prd_cod= "+tabla.getValueAt(a,1)+"";
 conn2.sentencia.executeUpdate(insercionSQLb);
}
}//fin del if

} catch (SQLException e) {
// Logger.getLogger(registrar_ingredientes.class.getName()).log(Level.SEVERE, null, e);
 }
 }
private void eliminar_etapa(){
    try{


   ver_conex conn3= new ver_conex();
            conn3.sentencia = conn3.conexion.createStatement();
            String consultaSQL3=("SELECT * FROM control_etapas  WHERE rece_cod= " +t_numero_receta.getText());
            conn3.resultado = conn3.sentencia.executeQuery(consultaSQL3);

 boolean encontro3 = conn3.resultado.next();
 if (encontro3==true)//encontrog
 {
 for (int b = 0; b < grilla.getRowCount(); b++)
{
 String consultaSQL2="DELETE FROM control_etapas WHERE etap_cod= "+grilla.getValueAt(b,0)+" AND rece_cod = "+t_numero_receta.getText ()+" ";
 conn3.sentencia.executeUpdate(consultaSQL2);
 }
 }
 }
 catch (SQLException e) {
 }
 }

public void genreporte() //throws JRException, Exception
    {
        try //throws JRException, Exception
        {
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery(" SELECT r.rece_cod,g.grup_descri,r.rece_desc,r.rece_fecha,su.suc_desc,d.prd_cod,d.cantidad,po.prd_nom,u.unid_desc,ti.tip_prd_dec,pe.presen_des,ma.mar_desc FROM sucursal su, detalle_recetas d,cabecera_recet r,producto po,presentacion pe,marcas ma,tipo_producto ti,unidad_medida u, grupo g WHERE su.suc_cod=r.suc_cod AND d.rece_cod=r.rece_cod AND po.prd_cod=d.prd_cod AND d.unid_cod=u.unid_cod AND ti.tip_prd_cod=po.tip_prd_cod AND pe.presen_cod=po.presen_cod AND ma.mar_cod=po.mar_cod AND g.grup_cod=po.grup_cod AND r.rece_cod="+t_numero_receta.getText()); //OJO LE PASO LA SENTENCIA
            JRResultSetDataSource jrRS = new JRResultSetDataSource(conn.resultado);

            HashMap parameters = new HashMap();
            URL urlMaestro = getClass().getClassLoader().getResource("impresion/receta.jasper");

            // Cargamos el reporte
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport, parameters, jrRS);
            JasperViewer ventana = new JasperViewer(masterPrint, false);
            ventana.setTitle("VISTA PREVIA");
            ventana.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(registrar_ingredientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(registrar_ingredientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
