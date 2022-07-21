package formularios;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import programas.ver_conex;

public class VentanaBuscar extends javax.swing.JFrame {
    int col;
    String[] nom;
    ArrayList<String[]> val = new ArrayList<String[]>();
    String query;
    String des;
    int cod;
    Object[] tfParam;
    /** Creates new form VentanaBuscar */
    public VentanaBuscar(String consulta_sql,String[] nombre_columnas,int cantidad_columnas,Object[] objetos_pa_devolver_resultado) {
        this.query  =consulta_sql;
        this.nom = nombre_columnas;
        this.col = cantidad_columnas;
        this.tfParam = objetos_pa_devolver_resultado;
                
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtfValorBusqueda = new javax.swing.JTextField();
        jbtnBuscar = new javax.swing.JButton();
        jscrllDetalleBusqueda = new javax.swing.JScrollPane();
        jtblDetalleBusqueda = new javax.swing.JTable();
        jbtnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setText("Descripcion:");

        jbtnBuscar.setText("Buscar");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jtblDetalleBusqueda.setModel(new ModeloTabla(col, nom, val));
        jtblDetalleBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblDetalleBusquedaMouseClicked(evt);
            }
        });
        jscrllDetalleBusqueda.setViewportView(jtblDetalleBusqueda);

        javax.swing.GroupLayout jpnlBuscarLayout = new javax.swing.GroupLayout(jpnlBuscar);
        jpnlBuscar.setLayout(jpnlBuscarLayout);
        jpnlBuscarLayout.setHorizontalGroup(
            jpnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtfValorBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addComponent(jscrllDetalleBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );
        jpnlBuscarLayout.setVerticalGroup(
            jpnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBuscarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtfValorBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jscrllDetalleBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnSeleccionar.setText("Cerrar");
        jbtnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jbtnSeleccionar)
                .addContainerGap(277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnSeleccionar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        try {
            ver_conex con = new ver_conex();
            con.sentencia = con.conexion.createStatement();
           con.resultado = con.sentencia.executeQuery(query+" upper('%"+this.jtxtfValorBusqueda.getText().toString()+"%')");
            
            boolean exito = con.resultado.next();
            val = new ArrayList<>();
           if(exito){
                 con.sentencia = con.conexion.createStatement();
            con.resultado = con.sentencia.executeQuery(query+" upper('%"+this.jtxtfValorBusqueda.getText().toString()+"%')");

                while (con.resultado.next()) {                
                    String[] aux = new String[col];
                    for (int i = 0; i < aux.length; i++) {
                        aux[i] = String.valueOf(con.resultado.getObject(i+1));
                        
                    }
                    val.add(aux);                  
                }
            }
            jtblDetalleBusqueda.setModel(new ModeloTabla(col, nom, val));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
}//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSeleccionarActionPerformed
      this.dispose();

}//GEN-LAST:event_jbtnSeleccionarActionPerformed

private void jtblDetalleBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblDetalleBusquedaMouseClicked
    for (int i = 0; i < tfParam.length; i++) {
        if(jtblDetalleBusqueda.getValueAt(jtblDetalleBusqueda.getSelectedRow(),i) != null) {
            if ( tfParam[i] instanceof JTextField ) {
                 //System.out.println(((JTextField)tfParam[i]).getName());
                ((JTextField)tfParam[i]).setText(jtblDetalleBusqueda.getValueAt(jtblDetalleBusqueda.getSelectedRow(),i).toString());
            }
            else if(tfParam[i] instanceof JComboBox){
                int indice =Integer.parseInt(jtblDetalleBusqueda.getValueAt(jtblDetalleBusqueda.getSelectedRow(),i).toString());
                //System.out.print(indice);
                ((JComboBox)tfParam[i]).setSelectedIndex(indice);
            }

        }
            //tfParam[i].setText(jtblDetalleBusqueda.getValueAt(jtblDetalleBusqueda.getSelectedRow(),i).toString());
    }//Cierre del for
}//GEN-LAST:event_jtblDetalleBusquedaMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
 //               new VentanaBuscar("select id, rsocial, telefono from proveedores where rsocial like '", new String[]{"CODIGO","DESCRIPCION","TELEFONO"},3).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnSeleccionar;
    private javax.swing.JPanel jpnlBuscar;
    private javax.swing.JScrollPane jscrllDetalleBusqueda;
    private javax.swing.JTable jtblDetalleBusqueda;
    private javax.swing.JTextField jtxtfValorBusqueda;
    // End of variables declaration//GEN-END:variables

}
