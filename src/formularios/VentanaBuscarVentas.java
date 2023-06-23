package formularios;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import programas.ver_conex;

public class VentanaBuscarVentas extends javax.swing.JFrame {

    int col;
    String[] nom;
    ArrayList<String[]> val = new ArrayList<String[]>();
    String query;
    String des;
    int cod;
    Object[] tfParam;

    /**
     * Creates new form VentanaBuscar
     */
    public VentanaBuscarVentas(String consulta_sql, String[] nombre_columnas, int cantidad_columnas, Object[] objetos_pa_devolver_resultado) {
        this.query = consulta_sql;
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
        jscrllDetalleBusqueda = new javax.swing.JScrollPane();
        jtblDetalleBusqueda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setText("Descripcion:");

        jtxtfValorBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtfValorBusquedaActionPerformed(evt);
            }
        });
        jtxtfValorBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtfValorBusquedaKeyPressed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jscrllDetalleBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
        jpnlBuscarLayout.setVerticalGroup(
            jpnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBuscarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtfValorBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jscrllDetalleBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jtblDetalleBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblDetalleBusquedaMouseClicked
    for (int i = 0; i < tfParam.length; i++) {
        if (jtblDetalleBusqueda.getValueAt(jtblDetalleBusqueda.getSelectedRow(), i) != null) {
            if (tfParam[i] instanceof JTextField) {
                //System.out.println(((JTextField)tfParam[i]).getName());
                ((JTextField) tfParam[i]).setText(jtblDetalleBusqueda.getValueAt(jtblDetalleBusqueda.getSelectedRow(), i).toString());
                 dispose();
            } else if (tfParam[i] instanceof JComboBox) {
                int indice = Integer.parseInt(jtblDetalleBusqueda.getValueAt(jtblDetalleBusqueda.getSelectedRow(), i).toString());
                //System.out.print(indice);
                ((JComboBox) tfParam[i]).setSelectedIndex(indice);
          
            }

        }
        //tfParam[i].setText(jtblDetalleBusqueda.getValueAt(jtblDetalleBusqueda.getSelectedRow(),i).toString());
    }//Cierre del for
}//GEN-LAST:event_jtblDetalleBusquedaMouseClicked

    private void jtxtfValorBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtfValorBusquedaActionPerformed
        // TODO add your handling code here:
        
              try {
            ver_conex con = new ver_conex();
            con.sentencia = con.conexion.createStatement();
            con.resultado = con.sentencia.executeQuery(query + " upper('%" + this.jtxtfValorBusqueda.getText().toString() + "%')");

            boolean exito = con.resultado.next();
            val = new ArrayList<>();
            if (exito) {
                con.sentencia = con.conexion.createStatement();
                con.resultado = con.sentencia.executeQuery(query + " upper('%" + this.jtxtfValorBusqueda.getText().toString() + "%')");

                while (con.resultado.next()) {
                    String[] aux = new String[col];
                    for (int i = 0; i < aux.length; i++) {
                        aux[i] = String.valueOf(con.resultado.getObject(i + 1));

                    }
                    val.add(aux);
                }
            }
            jtblDetalleBusqueda.setModel(new ModeloTabla(col, nom, val));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jtxtfValorBusquedaActionPerformed

    private void jtxtfValorBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtfValorBusquedaKeyPressed
        // TODO add your handling code here:
     //   if (!jtxtfValorBusqueda.getText().equals("") && evt.getKeyChar() == KeyEvent.VK_ENTER)//no trae nada
       // {
        //    dispose();
      //  }
    }//GEN-LAST:event_jtxtfValorBusquedaKeyPressed

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
    private javax.swing.JPanel jpnlBuscar;
    private javax.swing.JScrollPane jscrllDetalleBusqueda;
    private javax.swing.JTable jtblDetalleBusqueda;
    private javax.swing.JTextField jtxtfValorBusqueda;
    // End of variables declaration//GEN-END:variables

}
