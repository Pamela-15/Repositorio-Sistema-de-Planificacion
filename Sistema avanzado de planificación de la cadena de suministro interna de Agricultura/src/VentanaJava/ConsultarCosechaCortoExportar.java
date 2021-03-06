package VentanaJava;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class ConsultarCosechaCortoExportar extends javax.swing.JFrame {
    String fecha;
    /**
     * Creates new form ConsultarCosechaCortoExportar
     */
    public ConsultarCosechaCortoExportar(String filtro) {
        fecha=filtro;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ExportarPlan = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPlanesCosechaCorto = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        jLabel1.setText("Planificación de Cosecha a Corto Plazo");

        ExportarPlan.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        ExportarPlan.setText("Exportar Plan");
        ExportarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarPlanActionPerformed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        TablaPlanesCosechaCorto.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        TablaPlanesCosechaCorto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Secuencia", "Fecha de Cosecha", "Granja", "Galera", "Cantidad a cosechar", "Peso Promedio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPlanesCosechaCorto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TablaPlanesCosechaCortoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(TablaPlanesCosechaCorto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(ExportarPlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(133, 133, 133))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(189, 189, 189))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExportarPlan)
                    .addComponent(Salir))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void TablaPlanesCosechaCortoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TablaPlanesCosechaCortoAncestorAdded
        DefaultTableModel model=(DefaultTableModel) TablaPlanesCosechaCorto.getModel();
        String driver = "com.mysql.jdbc.Driver";
        String connection = "jdbc:mysql://localhost:3306/Cargill";
        String user = "root";
        String password = "admi";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connection, user, password);
            if (!con.isClosed()) {
                PreparedStatement planes = con.prepareStatement("SELECT Date_format(`cosecha corto plazo`.`Fecha de cosecha`,'%d/%m/%Y'), `cosecha corto plazo`.`Cantidad a cosechar`,`cosecha corto plazo`.`Peso Promedio`,`cosecha corto plazo`.`Secuencia`, `galera`.`Nombre Granja`, `galera`.`Numero de Galera` FROM `cargill`.`cosecha corto plazo` inner join `cargill`.`galera` on `cosecha corto plazo`.`Galera_idGalera`= `galera`.`idGalera` where `cosecha corto plazo`.`Fecha de cosecha` = ?");
                planes.setString(1,fecha);
                ResultSet planesconsultados = planes.executeQuery();
                while( planesconsultados.next() ) {
                    model.addRow(new Object[]{planesconsultados.getString("Secuencia"),planesconsultados.getString("Date_format(`cosecha corto plazo`.`Fecha de cosecha`,'%d/%m/%Y')"),planesconsultados.getString("Nombre Granja"),Integer.parseInt(planesconsultados.getString("Numero de Galera")),Integer.parseInt(planesconsultados.getString("Cantidad a cosechar")),Float.parseFloat(planesconsultados.getString("Peso Promedio"))});
                }
                planesconsultados.close();
                planes.close();
                con.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error",e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TablaPlanesCosechaCortoAncestorAdded

    private void ExportarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarPlanActionPerformed
        DefaultTableModel model=(DefaultTableModel) TablaPlanesCosechaCorto.getModel();
        int filas=TablaPlanesCosechaCorto.getRowCount();
        JFileChooser GuardarArchivo = new JFileChooser();
        int opcion=GuardarArchivo.showSaveDialog(this);
        if(opcion == JFileChooser.APPROVE_OPTION){
            String direccion = GuardarArchivo.getSelectedFile().toString();
            XSSFWorkbook libro=new XSSFWorkbook();
            XSSFSheet hoja= libro.createSheet();
            XSSFRow fila = hoja.createRow(0);
            fila.createCell(0).setCellValue("Secuencia");
            fila.createCell(1).setCellValue("Fecha de Cosecha");
            fila.createCell(2).setCellValue("Granja");
            fila.createCell(3).setCellValue("Galera");
            fila.createCell(4).setCellValue("Cantidad a Cosechar");
            fila.createCell(5).setCellValue("Peso Promedio");
            
            XSSFRow hileras;
            for(int i=0; i<filas; i++){
                hileras = hoja.createRow((i+1));
                for(int e=0; e<6;e++){
                    hileras.createCell(e).setCellValue(model.getValueAt(i, e).toString());
                }
            }
            try{
                libro.write(new FileOutputStream(new File(direccion+".xlsx")));
                Desktop.getDesktop().open(new File(direccion+".xlsx"));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        this.dispose();
    }//GEN-LAST:event_ExportarPlanActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(ConsultarCosechaCortoExportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarCosechaCortoExportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarCosechaCortoExportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarCosechaCortoExportar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String a = "2016-01-01";
                new ConsultarCosechaCortoExportar(a).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExportarPlan;
    private javax.swing.JButton Salir;
    private javax.swing.JTable TablaPlanesCosechaCorto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
