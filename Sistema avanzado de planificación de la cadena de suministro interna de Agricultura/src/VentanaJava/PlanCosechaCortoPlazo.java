package VentanaJava;

import static VentanaJava.Galeras.TablaGaleras;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class PlanCosechaCortoPlazo extends javax.swing.JFrame {
    String[][][] tabla;
    int idusuarioautenticado;
    int[] numerogalerascosechadaspordia;
    /** variable que puedo usar en todos los metodos que cree
     * Creates new form PlanCosechaCortoPlazo
     */
    public PlanCosechaCortoPlazo(int idusuario,String[][][] plan, int[] numero) {
        initComponents();
        idusuarioautenticado=idusuario;
        tabla = plan;
        numerogalerascosechadaspordia= numero;
    // plan es lo que se recibe del método del algoritmo
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        GuardarPlanCosechaCorto = new javax.swing.JButton();
        ModificarPlanCosechaCorto = new javax.swing.JButton();
        ScrollPlanificacionCosechaCortoPlazo = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPlanCompletoCosechaCortoPlazo = new javax.swing.JTable();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Planificación de Cosecha a Corto Plazo");

        GuardarPlanCosechaCorto.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        GuardarPlanCosechaCorto.setText("Guardar Plan");

        ModificarPlanCosechaCorto.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        ModificarPlanCosechaCorto.setText("Modificar Plan");
        ModificarPlanCosechaCorto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPlanCosechaCortoActionPerformed(evt);
            }
        });

        TablaPlanCompletoCosechaCortoPlazo.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        TablaPlanCompletoCosechaCortoPlazo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Secuencia", "Fecha de Cosecha", "Granja", "Galera", "Peso", "Rango", "Cantidad a Cosechar", "Cantidad disponible"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPlanCompletoCosechaCortoPlazo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaPlanCompletoCosechaCortoPlazo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TablaPlanCompletoCosechaCortoPlazoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(TablaPlanCompletoCosechaCortoPlazo);
        if (TablaPlanCompletoCosechaCortoPlazo.getColumnModel().getColumnCount() > 0) {
            TablaPlanCompletoCosechaCortoPlazo.getColumnModel().getColumn(0).setResizable(false);
            TablaPlanCompletoCosechaCortoPlazo.getColumnModel().getColumn(1).setPreferredWidth(140);
            TablaPlanCompletoCosechaCortoPlazo.getColumnModel().getColumn(6).setPreferredWidth(150);
            TablaPlanCompletoCosechaCortoPlazo.getColumnModel().getColumn(7).setPreferredWidth(150);
        }

        ScrollPlanificacionCosechaCortoPlazo.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(GuardarPlanCosechaCorto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ModificarPlanCosechaCorto)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ScrollPlanificacionCosechaCortoPlazo)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ScrollPlanificacionCosechaCortoPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarPlanCosechaCorto)
                    .addComponent(ModificarPlanCosechaCorto))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarPlanCosechaCortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarPlanCosechaCortoActionPerformed
        MostrarModificarSeleccionCosechaCortoPlazo();       // TODO add your handling code here:
    }//GEN-LAST:event_ModificarPlanCosechaCortoActionPerformed

    private void TablaPlanCompletoCosechaCortoPlazoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TablaPlanCompletoCosechaCortoPlazoAncestorAdded
        DefaultTableModel model=(DefaultTableModel) TablaPlanCompletoCosechaCortoPlazo.getModel();
        for(int dia=0;dia<7;dia++){
            for (int i=0; i<numerogalerascosechadaspordia[dia];i++){ 
                model.addRow(new Object[]{i+1,tabla[dia][i][9],tabla[dia][i][10], tabla[dia][i][11], tabla[dia][i][14], tabla[dia][i][1], tabla[dia][i][3], tabla[dia][i][12]});
            }
        }
    }//GEN-LAST:event_TablaPlanCompletoCosechaCortoPlazoAncestorAdded
    public void MostrarModificarSeleccionCosechaCortoPlazo() {
        ModificarSeleccionCosechaCortoPlazoPlanCompleto modificar=new ModificarSeleccionCosechaCortoPlazoPlanCompleto();
        modificar.setVisible(true);
        modificar.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(PlanCosechaCortoPlazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanCosechaCortoPlazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanCosechaCortoPlazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanCosechaCortoPlazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int b=0;
                String [][][] a = new String[1][1][1];
                int[] c= new int[7];
                new PlanCosechaCortoPlazo(b,a,c).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarPlanCosechaCorto;
    private javax.swing.JButton ModificarPlanCosechaCorto;
    private javax.swing.JScrollPane ScrollPlanificacionCosechaCortoPlazo;
    private javax.swing.JTable TablaPlanCompletoCosechaCortoPlazo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
