/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;
import javax.swing.JOptionPane;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import programas.conexion;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import programas.ver_conex;

/**
 *
 * @author Yeni
 */
public class informe_servicios extends javax.swing.JFrame {
public int radio1,radio2,radio3,radio4,radio5 = 0;
   ResultSet gloResu;
    private int ban;
        public String operacion="";
  private int opcion;
  public ResultSet rs;
    private java.sql.ResultSet rss;
  ver_conex conn =new ver_conex();
    /**
     * Creates new form informe_servicios
     */
    public informe_servicios() {
        initComponents();
        this.setLocationRelativeTo(null);
         conn =new ver_conex();
    }
private void habilitar_jRadioBoton(){
     recetas.setEnabled(true);
     ordenproduccion.setEnabled(true);
     transferencia.setEnabled(true);
     proceso.setEnabled(true);
     control.setEnabled(true);
    
     jr_fecha.setEnabled(true);
     jr_todos.setEnabled(true);
          }
private void deshabilitar_jRadioBoton(){
     recetas.setEnabled(false);
     ordenproduccion.setEnabled(false);
     transferencia.setEnabled(false);
     proceso.setEnabled(false);
     control.setEnabled(false);
     
     jr_fecha.setEnabled(false);
     jr_todos.setEnabled(false);
    }
private void limpiar_txt(){

   this.tdesde.setText("");
   this.thasta.setText("");
   
    }
private void habilita_text(){


this.tdesde.setEnabled(true);
this.thasta.setEnabled(true);
 }
private void deshabilita_txt(){

this.thasta.setEnabled(false);
this.tdesde.setEnabled(false);
 }

private void generar_informe_recetas()
{
try
{
java.sql.Statement instruccion = conn.conexion.createStatement();
if(jr_fecha.isSelected()==true){
   String sql ="SELECT cabecera_recet.rece_cod,cabecera_recet.rece_desc,cabecera_recet.rece_fecha,\n" +
"CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape)) AS personal,sucursal.suc_desc FROM \n" +
"cabecera_recet,funcionario,sucursal WHERE cabecera_recet.func_cod=funcionario.func_cod AND \n" +
"cabecera_recet.suc_cod=sucursal.suc_cod and cabecera_recet.rece_fecha >= '" +tdesde.getText()+ "' and cabecera_recet.rece_fecha <= '"+thasta.getText()+"' order by cabecera_recet.rece_cod";
            rss = instruccion.executeQuery(sql);
            }
         if(jr_todos.isSelected()==true){
         String sqll ="SELECT cabecera_recet.rece_cod,cabecera_recet.rece_desc,cabecera_recet.rece_fecha,\n" +
"CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape)) AS personal,sucursal.suc_desc FROM \n" +
"cabecera_recet,funcionario,sucursal WHERE cabecera_recet.func_cod=funcionario.func_cod AND \n" +
"cabecera_recet.suc_cod=sucursal.suc_cod order by cabecera_recet.rece_cod";
         rss = instruccion.executeQuery(sqll);
         }
 
        } catch (Exception ex) {
            Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE,null, ex);
        }

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rss);
        HashMap parameters = new HashMap();

        try{
            URL urlMaestro=null;
             urlMaestro = getClass().getClassLoader().getResource("reportes/informerecetas.jasper");
            // Cargamos el reporte
             System.out.println(urlMaestro);
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport,parameters,jrRS);

             JasperViewer ventana = new JasperViewer(masterPrint,false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);

        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error "+e.toString(),"ATENCION ", JOptionPane.INFORMATION_MESSAGE);
        }
	buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
//         cbo_estado.removeAll();
    }
private void generar_informe_orden()
{
try
{
java.sql.Statement instruccion = conn.conexion.createStatement();
if(jr_fecha.isSelected()==true){
   String sql ="SELECT orden_produccion.or_pro_cod,orden_produccion.fecha_inicio,sucursal.suc_desc,\n" +
"CONCAT(CONCAT(cliente.cli_nom,'-',cli_ape)) AS cliente,cliente.cli_ci,CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape))\n" +
"AS personal FROM orden_produccion,sucursal,cliente,funcionario WHERE orden_produccion.suc_cod=sucursal.suc_cod AND \n" +
"orden_produccion.cli_cod=cliente.cli_cod AND orden_produccion.func_cod=funcionario.func_cod and orden_produccion.fecha_inicio >= '" +tdesde.getText()+ "' and orden_produccion.fecha_inicio <= '"+thasta.getText()+"' order by orden_produccion.or_pro_cod";
            rss = instruccion.executeQuery(sql);
            }
         if(jr_todos.isSelected()==true){
         String sqll ="SELECT orden_produccion.or_pro_cod,orden_produccion.fecha_inicio,sucursal.suc_desc,\n" +
"CONCAT(CONCAT(cliente.cli_nom,'-',cli_ape)) AS cliente,cliente.cli_ci,CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape))\n" +
"AS personal FROM orden_produccion,sucursal,cliente,funcionario WHERE orden_produccion.suc_cod=sucursal.suc_cod AND \n" +
"orden_produccion.cli_cod=cliente.cli_cod AND orden_produccion.func_cod=funcionario.func_cod order by orden_produccion.or_pro_cod";
         rss = instruccion.executeQuery(sqll);
         }
 
        } catch (Exception ex) {
            Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE,null, ex);
        }

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rss);
        HashMap parameters = new HashMap();

        try{
            URL urlMaestro=null;
             urlMaestro = getClass().getClassLoader().getResource("reportes/informeproduccion.jasper");
            // Cargamos el reporte
             System.out.println(urlMaestro);
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport,parameters,jrRS);

             JasperViewer ventana = new JasperViewer(masterPrint,false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);

        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error "+e.toString(),"ATENCION ", JOptionPane.INFORMATION_MESSAGE);
        }
	buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
//         cbo_estado.removeAll();
    }
private void generar_informe_transferencia()
{
try
{
java.sql.Statement instruccion = conn.conexion.createStatement();
if(jr_fecha.isSelected()==true){
   String sql ="SELECT cabecera_transf.transf_cod,cabecera_transf.trans_fech,cabecera_transf.destino,cabecera_transf.tipo_trans,\n" +
"sucursal.suc_desc,funcionario.func_nom FROM cabecera_transf,sucursal,funcionario WHERE cabecera_transf.suc_cod=sucursal.suc_cod AND \n" +
"cabecera_transf.func_cod=funcionario.func_cod and cabecera_transf.trans_fech >= '" +tdesde.getText()+ "' and cabecera_transf.trans_fech <= '"+thasta.getText()+"' order by cabecera_transf.transf_cod";
            rss = instruccion.executeQuery(sql);
            }
         if(jr_todos.isSelected()==true){
         String sqll ="SELECT cabecera_transf.transf_cod,cabecera_transf.trans_fech,cabecera_transf.destino,cabecera_transf.tipo_trans,\n" +
"sucursal.suc_desc,funcionario.func_nom FROM cabecera_transf,sucursal,funcionario WHERE cabecera_transf.suc_cod=sucursal.suc_cod AND \n" +
"cabecera_transf.func_cod=funcionario.func_cod order by cabecera_transf.transf_cod";
         rss = instruccion.executeQuery(sqll);
         }
 
        } catch (Exception ex) {
            Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE,null, ex);
        }

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rss);
        HashMap parameters = new HashMap();

        try{
            URL urlMaestro=null;
             urlMaestro = getClass().getClassLoader().getResource("reportes/informetransferencia.jasper");
            // Cargamos el reporte
             System.out.println(urlMaestro);
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport,parameters,jrRS);

             JasperViewer ventana = new JasperViewer(masterPrint,false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);

        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error "+e.toString(),"ATENCION ", JOptionPane.INFORMATION_MESSAGE);
        }
	buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
//         cbo_estado.removeAll();
    }

private void generar_informe_proceso()
{
try
{
java.sql.Statement instruccion = conn.conexion.createStatement();
if(jr_fecha.isSelected()==true){
   String sql ="SELECT procesos_produccion.proces_cod,procesos_produccion.proces_fech,sucursal.suc_desc,\n" +
"orden_produccion.or_pro_cod,funcionario.func_nom FROM procesos_produccion,sucursal,funcionario,orden_produccion\n" +
"WHERE procesos_produccion.suc_cod=sucursal.suc_cod AND procesos_produccion.func_cod=funcionario.func_cod AND \n" +
"procesos_produccion.or_pro_cod=orden_produccion.or_pro_cod and procesos_produccion.proces_fech >= '" +tdesde.getText()+ "' and procesos_produccion.proces_fech <= '"+thasta.getText()+"' order by procesos_produccion.proces_cod";
            rss = instruccion.executeQuery(sql);
            }
         if(jr_todos.isSelected()==true){
         String sqll ="SELECT procesos_produccion.proces_cod,procesos_produccion.proces_fech,sucursal.suc_desc,\n" +
"orden_produccion.or_pro_cod,funcionario.func_nom FROM procesos_produccion,sucursal,funcionario,orden_produccion\n" +
"WHERE procesos_produccion.suc_cod=sucursal.suc_cod AND procesos_produccion.func_cod=funcionario.func_cod AND \n" +
"procesos_produccion.or_pro_cod=orden_produccion.or_pro_cod order by procesos_produccion.proces_cod";
         rss = instruccion.executeQuery(sqll);
         }
 
        } catch (Exception ex) {
            Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE,null, ex);
        }

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rss);
        HashMap parameters = new HashMap();

        try{
            URL urlMaestro=null;
             urlMaestro = getClass().getClassLoader().getResource("reportes/informeproceso.jasper");
            // Cargamos el reporte
             System.out.println(urlMaestro);
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport,parameters,jrRS);

             JasperViewer ventana = new JasperViewer(masterPrint,false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);

        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error "+e.toString(),"ATENCION ", JOptionPane.INFORMATION_MESSAGE);
        }
	buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
//         cbo_estado.removeAll();
    }
private void generar_informe_control()
{
try
{
java.sql.Statement instruccion = conn.conexion.createStatement();
if(jr_fecha.isSelected()==true){
   String sql ="SELECT control_calidad.cont_cod,control_calidad.cont_fecha,CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape))AS personal,\n" +
"sucursal.suc_desc,orden_produccion.or_pro_cod FROM control_calidad,sucursal,funcionario,orden_produccion\n" +
"WHERE control_calidad.suc_cod=sucursal.suc_cod AND control_calidad.func_cod=funcionario.func_cod AND \n" +
"control_calidad.or_pro_cod=orden_produccion.or_pro_cod and control_calidad.cont_fecha >= '" +tdesde.getText()+ "' and control_calidad.cont_fecha <= '"+thasta.getText()+"' order by control_calidad.cont_cod";
            rss = instruccion.executeQuery(sql);
            }
         if(jr_todos.isSelected()==true){
         String sqll ="SELECT control_calidad.cont_cod,control_calidad.cont_fecha,CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape))AS personal,\n" +
"sucursal.suc_desc,orden_produccion.or_pro_cod FROM control_calidad,sucursal,funcionario,orden_produccion\n" +
"WHERE control_calidad.suc_cod=sucursal.suc_cod AND control_calidad.func_cod=funcionario.func_cod AND \n" +
"control_calidad.or_pro_cod=orden_produccion.or_pro_cod order by control_calidad.cont_cod";
         rss = instruccion.executeQuery(sqll);
         }
 
        } catch (Exception ex) {
            Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE,null, ex);
        }

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rss);
        HashMap parameters = new HashMap();

        try{
            URL urlMaestro=null;
             urlMaestro = getClass().getClassLoader().getResource("reportes/informecontrol.jasper");
            // Cargamos el reporte
             System.out.println(urlMaestro);
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport,parameters,jrRS);

             JasperViewer ventana = new JasperViewer(masterPrint,false);
            ventana.setTitle("Vista Previa");
            ventana.setVisible(true);

        }catch(JRException e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error "+e.toString(),"ATENCION ", JOptionPane.INFORMATION_MESSAGE);
        }
	buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
//         cbo_estado.removeAll();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        recetas = new javax.swing.JRadioButton();
        ordenproduccion = new javax.swing.JRadioButton();
        transferencia = new javax.swing.JRadioButton();
        proceso = new javax.swing.JRadioButton();
        control = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tdesde = new javax.swing.JFormattedTextField();
        thasta = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jr_todos = new javax.swing.JRadioButton();
        jr_fecha = new javax.swing.JRadioButton();
        bhabilitar = new javax.swing.JButton();
        bgenerar = new javax.swing.JButton();
        bcancelar = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Servicios", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        buttonGroup1.add(recetas);
        recetas.setText("Recetas");
        recetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recetasMouseClicked(evt);
            }
        });
        recetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recetasActionPerformed(evt);
            }
        });

        buttonGroup1.add(ordenproduccion);
        ordenproduccion.setText("Orden de Produccion");
        ordenproduccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordenproduccionMouseClicked(evt);
            }
        });
        ordenproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenproduccionActionPerformed(evt);
            }
        });

        buttonGroup1.add(transferencia);
        transferencia.setText("Transferencias");
        transferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferenciaMouseClicked(evt);
            }
        });
        transferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferenciaActionPerformed(evt);
            }
        });

        buttonGroup1.add(proceso);
        proceso.setText("Proceso de Produccion");
        proceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                procesoMouseClicked(evt);
            }
        });
        proceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesoActionPerformed(evt);
            }
        });

        buttonGroup1.add(control);
        control.setText("Control de Calidad");
        control.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controlMouseClicked(evt);
            }
        });
        control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(control)
                    .addComponent(transferencia)
                    .addComponent(recetas)
                    .addComponent(ordenproduccion)
                    .addComponent(proceso))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recetas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                .addComponent(ordenproduccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(proceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(control)
                .addGap(45, 45, 45))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "ingrese parametros", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("Hasta");

        jLabel2.setText("Desde");

        try {
            tdesde.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tdesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdesdeActionPerformed(evt);
            }
        });

        try {
            thasta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        thasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thastaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thasta, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(tdesde))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tdesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(thasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Seleccione opcion", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        buttonGroup2.add(jr_todos);
        jr_todos.setText("Todos los registros");
        jr_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr_todosActionPerformed(evt);
            }
        });

        buttonGroup2.add(jr_fecha);
        jr_fecha.setText("Registro por Fecha");
        jr_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr_fechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jr_todos)
                .addGap(18, 18, 18)
                .addComponent(jr_fecha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jr_todos)
                    .addComponent(jr_fecha))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        bhabilitar.setText("Habilitar");
        bhabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhabilitarActionPerformed(evt);
            }
        });

        bgenerar.setText("Generar");
        bgenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgenerarActionPerformed(evt);
            }
        });

        bcancelar.setText("Cancelar");
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });

        bsalir.setText("Salir");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bhabilitar)
                            .addComponent(bcancelar))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bgenerar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bhabilitar)
                            .addComponent(bgenerar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bcancelar)
                            .addComponent(bsalir)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Produccion");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recetasMouseClicked
        if(recetas.isSelected())
        recetas.setEnabled(true);
    }//GEN-LAST:event_recetasMouseClicked

    private void recetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recetasActionPerformed
        operacion="recetas";
        opcion = 1;
        recetas.setEnabled(true);
        //  boton_generar.setEnabled(true);
        //jr_fecha.setEnabled(false);
    }//GEN-LAST:event_recetasActionPerformed

    private void ordenproduccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordenproduccionMouseClicked
        if(ordenproduccion.isSelected())
        ordenproduccion.setEnabled(true);
    }//GEN-LAST:event_ordenproduccionMouseClicked

    private void ordenproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenproduccionActionPerformed
        operacion="ordenproduccion";
        opcion = 2;
        ordenproduccion.setEnabled(true);
        //  boton_generar.setEnabled(true);
        //jr_fecha.setEnabled(false);
    }//GEN-LAST:event_ordenproduccionActionPerformed

    private void transferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferenciaMouseClicked
        if(transferencia.isSelected())
        transferencia.setEnabled(true);
    }//GEN-LAST:event_transferenciaMouseClicked

    private void transferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferenciaActionPerformed
        operacion="transferencia";
        opcion = 3;
        transferencia.setEnabled(true);
    }//GEN-LAST:event_transferenciaActionPerformed

    private void procesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procesoMouseClicked
        if(proceso.isSelected())
        proceso.setEnabled(true);
    }//GEN-LAST:event_procesoMouseClicked

    private void procesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesoActionPerformed
        operacion="proceso";
        opcion = 4;
        proceso.setEnabled(true);
    }//GEN-LAST:event_procesoActionPerformed

    private void controlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlMouseClicked
        if(control.isSelected())
        control.setEnabled(true);
    }//GEN-LAST:event_controlMouseClicked

    private void controlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlActionPerformed
        operacion="control";
        opcion = 5;
        control.setEnabled(true);
    }//GEN-LAST:event_controlActionPerformed

    private void tdesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdesdeActionPerformed
        if(tdesde.getText().trim().length()==0)
        {
            JOptionPane.showMessageDialog(this, "El campo de texto está vacío");
            this.tdesde.setEnabled(true);
            this.tdesde.requestFocus();
        }
        else
        {
            if(operacion.equals("recetas"))
            {
                try {
                    conn.sentencia = conn.conexion.createStatement();
                    conn.resultado = conn.sentencia.executeQuery("SELECT * FROM cabecera_recet WHERE cabecera_recet.rece_fecha='"+tdesde.getText()+"'");
                    boolean encontro = conn.resultado.next();

                    if (encontro==true)//encontro
                    {

                        tdesde.setEnabled(false);
                        thasta.setEnabled(true);
                        thasta.requestFocus();

                    }else {
                        JOptionPane.showMessageDialog(null, "NO EXISTE LA FECHA SELECCIONADA", "Atencion", JOptionPane.ERROR_MESSAGE);
                        tdesde.setText("");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(informe_servicios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(operacion.equals("ordenproduccion"))
        {
            try {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("SELECT * FROM orden_produccion WHERE orden_produccion.fecha_inicio='"+tdesde.getText()+"'");
                boolean encontro = conn.resultado.next();

                if (encontro==true)//encontro
                {

                    tdesde.setEnabled(false);
                    thasta.setEnabled(true);
                    thasta.requestFocus();

                }else {
                    JOptionPane.showMessageDialog(null, "NO EXISTE LA FECHA SELECCIONADA", "Atencion", JOptionPane.ERROR_MESSAGE);
                    tdesde.setText("");
                }

            } catch (SQLException ex) {
                Logger.getLogger(informe_servicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(operacion.equals("transferencia"))
        {
            try {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("SELECT * FROM cabecera_transf WHERE cabecera_transf.trans_fech='"+tdesde.getText()+"'");
                boolean encontro = conn.resultado.next();

                if (encontro==true)//encontro
                {

                    tdesde.setEnabled(false);
                    thasta.setEnabled(true);
                    thasta.requestFocus();

                }else {
                    JOptionPane.showMessageDialog(null, "NO EXISTE LA FECHA SELECCIONADA", "Atencion", JOptionPane.ERROR_MESSAGE);
                    tdesde.setText("");
                }

            } catch (SQLException ex) {
                Logger.getLogger(informe_servicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if(operacion.equals("proceso"))
        {
            try {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("SELECT * FROM procesos_produccion WHERE procesos_produccion.proces_fech='"+tdesde.getText()+"'");
                boolean encontro = conn.resultado.next();

                if (encontro==true)//encontro
                {

                    tdesde.setEnabled(false);
                    thasta.setEnabled(true);
                    thasta.requestFocus();

                }else {
                    JOptionPane.showMessageDialog(null, "NO EXISTE LA FECHA SELECCIONADA", "Atencion", JOptionPane.ERROR_MESSAGE);
                    tdesde.setText("");
                }

            } catch (SQLException ex) {
                Logger.getLogger(informe_servicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if(operacion.equals("control"))
        {
            try {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("SELECT * FROM control_calidad WHERE control_calidad.cont_fecha='"+tdesde.getText()+"'");
                boolean encontro = conn.resultado.next();

                if (encontro==true)//encontro
                {

                    tdesde.setEnabled(false);
                    thasta.setEnabled(true);
                    thasta.requestFocus();

                }else {
                    JOptionPane.showMessageDialog(null, "NO EXISTE LA FECHA SELECCIONADA", "Atencion", JOptionPane.ERROR_MESSAGE);
                    tdesde.setText("");
                }

            } catch (SQLException ex) {
                Logger.getLogger(informe_servicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tdesdeActionPerformed

    private void thastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thastaActionPerformed
        if(thasta.getText().trim().length()==0)
        {
            JOptionPane.showMessageDialog(this, "El campo de texto está vacío");
            this.thasta.setEnabled(true);
            this.thasta.requestFocus();
        }
        else
        {
            if(operacion.equals("recetas"))
            {
                try {
                    conn.sentencia = conn.conexion.createStatement();
                    conn.resultado = conn.sentencia.executeQuery("SELECT * FROM cabecera_recet WHERE cabecera_recet.rece_fecha='"+thasta.getText()+"'");
                    boolean encontro = conn.resultado.next();

                    if (encontro==true)//encontro
                    {

                        thasta.setEnabled(false);
                        bgenerar.setEnabled(true);
                        bgenerar.requestFocus();

                    }else {
                        JOptionPane.showMessageDialog(null, "NO EXISTE LA FECHA SELECCIONADA", "Atencion", JOptionPane.ERROR_MESSAGE);
                        thasta.setText("");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(informe_servicios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(operacion.equals("ordenproduccion"))
        {
            try {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("SELECT * FROM orden_produccion WHERE orden_produccion.fecha_inicio='"+tdesde.getText()+"'");
                boolean encontro = conn.resultado.next();

                if (encontro==true)//encontro
                {

                    thasta.setEnabled(false);
                    bgenerar.setEnabled(true);
                    bgenerar.requestFocus();

                }else {
                    JOptionPane.showMessageDialog(null, "NO EXISTE LA FECHA SELECCIONADA", "Atencion", JOptionPane.ERROR_MESSAGE);
                    thasta.setText("");
                }

            } catch (SQLException ex) {
                Logger.getLogger(informe_servicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(operacion.equals("transferencia"))
        {
            try {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("SELECT * FROM cabecera_transf WHERE cabecera_transf.trans_fech='"+tdesde.getText()+"'");
                boolean encontro = conn.resultado.next();

                if (encontro==true)//encontro
                {

                    thasta.setEnabled(false);
                    bgenerar.setEnabled(true);
                    bgenerar.requestFocus();

                }else {
                    JOptionPane.showMessageDialog(null, "NO EXISTE LA FECHA SELECCIONADA", "Atencion", JOptionPane.ERROR_MESSAGE);
                    thasta.setText("");
                }

            } catch (SQLException ex) {
                Logger.getLogger(informe_servicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if(operacion.equals("proceso"))
        {
            try {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("SELECT * FROM procesos_produccion WHERE procesos_produccion.proces_fech='"+tdesde.getText()+"'");
                boolean encontro = conn.resultado.next();

                if (encontro==true)//encontro
                {

                    thasta.setEnabled(false);
                    bgenerar.setEnabled(true);
                    bgenerar.requestFocus();

                }else {
                    JOptionPane.showMessageDialog(null, "NO EXISTE LA FECHA SELECCIONADA", "Atencion", JOptionPane.ERROR_MESSAGE);
                    thasta.setText("");
                }

            } catch (SQLException ex) {
                Logger.getLogger(informe_servicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if(operacion.equals("control"))
        {
            try {
                conn.sentencia = conn.conexion.createStatement();
                conn.resultado = conn.sentencia.executeQuery("SELECT * FROM control_calidad WHERE control_calidad.cont_fecha='"+tdesde.getText()+"'");
                boolean encontro = conn.resultado.next();

                if (encontro==true)//encontro
                {

                    thasta.setEnabled(false);
                    bgenerar.setEnabled(true);
                    bgenerar.requestFocus();

                }else {
                    JOptionPane.showMessageDialog(null, "NO EXISTE LA FECHA SELECCIONADA", "Atencion", JOptionPane.ERROR_MESSAGE);
                    thasta.setText("");
                }

            } catch (SQLException ex) {
                Logger.getLogger(informe_servicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_thastaActionPerformed

    private void jr_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr_todosActionPerformed
        tdesde.setText("");
        thasta.setText("");

        this.bgenerar.setEnabled(true);
        bgenerar.requestFocus();
    }//GEN-LAST:event_jr_todosActionPerformed

    private void jr_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr_fechaActionPerformed

        tdesde.setText("");
        thasta.setText("");
        tdesde.setEnabled(true);
        thasta.setEnabled(true);
        tdesde.requestFocus();
    }//GEN-LAST:event_jr_fechaActionPerformed

    private void bhabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhabilitarActionPerformed
        habilitar_jRadioBoton();
        deshabilita_txt();
        bcancelar.setEnabled(true);
    }//GEN-LAST:event_bhabilitarActionPerformed

    private void bgenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgenerarActionPerformed
        if(opcion ==1)
        {

            generar_informe_recetas();
        }
        if(opcion ==2)
        {
            generar_informe_orden();
        }
        if(opcion ==3)
        {
            generar_informe_transferencia();

        }
        if(opcion == 4)  {
            generar_informe_proceso();
        }

        if(opcion == 5)  {
            generar_informe_control();
        }
    }//GEN-LAST:event_bgenerarActionPerformed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        limpiar_txt();
        deshabilita_txt();
        deshabilitar_jRadioBoton();
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
    }//GEN-LAST:event_bcancelarActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        int mensaje = JOptionPane.showConfirmDialog(this,"Desea salir?? ","Confirmar",JOptionPane.YES_NO_OPTION);
        if(mensaje == JOptionPane.YES_OPTION){
            dispose();
        }else // no quiere borrar
        {
            JOptionPane.showMessageDialog(null, "Cancelando Salida", "Atencion", JOptionPane.ERROR_MESSAGE);
        }        // TODO add your handling code here:
        //  int mensaje = JOptionPane.showConfirmDialog(this,"DESEA SALIR","CONFIRMAR",JOptionPane.YES_NO_OPTION);
        // TODO add your handling code here:
    }//GEN-LAST:event_bsalirActionPerformed

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
            java.util.logging.Logger.getLogger(informe_servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(informe_servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(informe_servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(informe_servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new informe_servicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton bgenerar;
    private javax.swing.JButton bhabilitar;
    private javax.swing.JButton bsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton control;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jr_fecha;
    private javax.swing.JRadioButton jr_todos;
    private javax.swing.JRadioButton ordenproduccion;
    private javax.swing.JRadioButton proceso;
    private javax.swing.JRadioButton recetas;
    private javax.swing.JFormattedTextField tdesde;
    private javax.swing.JFormattedTextField thasta;
    private javax.swing.JRadioButton transferencia;
    // End of variables declaration//GEN-END:variables
}
