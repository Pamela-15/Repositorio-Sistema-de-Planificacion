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
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Calendar;
/**
 *
 * @author lopez.p.2
 */
public class TipoCorte extends javax.swing.JFrame {

    /**
     * Creates new form TipoCorte
     */
    public TipoCorte() {
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

        Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rendimientodeshuesado = new javax.swing.JTextField();
        PorcentajeDeshuesado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        porcentajelimpio = new javax.swing.JTextField();
        RendimientoLimpio = new javax.swing.JTextField();
        RendimientoCortes = new javax.swing.JTextField();
        PorcentajeCortes = new javax.swing.JTextField();
        FechaInicial = new com.toedter.calendar.JDateChooser();
        FechaFinal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Guardar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Fecha Inicial");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tipo de Corte");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("Fecha Final");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tipo de Corte");

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel5.setText("Porcentaje Requerido");

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel6.setText("Rendimiento de Planta");

        Cancelar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        Cancelar.setText("Cancelar");

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Pollo Deshuesado");

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Pollo Limpio");

        jLabel9.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cortes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(Guardar)
                        .addGap(73, 73, 73)
                        .addComponent(Cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PorcentajeDeshuesado, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(porcentajelimpio)
                                .addComponent(PorcentajeCortes, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RendimientoLimpio)
                            .addComponent(rendimientodeshuesado)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RendimientoCortes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(FechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PorcentajeDeshuesado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rendimientodeshuesado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(porcentajelimpio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RendimientoLimpio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PorcentajeCortes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RendimientoCortes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Guardar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
    int idnecesidadcortes = 0;
        String driver = "com.mysql.jdbc.Driver";
        String connection = "jdbc:mysql://localhost:3306/cargill";
        String user = "root";
        String password = "admi";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connection, user, password);
            float x = Float.parseFloat(PorcentajeDeshuesado.getText())+Float.parseFloat(porcentajelimpio.getText())+Float.parseFloat(PorcentajeCortes.getText());              
            if(x==1){
		if (!con.isClosed()&& FechaInicial.getDate() != null && rendimientodeshuesado.getText()!= null && PorcentajeDeshuesado.getText()!= null && porcentajelimpio.getText()!= null && RendimientoLimpio.getText()!= null && RendimientoCortes.getText()!= null && PorcentajeCortes.getText()!= null) {
                
                        PreparedStatement cantidadcortesreales = con.prepareStatement("select * from `cortes real`");
        	        ResultSet resultadocantidadcortesreales = cantidadcortesreales.executeQuery();
                	while( resultadocantidadcortesreales.next() ) {
                    		idnecesidadcortes = Integer.parseInt(resultadocantidadcortesreales.getString("ID cortes"));
                	}
                
                	resultadocantidadcortesreales.close();
                	cantidadcortesreales.close();
                        java.util.Date javaFechaInicial = FechaInicial.getDate();
                        java.sql.Date sqlFechaInicial = new java.sql.Date(javaFechaInicial.getTime());
                        java.sql.Date sqlFechaFinal;
                        if(FechaFinal.getDate()!=null){
                            java.util.Date javaFechaFinal = FechaFinal.getDate();
                            sqlFechaFinal = new java.sql.Date(javaFechaFinal.getTime());
                        }else{
                            sqlFechaFinal=sqlFechaInicial;
                        }
                
                	PreparedStatement necesidaddeshuesado = con.prepareStatement("INSERT INTO `cortes real` (`ID cortes`, `Fecha de inicio`, `Fecha de finalización`, `Porcentaje de necesidad`, `Porcentaje de rendimiento`, `Costes Estándar_Nombre`) VALUES (?,?,?,?,?,?);");
                	necesidaddeshuesado.setInt(1, idnecesidadcortes + 1);
                	necesidaddeshuesado.setDate(2, sqlFechaInicial);	
	                necesidaddeshuesado.setDate(3, sqlFechaFinal);
        	        necesidaddeshuesado.setFloat(4, Float.parseFloat(PorcentajeDeshuesado.getText()));
			necesidaddeshuesado.setFloat(5, Float.parseFloat(rendimientodeshuesado.getText()));
			necesidaddeshuesado.setString(6,"Pollo Deshuesado");
                        int z = necesidaddeshuesado.executeUpdate();
	                necesidaddeshuesado.close();

			PreparedStatement necesidadlimpio = con.prepareStatement("INSERT INTO `cortes real` (`ID cortes`, `Fecha de inicio`, `Fecha de finalización`, `Porcentaje de necesidad`, `Porcentaje de rendimiento`, `Costes Estándar_Nombre`) VALUES (?,?,?,?,?,?);");
                	necesidadlimpio.setInt(1, idnecesidadcortes + 2);
                	necesidadlimpio.setDate(2, sqlFechaInicial);	
	                necesidadlimpio.setDate(3, sqlFechaFinal);
        	        necesidadlimpio.setFloat(4, Float.parseFloat(porcentajelimpio.getText()));
			necesidadlimpio.setFloat(5, Float.parseFloat(RendimientoLimpio.getText()));
			necesidadlimpio.setString(6,"Pollo Limpio");
                        int y = necesidadlimpio.executeUpdate();
	                necesidadlimpio.close();


			PreparedStatement necesidadcortes = con.prepareStatement("INSERT INTO `cortes real` (`ID cortes`, `Fecha de inicio`, `Fecha de finalización`, `Porcentaje de necesidad`, `Porcentaje de rendimiento`, `Costes Estándar_Nombre`) VALUES (?,?,?,?,?,?);");
                	necesidadcortes.setInt(1, idnecesidadcortes + 3);
                	necesidadcortes.setDate(2, sqlFechaInicial);	
	                necesidadcortes.setDate(3, sqlFechaFinal);
        	        necesidadcortes.setFloat(4, Float.parseFloat(PorcentajeCortes.getText()));
			necesidadcortes.setFloat(5, Float.parseFloat(RendimientoCortes.getText()));
			necesidadcortes.setString(6,"Cortes");
                        int w = necesidadcortes.executeUpdate();
	                necesidadcortes.close();	
	                con.close();
                        this.dispose();
        	}else {
                	JOptionPane.showMessageDialog(null, "Por favor ingrese los datos en todos los campos mostrados","Campos obligatorios incompletos", JOptionPane.ERROR_MESSAGE);
                	con.close();
                }
            }
            if(x!=1){
    		JOptionPane.showMessageDialog(null, "La sumatoria de porcentajes requeridos no da 1", "Datos incongruentes",JOptionPane.ERROR_MESSAGE);
	    }
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Los datos ingresados no están en el formato aceptado","Error", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(TipoCorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoCorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoCorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoCorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoCorte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private com.toedter.calendar.JDateChooser FechaFinal;
    private com.toedter.calendar.JDateChooser FechaInicial;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField PorcentajeCortes;
    private javax.swing.JTextField PorcentajeDeshuesado;
    private javax.swing.JTextField RendimientoCortes;
    private javax.swing.JTextField RendimientoLimpio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField porcentajelimpio;
    private javax.swing.JTextField rendimientodeshuesado;
    // End of variables declaration//GEN-END:variables
}
