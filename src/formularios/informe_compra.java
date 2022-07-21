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

public class informe_compra extends javax.swing.JFrame {
public int radio1,radio2,radio3,radio4,radio5 = 0;
   ResultSet gloResu;
    private int ban;
        public String operacion="";
  private int opcion;
  public ResultSet rs;
    private java.sql.ResultSet rss;
  ver_conex conn =new ver_conex();
    public informe_compra() {
        initComponents();
        this.setLocationRelativeTo(null);
         conn =new ver_conex();
    }
private void habilitar_jRadioBoton(){
     pedido.setEnabled(true);
     orden.setEnabled(true);
     compra.setEnabled(true);
     ajuste.setEnabled(true);
     nota_credito.setEnabled(true);
     nota_remision.setEnabled(true);
     jr_fecha.setEnabled(true);
     jr_todos.setEnabled(true);
          }
private void deshabilitar_jRadioBoton(){
     pedido.setEnabled(false);
     orden.setEnabled(false);
     compra.setEnabled(false);
     ajuste.setEnabled(false);
     nota_credito.setEnabled(false);
     nota_remision.setEnabled(false);
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
private void generar_informe_pedido()
{
try
{
java.sql.Statement instruccion = conn.conexion.createStatement();
if(jr_fecha.isSelected()==true){
   String sql ="SELECT cabecera_pedidos.pedi_cod,cabecera_pedidos.fecha,CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape))AS personal,\n" +
"proveedor.provee_nom,sucursal.suc_desc FROM cabecera_pedidos,funcionario,proveedor,sucursal WHERE \n" +
"cabecera_pedidos.func_cod=funcionario.func_cod AND cabecera_pedidos.provee_cod=proveedor.provee_cod AND \n" +
"cabecera_pedidos.suc_cod=sucursal.suc_cod and cabecera_pedidos.fecha >= '" +tdesde.getText()+ "' and cabecera_pedidos.fecha <= '"+thasta.getText()+"' order by cabecera_pedidos.pedi_cod";
            rss = instruccion.executeQuery(sql);
            }
         if(jr_todos.isSelected()==true){
         String sqll ="SELECT cabecera_pedidos.pedi_cod,cabecera_pedidos.fecha,CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape))AS personal,\n" +
"proveedor.provee_nom,sucursal.suc_desc FROM cabecera_pedidos,funcionario,proveedor,sucursal WHERE \n" +
"cabecera_pedidos.func_cod=funcionario.func_cod AND cabecera_pedidos.provee_cod=proveedor.provee_cod AND \n" +
"cabecera_pedidos.suc_cod=sucursal.suc_cod order by cabecera_pedidos.pedi_cod";
         rss = instruccion.executeQuery(sqll);
         }
 
        } catch (Exception ex) {
            Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE,null, ex);
        }

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rss);
        HashMap parameters = new HashMap();

        try{
            URL urlMaestro=null;
             urlMaestro = getClass().getClassLoader().getResource("reportes/informepedido.jasper");
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
   String sql ="SELECT cabecera_oc.oc_cod,cabecera_oc.fecha,CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape))AS personal,\n" +
"deposito.depo_desc,proveedor.provee_nom,sucursal.suc_desc,cabecera_pedidos.pedi_cod FROM \n" +
"cabecera_oc,funcionario,deposito,proveedor,sucursal,cabecera_pedidos WHERE cabecera_oc.func_cod=funcionario.func_cod AND \n" +
"cabecera_oc.depo_cod=deposito.depo_cod AND cabecera_oc.provee_cod=proveedor.provee_cod AND \n" +
"cabecera_oc.suc_cod=sucursal.suc_cod AND cabecera_oc.pedi_cod=cabecera_pedidos.pedi_cod AND cabecera_oc.fecha >= '" +tdesde.getText()+ "' and cabecera_oc.fecha <= '"+thasta.getText()+"' order by cabecera_oc.oc_cod";
            rss = instruccion.executeQuery(sql);
            }
         if(jr_todos.isSelected()==true){
         String sqll ="SELECT cabecera_oc.oc_cod,cabecera_oc.fecha,CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape))AS personal,\n" +
"deposito.depo_desc,proveedor.provee_nom,sucursal.suc_desc,cabecera_pedidos.pedi_cod FROM \n" +
"cabecera_oc,funcionario,deposito,proveedor,sucursal,cabecera_pedidos WHERE cabecera_oc.func_cod=funcionario.func_cod AND \n" +
"cabecera_oc.depo_cod=deposito.depo_cod AND cabecera_oc.provee_cod=proveedor.provee_cod AND \n" +
"cabecera_oc.suc_cod=sucursal.suc_cod AND cabecera_oc.pedi_cod=cabecera_pedidos.pedi_cod order by cabecera_oc.oc_cod";
         rss = instruccion.executeQuery(sqll);
         }
 
        } catch (Exception ex) {
            Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE,null, ex);
        }

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rss);
        HashMap parameters = new HashMap();

        try{
            URL urlMaestro=null;
             urlMaestro = getClass().getClassLoader().getResource("reportes/informeorden.jasper");
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
private void generar_informe_compra()
{
try
{
java.sql.Statement instruccion = conn.conexion.createStatement();
if(jr_fecha.isSelected()==true){
   String sql ="SELECT cabecera_reg_fact.rg_fac_cod,cabecera_reg_fact.fecha,cabecera_reg_fact.fact_num,\n" +
"CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape))AS personal,deposito.depo_desc,\n" +
"proveedor.provee_nom,cabecera_oc.oc_cod,sucursal.suc_desc,cabecera_reg_fact.montotal FROM \n" +
"cabecera_reg_fact,funcionario,deposito,proveedor,cabecera_oc,sucursal WHERE \n" +
"cabecera_reg_fact.func_cod=funcionario.func_cod AND cabecera_reg_fact.depo_cod=deposito.depo_cod AND \n" +
"cabecera_reg_fact.provee_cod=proveedor.provee_cod AND cabecera_reg_fact.suc_cod=sucursal.suc_cod AND cabecera_reg_fact.fecha >= '" +tdesde.getText()+ "' and cabecera_reg_fact.fecha <= '"+thasta.getText()+"' order by cabecera_reg_fact.rg_fac_cod";
            rss = instruccion.executeQuery(sql);
            }
         if(jr_todos.isSelected()==true){
         String sqll ="SELECT cabecera_reg_fact.rg_fac_cod,cabecera_reg_fact.fecha,cabecera_reg_fact.fact_num,\n" +
"CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape))AS personal,deposito.depo_desc,\n" +
"proveedor.provee_nom,cabecera_oc.oc_cod,sucursal.suc_desc,cabecera_reg_fact.montotal FROM \n" +
"cabecera_reg_fact,funcionario,deposito,proveedor,cabecera_oc,sucursal WHERE \n" +
"cabecera_reg_fact.func_cod=funcionario.func_cod AND cabecera_reg_fact.depo_cod=deposito.depo_cod AND \n" +
"cabecera_reg_fact.provee_cod=proveedor.provee_cod AND cabecera_reg_fact.suc_cod=sucursal.suc_cod order by cabecera_reg_fact.rg_fac_cod";
         rss = instruccion.executeQuery(sqll);
         }
 
        } catch (Exception ex) {
            Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE,null, ex);
        }

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rss);
        HashMap parameters = new HashMap();

        try{
            URL urlMaestro=null;
             urlMaestro = getClass().getClassLoader().getResource("reportes/informecompra.jasper");
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
private void generar_informe_ajuste()
{
try
{
java.sql.Statement instruccion = conn.conexion.createStatement();
if(jr_fecha.isSelected()==true){
   String sql ="SELECT cabec_ajustes.ajus_cod,cabec_ajustes.ajus_fecha,CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape)) AS personal,\n" +
"motivos.mot_desc,deposito.depo_desc,sucursal.suc_desc FROM cabec_ajustes,funcionario,motivos,deposito,sucursal WHERE \n" +
"cabec_ajustes.func_cod=funcionario.func_cod AND cabec_ajustes.mot_cod=motivos.mot_cod AND \n" +
"cabec_ajustes.depo_cod=deposito.depo_cod AND cabec_ajustes.suc_cod=sucursal.suc_cod AND cabec_ajustes.ajus_fecha >= '" +tdesde.getText()+ "' and cabec_ajustes.ajus_fecha <= '"+thasta.getText()+"' order by cabec_ajustes.ajus_cod";
            rss = instruccion.executeQuery(sql);
            }
         if(jr_todos.isSelected()==true){
         String sqll ="SELECT cabec_ajustes.ajus_cod,cabec_ajustes.ajus_fecha,CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape)) AS personal,\n" +
"motivos.mot_desc,deposito.depo_desc,sucursal.suc_desc FROM cabec_ajustes,funcionario,motivos,deposito,sucursal WHERE \n" +
"cabec_ajustes.func_cod=funcionario.func_cod AND cabec_ajustes.mot_cod=motivos.mot_cod AND \n" +
"cabec_ajustes.depo_cod=deposito.depo_cod AND cabec_ajustes.suc_cod=sucursal.suc_cod order by cabec_ajustes.ajus_cod";
         rss = instruccion.executeQuery(sqll);
         }
 
        } catch (Exception ex) {
            Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE,null, ex);
        }

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rss);
        HashMap parameters = new HashMap();

        try{
            URL urlMaestro=null;
             urlMaestro = getClass().getClassLoader().getResource("reportes/informeajustes.jasper");
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
private void generar_informe_notacredi()
{
try
{
java.sql.Statement instruccion = conn.conexion.createStatement();
if(jr_fecha.isSelected()==true){
   String sql ="SELECT cabecera_snc.snc_cod,cabecera_snc.fecha,cabecera_reg_fact.rg_fac_cod,cabecera_snc.motivo,\n" +
"CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape)) AS personal,\n" +
"sucursal.suc_desc,cabecera_snc.total FROM cabecera_snc,cabecera_reg_fact,funcionario,sucursal WHERE \n" +
"cabecera_snc.rg_fac_cod=cabecera_reg_fact.rg_fac_cod AND cabecera_snc.func_cod=funcionario.func_cod AND \n" +
"cabecera_snc.suc_cod=sucursal.suc_cod AND cabecera_snc.fecha >= '" +tdesde.getText()+ "' and cabecera_snc.fecha <= '"+thasta.getText()+"' order by cabecera_snc.snc_cod";
            rss = instruccion.executeQuery(sql);
            }
         if(jr_todos.isSelected()==true){
         String sqll ="SELECT cabecera_snc.snc_cod,cabecera_snc.fecha,cabecera_reg_fact.rg_fac_cod,cabecera_snc.motivo,\n" +
"CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape)) AS personal,\n" +
"sucursal.suc_desc,cabecera_snc.total FROM cabecera_snc,cabecera_reg_fact,funcionario,sucursal WHERE \n" +
"cabecera_snc.rg_fac_cod=cabecera_reg_fact.rg_fac_cod AND cabecera_snc.func_cod=funcionario.func_cod AND \n" +
"cabecera_snc.suc_cod=sucursal.suc_cod order by cabecera_snc.snc_cod";
         rss = instruccion.executeQuery(sqll);
         }
 
        } catch (Exception ex) {
            Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE,null, ex);
        }

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rss);
        HashMap parameters = new HashMap();

        try{
            URL urlMaestro=null;
             urlMaestro = getClass().getClassLoader().getResource("reportes/informenotadecredito.jasper");
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
private void generar_informe_remision()
{
try
{
java.sql.Statement instruccion = conn.conexion.createStatement();
if(jr_fecha.isSelected()==true){
   String sql ="SELECT nota_remision.cod_remi,destino,nota_remision.fecha,motivos.mot_desc,\n" +
"CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape))AS personal,\n" +
"sucursal.suc_desc,vehiculo.chapa,vehiculo.modelo FROM nota_remision,motivos,\n" +
"funcionario,sucursal,vehiculo WHERE nota_remision.func_cod=funcionario.func_cod AND \n" +
"nota_remision.mot_cod=motivos.mot_cod AND nota_remision.suc_cod=sucursal.suc_cod AND \n" +
"nota_remision.vehi_cod=vehiculo.vehi_cod AND nota_remision.fecha >= '" +tdesde.getText()+ "' and nota_remision.fecha <= '"+thasta.getText()+"' order by nota_remision.cod_remi";
            rss = instruccion.executeQuery(sql);
            }
         if(jr_todos.isSelected()==true){
         String sqll ="SELECT nota_remision.cod_remi,destino,nota_remision.fecha,motivos.mot_desc,\n" +
"CONCAT(CONCAT(funcionario.func_nom,'-',funcionario.func_ape))AS personal,\n" +
"sucursal.suc_desc,vehiculo.chapa,vehiculo.modelo FROM nota_remision,motivos,\n" +
"funcionario,sucursal,vehiculo WHERE nota_remision.func_cod=funcionario.func_cod AND \n" +
"nota_remision.mot_cod=motivos.mot_cod AND nota_remision.suc_cod=sucursal.suc_cod AND \n" +
"nota_remision.vehi_cod=vehiculo.vehi_cod order by nota_remision.cod_remi";
         rss = instruccion.executeQuery(sqll);
         }
 
        } catch (Exception ex) {
            Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE,null, ex);
        }

        JRResultSetDataSource jrRS = new JRResultSetDataSource(rss);
        HashMap parameters = new HashMap();

        try{
            URL urlMaestro=null;
             urlMaestro = getClass().getClassLoader().getResource("reportes/informeremision.jasper");
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
        pedido = new javax.swing.JRadioButton();
        orden = new javax.swing.JRadioButton();
        compra = new javax.swing.JRadioButton();
        ajuste = new javax.swing.JRadioButton();
        nota_credito = new javax.swing.JRadioButton();
        nota_remision = new javax.swing.JRadioButton();
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Compra", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        buttonGroup1.add(pedido);
        pedido.setText("Pedido Compra");
        pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedidoMouseClicked(evt);
            }
        });
        pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoActionPerformed(evt);
            }
        });

        buttonGroup1.add(orden);
        orden.setText("Orden de Compra");
        orden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordenMouseClicked(evt);
            }
        });
        orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenActionPerformed(evt);
            }
        });

        buttonGroup1.add(compra);
        compra.setText("Registro de Compra");
        compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraMouseClicked(evt);
            }
        });
        compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraActionPerformed(evt);
            }
        });

        buttonGroup1.add(ajuste);
        ajuste.setText("Ajuste de Stock");
        ajuste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajusteMouseClicked(evt);
            }
        });
        ajuste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajusteActionPerformed(evt);
            }
        });

        buttonGroup1.add(nota_credito);
        nota_credito.setText("Nota de Credito");
        nota_credito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nota_creditoMouseClicked(evt);
            }
        });
        nota_credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota_creditoActionPerformed(evt);
            }
        });

        buttonGroup1.add(nota_remision);
        nota_remision.setText("Nota de Remision");
        nota_remision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nota_remisionMouseClicked(evt);
            }
        });
        nota_remision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota_remisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nota_remision)
                    .addComponent(nota_credito)
                    .addComponent(compra)
                    .addComponent(pedido)
                    .addComponent(orden)
                    .addComponent(ajuste))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(compra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ajuste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nota_credito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nota_remision)
                .addGap(37, 37, 37))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Seleccione opcion", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        buttonGroup2.add(jr_todos);
        jr_todos.setText("todos los registros");
        jr_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr_todosActionPerformed(evt);
            }
        });

        buttonGroup2.add(jr_fecha);
        jr_fecha.setText("Por Fecha");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bhabilitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bgenerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bsalir, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bhabilitar)
                            .addComponent(bgenerar)
                            .addComponent(bcancelar)
                            .addComponent(bsalir))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoActionPerformed
        operacion="pedido";
        opcion = 1;
        pedido.setEnabled(true);
        //  boton_generar.setEnabled(true);
        //jr_fecha.setEnabled(false);
    }//GEN-LAST:event_pedidoActionPerformed

    private void ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenActionPerformed
            operacion="orden";
        opcion = 2;
        orden.setEnabled(true);
        //  boton_generar.setEnabled(true);
        //jr_fecha.setEnabled(false);
    }//GEN-LAST:event_ordenActionPerformed

    private void compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraActionPerformed
                operacion="compra";
        opcion = 3;
        compra.setEnabled(true);
    }//GEN-LAST:event_compraActionPerformed

    private void ajusteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajusteActionPerformed
              operacion="ajuste";
        opcion = 4;
        ajuste.setEnabled(true);
    }//GEN-LAST:event_ajusteActionPerformed

    private void nota_creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota_creditoActionPerformed
                   operacion="nota_credito";
        opcion = 5;
        nota_credito.setEnabled(true);
    }//GEN-LAST:event_nota_creditoActionPerformed

    private void pedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidoMouseClicked
        if(pedido.isSelected())
        pedido.setEnabled(true);
    }//GEN-LAST:event_pedidoMouseClicked

    private void ordenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordenMouseClicked
        if(orden.isSelected())
        orden.setEnabled(true);
    }//GEN-LAST:event_ordenMouseClicked

    private void compraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraMouseClicked
        if(compra.isSelected())
        compra.setEnabled(true);
    }//GEN-LAST:event_compraMouseClicked

    private void ajusteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajusteMouseClicked
        if(ajuste.isSelected())
        ajuste.setEnabled(true);
    }//GEN-LAST:event_ajusteMouseClicked

    private void nota_creditoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nota_creditoMouseClicked
        if(nota_credito.isSelected())
        nota_credito.setEnabled(true);
    }//GEN-LAST:event_nota_creditoMouseClicked

    private void tdesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdesdeActionPerformed
       if(tdesde.getText().trim().length()==0)
        {
            JOptionPane.showMessageDialog(this, "El campo de texto está vacío");
            this.tdesde.setEnabled(true);
            this.tdesde.requestFocus();
        }
        else
        {
            if(operacion.equals("pedido"))
            {
                try {
                    conn.sentencia = conn.conexion.createStatement();
                    conn.resultado = conn.sentencia.executeQuery("SELECT * FROM pedido_compra WHERE pedido_compra.pedc_fech='"+tdesde.getText()+"'");
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
                    Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
       if(operacion.equals("orden"))
            {
                try {
                    conn.sentencia = conn.conexion.createStatement();
                    conn.resultado = conn.sentencia.executeQuery("SELECT * FROM orden_compra WHERE orden_compra.or_fech='"+tdesde.getText()+"'");
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
                    Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(operacion.equals("compra"))
            {
                try {
                    conn.sentencia = conn.conexion.createStatement();
                    conn.resultado = conn.sentencia.executeQuery("SELECT * FROM compra WHERE compra.facprov_nro='"+tdesde.getText()+"'");
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
                    Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if(operacion.equals("ajuste"))
            {
                try {
                    conn.sentencia = conn.conexion.createStatement();
                    conn.resultado = conn.sentencia.executeQuery("SELECT * FROM ajustes_producto WHERE ajustes_producto.aj_fecha='"+tdesde.getText()+"'");
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
                    Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if(operacion.equals("nota_credito"))
            {
                try {
                    conn.sentencia = conn.conexion.createStatement();
                    conn.resultado = conn.sentencia.executeQuery("SELECT * FROM reg_notacredi WHERE reg_notacredi.reg_fecha='"+tdesde.getText()+"'");
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
                    Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(operacion.equals("nota_remision"))
            {
                try {
                    conn.sentencia = conn.conexion.createStatement();
                    conn.resultado = conn.sentencia.executeQuery("SELECT * FROM nota_remision WHERE nota_remision.fecha='"+tdesde.getText()+"'");
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
                    Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE, null, ex);
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
            if(operacion.equals("pedido"))
            {
                try {
                    conn.sentencia = conn.conexion.createStatement();
                    conn.resultado = conn.sentencia.executeQuery("SELECT * FROM pedido_compra WHERE pedido_compra.pedc_fech='"+thasta.getText()+"'");
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
                    Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
}
           if(operacion.equals("orden"))
            {
                try {
                    conn.sentencia = conn.conexion.createStatement();
                    conn.resultado = conn.sentencia.executeQuery("SELECT * FROM orden_compra WHERE orden_compra.or_fech='"+tdesde.getText()+"'");
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
                    Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(operacion.equals("compra"))
            {
                try {
                    conn.sentencia = conn.conexion.createStatement();
                    conn.resultado = conn.sentencia.executeQuery("SELECT * FROM compra WHERE compra.com_fech='"+tdesde.getText()+"'");
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
                    Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if(operacion.equals("ajuste"))
            {
                try {
                    conn.sentencia = conn.conexion.createStatement();
                    conn.resultado = conn.sentencia.executeQuery("SELECT * FROM ajustes_producto WHERE ajustes_producto.aj_fecha='"+tdesde.getText()+"'");
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
                    Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if(operacion.equals("nota_credito"))
            {
                try {
                    conn.sentencia = conn.conexion.createStatement();
                    conn.resultado = conn.sentencia.executeQuery("SELECT * FROM reg_notacredi WHERE reg_notacredi.reg_fecha='"+tdesde.getText()+"'");
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
                    Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
             if(operacion.equals("nota_remision"))
            {
                try {
                    conn.sentencia = conn.conexion.createStatement();
                    conn.resultado = conn.sentencia.executeQuery("SELECT * FROM nota_remision WHERE nota_remision.fecha='"+tdesde.getText()+"'");
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
                    Logger.getLogger(informe_compra.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
    }//GEN-LAST:event_thastaActionPerformed

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

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        limpiar_txt();
        deshabilita_txt();
        deshabilitar_jRadioBoton();
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
    }//GEN-LAST:event_bcancelarActionPerformed

    private void bgenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgenerarActionPerformed
         if(opcion ==1)
        {

        generar_informe_pedido();
        }
         if(opcion ==2)
        {
            generar_informe_orden();
        }
        if(opcion ==3)
        {
            generar_informe_compra();

        }
        if(opcion == 4)  {
            generar_informe_ajuste();
        }

        if(opcion == 5)  {
            generar_informe_notacredi();
        }
         if(opcion == 6)  {
            generar_informe_remision();
        }
    }//GEN-LAST:event_bgenerarActionPerformed

    private void bhabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhabilitarActionPerformed
          habilitar_jRadioBoton();
        deshabilita_txt();
        bcancelar.setEnabled(true);
    }//GEN-LAST:event_bhabilitarActionPerformed

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

    private void nota_remisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota_remisionActionPerformed
             operacion="nota_remision";
        opcion = 6;
        nota_remision.setEnabled(true);
    }//GEN-LAST:event_nota_remisionActionPerformed

    private void nota_remisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nota_remisionMouseClicked
 if(nota_remision.isSelected())
        nota_remision.setEnabled(true);
    }//GEN-LAST:event_nota_remisionMouseClicked

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
            java.util.logging.Logger.getLogger(informe_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(informe_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(informe_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(informe_compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new informe_compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ajuste;
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton bgenerar;
    private javax.swing.JButton bhabilitar;
    private javax.swing.JButton bsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton compra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jr_fecha;
    private javax.swing.JRadioButton jr_todos;
    private javax.swing.JRadioButton nota_credito;
    private javax.swing.JRadioButton nota_remision;
    private javax.swing.JRadioButton orden;
    private javax.swing.JRadioButton pedido;
    private javax.swing.JFormattedTextField tdesde;
    private javax.swing.JFormattedTextField thasta;
    // End of variables declaration//GEN-END:variables
}
