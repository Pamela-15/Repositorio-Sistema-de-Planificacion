/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaJava;

import static VentanaJava.Galeras.TablaGaleras;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter.ComparisonType;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lopez.p.2
 */
public class SecuenciaTransporte extends javax.swing.JFrame {

    /**
     * Creates new form SecuenciaTransporte
     */
    public SecuenciaTransporte() {
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

        jLabel1 = new javax.swing.JLabel();
        RegistrarSecuencia = new javax.swing.JButton();
        ModificarSecuencia = new javax.swing.JButton();
        CambiarSecuenciaPredeterminada = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaSecuencia = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Filtro = new com.toedter.calendar.JDateChooser();
        Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos de Secuencia de Transporte por Rangos");

        RegistrarSecuencia.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        RegistrarSecuencia.setText("Registrar Secuencia");
        RegistrarSecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarSecuenciaActionPerformed(evt);
            }
        });

        ModificarSecuencia.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        ModificarSecuencia.setText("Modificar Secuencia");

        CambiarSecuenciaPredeterminada.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        CambiarSecuenciaPredeterminada.setText("Cambiar Secuencia Predeterminada");

        TablaSecuencia.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        TablaSecuencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha Inicial", "Fecha Final", "Secuencia No.", "Rango de Peso", "Horas de Procesamiento", "idSecuencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.Short.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaSecuencia.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TablaSecuenciaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        TablaSecuencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaSecuenciaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaSecuencia);

        jScrollPane1.setViewportView(jScrollPane2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Fecha a consultar");

        Filtro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FiltroMouseEntered(evt);
            }
        });

        Buscar.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(RegistrarSecuencia)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ModificarSecuencia)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(CambiarSecuenciaPredeterminada))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistrarSecuencia)
                    .addComponent(ModificarSecuencia)
                    .addComponent(CambiarSecuenciaPredeterminada))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarSecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarSecuenciaActionPerformed
        AgregarSecuencia abrir = new AgregarSecuencia();
        abrir.setVisible(true);
    }//GEN-LAST:event_RegistrarSecuenciaActionPerformed

    private void TablaSecuenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaSecuenciaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaSecuenciaMouseClicked

    private void TablaSecuenciaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TablaSecuenciaAncestorAdded
        DefaultTableModel model=(DefaultTableModel) TablaSecuencia.getModel();
        String driver = "com.mysql.jdbc.Driver";
        String connection = "jdbc:mysql://localhost:3306/Cargill";
        String user = "root";
        String password = "admi";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connection, user, password);
            if (!con.isClosed()) {
                PreparedStatement secuencia = con.prepareStatement("select * from `secuencia de transporte real` ");
                ResultSet datossecuencia = secuencia.executeQuery();
                while( datossecuencia.next() ) {
                    model.addRow(new Object[]{datossecuencia.getString("Fecha de inicio"), datossecuencia.getString("Fecha de Finalización"),datossecuencia.getInt("Secuencia"),datossecuencia.getString("Rango de peso_Nombre"),datossecuencia.getInt("Horas de procesamiento"),datossecuencia.getInt("idSecuencia")});
                }
                datossecuencia.close();
                secuencia.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TablaSecuenciaAncestorAdded

    private void FiltroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiltroMouseEntered
        
    }//GEN-LAST:event_FiltroMouseEntered

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        /*DefaultTableModel model=(DefaultTableModel) TablaSecuencia.getModel();
        
               
        List<RowFilter<Object,Object>> filters = new ArrayList<>(Filtro.getDate);
        filters.add( RowFilter.dateFilter(ComparisonType.AFTER, Fecha Inicial) );
        filters.add( RowFilter.dateFilter(ComparisonType.BEFORE, Fecha Final) );
        rf = RowFilter.andFilter(filters);
        sorter.setRowFilter(rf);*/
        
        
        DefaultTableModel model=(DefaultTableModel) TablaSecuencia.getModel();
        int filas=TablaSecuencia.getRowCount();
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
                
                java.util.Date javafechaFiltro = Filtro.getDate();
                java.sql.Date sqlfechaFiltro = new java.sql.Date(javafechaFiltro.getTime());
                String fechaFiltro = sqlfechaFiltro.toString();
                System.out.println(fechaFiltro);
                
                
                PreparedStatement filtro = con.prepareStatement("select * from `secuencia de transporte real` WHERE `Fecha de inicio` <= "+fechaFiltro+" AND `Fecha de finalización`>= "+fechaFiltro+"");
                ResultSet datossecuencia = filtro.executeQuery();
                while( datossecuencia.next() ) {
                    model.addRow(new Object[]{datossecuencia.getString("Fecha de inicio"), datossecuencia.getString("Fecha de finalización"),datossecuencia.getInt("Secuencia"),datossecuencia.getString("Rango de peso_Nombre"),datossecuencia.getInt("Horas de procesamiento"),datossecuencia.getInt("idSecuencia")});
                    System.out.println(datossecuencia.getString("Fecha de inicio"));
                }
                datossecuencia.close();
                filtro.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        
        /* Filtro.addMouseListener(new MouseAdapter() {
             public void keyReleased(final KeyEvent e) {
                Date fechaFiltro = (Filtro.getDate());
                Filtro.setDate(fechaFiltro);
                repaint();
                filtro();
             }
        });
        trsFiltro1 = new TableRowSorter(TablaSecuencia.getModel());
        trsFiltro2 = new TableRowSorter(TablaSecuencia.getModel());
        TablaGaleras.setRowSorter(trsFiltro1);*/
 
    }//GEN-LAST:event_BuscarActionPerformed

     /*private TableRowSorter trsFiltro;
     
     public void filtro() {

        trsFiltro.setRowFilter(RowFilter.dateFilter(ComparisonType.BEFORE, Filtro.getDate(),0));
        trsFiltro.setRowFilter(RowFilter.dateFilter(ComparisonType.AFTER, Filtro.getDate(),1));
    } */
        
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
            java.util.logging.Logger.getLogger(SecuenciaTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecuenciaTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecuenciaTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecuenciaTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecuenciaTransporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton CambiarSecuenciaPredeterminada;
    private com.toedter.calendar.JDateChooser Filtro;
    private javax.swing.JButton ModificarSecuencia;
    private javax.swing.JButton RegistrarSecuencia;
    private javax.swing.JTable TablaSecuencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
