/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author lopez.p.2
 */
public class RangoPesoPredeterminado extends javax.swing.JFrame {

    /**
     * Creates new form RangoPesoPredeterminado
     */
    public RangoPesoPredeterminado() {
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

        jLabel4 = new javax.swing.JLabel();
        PorcentajeMediano = new javax.swing.JTextField();
        VelocidadPequeño = new javax.swing.JTextField();
        VelocidadGrande = new javax.swing.JTextField();
        VelocidadMediano = new javax.swing.JTextField();
        PorcentajePequeño = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PorcentajeGrande = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Rango de Peso Predeterminado");

        PorcentajePequeño.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                PorcentajePequeñoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel11.setText("Velocidad de Procesamiento");

        Cancelar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Rango de Peso");

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Pequeño");

        jLabel13.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mediano");

        jLabel14.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Grande");

        Guardar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel10.setText("Porcentaje Requerido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(Guardar)
                .addGap(73, 73, 73)
                .addComponent(Cancelar)
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PorcentajePequeño)
                            .addComponent(PorcentajeMediano)
                            .addComponent(PorcentajeGrande))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(VelocidadPequeño, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VelocidadMediano, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VelocidadGrande, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(VelocidadPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PorcentajePequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(PorcentajeGrande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VelocidadGrande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cancelar)
                            .addComponent(Guardar)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(VelocidadMediano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PorcentajeMediano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String driver = "com.mysql.jdbc.Driver";
        String connection = "jdbc:mysql://localhost:3306/cargill";
        String user = "root";
        String password = "admi";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connection, user, password);
            float x = Float.parseFloat(PorcentajePequeño.getText())+Float.parseFloat(PorcentajeMediano.getText())+Float.parseFloat(PorcentajeGrande.getText());              
            if(x==1){
		if (!con.isClosed()&& PorcentajePequeño.getText()!= null && VelocidadPequeño.getText()!= null && PorcentajeMediano.getText()!= null && VelocidadMediano.getText()!= null && VelocidadGrande.getText()!= null && PorcentajeGrande.getText()!= null) {
                               
                	PreparedStatement rangopequeño = con.prepareStatement("UPDATE `rango de peso` SET `Porcentaje de Necesidad` = ?, `Velocidad de Procesamiento` = ? WHERE `Rango de Peso` = ?;");
                   	rangopequeño.setString(3,"Pequeño");
                        rangopequeño.setFloat(1, Float.parseFloat(PorcentajePequeño.getText()));
			rangopequeño.setFloat(2, Float.parseFloat(VelocidadPequeño.getText()));
                        int i = rangopequeño.executeUpdate();
                        rangopequeño.close();
                        
                        PreparedStatement rangoMediano = con.prepareStatement("UPDATE `rango de peso` SET `Porcentaje de Necesidad` = ?, `Velocidad de Procesamiento` = ? WHERE `Rango de Peso` = ?;");
                   	rangoMediano.setString(3,"Mediano");
                        rangoMediano.setFloat(1, Float.parseFloat(PorcentajeMediano.getText()));
			rangoMediano.setFloat(2, Float.parseFloat(VelocidadMediano.getText()));
                        int j = rangoMediano.executeUpdate();
                        rangoMediano.close();
                        
                        PreparedStatement rangoGrande = con.prepareStatement("UPDATE `rango de peso` SET `Porcentaje de Necesidad` = ?, `Velocidad de Procesamiento` = ? WHERE `Rango de Peso` = ?;");
                   	rangoGrande.setString(3,"Grande");
                        rangoGrande.setFloat(1, Float.parseFloat(PorcentajeGrande.getText()));
			rangoGrande.setFloat(2, Float.parseFloat(VelocidadGrande.getText()));
                        int k = rangoGrande.executeUpdate();
                        rangoGrande.close();
	
	                con.close();
        	    }
                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente","", JOptionPane.ERROR_MESSAGE);
                    this.dispose();
                }
       		else {
                	JOptionPane.showMessageDialog(null, "Por favor ingrese los datos en todos los campos mostrados","Campos obligatorios incompletos", JOptionPane.ERROR_MESSAGE);
                	con.close();
            	}
            if(x!=1){
    		JOptionPane.showMessageDialog(null,"La sumatoria de porcentajes requeridos no da 1", "Datos incongruentes", JOptionPane.ERROR_MESSAGE);
                con.close();
            }
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() +"Los datos ingresados no están en el formato aceptado","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void PorcentajePequeñoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_PorcentajePequeñoAncestorAdded
        String driver = "com.mysql.jdbc.Driver";
        String connection = "jdbc:mysql://localhost:3306/cargill";
        String user = "root";
        String password = "admi";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connection, user, password);
                           
            if (!con.isClosed()) {
                PreparedStatement rangoPequeño = con.prepareStatement("select * from `rango de peso` WHERE `Rango de Peso` = ?");
                rangoPequeño.setString(1,"Pequeño");
                ResultSet resultadorangopequeño = rangoPequeño.executeQuery();
                while( resultadorangopequeño.next() ) {
                    PorcentajePequeño.setText("" + resultadorangopequeño.getFloat("Porcentaje de Necesidad"));
                    VelocidadPequeño.setText("" + resultadorangopequeño.getFloat("Velocidad de Procesamiento"));
                }
                resultadorangopequeño.close();
                rangoPequeño.close();
                
                PreparedStatement rangoMediano = con.prepareStatement("select * from `rango de peso` WHERE `Rango de Peso` = ?");
                rangoMediano.setString(1,"Mediano");
                ResultSet resultadorangoMediano = rangoMediano.executeQuery();
                while( resultadorangoMediano.next() ) {
                    PorcentajeMediano.setText("" + resultadorangoMediano.getFloat("Porcentaje de Necesidad"));
                    VelocidadMediano.setText("" + resultadorangoMediano.getFloat("Velocidad de Procesamiento"));
                }
                resultadorangoMediano.close();
                rangoMediano.close();
                
                PreparedStatement rangoGrande = con.prepareStatement("select * from `rango de peso` WHERE `Rango de Peso` = ?");
                rangoGrande.setString(1,"Grande");
                ResultSet resultadorangoGrande = rangoGrande.executeQuery();
                while( resultadorangoGrande.next() ) {
                    PorcentajeGrande.setText("" + resultadorangoGrande.getFloat("Porcentaje de Necesidad"));
                    VelocidadGrande.setText("" + resultadorangoGrande.getFloat("Velocidad de Procesamiento"));
                }
                resultadorangoGrande.close();
                rangoGrande.close();
                
                
                con.close();
            }              
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Los datos ingresados no están en el formato aceptado" ,"Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_PorcentajePequeñoAncestorAdded

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
            java.util.logging.Logger.getLogger(RangoPesoPredeterminado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RangoPesoPredeterminado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RangoPesoPredeterminado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RangoPesoPredeterminado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RangoPesoPredeterminado().setVisible(true);
            }
        });
    }
//Hola
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField PorcentajeGrande;
    private javax.swing.JTextField PorcentajeMediano;
    private javax.swing.JTextField PorcentajePequeño;
    private javax.swing.JTextField VelocidadGrande;
    private javax.swing.JTextField VelocidadMediano;
    private javax.swing.JTextField VelocidadPequeño;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
