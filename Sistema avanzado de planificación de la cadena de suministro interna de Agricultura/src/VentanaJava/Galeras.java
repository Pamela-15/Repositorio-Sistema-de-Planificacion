/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaJava;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author lopez.p.2
 */
public class Galeras extends javax.swing.JFrame {

    /**
     * Creates new form Galeras
     */
    public Galeras() {
        initComponents();
    }
    
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        AgregarGalera = new javax.swing.JButton();
        ModificarGalera = new javax.swing.JButton();
        InactivarGalera = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaGaleras = new javax.swing.JTable();
        Filtro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CriterioFiltro = new javax.swing.JComboBox<>();
        ActivarGalera = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.blue);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos de Galeras");

        AgregarGalera.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        AgregarGalera.setText("Agregar Galera");
        AgregarGalera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarGaleraActionPerformed(evt);
            }
        });

        ModificarGalera.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        ModificarGalera.setText("Modificar Galera");
        ModificarGalera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarGaleraActionPerformed(evt);
            }
        });

        InactivarGalera.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        InactivarGalera.setText("Inactivar Galera");
        InactivarGalera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InactivarGaleraActionPerformed(evt);
            }
        });

        TablaGaleras.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        TablaGaleras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Galera", "No. Galera", "Nombre de Granja", "Zona", "Capacidad", "Supervisor", "Carrusel", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaGaleras.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TablaGalerasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        TablaGaleras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaGalerasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaGaleras);

        jScrollPane2.setViewportView(jScrollPane1);

        Filtro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroActionPerformed(evt);
            }
        });
        Filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FiltroKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("Filtrar por:");

        CriterioFiltro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        CriterioFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No. Galera", "Nombre de Granja", "Zona", "Carrusel" }));
        CriterioFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriterioFiltroActionPerformed(evt);
            }
        });

        ActivarGalera.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        ActivarGalera.setText("Activar Galera");
        ActivarGalera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivarGaleraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AgregarGalera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ModificarGalera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(InactivarGalera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ActivarGalera))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(CriterioFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Filtro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(CriterioFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarGalera)
                    .addComponent(ModificarGalera)
                    .addComponent(InactivarGalera)
                    .addComponent(ActivarGalera))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarGaleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarGaleraActionPerformed
        mostrarAgregarGalera();
    }//GEN-LAST:event_AgregarGaleraActionPerformed

    private void ModificarGaleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarGaleraActionPerformed
        
        int filaseleccionada=0;
       
        DefaultTableModel model=(DefaultTableModel) TablaGaleras.getModel();

        if( TablaGaleras.getSelectedRow() < 0 ){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila para modificar","Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            filaseleccionada=Integer.parseInt(model.getValueAt(TablaGaleras.getSelectedRow(),0).toString());
            mostrarModificarGalera(filaseleccionada);            
        }
        
    }//GEN-LAST:event_ModificarGaleraActionPerformed

               
    
    private void FiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroActionPerformed

    private void FiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroKeyReleased
        
    }//GEN-LAST:event_FiltroKeyReleased

    private void FiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroKeyTyped
        Filtro.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (Filtro.getText());
                Filtro.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(TablaGaleras.getModel());
        TablaGaleras.setRowSorter(trsFiltro);
    }//GEN-LAST:event_FiltroKeyTyped

    private void TablaGalerasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TablaGalerasAncestorAdded
        DefaultTableModel model=(DefaultTableModel) TablaGaleras.getModel();
        String driver = "com.mysql.jdbc.Driver";
        String connection = "jdbc:mysql://localhost:3306/Cargill";
        String user = "root";
        String password = "admi";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connection, user, password);
            if (!con.isClosed()) {
                PreparedStatement galeras = con.prepareStatement("select * from galera ");
                ResultSet datosgaleras = galeras.executeQuery();
                while( datosgaleras.next() ) {
                    model.addRow(new Object[]{datosgaleras.getString("idGalera"), datosgaleras.getString("Numero de Galera"),datosgaleras.getString("Nombre Granja"),datosgaleras.getString("Zona"),datosgaleras.getInt("Capacidad"),datosgaleras.getString("Supervisor"),datosgaleras.getString("Carrusel"),datosgaleras.getString("ActivacionGalera")});
                }
                datosgaleras.close();
                galeras.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error",e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        
           
    }//GEN-LAST:event_TablaGalerasAncestorAdded
    
    private void TablaGalerasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaGalerasMouseClicked
        
    }//GEN-LAST:event_TablaGalerasMouseClicked

    private void InactivarGaleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InactivarGaleraActionPerformed
        int galeraseleccionada=0;
        DefaultTableModel model=(DefaultTableModel) TablaGaleras.getModel();
        if (TablaGaleras.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna galera para inactivar","Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            galeraseleccionada=Integer.parseInt(model.getValueAt(TablaGaleras.getSelectedRow(),1).toString());
            String driver = "com.mysql.jdbc.Driver";
            String connection = "jdbc:mysql://localhost:3306/Cargill";
            String user = "root";
            String password = "admi";
            try {
                Class.forName(driver);
                Connection con = DriverManager.getConnection(connection, user, password);
                if (!con.isClosed()) {
                    PreparedStatement inactivargalera = con.prepareStatement("UPDATE `galera` SET `ActivacionGalera` = ? WHERE `idGalera` = ?;");
                    inactivargalera.setInt(1, 0);
                    inactivargalera.setInt(2, galeraseleccionada);
                    int x = inactivargalera.executeUpdate();
                    inactivargalera.close();
                    con.close();
                    ActualizarTabla();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        }        
    }//GEN-LAST:event_InactivarGaleraActionPerformed

    private void ActivarGaleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivarGaleraActionPerformed
        int galeraseleccionada=0;
        DefaultTableModel model=(DefaultTableModel) TablaGaleras.getModel();
        if (TablaGaleras.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna galera para inactivar","Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            galeraseleccionada=Integer.parseInt(model.getValueAt(TablaGaleras.getSelectedRow(),1).toString());
            String driver = "com.mysql.jdbc.Driver";
            String connection = "jdbc:mysql://localhost:3306/Cargill";
            String user = "root";
            String password = "admi";
            try {
                Class.forName(driver);
                Connection con = DriverManager.getConnection(connection, user, password);
                if (!con.isClosed()) {
                    PreparedStatement inactivargalera = con.prepareStatement("UPDATE `galera` SET `ActivacionGalera` = ? WHERE `idGalera` = ?;");
                    inactivargalera.setInt(1, 1);
                    inactivargalera.setInt(2, galeraseleccionada);
                    int x = inactivargalera.executeUpdate();
                    inactivargalera.close();
                    con.close();
                    ActualizarTabla();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        }        
    }//GEN-LAST:event_ActivarGaleraActionPerformed

    private void CriterioFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriterioFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CriterioFiltroActionPerformed

     private TableRowSorter trsFiltro;
     
     public void filtro() {
        int columnaABuscar = 0;
        
        if (CriterioFiltro.getSelectedItem() == "No. Galera") {
            columnaABuscar = 1;
        }
        if (CriterioFiltro.getSelectedItem() == "Nombre de Granja") {
            columnaABuscar = 2;
        }
        if (CriterioFiltro.getSelectedItem().toString() == "Zona") {
            columnaABuscar = 3;
        }
        if (CriterioFiltro.getSelectedItem().toString() == "Carrusel") {
            columnaABuscar = 6;
        }
        
        trsFiltro.setRowFilter(RowFilter.regexFilter(Filtro.getText(), columnaABuscar));
    } 
    
     public void mostrarAgregarGalera() {
        AgregarGalera lol=new AgregarGalera();
        lol.setVisible(true);
        lol.setLocationRelativeTo(this);
  }
     
      private void mostrarModificarGalera(int x) {
        ModificarGalera modificar=new ModificarGalera(x);
        modificar.setVisible(true);
        modificar.setLocationRelativeTo(this);
    }
      
      public static void ActualizarTabla(){
        DefaultTableModel model=(DefaultTableModel) TablaGaleras.getModel();
        int filas=TablaGaleras.getRowCount();
            for (int i = 0;filas>i; i++) {
                model.removeRow(0);
            }
        String driver = "com.mysql.jdbc.Driver";
        String connection = "jdbc:mysql://localhost:3306/Cargill";
        String user = "root";
        String password = "admi";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connection, user, password);
            if (!con.isClosed()) {
                PreparedStatement galeras = con.prepareStatement("select * from galera ");
                ResultSet datosgaleras = galeras.executeQuery();
                while( datosgaleras.next() ) {
                    model.addRow(new Object[]{datosgaleras.getString("idGalera"), datosgaleras.getString("Numero de Galera"),datosgaleras.getString("Nombre Granja"),datosgaleras.getString("Zona"),datosgaleras.getInt("Capacidad"),datosgaleras.getString("Supervisor"),datosgaleras.getString("Carrusel"),datosgaleras.getString("ActivacionGalera")});
                }
                datosgaleras.close();
                galeras.close();
                con.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error",e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
     
    }
      
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
            java.util.logging.Logger.getLogger(Galeras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Galeras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Galeras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Galeras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Galeras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActivarGalera;
    private javax.swing.JButton AgregarGalera;
    private javax.swing.JComboBox<String> CriterioFiltro;
    private javax.swing.JTextField Filtro;
    private javax.swing.JButton InactivarGalera;
    private javax.swing.JButton ModificarGalera;
    public static javax.swing.JTable TablaGaleras;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

   
}
