package formularios;

import static formularios.menupri.usucodigo;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import java.net.URL;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import programas.ver_conex;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 *
 * @author Eduardo Avila
 */
public class cobros extends javax.swing.JFrame {

    ver_conex conn = new ver_conex();
    javax.swing.table.DefaultTableModel cursor;
    private Object calendario;
    String operacion = "";
    int c;
    String nroCaja = "";
    private int band = 0;
    int id_detalle;

    /**
     * Creates new form cobros
     *
     * @throws java.lang.ClassNotFoundException
     */
    public cobros() throws ClassNotFoundException {

        initComponents();
        this.setLocationRelativeTo(null);
        fecha.setText(acceso.fechasistema);
        cursor = (javax.swing.table.DefaultTableModel) grillacobro.getModel();
        BGravar.setMnemonic(KeyEvent.VK_F3);
        cajero.setText(menupri.usucodigo.getText());//codigo usuario
        buscar_cajero();
        ComboCaja();

        factura_num();
        fecha();
        gencod();
        // bcancelar.doClick();
        barra.setEnabled(true);
        barra.requestFocus();
        //cursor = (javax.swing.table.DefaultTableModel)grilla.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        turno = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cobnro = new javax.swing.JTextField();
        cajenomb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cajero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        facturanum = new javax.swing.JTextField();
        timbrado_num = new javax.swing.JTextField();
        suc_cod = new javax.swing.JLabel();
        sucucod = new javax.swing.JTextField();
        sucudesc = new javax.swing.JTextField();
        jLcod12 = new javax.swing.JLabel();
        cajanum = new javax.swing.JTextField();
        jLcod14 = new javax.swing.JLabel();
        jLcod13 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        txthora = new javax.swing.JLabel();
        apercodi = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        produdesc = new javax.swing.JTextField();
        IDproduc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        unimed_cod = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cantid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        grillacobro = new javax.swing.JTable();
        unimed_nomb = new javax.swing.JTextField();
        barra = new javax.swing.JTextField();
        Total = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        bborrar = new javax.swing.JButton();
        Letras = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtpagado = new javax.swing.JTextField();
        txtcambio1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtsaldo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        bcancelar = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        BGravar = new javax.swing.JButton();
        BGravar1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txtcambio122233 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setResizable(false);

        turno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        turno.setText("Gestion de Venta");

        jPanel5.setBackground(new java.awt.Color(173, 216, 230));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nro.");

        cobnro.setEditable(false);
        cobnro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobnroActionPerformed(evt);
            }
        });

        cajenomb.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Cajero:");

        cajero.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Fecha:");

        facturanum.setEditable(false);
        facturanum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        facturanum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturanumActionPerformed(evt);
            }
        });
        facturanum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                facturanumKeyPressed(evt);
            }
        });

        timbrado_num.setEditable(false);
        timbrado_num.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        suc_cod.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        suc_cod.setText("Sucursal:");

        sucucod.setEditable(false);

        sucudesc.setEditable(false);

        jLcod12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLcod12.setText("Caja Nro:");

        cajanum.setEditable(false);
        cajanum.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cajanum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajanumActionPerformed(evt);
            }
        });
        cajanum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajanumKeyPressed(evt);
            }
        });

        jLcod14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLcod13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLcod13.setText("Nro Apertura:");

        fecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fecha.setText("FECHA");

        txthora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txthora.setText("HORA");

        apercodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apercodiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(facturanum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLcod14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timbrado_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(690, 690, 690))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cobnro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLcod13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apercodi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLcod12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cajanum, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(cajero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cajenomb, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                                .addComponent(suc_cod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sucucod, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sucudesc, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(256, 256, 256))))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cobnro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(suc_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sucucod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sucudesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txthora)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLcod12)
                                .addComponent(cajanum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLcod13)
                                .addComponent(apercodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(facturanum, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timbrado_num, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLcod14))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajenomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel6.setBackground(new java.awt.Color(173, 216, 230));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        produdesc.setEditable(false);

        IDproduc.setEditable(false);
        IDproduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDproducActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Producto:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Unidad Medida");

        unimed_cod.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("Cantidad:");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("Precio:");

        precio.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Agregar Productos ");

        cantid.setEnabled(false);
        cantid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidActionPerformed(evt);
            }
        });
        cantid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantidKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidKeyTyped(evt);
            }
        });

        grillacobro.setBackground(new java.awt.Color(153, 255, 255));
        grillacobro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "ID Producto", "Codigo", "Desc", "Cod Unidad", "Unid_Med", "Precio", "Cant", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grillacobro.setColumnSelectionAllowed(true);
        grillacobro.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(grillacobro);
        grillacobro.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        unimed_nomb.setEditable(false);

        barra.setEnabled(false);
        barra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraActionPerformed(evt);
            }
        });
        barra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barraKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDproduc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(produdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unimed_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unimed_nomb, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantid, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(514, 514, 514)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(produdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IDproduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cantid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(unimed_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(unimed_nomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Total.setEditable(false);
        Total.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Total.setText("0");
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("TOTAL:");

        bborrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bborrar.setText("Borrar item");
        bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bborrarActionPerformed(evt);
            }
        });

        Letras.setEditable(false);
        Letras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Letras.setText("Letras");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("PAGADO:");

        txtpagado.setEditable(false);
        txtpagado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpagado.setText("0");

        txtcambio1.setEditable(false);
        txtcambio1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtcambio1.setText("0");
        txtcambio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcambio1ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("CAMBIO");

        txtsaldo.setEditable(false);
        txtsaldo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtsaldo.setText("0");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("SALDO");

        bcancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_icon-icons.com_73703.png"))); // NOI18N
        bcancelar.setEnabled(false);
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });

        BSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout_90894.png"))); // NOI18N
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });

        BGravar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/business-color_money-coins_icon-icons.com_53446.png"))); // NOI18N
        BGravar.setEnabled(false);
        BGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGravarActionPerformed(evt);
            }
        });
        BGravar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BGravarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BGravarKeyTyped(evt);
            }
        });

        BGravar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BGravar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savedisk_floppydisk_guardar_1543.png"))); // NOI18N
        BGravar1.setEnabled(false);
        BGravar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGravar1ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("ULTIMO VUELTO:");

        txtcambio122233.setEditable(false);
        txtcambio122233.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtcambio122233.setText("0");
        txtcambio122233.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcambio122233ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Letras, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bborrar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BGravar)
                                .addGap(40, 40, 40)
                                .addComponent(BGravar1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(bcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtpagado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcambio1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcambio122233, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(537, 537, 537)
                .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Letras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bcancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BGravar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpagado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel23)
                            .addComponent(txtcambio122233, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtcambio1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );

        setBounds(0, 0, 1233, 626);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {

        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }

    private void IDproducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDproducActionPerformed
        buscar_id();
        cantid.setEnabled(true);
        precio.setEnabled(true);
        cantid.requestFocus();
        IDproduc.setEnabled(false);
        barra.setEnabled(false);

    }//GEN-LAST:event_IDproducActionPerformed

    private void cantidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidActionPerformed
        // TODO add your handling code here:
        tirar_grillas();
        apercodi.setEnabled(false);
        limpiar();
        BGravar.setEnabled(true);
        bcancelar.setEnabled(true);
        sumarColumna();
    }//GEN-LAST:event_cantidActionPerformed

    private void cantidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!cantid.getText().trim().equals("")) {

                float subtotal;
                subtotal = Float.parseFloat(cantid.getText()) * Float.parseFloat(precio.getText());

                total = total + subtotal;

                Total.setText(String.valueOf(total));
                //  Total3.setText(String.valueOf(total));

                Letras.setText(numero.nletra((int) total));

                /////tira a la grilla
                if (iva.equals("1")) // exenta
                {
                    String registro[] = new String[]{IDproduc.getText(), produdesc.getText(), unimed_cod.getText(), precio.getText(), cantid.getText(), String.valueOf(subtotal), "0", "0"};
                    cursor.addRow(registro);
                }

                if (iva.equals("2"))//gravada 5%
                {
                    String registro[] = new String[]{IDproduc.getText(), produdesc.getText(), unimed_cod.getText(), precio.getText(), cantid.getText(), "0", String.valueOf(subtotal), "0"};
                    cursor.addRow(registro);
                    totaliva5 = totaliva5 + (subtotal / 21);
                    //   this.Tiva5.setText(String.valueOf(totaliva5));

                }

                if (iva.equals("3")) // gravada 10 %
                {
                    String registro[] = new String[]{IDproduc.getText(), produdesc.getText(), unimed_cod.getText(),
                        precio.getText(), cantid.getText(), "0", "0", String.valueOf(subtotal)};
                    cursor.addRow(registro);
                    totaliva10 = totaliva10 + (subtotal / 11);
//                this.Tiva10.setText(String.valueOf(totaliva10));

                }

                totaliva = totaliva5 + totaliva10;

            } else {
                JOptionPane.showMessageDialog(null, "El campo no puede "
                        + "estar vacio", "Atención", JOptionPane.WARNING_MESSAGE);
                cantid.requestFocus();
                cantid.setText("");
            }
        }

        ////fin verificacion
        //     this.Tiva.setText(String.valueOf(totaliva));
        /////
        // sumarColumna();

    }//GEN-LAST:event_cantidKeyPressed

    private void cajanumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajanumKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajanumKeyPressed

    private void cajanumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajanumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajanumActionPerformed

    private void txtcambio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcambio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcambio1ActionPerformed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        // TODO add your handling code here:
        limpiargrilla();
        limpiarTexto();
        barra.requestFocus();
    }//GEN-LAST:event_bcancelarActionPerformed

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_BSalirActionPerformed

    private void cobnroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobnroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cobnroActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

    private void BGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGravarActionPerformed
        // TODO add your handling code here:
        new cobrar().setVisible(true);
        bcancelar.setEnabled(true);

    }//GEN-LAST:event_BGravarActionPerformed

    private void BGravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGravar1ActionPerformed
        // TODO add your handling code here:
        gencodDetalle();
        try {
            grabar();
        } catch (IOException ex) {
            Logger.getLogger(cobros.class.getName()).log(Level.SEVERE, null, ex);
        }

        limpiarTexto();
        total = 0;
        BGravar1.setEnabled(false);
        BGravar.setEnabled(false);
        barra.setEnabled(true);
        barra.requestFocus();


    }//GEN-LAST:event_BGravar1ActionPerformed

    private void barraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraActionPerformed
        // TODO add your handling code here:
        buscar_cod();
    }//GEN-LAST:event_barraActionPerformed

    private void facturanumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facturanumKeyPressed
        if (evt.getKeyCode() == 123) {
            //          BUSCAR_POR_FACTURA();

        }
        //////////
        if (facturanum.getText().equals("") && evt.getKeyChar() == KeyEvent.VK_ENTER)//no trae nada
        {
            JTextField[] tfParam = new JTextField[5];
            tfParam[0] = this.facturanum;
            //            tfParam[1] = this.jTextField1;
            //     tfParam[2] = this.tarjenum;
            //          tfParam[3] = this.jTextField10;
            //tfParam[4] = this.jTextField11;

            VentanaBuscar buscador = new VentanaBuscar("SELECT ventas.ven_cod,ventas.cli_ruc,clientes.cli_nom,clientes.cli_ape,ventas.vent_monto,ventas.estado FROM ventas,clientes WHERE ventas.cli_ruc=clientes.cli_ruc AND ventas.estado='P' AND ventas.ven_cod LIKE  ", new String[]{"FACTURA N°", "RUC", "NOMBRE", "APELLIDO", "MONTO", "ESTADO"}, 6, tfParam);
            buscador.setTitle("Buscar CARGO");
            buscador.setVisible(true);
        }
    }//GEN-LAST:event_facturanumKeyPressed

    private void facturanumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturanumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facturanumActionPerformed

    private void apercodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apercodiActionPerformed
        // TODO add your handling code here:
        ComboCaja();
    }//GEN-LAST:event_apercodiActionPerformed

    private void barraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barraKeyPressed
        // TODO add your handling code here:
        if (barra.getText().equals("") && evt.getKeyChar() == KeyEvent.VK_ENTER)//no trae nada
        {
            JTextField[] tfParam = new JTextField[2];
            tfParam[0] = this.barra;
            VentanaBuscar buscador = new VentanaBuscar("SELECT BARRA,UPPER(descripcion)AS descripcion\n"
                    + "FROM producto where descripcion like  ", new String[]{"CODIGO PRODUCTO", "NOMBRE PRODUCTO"}, 2, tfParam);
            buscador.setTitle("Buscar PRODUCTOS");
            buscador.setVisible(true);
            buscador.setVisible(true);
        }

        if (evt.getKeyCode() == 123) {
            new cobrar().setVisible(true);
            bcancelar.setEnabled(true);

        }

        if (evt.getKeyCode() == 122) {
            gencodDetalle();
            try {
                grabar();
            } catch (IOException ex) {
                Logger.getLogger(cobros.class.getName()).log(Level.SEVERE, null, ex);
            }

            limpiarTexto();
            total = 0;
            BGravar1.setEnabled(false);
            BGravar.setEnabled(false);
            barra.setEnabled(true);
            barra.requestFocus();

        }
    }//GEN-LAST:event_barraKeyPressed

    private void bborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bborrarActionPerformed
        // TODO add your handling code here:DefaultTableModel dtm = (DefaultTableModel) jTableProducto.getModel(); //TableProducto es el nombre de mi tabla ;)
        // DefaultTableModel dtm = (DefaultTableModel) grillacobro.getModel(); //TableProducto es el nombre de mi tabla ;) 
        // dtm.removeRow(grillacobro.getSelectedRow()); 
        // cursor.removeRow(grillacobro.getSelectedRow());
        sumarColumna();
        eliminarPedido();
    }//GEN-LAST:event_bborrarActionPerformed

    private void txtcambio122233ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcambio122233ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcambio122233ActionPerformed

    private void cantidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidKeyTyped
        // TODO add your handling code here:
//         char caracter = evt.getKeyChar();
//        if(((caracter < '0') ||
//        (caracter > '9')) &&
//        (caracter != evt.VK_BACK_SPACE))
//        {
//            evt.consume();
//        }
    }//GEN-LAST:event_cantidKeyTyped

    private void BGravarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BGravarKeyPressed

    }//GEN-LAST:event_BGravarKeyPressed

    private void BGravarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BGravarKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_BGravarKeyTyped

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
            java.util.logging.Logger.getLogger(cobros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cobros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cobros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cobros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {
                    new cobros().setVisible(false);
                } catch (ClassNotFoundException ex) {

                }

            }
        });
    }

    /*  private void total_abonado() {AD
 //       int totalabo = Integer.parseInt(efectivo.getText());
  //      monto.setText(String.valueOf(totalabo));
   //     if (Integer.parseInt(monto.getText()) > Integer.parseInt(monto.getText())) {
   //         cambio.setText(String.valueOf(Integer.parseInt(monto.getText()) - Integer.parseInt(monto.getText())));
       } else {
            cambio.setText("0");
        }
    }*/

 /*   private void habilitargrabar() {
        if (Integer.parseInt(monto.getText()) >= Integer.parseInt(monto.getText())) {
//  grabar.setEnabled(true);
        }
    }
     */
    private void gencod() {
        try {

            bandera = "agregar";
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(id),0)+1 AS newcod ,CURDATE() AS fecha,curtime() as hora FROM cabecera_ventas");
            conn.resultado.next();

            cobnro.setText(conn.resultado.getString("newcod"));
            txthora.setText(conn.resultado.getString("hora"));
            fecha.setText(conn.resultado.getString("fecha"));

        } //fin generar
        catch (SQLException ex) {
            //   Logger.getLogger(facturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void gencodDetalle() {
        try {

            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(id),0)+1 AS newcod ,CURDATE() AS fecha FROM detalle_ventas");
            conn.resultado.next();
            //this.jTextcod
            //fecha.setText(conn.resultado.getString("fecha"));
            id_detalle = Integer.parseInt(conn.resultado.getString("newcod"));
        } //fin generar
        catch (SQLException ex) {
            //   Logger.getLogger(facturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void buscar_cajero() {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery(" SELECT DISTINCT AC.USU_COD AS USUARIO, \n"
                    + "  U.usu_nomb AS USUARIO_NOMBRE,\n"
                    + "  SU.SUC_COD,\n"
                    + "  SU.SUC_DESC,\n"
                    + "  AC.ID_CAJA,\n"
                    + "  AC.FECHA_APER,\n"
                    + "  AC.id AS nro_apertura\n"
                    + "  FROM APER_CIERRE AC \n"
                    + "  INNER JOIN USUARIO U ON U.USU_COD = AC.USU_COD\n"
                    + "  INNER JOIN SUCURSAL SU ON SU.SUC_COD =AC.SUCU_COD \n"
                    + "  INNER JOIN CAJAS C ON C.ID = AC.ID_CAJA\n"
                    + "  WHERE AC.ESTADO = 2\n"
                    + "  AND C.ESTADO = 2  \n"
                    + "  AND AC.USU_COD = " + cajero.getText() + "");
            while (conn.resultado.next()) {
                //this.jTextcod
                // cajero.setText(conn.resultado.getString("id"));
                cajenomb.setText(conn.resultado.getString("USUARIO_NOMBRE"));
                sucucod.setText(conn.resultado.getString("SUC_COD"));
                sucudesc.setText(conn.resultado.getString("SUC_DESC"));
                nroCaja = (conn.resultado.getString("ID_CAJA"));
                //cajanum.setText(conn.resultado.getString("ID_CAJA"));
                apercodi.addItem(conn.resultado.getString("nro_apertura"));
                barra.requestFocus();
            } //fin generar
        } catch (Exception ex) {
        }
    }

    private void buscarCliente() {
        try {

            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(id),0)+1 AS newcod ,CURDATE() AS fecha FROM cabecera_ventas");
            conn.resultado.next();
            //this.jTextcod
            fecha.setText(conn.resultado.getString("fecha"));
            cobnro.setText(conn.resultado.getString("newcod"));
        } //fin generar
        catch (SQLException ex) {
            //   Logger.getLogger(facturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void numaper() {
        try {
            //  int codbuscado = Integer.parseInt(aper_cie_arqueo.pasarnumapertura());
            ver_conex conf = new ver_conex();//instanciamos current_date()  (curdate())
            conf.sentencia = conf.conexion.createStatement();
            // conf.resultado = conf.sentencia.executeQuery("SELECT aper_id FROM aper_ciere= " + aper.getText());
            conf.resultado.next();
            cajanum.setText(conf.resultado.getString("caja"));
            apertura_num = conf.resultado.getString("aper_id");

        } catch (SQLException exceptionSql) {
            JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    private void des_botones() {

    }

    private void hab_botones() {

    }

    private void clear_text() {
        fecha.setText("");
        cobnro.setText("");
        //  codcli.setText("");
        //nomcli.setText("");
        // monto.setText("");
    }

    private void grabar() throws IOException {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            gencod();  // sirve para que no se dupliquen los codigos y no de error cuando se trabaja en redes
            conn.sentencia.executeUpdate("INSERT INTO cabecera_ventas(id,id_local,id_cliente,nro_factura,fecha,hora,venta_total,usuario,estado,numero_caja,aper_cod,id_condicion,monto_pagado,vuelto) values(" + cobnro.getText() + "," + sucucod.getText() + "," + 1 + "," + facturanum.getText() + ",'" + fecha.getText() + "','" + txthora.getText() + "'," + Total.getText() + "," + usucodigo.getText() + "," + "'1'" + "," + cajanum.getText() + "," + apercodi.getSelectedItem() + "," + "'1'" + ",'" + Integer.parseInt(txtpagado.getText()) + "','" + txtcambio122233.getText() + "')");
            gencodDetalle();
            //graba en el detalle
            for (int fila = 0; fila < grillacobro.getRowCount(); fila++) {
                gencodDetalle();
                conn.sentencia.executeUpdate("insert into detalle_ventas(id,id_cabecera,id_producto,barra_producto,item,cantidad,precio_unit,importe_bruto,unidad_medida)values(" + id_detalle + "," + cobnro.getText() + "," + grillacobro.getValueAt(fila, 1) + "," + grillacobro.getValueAt(fila, 2) + "," + grillacobro.getValueAt(fila, 0) + "," + grillacobro.getValueAt(fila, 7) + "," + grillacobro.getValueAt(fila, 6) + "," + grillacobro.getValueAt(fila, 8) + "," + grillacobro.getValueAt(fila, 4) + ")");

                String valorCodigo = String.valueOf(grillacobro.getValueAt(fila, 2));
                //               ajustar_saldo(valorCodigo.toString());
                if (asociado > 0) {
                    if (Integer.parseInt((String) grillacobro.getValueAt(fila, 7)) > saldo) {
                        suma_saldo = contenido + saldo;
                        valor_final_saldo = suma_saldo - Integer.parseInt((String) grillacobro.getValueAt(fila, 7));

                        //    conn.sentencia.executeUpdate("update stock_productos set disponible = disponible - 1 where plu_producto = " + asociado + "");
                        //    conn.sentencia.executeUpdate("update producto set saldo = " + valor_final_saldo + " where barra = " + valorCodigo + "");
                        //    conn.sentencia.executeUpdate("update stock_productos set disponible= " + valor_final_saldo + " where plu_producto = " + valorCodigo + "");
                    }
                    if (Integer.parseInt((String) grillacobro.getValueAt(fila, 7)) <= saldo) {

                        //    conn.sentencia.executeUpdate("update producto set saldo = saldo - " + grillacobro.getValueAt(fila, 7) + " where barra = " + valorCodigo + "");
                        conn.sentencia.executeUpdate("update stock_productos set disponible= disponible - " + grillacobro.getValueAt(fila, 7) + " where plu_producto = " + valorCodigo + "");
                    }
                }

            }
            //generarArchivo();
             generarTicketVenta();
            //   JOptionPane.showMessageDialog(null, "REGISTRO GRABADO", "CONFIRMACION", JOptionPane.INFORMATION_MESSAGE);

            gencod();
            limpiargrilla();

        } catch (SQLException ex) {
            Logger.getLogger(ciudad.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String actuali_fact = "";
    public String ventaNro = "";
    public String bandera = "";
    public String fpago = "";
    public String iva = "";
    public float total, totaliva5, totaliva10, totaliva, ban;
    String apertura_num = "";
    public String Hora = "";
    public String v = "";
    public String fact = "";
    public int cam, efe, mon;
    public int condicion = 0;
    public int nuevo_saldo = 0;
    public int saldo = 0;
    public int contenido = 0;
    public int asociado = 0;
    public int suma_saldo = 0;
    public int valor_final_saldo = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BGravar;
    public static javax.swing.JButton BGravar1;
    private javax.swing.JButton BSalir;
    private javax.swing.JTextField IDproduc;
    private javax.swing.JTextField Letras;
    public static javax.swing.JTextField Total;
    private javax.swing.JComboBox<String> apercodi;
    private javax.swing.JTextField barra;
    private javax.swing.JButton bborrar;
    private javax.swing.JButton bcancelar;
    private javax.swing.JTextField cajanum;
    private javax.swing.JTextField cajenomb;
    private javax.swing.JTextField cajero;
    private javax.swing.JTextField cantid;
    private javax.swing.JTextField cobnro;
    private javax.swing.JTextField facturanum;
    private javax.swing.JLabel fecha;
    private javax.swing.JTable grillacobro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLcod12;
    private javax.swing.JLabel jLcod13;
    private javax.swing.JLabel jLcod14;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField produdesc;
    private javax.swing.JLabel suc_cod;
    private javax.swing.JTextField sucucod;
    private javax.swing.JTextField sucudesc;
    private javax.swing.JTextField timbrado_num;
    private javax.swing.JLabel turno;
    public static javax.swing.JTextField txtcambio1;
    public static javax.swing.JTextField txtcambio122233;
    private javax.swing.JLabel txthora;
    public static javax.swing.JTextField txtpagado;
    public static javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField unimed_cod;
    private javax.swing.JTextField unimed_nomb;
    // End of variables declaration//GEN-END:variables
    public void generereporte_efe() //throws JRException, Exception
    {
        try //throws JRException, Exception
        {
            conn.sentencia = conn.conexion.createStatement();
//            String aux ="";
//            aux = "SELECT ventas.tipo,ventas.ven_iva,ventas.cli_ruc,ventas.ven_cod,ventas.vent_fecha,ventas.vent_monto,";
//            aux = aux + "detalle_ventas.pro_cod,detalle_ventas.sub_g5,detalle_ventas.sub_g10,detalle_ventas.precio,detalle_ventas.cantidad, producto.pro_desc,detalle_ventas.sub_ex ";
//            aux = aux + "FROM ventas,detalle_ventas,producto";
//            aux = aux + "WHERE ventas.ven_cod = detalle_ventas.ven_cod AND";
//            aux = aux + "ventas.ven_cod= "+Tcod.getText();

            conn.resultado = conn.sentencia.executeQuery("SELECT  deta_cobro.ven_cod ,detalle_cobros.cob_cod,cobros.for_cod,f_cobro.for_desc,cobros.fecha,cobros.monto,ventas.cli_ruc,clientes.cli_nom,clientes.cli_ape FROM cobros INNER JOIN detalle_cobros ON cobros.cob_cod = detalle_cobros.cob_cod INNER JOIN ventas ON detalle_cobros.ven_cod= ventas.ven_cod INNER JOIN clientes ON ventas.cli_ruc = clientes.cli_ruc INNER JOIN f_cobro ON cobros.for_cod = f_cobro.for_cod WHERE detalle_cobros.cob_cod=" + cobnro.getText()); //OJO LE PASO LA SENTENCIA
            JRResultSetDataSource jrRS = new JRResultSetDataSource(conn.resultado);

            HashMap parameters = new HashMap();
            URL urlMaestro = getClass().getClassLoader().getResource("reportes/reciboefe.jasper");

            // Cargamos el reporte
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport, parameters, jrRS);
            JasperViewer ventana = new JasperViewer(masterPrint, false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(cobros.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(cobros.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void buscar_cod() {
        try {
            Integer saldo = 0;
            Integer contenido = 0;

            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT  p.barra,p.prd_cod,p.descripcion,"
                    + "p.precio_venta,udm.unid_cod,udm.unid_desc,p.saldo,p.contenido\n"
                    + "                    FROM producto p\n"
                    + "                    INNER JOIN unidad_medida udm ON p.unid_cod =udm.unid_cod \n"
                    + "                    WHERE  p.barra = " + this.barra.getText());

            if (conn.resultado.next())//si encontro
            {
                this.IDproduc.setText(conn.resultado.getString("prd_cod"));
                this.produdesc.setText(conn.resultado.getString("descripcion"));
                this.unimed_cod.setText(conn.resultado.getString("unid_cod"));
                this.unimed_nomb.setText(conn.resultado.getString("unid_desc"));
                this.precio.setText(conn.resultado.getString("precio_venta"));
                saldo = Integer.parseInt(conn.resultado.getString("saldo"));
                contenido = Integer.parseInt(conn.resultado.getString("contenido"));
                //iva = conn.resultado.getString("imp_cod");
                this.IDproduc.setEnabled(false);
                this.cantid.setEnabled(true);
                this.cantid.requestFocus();

                precio.setEnabled(true);
                IDproduc.setEnabled(false);
                barra.setEnabled(false);

            } else//no encontro
            {
                JOptionPane.showMessageDialog(null, "CODIGO DE PRODUCTO NO EXISTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                this.barra.setEnabled(true);
                this.barra.requestFocus();
            }

        } catch (SQLException exceptionSql) {
        }
    }

    private void buscar_id() {

        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT p.barra, p.prd_cod,p.descripcion,p.precio_venta,udm.unid_cod,udm.unid_desc\n"
                    + "                    FROM producto p\n"
                    + "                    INNER JOIN unidad_medida udm ON p.unid_cod =udm.unid_cod \n"
                    + "                    AND p.prd_cod = " + this.IDproduc.getText());

            if (conn.resultado.next())//si encontro
            {
                this.barra.setText(conn.resultado.getString("barra"));
                this.produdesc.setText(conn.resultado.getString("descripcion"));
                this.unimed_cod.setText(conn.resultado.getString("unid_cod"));
                this.unimed_nomb.setText(conn.resultado.getString("unid_desc"));
                this.precio.setText(conn.resultado.getString("precio_venta"));

                // this.txtcantidad.setText(conn.resultado.getString("p"));
                //iva = conn.resultado.getString("imp_cod");
                this.IDproduc.setEnabled(false);
                this.cantid.setEnabled(true);
                this.cantid.requestFocus();
            } else//no encontro
            {
                JOptionPane.showMessageDialog(null, "CODIGO DE PRODUCTO NO EXISTE", "MENSAJE",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException exceptionSql) {
            JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    private void tirar_grillas() {
        try {
            do {
                c++;
                DefaultTableModel dt;
                dt = (DefaultTableModel) grillacobro.getModel();
                String campos[] = new String[]{String.valueOf(c), IDproduc.getText(), barra.getText(), produdesc.getText(), unimed_cod.getText(), unimed_nomb.getText(), precio.getText(), cantid.getText(), (String.valueOf(Float.parseFloat(precio.getText()) * Float.parseFloat(cantid.getText()))).replace(".0", "")};//cantid
                dt.addRow(campos);
            } while (conn.resultado.next());
        } catch (NumberFormatException | SQLException e) {
            //  JOptionPane.showMessageDialog(this, "ERROR" + e, "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
        cantid.setEnabled(false);
        cantid.setText("");
        unimed_cod.setText("");
        unimed_nomb.setText("");
        produdesc.setText("");
        precio.setText("");
        barra.setText("");
    }

    private void limpiar() {
        barra.setEnabled(true);
        barra.setText("");
        barra.requestFocus();
        IDproduc.setText("");
        unimed_cod.setText("");
        produdesc.setText("");
        cantid.setText("");
        precio.setText("");
        //fecha.setText("");
    }

    //SELECT CONCAT(suc_exp,'-',suc_boca,'-',num_fa_ac) AS factura FROM caja WHERE caja_cod =
    private void factura_num() {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT CONCAT(LPAD(c.cod_establecimiento,3,'0'),'-',LPAD(c.punto_expedicion,3,'0'),'-',LPAD((c.nro_fact_actual+1),7,'0')) AS factura,t.nro_timbrado\n"
                    + "FROM cajas c INNER JOIN timbrado t ON t.id = c.id_timbrado  \n"
                    + "WHERE c.id = 1");

            if (conn.resultado.next())//si encontro
            {
                this.facturanum.setText(conn.resultado.getString("factura"));
                this.timbrado_num.setText(conn.resultado.getString("nro_timbrado"));
                //this.titular.requestFocus();
                barra.requestFocus();

            } else//no encontro
            {
                //  JOptionPane.showMessageDialog(null, "CODIGO DE BANCO NO EXISTE", "MENSAJE",
                //  JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException exceptionSql) {
            JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
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
            //  System.exit(0);
        }
    }//fin generar

    private void Hora1() {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("select curtime() as hora");
            conn.resultado.next();
            txthora.setText(conn.resultado.getString("hora"));
            barra.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error" + e, "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void limpiargrilla() {
        DefaultTableModel tb = (DefaultTableModel) grillacobro.getModel();
        int a = grillacobro.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
    }

    private void ComboCaja() {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("select id_caja from aper_cierre where id = '" + apercodi.getSelectedItem() + "'");
            conn.resultado.next();

            cajanum.setText(conn.resultado.getString("id_caja"));
            barra.setEnabled(true);
            IDproduc.setEnabled(true);
            barra.requestFocus();
        } catch (Exception e) {
            dispose();
        }
    }

    public void sumarColumna() {
        int fila;
        float total = 0;
        int total_letas = 0;

        for (int i = 0; i < grillacobro.getRowCount(); i++) {
            fila = Integer.parseInt(grillacobro.getValueAt(i, 8).toString());
            total += fila;
            Total.setText(String.valueOf(Math.round(total)));

            Letras.setText(numero.nletra(Math.round(total)));

        }
    }

    private void limpiarTexto() {
        barra.setText("");
        IDproduc.setText("");
        precio.setText("");
        precio.setText("");
        unimed_nomb.setText("");
        cantid.setText("");
        Letras.setText("");
        Total.setText("");
        txtpagado.setText("");
        txtsaldo.setText("");
        txtcambio122233.setText("");

    }

    private void salir() {
        int respuesta = JOptionPane.showConfirmDialog(this, "DESEA SALIR", "CONFIRMAR", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            dispose();

        }

    }

    public void eliminarPedido() {
        cursor = (DefaultTableModel) grillacobro.getModel();
        int fila = grillacobro.getSelectedRow();
        if (fila >= 0) {
            int[] filasselec = grillacobro.getSelectedRows();
            for (int i = 0; i < filasselec.length; i++) {
                cursor.removeRow(filasselec[i]);
                sumarColumna();
                ;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No Selecciono Ninguna Fila", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void generarTicketVenta() {
        try {
            ver_conex con = new ver_conex();

            JasperReport reporte = null;

            String path = "\\reportes2\\ticket.jasper";

            Map parametro = new HashMap();
            parametro.put("ID_VENTA", cobnro.getText());

            reporte = (JasperReport) JRLoader.loadObjectFromFile(System.getProperty("user.dir") + path);

            JasperPrint jp = JasperFillManager.fillReport(reporte, parametro, con.conexion);

            // para visiualizar el ticket antes de imprimir
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jv.setVisible(false);

            JasperPrintManager.printReport(jp, false);

        } catch (JRException ex) {
            Logger.getLogger(ReporteInventario.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void generarArchivo() throws IOException {

        try {
            // Se genera en archivo y se especifica la ubicacion donde estara
            FileWriter file = new FileWriter("C:/Fichero/fichero.txt");

            // armamos el ticket
            file.write("           Despensa Morales");
            file.write("\n    Ramos generales Anexo Bodega ");
            file.write("\n--------------------------------------");
            file.write("\nNro: " + String.format("%07d", Integer.parseInt(cobnro.getText())) + " Cajero: " + String.format("%-8s", cajenomb.getText()).substring(0, 8) + " Caja: " + String.format("%02d", Integer.parseInt(cajanum.getText())));
            file.write("\nFecha :" + String.format("%-13s", fecha.getText()) + " Hora: " + String.format("%-11s", txthora.getText()));
            file.write("\n______________________________________");
            file.write("\nCódigo        Descripción");
            file.write("\nCantidad      Precio Unitario  Importe");
            file.write("\n______________________________________");
            file.write("\n--------------------------------------" );
         
            // agregamos los detalles 
            for (int i = 0; i < this.grillacobro.getRowCount(); i++) {
                file.write("\n"+ String.format("%-13s"  ,grillacobro.getValueAt(i, 2).toString()) +" "+ String.format("%-24s", grillacobro.getValueAt(i, 3).toString()).substring(0,24) );
                file.write("\nCant:"+ String.format("%-9s"  ,grillacobro.getValueAt(i, 7).toString()) +" Unit:"+ String.format("%-10s"  ,grillacobro.getValueAt(i, 6).toString()) + String.format("%-7s"  ,grillacobro.getValueAt(i, 8).toString()));
            }

            DecimalFormat formatea = new DecimalFormat("###,###.##");
            // agregamos los importes 
           file.write("\n______________________________________");
           file.write("\n         Importe Total:    " + String.format("%-8s"  ,formatea.format(Double.parseDouble(Total.getText().toString()))));
           file.write("\n         Monto Pagado:     " + String.format("%-8s"  ,formatea.format(Double.parseDouble(txtpagado.getText().toString()))));
           file.write("\n         Vuelto:           " + String.format("%-8s"  ,formatea.format(Double.parseDouble(txtcambio122233.getText().toString()))));
           file.write("\n--------------------------------------" );
           // agregamos el pie de pagina
           file.write("\n    Gracias por su preferencia.!!!    " );
           file.write("\n   *Este documento no tiene validez   " );
           file.write("\n  legal, favor solicitar su factura.  " );
           
            file.close();

            // imprimir el archivo generado
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            // obtenemos el archivo a imprimir
            java.io.File fichero = new java.io.File("C:/Fichero/fichero.txt");

      
                   desktop.print(fichero);

        } catch (Exception e) {
            System.out.println("excepcion :" + e);
        }
    }

}
