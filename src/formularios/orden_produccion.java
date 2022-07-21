

package formularios;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class orden_produccion extends javax.swing.JFrame {

    /** Creates new form orden_produccion */
    ver_conex conn = new ver_conex();
    javax.swing.table.DefaultTableModel cursor;
    String operacion="";
    int c;
    private int band = 0;

    public orden_produccion() {
        initComponents();
        this.setLocationRelativeTo(null);
        t_cod_sucursal.setText(acceso.ususucur);//codigo de sucursal
        t_sucursal.setText(acceso.sucurdescri); // sucursal
        t_cod_personal.setText(acceso.usucod);//codigo usuario
        t_nombre.setText(acceso.usunom);    //nombre de usuario
       
        cursor = (javax.swing.table.DefaultTableModel)tabla.getModel();
        setResizable(false);
         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t_cliente_nombre = new javax.swing.JTextField();
        t_ci = new javax.swing.JTextField();
        t_cod_cliente = new javax.swing.JTextField();
        t_cliente_telefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t_cliente_direccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t_cliente_ciudad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        t_cliente_email = new javax.swing.JTextField();
        t_cliente_ruc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        t_cliente_apellido = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        b_cliente = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        t_cod_personal = new javax.swing.JTextField();
        t_nombre = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        t_cod_sucursal = new javax.swing.JTextField();
        t_sucursal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        t_numero_orden = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t_hora = new javax.swing.JTextField();
        t_fecha_inicio = new javax.swing.JTextField();
        t_fecha_final = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        b_borrar_items = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        b_grabar = new javax.swing.JButton();
        b_anular = new javax.swing.JButton();
        b_editar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        b_nuevo = new javax.swing.JButton();
        b_salir = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        t_actividades = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        t_receta = new javax.swing.JTextField();
        t_cod_receta = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        t_cantidad = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        t_cocinero_nombre = new javax.swing.JTextField();
        t_ci_cocinero = new javax.swing.JTextField();
        t_cod_cocinero = new javax.swing.JTextField();
        t_cocinero_telefono = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        t_cocinero_sexo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        t_cocinero_cargo = new javax.swing.JTextField();
        t_cocinero_apellido = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "DATOS DEL CLIENTE", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("CLIENTE C.I:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("NOMBRE:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("TELEFONO:");

        t_cliente_nombre.setEnabled(false);

        t_ci.setEnabled(false);
        t_ci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ciActionPerformed(evt);
            }
        });
        t_ci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_ciKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_ciKeyTyped(evt);
            }
        });

        t_cod_cliente.setEnabled(false);

        t_cliente_telefono.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("DIRECCION:");

        t_cliente_direccion.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("CIUDAD:");

        t_cliente_ciudad.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("E_MAIL:");

        t_cliente_email.setEnabled(false);
        t_cliente_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cliente_emailActionPerformed(evt);
            }
        });
        t_cliente_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cliente_emailKeyTyped(evt);
            }
        });

        t_cliente_ruc.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("RUC:");

        t_cliente_apellido.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("APELLIDO:");

        b_cliente.setText("ADD CLIENTE");
        b_cliente.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel20.setText("BUSCAR CON F12 ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_cliente_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(t_ci, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_cod_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t_cliente_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(t_cliente_email, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(t_cliente_ruc, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(t_cliente_ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(t_cliente_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(t_cliente_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(b_cliente))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel15)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(t_cliente_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(t_cliente_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(t_cliente_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_cliente_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_cliente_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(t_cliente_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_cliente_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(t_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t_cod_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(b_cliente))
                            .addComponent(jLabel20))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true)));

        t_cod_personal.setEnabled(false);

        t_nombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t_nombre.setText("NOMBRE");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("FUNCIONARIO:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("SUCURSAL:");

        t_cod_sucursal.setEnabled(false);

        t_sucursal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        t_sucursal.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ORDEN DE PRODUCCION");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 443, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_cod_personal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(t_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel13)
                .addGap(22, 22, 22)
                .addComponent(t_cod_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(t_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_cod_personal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_nombre)
                    .addComponent(t_cod_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(t_sucursal)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "DATOS DE ORDEN", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        t_numero_orden.setEnabled(false);
        t_numero_orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_numero_ordenActionPerformed(evt);
            }
        });
        t_numero_orden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_numero_ordenKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_numero_ordenKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("HORA RETIRO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("FECHA INICIO:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("NUMERO:");

        t_hora.setEnabled(false);
        t_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_horaActionPerformed(evt);
            }
        });
        t_hora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_horaKeyTyped(evt);
            }
        });

        t_fecha_inicio.setEnabled(false);
        t_fecha_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_fecha_inicioActionPerformed(evt);
            }
        });

        t_fecha_final.setEnabled(false);
        t_fecha_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_fecha_finalActionPerformed(evt);
            }
        });
        t_fecha_final.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_fecha_finalKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("FECHA FINAL:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel21.setText("BUSCAR CON F12 ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel17))
                .addGap(18, 25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(t_hora)
                    .addComponent(t_fecha_final, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_fecha_inicio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_numero_orden, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_numero_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel3)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true)));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEMS", "Nº RECETA", "MENU A REALIZAR", "CANTIDAD", "ACTIVIDAD A REALIZAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        jScrollPane1.setViewportView(tabla);

        b_borrar_items.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_borrar_items.setText("BORRAR ITEM");
        b_borrar_items.setEnabled(false);
        b_borrar_items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_borrar_itemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b_borrar_items)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_borrar_items)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true)));

        b_grabar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_grabar.setText("GRABAR");
        b_grabar.setEnabled(false);
        b_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_grabarActionPerformed(evt);
            }
        });

        b_anular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_anular.setText("ANULAR");
        b_anular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_anularActionPerformed(evt);
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

        b_nuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_nuevo.setText("NUEVO");
        b_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nuevoActionPerformed(evt);
            }
        });

        b_salir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b_salir.setText("SALIR");
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addComponent(b_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(b_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(b_anular, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(b_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(b_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_nuevo)
                    .addComponent(b_anular)
                    .addComponent(b_editar)
                    .addComponent(b_grabar)
                    .addComponent(b_cancelar)
                    .addComponent(b_salir))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true)));

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel22.setText("BUSCAR CON F12 ");

        t_actividades.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        t_actividades.setEnabled(false);
        t_actividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_actividadesActionPerformed(evt);
            }
        });
        t_actividades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_actividadesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_actividadesKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("ACTIVIDADES:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("MENU PEDIDO:");

        t_receta.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        t_receta.setEnabled(false);
        t_receta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_recetaActionPerformed(evt);
            }
        });
        t_receta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_recetaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_recetaKeyTyped(evt);
            }
        });

        t_cod_receta.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        t_cod_receta.setEnabled(false);
        t_cod_receta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cod_recetaActionPerformed(evt);
            }
        });
        t_cod_receta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cod_recetaKeyTyped(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("CANTIDAD:");

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel26))
                        .addGap(190, 190, 190))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t_actividades)
                            .addComponent(t_receta, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(t_cantidad))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_cod_receta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel22)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jLabel26))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_receta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(t_cod_receta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_actividades, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "DATOS DEL COCINERO", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("COCINERO C.I:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("NOMBRE:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("TELEFONO:");

        t_cocinero_nombre.setEnabled(false);

        t_ci_cocinero.setEnabled(false);
        t_ci_cocinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ci_cocineroActionPerformed(evt);
            }
        });
        t_ci_cocinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_ci_cocineroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_ci_cocineroKeyTyped(evt);
            }
        });

        t_cod_cocinero.setEnabled(false);

        t_cocinero_telefono.setEnabled(false);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("SEXO:");

        t_cocinero_sexo.setEnabled(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("CARGO:");

        t_cocinero_cargo.setEnabled(false);

        t_cocinero_apellido.setEnabled(false);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("APELLIDO:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel29.setText("BUSCAR CON F12 ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel28)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(45, 45, 45)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t_cocinero_cargo)
                    .addComponent(t_cocinero_sexo)
                    .addComponent(t_cocinero_telefono)
                    .addComponent(t_cocinero_apellido)
                    .addComponent(t_cocinero_nombre)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(t_ci_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_cod_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_ci_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_cod_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t_cocinero_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)))
                .addGap(9, 9, 9)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(t_cocinero_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(t_cocinero_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_cocinero_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t_cocinero_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel8, 0, 425, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_grabarActionPerformed
        validarGrilla();
        limpiar_grilla();
        hab_botones();
        des_text();
        clear_text();
        this.t_numero_orden.setEnabled(false);
}//GEN-LAST:event_b_grabarActionPerformed

    private void b_anularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_anularActionPerformed
        operacion="anular";
        this.t_numero_orden.setEnabled(true);
        this.t_numero_orden.requestFocus();
        des_botones();
}//GEN-LAST:event_b_anularActionPerformed

    private void b_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editarActionPerformed
        operacion="editar";
        des_botones();
        this.t_numero_orden.setEnabled(true);
        this.t_numero_orden.requestFocus();
}//GEN-LAST:event_b_editarActionPerformed

    private void t_ciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ciActionPerformed
buscar_cliente();
}//GEN-LAST:event_t_ciActionPerformed

    private void t_ciKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_ciKeyPressed
        if (t_ci.getText().equals("") &&evt.getKeyCode()==123) { // presiona F12
            JTextField[] tfParam = new JTextField[9];

            tfParam[0] = this.t_cod_cliente;
            tfParam[1] = this.t_ci;
            tfParam[2] = this.t_cliente_nombre;
            tfParam[3] = this.t_cliente_apellido;
            tfParam[4] = this.t_cliente_direccion;
            tfParam[5] = this.t_cliente_ciudad;
            tfParam[6] = this.t_cliente_telefono;
            tfParam[7] = this.t_cliente_ruc;
            tfParam[8] = this.t_cliente_email;


            String sql = "SELECT c.cli_cod,c.cli_ci,c.cli_nom,c.cli_ape,c.cli_dir,cu.ciu_desc,c.cli_tel,c.cli_ruc,c.cli_mail FROM cliente c, ciudad cu WHERE c.ciu_cod=cu.ciu_cod AND c.cli_ci LIKE ";
            Buscador pp = new Buscador(sql , new String[]{"Codigo", "C.I","Nombre","Apellido","Direccion","Ciudad","Telefono","Ruc","E_mail"},9, tfParam);
            pp.setTitle("Buscar Clientes");
            pp.setVisible(true);
        }  else if (evt.getKeyCode() ==KeyEvent.VK_ENTER  &&   t_ci.getText().equals("") ){

            JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);

            this.t_ci.setEnabled(true);
            this.t_ci.requestFocus();
        }
}//GEN-LAST:event_t_ciKeyPressed

    private void t_ciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_ciKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < '0') ||
                (caracter > '9')) &&
                (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
}//GEN-LAST:event_t_ciKeyTyped

    private void t_cliente_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cliente_emailActionPerformed
        try {
            String cant;
            cant = t_cliente_email.getText();
            int multnum = 0;
            multnum = Integer.parseInt(cant);
            if (multnum <= 0) {
                JOptionPane.showMessageDialog(null, "TIENE QUE SER UN N° POSITIVO Y UN NUMERO MAYOR A CERO");
                t_cliente_email.requestFocus();
            } else {
                tirar_grilla();
            }
        } catch (Exception e) {
            getToolkit().beep();
        }
}//GEN-LAST:event_t_cliente_emailActionPerformed

    private void t_cliente_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cliente_emailKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < '0') ||
                (caracter > '9')) &&
                (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
}//GEN-LAST:event_t_cliente_emailKeyTyped

    private void b_borrar_itemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_borrar_itemsActionPerformed
        cursor.removeRow(tabla.getSelectedRow());
        this.b_borrar_items.setEnabled(false);
}//GEN-LAST:event_b_borrar_itemsActionPerformed

    private void t_numero_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_numero_ordenActionPerformed
        buscar_detalle_orden();
}//GEN-LAST:event_t_numero_ordenActionPerformed

    private void t_numero_ordenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_numero_ordenKeyPressed
        if (t_numero_orden.getText().equals("") &&evt.getKeyCode()==123) { // presiona F12
            JTextField[] tfParam = new JTextField[4];

            tfParam[0] = this.t_numero_orden;
            tfParam[1] = this.t_fecha_inicio;
            tfParam[2] = this.t_fecha_final;
            tfParam[3] = this.t_hora;


            String sql = "SELECT o.or_pro_cod,o.fecha_inicio,o.fecha_final,o.hora_retiro FROM orden_produccion o WHERE  o.ord_pro_est='pendiente' and  o.fecha_inicio LIKE ";
            Buscador pp = new Buscador(sql , new String[]{"NUMERO", "FECHA INICIO","","FECHA FINAL","HORA"},4 , tfParam);
            pp.setTitle("Buscar Orden de Produccion");
            pp.setVisible(true);

        }
}//GEN-LAST:event_t_numero_ordenKeyPressed

    private void t_numero_ordenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_numero_ordenKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < '0') ||
                (caracter > '9')) &&
                (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
}//GEN-LAST:event_t_numero_ordenKeyTyped

    private void t_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_horaActionPerformed

        if(t_hora.getText().equals("") ||t_hora.getText().trim().length()==0 ){
            JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);
            this.t_ci_cocinero.setEnabled(false);
            this.t_hora.setEnabled(true);
            this.t_hora.requestFocus();
        } else{
            this.t_hora.setEnabled(false);
            this.t_ci_cocinero.setEnabled(true);
            this.t_ci_cocinero.requestFocus();
        }
    }//GEN-LAST:event_t_horaActionPerformed

    private void t_horaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_horaKeyTyped

}//GEN-LAST:event_t_horaKeyTyped

    private void t_fecha_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_fecha_inicioActionPerformed


        if(t_fecha_inicio.getText().equals("") ||t_fecha_inicio.getText().trim().length()==0 ){
            JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);
            this.t_fecha_final.setEnabled(false);
            this.t_fecha_inicio.setEnabled(true);
            this.t_fecha_inicio.requestFocus();
        } else{
            //this.t_fecha_inicio.setEnabled(false);
             mostrar_fecha2();
            this.t_fecha_final.setEnabled(true);
            this.t_fecha_final.requestFocus();
        }
    }//GEN-LAST:event_t_fecha_inicioActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        hab_botones();
        des_text();
        clear_text();
}//GEN-LAST:event_b_cancelarActionPerformed

    private void b_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nuevoActionPerformed
    
        operacion = "nuevo";
        gencodigo();
        des_botones();
        hab_text();

    }//GEN-LAST:event_b_nuevoActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
        int mensaje = JOptionPane.showConfirmDialog(this, "¿DESEA SALIR?", "CONFIRMAR", JOptionPane.YES_NO_OPTION);
        if (mensaje == JOptionPane.YES_OPTION) {
            dispose();
        }
}//GEN-LAST:event_b_salirActionPerformed

    private void t_recetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_recetaKeyTyped
int letra = (int) evt.getKeyChar();
        if (letra > 47 && letra < 58)
        {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();///el sonido del error
            evt.consume();////mantiene el pulsor al presionar espacio
            JOptionPane.showMessageDialog(null,"NO PUEDES INGRESAR NUMEROS");
            t_receta.requestFocus();
        }
        if (letra == 10) // enter
        {
           //transfiere el foco si presionas enter
       //    t_actividades.setEnabled(false);
           t_actividades.setEnabled(true);
           t_actividades.requestFocus();
        }
}//GEN-LAST:event_t_recetaKeyTyped

    private void t_recetaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_recetaKeyPressed
        if (t_receta.getText().equals("") && evt.getKeyCode()==123) { // presiona F12
            JTextField[] tfParam = new JTextField[2];

            tfParam[0] = this.t_cod_receta;
            tfParam[1] = this.t_receta;
            String sql = "SELECT rece_cod,rece_desc FROM cabecera_recet WHERE rece_desc LIKE";
            Buscador pp = new Buscador(sql , new String[]{"Codigo", "Receta"},2, tfParam);
            pp.setTitle("Buscar Receta");
            pp.setVisible(true);
        } else if (evt.getKeyCode() ==KeyEvent.VK_ENTER  &&   t_receta.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);

            this.t_receta.setEnabled(true);
            this.t_receta.requestFocus();
        }
}//GEN-LAST:event_t_recetaKeyPressed

    private void t_recetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_recetaActionPerformed

       buscar_receta();
    }//GEN-LAST:event_t_recetaActionPerformed

    private void t_actividadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_actividadesKeyTyped
    int letra = (int) evt.getKeyChar();
        if (letra > 47 && letra < 58)
        {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();///el sonido del error
            evt.consume();////mantiene el pulsor al presionar espacio
            JOptionPane.showMessageDialog(null,"NO PUEDES INGRESAR NUMEROS");
            t_actividades.requestFocus();
        }
        if (letra == 10) // enter
        {
           //transfiere el foco si presionas enter
         //  t_cantidad.setEnabled(false);
           t_cantidad.setEnabled(true);
           t_cantidad.requestFocus();
        }
}//GEN-LAST:event_t_actividadesKeyTyped

    private void t_actividadesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_actividadesKeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_t_actividadesKeyPressed

    private void t_actividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_actividadesActionPerformed
          if(t_actividades.getText().equals("") ||t_actividades.getText().trim().length()==0 ){
            JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);
            this.t_cantidad.setEnabled(false);
            this.t_actividades.setEnabled(true);
            this.t_actividades.requestFocus();


          } else{
            this.t_cantidad.setEnabled(true);
            this.t_cantidad.requestFocus();
        }

}//GEN-LAST:event_t_actividadesActionPerformed

    private void t_cod_recetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cod_recetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_cod_recetaActionPerformed

    private void t_cod_recetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cod_recetaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_cod_recetaKeyTyped

    private void t_fecha_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_fecha_finalActionPerformed
      compararFechasConDate();
    }//GEN-LAST:event_t_fecha_finalActionPerformed

    private void t_fecha_finalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_fecha_finalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_fecha_finalKeyTyped

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
     this.b_borrar_items.setEnabled(true);
    }//GEN-LAST:event_tablaMouseClicked

    private void t_ci_cocineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ci_cocineroActionPerformed

        buscar_cocinero();
}//GEN-LAST:event_t_ci_cocineroActionPerformed

    private void t_ci_cocineroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_ci_cocineroKeyPressed
        if (t_ci_cocinero.getText().equals("") &&evt.getKeyCode()==123) { // presiona F12
            JTextField[] tfParam = new JTextField[7];

            tfParam[0] = this.t_cod_cocinero;
            tfParam[1] = this.t_ci_cocinero;
            tfParam[2] = this.t_cocinero_cargo;
            tfParam[3] = this.t_cocinero_nombre;
            tfParam[4] = this.t_cocinero_apellido;
            tfParam[5] = this.t_cocinero_telefono;
            tfParam[6] = this.t_cocinero_sexo;


            String sql = "SELECT f.func_cod,f.func_ci,c.carg_desc,f.func_nom,f.func_ape,f.func_tel,f.func_sexo FROM funcionario f, cargo c WHERE c.carg_cod=f.carg_cod AND f.func_ci LIKE ";
            Buscador pp = new Buscador(sql , new String[]{"CODIGO","C.I.","CARGO","NOMBRE","APELLIDO","TELEFONO","SEXO"},7, tfParam);
            pp.setTitle("Buscar Cocineros");
            pp.setVisible(true);
        }  else if (evt.getKeyCode() ==KeyEvent.VK_ENTER  &&   t_ci_cocinero.getText().equals("") ){

            JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);

            this.t_ci_cocinero.setEnabled(true);
            this.t_ci_cocinero.requestFocus();
        }
}//GEN-LAST:event_t_ci_cocineroKeyPressed

    private void t_ci_cocineroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_ci_cocineroKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < '0') ||
                (caracter > '9')) &&
                (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
}//GEN-LAST:event_t_ci_cocineroKeyTyped

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

    /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
   java.awt.EventQueue.invokeLater(new Runnable() {
   public void run() {
    new orden_produccion().setVisible(true);
    }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_anular;
    private javax.swing.JButton b_borrar_items;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_cliente;
    private javax.swing.JButton b_editar;
    private javax.swing.JButton b_grabar;
    private javax.swing.JButton b_nuevo;
    private javax.swing.JButton b_salir;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_actividades;
    private javax.swing.JTextField t_cantidad;
    private javax.swing.JTextField t_ci;
    private javax.swing.JTextField t_ci_cocinero;
    private javax.swing.JTextField t_cliente_apellido;
    private javax.swing.JTextField t_cliente_ciudad;
    private javax.swing.JTextField t_cliente_direccion;
    private javax.swing.JTextField t_cliente_email;
    private javax.swing.JTextField t_cliente_nombre;
    private javax.swing.JTextField t_cliente_ruc;
    private javax.swing.JTextField t_cliente_telefono;
    private javax.swing.JTextField t_cocinero_apellido;
    private javax.swing.JTextField t_cocinero_cargo;
    private javax.swing.JTextField t_cocinero_nombre;
    private javax.swing.JTextField t_cocinero_sexo;
    private javax.swing.JTextField t_cocinero_telefono;
    private javax.swing.JTextField t_cod_cliente;
    private javax.swing.JTextField t_cod_cocinero;
    private javax.swing.JTextField t_cod_personal;
    private javax.swing.JTextField t_cod_receta;
    private javax.swing.JTextField t_cod_sucursal;
    private javax.swing.JTextField t_fecha_final;
    private javax.swing.JTextField t_fecha_inicio;
    private javax.swing.JTextField t_hora;
    private javax.swing.JLabel t_nombre;
    private javax.swing.JTextField t_numero_orden;
    private javax.swing.JTextField t_receta;
    private javax.swing.JLabel t_sucursal;
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

   }
  private void hab_text()
   {
      this.t_ci.setEnabled(true);
      this.b_cliente.setEnabled(true);
      this.t_ci.requestFocus();
  }
  private void hab_botones()
   {
      this.b_nuevo.setEnabled(true);
      this.b_anular.setEnabled(true);
      this.b_salir.setEnabled(true);
      this.b_cancelar.setEnabled(false);
      this.b_grabar.setEnabled(false);
      this.b_editar.setEnabled(true);
      this.b_cliente.setEnabled(false);
   }
  private void des_text()
   {
     this.t_ci.setEnabled(false);
     this.t_fecha_inicio.setEnabled(false);
     this.t_fecha_final.setEnabled(false);
     this.t_hora.setEnabled(false);
     this.t_cod_receta.setEnabled(false);
     this.t_actividades.setEnabled(false);
     this.t_numero_orden.setEnabled(false);
     this.t_receta.setEnabled(false);
     this.t_ci_cocinero.setEnabled(false);


   }

    private void clear_text()
   {
       this.t_numero_orden.setText("");
       this.t_hora.setText("");
       this.t_fecha_inicio.setText("");
       this.t_fecha_final.setText("");
       this.t_actividades.setText("");
       this.t_cod_receta.setText("");
       this.t_receta.setText("");
       this.t_ci.setText("");
       this.t_cod_cliente.setText("");
       this.t_cliente_nombre.setText("");
       this.t_cliente_apellido.setText("");
       this.t_cliente_direccion.setText("");
       this.t_cliente_telefono.setText("");
       this.t_cliente_email.setText("");
       this.t_cliente_ruc.setText("");
       this.t_cliente_ciudad.setText("");
  this.t_ci_cocinero.setText("");
    this.t_cod_cocinero.setText("");
      this.t_cocinero_nombre.setText("");
        this.t_cocinero_apellido.setText("");
          this.t_cocinero_telefono.setText("");
            this.t_cocinero_sexo.setText("");
              this.t_cocinero_cargo.setText("");

       limpiar_grilla();
   }
  private void limpiar_grilla()
   {
   DefaultTableModel dt;
   dt = (DefaultTableModel) tabla.getModel();
   while (tabla.getRowCount() > 0) {
   dt.removeRow(0);
   }
   }

    private void gencodigo(){
   try {
    conn.sentencia = conn.conexion.createStatement();
    conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(or_pro_cod),0)+1 AS newcod FROM orden_produccion");
    conn.resultado.next();
    t_numero_orden.setText(conn.resultado.getString("newcod"));
         } catch (SQLException ex) {
            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
         }
         }
         private void mostrar_fecha() {
        try {
        ver_conex c=new ver_conex();
        c.sentencia=c.conexion.createStatement();
        c.resultado=c.sentencia.executeQuery("select date_format(current_date(),'%d/%m/%Y') as fecha");
        while (c.resultado.next()) {
        t_fecha_inicio.setText(c.resultado.getString("fecha"));
            }
            } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            }
         private void mostrar_fecha2() {
        try {
        ver_conex c=new ver_conex();
        c.sentencia=c.conexion.createStatement();
        c.resultado=c.sentencia.executeQuery("select date_format(current_date(),'%d/%m/%Y') as fecha");
        while (c.resultado.next()) {
        t_fecha_final.setText(c.resultado.getString("fecha"));
            }
            } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            }

      private void compararFechasConDate() {

  try {
   /**Obtenemos las fechas enviadas en el formato a comparar*/
   SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
   String fechaDate1=t_fecha_inicio.getText();
   String fechaDate2=t_fecha_final.getText();
   Date fechainicio = formateador.parse(fechaDate1);
   Date fechafinal = formateador.parse(fechaDate2);

    if ( fechainicio.before(fechafinal) ){
     this.t_fecha_final.setEnabled(false);
     this.t_fecha_inicio.setEnabled(false);
     this.t_hora.setEnabled(true);
     this.t_hora.requestFocus();
      Hora() ;

    }else{if ( fechafinal.before(fechainicio) )
    { //antes
     JOptionPane.showMessageDialog(null, "La Fecha final no puede ser menor a la fecha de inicio");
     this.t_fecha_final.setEnabled(true);
     this.t_fecha_final.requestFocus();
     this.t_hora.setText("");
     }else{
      this.t_fecha_final.setEnabled(false);
      this.t_fecha_inicio.setEnabled(false);
      this.t_hora.setEnabled(true);
      this.t_hora.requestFocus();
       Hora() ;
    }
    }
    } catch (Exception e)
    {
    }
 }

  private void Hora() {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("select curtime() as hora");
            conn.resultado.next();
            t_hora.setText(conn.resultado.getString("hora"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error" + e, "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        }
private void buscar_cliente() {
try
{
conn.sentencia = conn.conexion.createStatement();
conn.resultado = conn.sentencia.executeQuery("SELECT c.cli_cod,c.cli_ci,cu.ciu_desc,c.cli_ruc,c.cli_nom,c.cli_ape,c.cli_dir,c.cli_tel,c.cli_mail FROM cliente c, ciudad cu WHERE c.ciu_cod=cu.ciu_cod AND c.cli_ci="+this.t_ci.getText());

        if(conn.resultado.next())//si encontro
        {
          this.t_cod_cliente.setText(conn.resultado.getString("cli_cod"));
          this.t_ci.setText(conn.resultado.getString("cli_ci"));
          this.t_cliente_ciudad.setText(conn.resultado.getString("ciu_desc"));
          this.t_cliente_ruc.setText(conn.resultado.getString("cli_ruc"));
          this.t_cliente_nombre.setText(conn.resultado.getString("cli_nom"));
          this.t_cliente_apellido.setText(conn.resultado.getString("cli_ape"));
          this.t_cliente_direccion.setText(conn.resultado.getString("cli_dir"));
          this.t_cliente_telefono.setText(conn.resultado.getString("cli_tel"));
          this.t_cliente_email.setText(conn.resultado.getString("cli_mail"));
          mostrar_fecha();
          this.t_fecha_inicio.setEnabled(true);
          this.t_fecha_inicio.requestFocus();

      if(t_cod_cliente.getText().equals("") ||t_cod_cliente.getText().trim().length()==0 ){
        JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);
         this.t_cod_cliente.setEnabled(true);
         this.t_cod_cliente.requestFocus();
        }
   }
       else//no encontro
        {
     JOptionPane.showMessageDialog(null,"NO EXISTE EL CLIENTE", "MENSAJE",
     JOptionPane.INFORMATION_MESSAGE);
      this.t_cod_cliente.setEnabled(true);
      this.t_cod_cliente.requestFocus();
        }
 	}
	catch (SQLException exceptionSql)
	{
//	JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "no debe esta vacio", JOptionPane.ERROR_MESSAGE);
	}
        }

private void buscar_cocinero() {
try
{
conn.sentencia = conn.conexion.createStatement();
conn.resultado = conn.sentencia.executeQuery("SELECT f.func_cod,c.carg_desc,f.func_ci,f.func_nom,f.func_ape,f.func_tel,f.func_sexo FROM funcionario f, cargo c WHERE c.carg_cod=f.carg_cod AND f.func_ci="+this.t_ci_cocinero.getText());

        if(conn.resultado.next())//si encontro
        {
          this.t_cod_cocinero.setText(conn.resultado.getString("func_cod"));
          this.t_cocinero_cargo.setText(conn.resultado.getString("carg_desc"));
          this.t_ci_cocinero.setText(conn.resultado.getString("func_ci"));
          this.t_cocinero_nombre.setText(conn.resultado.getString("func_nom"));
          this.t_cocinero_apellido.setText(conn.resultado.getString("func_ape"));
          this.t_cocinero_telefono.setText(conn.resultado.getString("func_tel"));
          this.t_cocinero_sexo.setText(conn.resultado.getString("func_sexo"));

          this.t_receta.setEnabled(true);
          this.t_receta.requestFocus();

      if(t_ci_cocinero.getText().equals("") ||t_ci_cocinero.getText().trim().length()==0 ){
        JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);
         this.t_ci_cocinero.setEnabled(true);
         this.t_ci_cocinero.requestFocus();
        }
           }
       else//no encontro
        {
        JOptionPane.showMessageDialog(null,"NO EXISTE LA UNIDAD DE MEDIDA", "MENSAJE",
        JOptionPane.INFORMATION_MESSAGE);
        this.t_ci_cocinero.setEnabled(true);
        this.t_ci_cocinero.requestFocus();
        }
 	}
	catch (SQLException exceptionSql)
	{
//	JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "no debe esta vacio", JOptionPane.ERROR_MESSAGE);
	}
        }

private void buscar_receta() {
try
{
conn.sentencia = conn.conexion.createStatement();
conn.resultado = conn.sentencia.executeQuery("SELECT rece_cod,rece_desc FROM cabecera_recet WHERE rece_desc like '%"+t_receta.getText()+"%'");

        if(conn.resultado.next())//si encontro
        {
          this.t_cod_receta.setText(conn.resultado.getString("rece_cod"));
          this.t_receta.setText(conn.resultado.getString("rece_desc"));

          this.t_actividades.setEnabled(true);
          this.t_actividades.requestFocus();

      if(t_receta.getText().equals("") ||t_receta.getText().trim().length()==0 ){
        JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);
         this.t_actividades.setEnabled(false);
         this.t_receta.setEnabled(true);
         this.t_receta.requestFocus();
        }
   }
       else//no encontro
        {
     JOptionPane.showMessageDialog(null,"NO EXISTE LA RECETA", "MENSAJE",
     JOptionPane.INFORMATION_MESSAGE);
       this.t_actividades.setEnabled(false);
      this.t_receta.setEnabled(true);
      this.t_receta.requestFocus();
        }
 	}
	catch (SQLException exceptionSql)
	{
//	JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "no debe esta vacio", JOptionPane.ERROR_MESSAGE);
	}
        }

private void tirar_grilla() {
try {
   do{
   c++;
      DefaultTableModel dt;
      dt = (DefaultTableModel) tabla.getModel();
      String campos[] = new String[]{String.valueOf(c),t_cod_receta.getText(), t_receta.getText(), t_cantidad.getText(), t_actividades.getText()};
      dt.addRow(campos);
   }while(conn.resultado.next());
   } catch (Exception e) {
   JOptionPane.showMessageDialog(this, "ERROR" + e, "AVISO", JOptionPane.INFORMATION_MESSAGE);
   }
          t_cantidad.setEnabled(false);
          t_actividades.setEnabled(false);
          t_cantidad.setText("");
          t_cantidad.setText("");
          t_actividades.setText("");
          t_receta.setText("");
          t_cod_receta.setText("");
          t_receta.setEnabled(true);
          t_receta.requestFocus();
          b_grabar.setEnabled(true);

     }
private void validarGrilla(){
    int tabla2= tabla.getRowCount();
    if(tabla2==0)
    {
       JOptionPane.showMessageDialog(null,"CARGAR GRILLA PARA CONTINUAR","AVISO",JOptionPane.INFORMATION_MESSAGE);
       t_numero_orden.requestFocus();
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

String f=t_fecha_inicio.getText();
String dd=f.substring(0,2);
String mm=f.substring(3,5);
String aa=f.substring(6,10);
String fech=aa+"/"+mm+"/"+dd;
DateFormat df=new SimpleDateFormat(fech);

String f2=t_fecha_final.getText();
String ddd=f2.substring(0,2);
String mmm=f2.substring(3,5);
String aaa=f2.substring(6,10);
String fech2=aaa+"/"+mmm+"/"+ddd;
DateFormat df2=new SimpleDateFormat(fech2);


String SQL = null;

        if(operacion.equals("nuevo"))
      {
      {
      SQL = "INSERT INTO orden_produccion VALUES ("+t_numero_orden.getText()+","+t_cod_sucursal.getText()+","+t_cod_cliente.getText()+","+t_cod_cocinero.getText()+",'pendiente','"+fech+"','"+fech2+"','"+t_hora.getText()+"')";
                                                                                        
                                         
      }
        ver_conex c= new ver_conex();
        c.sentencia= c.conexion.createStatement();
        c.sentencia.executeUpdate(SQL);

        for (int fila = 0; fila < tabla.getRowCount(); fila++)
        {
        c.sentencia = c.conexion.createStatement();
        c.sentencia.executeUpdate("INSERT INTO detalle_orden_produccion(or_pro_cod,det_item,rece_cod,cantidad,actividad_realizar,or_estado) VALUES ("+t_numero_orden.getText()+","+tabla.getValueAt(fila,0)+","+tabla.getValueAt(fila,1)+","+tabla.getValueAt(fila,3)+",'"+tabla.getValueAt(fila,4)+"','pendiente')");
        }
                                                                      
    JOptionPane.showMessageDialog(this,"LA ORDEN DE PRODUCCION FUE REALIZADA","OPERACION",JOptionPane.INFORMATION_MESSAGE);
    genreporte();

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

public void genreporte() //throws JRException, Exception
    {
        try //throws JRException, Exception
        {
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT o.or_pro_cod,su.suc_desc,o.fecha_inicio,o.fecha_final,o.hora_retiro,c.cli_ci,c.cli_nom,c.cli_ape,c.cli_dir,c.cli_tel,d.cantidad,d.rece_cod,d.actividad_realizar,r.rece_desc FROM cliente c,detalle_orden_produccion d,orden_produccion o,sucursal su,cabecera_recet r WHERE su.suc_cod=o.suc_cod AND d.or_pro_cod=o.or_pro_cod AND o.cli_cod=c.cli_cod AND r.rece_cod=d.rece_cod AND d.or_pro_cod="+t_numero_orden.getText()); //OJO LE PASO LA SENTENCIA
            JRResultSetDataSource jrRS = new JRResultSetDataSource(conn.resultado);

            HashMap parameters = new HashMap();
            URL urlMaestro = getClass().getClassLoader().getResource("impresion/orden_produccion.jasper");

            // Cargamos el reporte
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport, parameters, jrRS);
            JasperViewer ventana = new JasperViewer(masterPrint, false);
            ventana.setTitle("VISTA PREVIA");
            ventana.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

private void anular()
{
  int res = javax.swing.JOptionPane.showOptionDialog(this,
  "DESEA ANULAR LA ORDEN DE PRODUCCION?"," ORDEN DE PRODUCCION",javax.swing.JOptionPane.OK_CANCEL_OPTION,
   javax.swing.JOptionPane.QUESTION_MESSAGE,null,
   new Object[] { "Si", "No"},"Si");
     if (res == javax.swing.JOptionPane.OK_OPTION)
        {
    try {
        ver_conex conn= new ver_conex();
        conn.sentencia = conn.conexion.createStatement();
        conn.sentencia.executeUpdate("UPDATE orden_produccion SET ord_pro_est='Anulado' WHERE or_pro_cod = " + t_numero_orden.getText());

        JOptionPane.showMessageDialog(null, "LA ORDEN DE PRODUCCION FUE ANULADA", "AVISO", JOptionPane.INFORMATION_MESSAGE);
       
        }catch (SQLException ex) {
        Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else
        {
        JOptionPane.showMessageDialog(null, "OPERACIÓN CANCELADA", "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        limpiar_grilla();
        hab_botones();
        des_text();
        clear_text();
        }


private void editar()
{
try {


String f=t_fecha_inicio.getText();
String dd=f.substring(0,2);
String mm=f.substring(3,5);
String aa=f.substring(6,10);
String fech=aa+"/"+mm+"/"+dd;
DateFormat df=new SimpleDateFormat(fech);

String f2=t_fecha_final.getText();
String ddd=f2.substring(0,2);
String mmm=f2.substring(3,5);
String aaa=f2.substring(6,10);
String fech2=aaa+"/"+mmm+"/"+ddd;
DateFormat df2=new SimpleDateFormat(fech2);

ver_conex co= new ver_conex();
co.sentencia = co.conexion.createStatement();
co.sentencia.executeUpdate("UPDATE orden_produccion SET cli_cod= "+ t_cod_cliente.getText()+ ",func_cod="+ t_cod_cocinero.getText()+ ",fecha_inicio= '"+fech+ "',fecha_final= '"+ fech2+ "',hora_retiro='"+ t_hora.getText()+ "' WHERE or_pro_cod = " + t_numero_orden.getText());
}catch (SQLException ex) {
 Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
        }
       try {
            ver_conex conn2= new ver_conex();
            conn2.sentencia = conn2.conexion.createStatement();
            String consultaSQL=("SELECT * FROM detalle_orden_produccion  WHERE  or_pro_cod= " +t_numero_orden.getText());
            conn2.resultado = conn2.sentencia.executeQuery(consultaSQL);


            while (conn2.resultado.next())
{
conn2.sentencia = conn2.conexion.createStatement();
}
conn2.sentencia = conn2.conexion.createStatement();


for (int a = 0; a < tabla.getRowCount(); a++)
{
 String insercionSQLb="DELETE FROM detalle_orden_produccion WHERE or_pro_cod = "+t_numero_orden.getText ()+" AND rece_cod= "+tabla.getValueAt(a,1)+"";
 conn2.sentencia.executeUpdate(insercionSQLb);



Object codigo = tabla.getValueAt(a, 1);
Object cantidad = tabla.getValueAt(a,3);
Object items = tabla.getValueAt(a,0);
Object actividad = tabla.getValueAt(a,4);


conn2.sentencia.executeUpdate("INSERT INTO detalle_orden_produccion(or_pro_cod,det_item,cantidad,rece_cod,actividad_realizar,or_estado) VALUES ("+ t_numero_orden.getText() +","+items + "," + cantidad + "," + codigo + ",'"+actividad + "','pendiente')");

}//fin grabacion en detalle

JOptionPane.showMessageDialog(null, "SE HA MODIFICADO LA ORDEN DE PRODUCCION", "AVISO",
JOptionPane.INFORMATION_MESSAGE);
genreporte();
 }catch (SQLException ex) {
 Logger.getLogger(orden_produccion.class.getName()).log(Level.SEVERE, null, ex);
 }
        limpiar_grilla();
        hab_botones();
        des_text();
        clear_text();
}

private void buscar_detalle_orden(){

try{

     conn.sentencia = conn.conexion.createStatement();
     conn.resultado = conn.sentencia.executeQuery("SELECT c.cli_cod,c.cli_ci,cu.ciu_desc,c.cli_ruc,c.cli_nom,c.cli_ape,c.cli_dir,c.cli_tel,c.cli_mail, f.func_cod,ca.carg_desc,f.func_ci,f.func_nom,f.func_ape,f.func_tel,f.func_sexo,o.or_pro_cod,o.fecha_inicio,o.fecha_final,o.hora_retiro FROM cliente c, ciudad cu ,funcionario f, cargo ca,orden_produccion o WHERE c.ciu_cod=cu.ciu_cod AND ca.carg_cod=f.carg_cod AND c.cli_cod=o.cli_cod AND f.func_cod=o.func_cod AND o.ord_pro_est='pendiente' AND  o.or_pro_cod=" + t_numero_orden.getText());
     boolean encontro = conn.resultado.next();
     if (encontro==true)//encontrog
            {
        this.t_cod_cliente.setText(conn.resultado.getString("cli_cod"));
        this.t_ci.setText(conn.resultado.getString("cli_ci"));
        this.t_cliente_ciudad.setText(conn.resultado.getString("ciu_desc"));
        this.t_cliente_ruc.setText(conn.resultado.getString("cli_ruc"));
        this.t_cliente_nombre.setText(conn.resultado.getString("cli_nom"));
        this.t_cliente_apellido.setText(conn.resultado.getString("cli_ape"));
        this.t_cliente_direccion.setText(conn.resultado.getString("cli_dir"));
        this.t_cliente_telefono.setText(conn.resultado.getString("cli_tel"));
        this.t_cliente_email.setText(conn.resultado.getString("cli_mail"));
        this.t_cod_cocinero.setText(conn.resultado.getString("func_cod"));
        this.t_cocinero_cargo.setText(conn.resultado.getString("carg_desc"));
        this.t_ci_cocinero.setText(conn.resultado.getString("func_ci"));
        this.t_cocinero_nombre.setText(conn.resultado.getString("func_nom"));
        this.t_cocinero_apellido.setText(conn.resultado.getString("func_ape"));
        this.t_cocinero_telefono.setText(conn.resultado.getString("func_tel"));
        this.t_cocinero_sexo.setText(conn.resultado.getString("func_sexo"));
        this.t_numero_orden.setText(conn.resultado.getString("or_pro_cod"));
        this.t_fecha_inicio.setText(conn.resultado.getString("fecha_inicio"));
        this.t_fecha_final.setText(conn.resultado.getString("fecha_final"));
        this.t_hora.setText(conn.resultado.getString("hora_retiro"));


////////////////////////////////////////////////////////////////////////
           ver_conex conn = new ver_conex();
           conn.sentencia = conn.conexion.createStatement();
           conn.resultado = conn.sentencia.executeQuery("SELECT d.det_item,d.cantidad,d.rece_cod,d.actividad_realizar,r.rece_desc FROM cabecera_recet r,detalle_orden_produccion d WHERE d.rece_cod=r.rece_cod AND d.or_pro_cod ="+t_numero_orden.getText()); //OJO LE PASO LA SENTENCIA=" + t_numero_receta.getText());
          while(conn.resultado.next())
           {
           conn.sentencia = conn.conexion.createStatement();
           String registro[] = new String[] {conn.resultado.getString("det_item"),conn.resultado.getString("rece_cod"),conn.resultado.getString("rece_desc"),conn.resultado.getString("cantidad"),conn.resultado.getString("actividad_realizar")};
           cursor.addRow(registro);
           }

        if(operacion.equals("editar")){
        this.t_numero_orden.setEnabled(false) ;
        this.t_ci.setEnabled(true) ;
        this.t_ci.requestFocus();
              }

        if(operacion.equals("anular")){
        this.t_numero_orden.setEnabled(false) ;
        this.b_grabar.setEnabled(true);
        this.b_grabar.requestFocus();

               }
               }
          else{
     JOptionPane.showMessageDialog(null, "NO EXISTE LA TRANSFERENCIA CON ESTE NUMERO", "ATENCION", JOptionPane.ERROR_MESSAGE);
     this.t_numero_orden.setEnabled(true);
     this.t_numero_orden.requestFocus();
         }
                     ver_conex conn2 = new ver_conex();
                     conn2.sentencia = conn2.conexion.createStatement();
                     conn2.resultado = conn2.sentencia.executeQuery("SELECT * FROM orden_produccion WHERE  ord_pro_est='Anulado' AND  or_pro_cod=" + t_numero_orden.getText());
                     boolean encontro3 = conn2.resultado.next();
                    if (encontro3==true)//encontrog
                    {
                    JOptionPane.showMessageDialog(null, "ESTA ORDEN DE PRODUCCION ESTA ANULADA", "ATENCION", JOptionPane.ERROR_MESSAGE);
                    this.t_numero_orden.setEnabled(true);
                    this.t_numero_orden.requestFocus();
                   }
//     else{
//     JOptionPane.showMessageDialog(null, "NO EXISTE LA TRANSFERENCIA CON ESTE NUMERO", "ATENCION", JOptionPane.ERROR_MESSAGE);
//     this.t_numero_transferencia.setEnabled(true);
//     this.t_numero_transferencia.requestFocus();
//         }

 } catch(SQLException e){
 //JOptionPane.showMessageDialog(null,e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

 }
}
}
