package VentanaJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pzamoram
 */
public class AgregarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form AgregarModificarUsuario
     */
    public AgregarUsuario() {
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

        AdministraciónUsuarios = new javax.swing.JLabel();
        NombreUsuarioIngresar = new javax.swing.JTextField();
        NombreUsuarioTitulo = new javax.swing.JLabel();
        ContrasenaTitulo = new javax.swing.JLabel();
        ContrasenaIngresar = new javax.swing.JTextField();
        RolUsuarioTitulo = new javax.swing.JLabel();
        RolUsuarioSeleccionar = new javax.swing.JComboBox<>();
        GuardarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdministraciónUsuarios.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        AdministraciónUsuarios.setText("Administración de Usuarios");

        NombreUsuarioIngresar.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        NombreUsuarioTitulo.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        NombreUsuarioTitulo.setText("Nombre de Usuario");

        ContrasenaTitulo.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        ContrasenaTitulo.setText("Contraseña");

        ContrasenaIngresar.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        RolUsuarioTitulo.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        RolUsuarioTitulo.setText("Rol de Usuario");

        RolUsuarioSeleccionar.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        RolUsuarioSeleccionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Encargado(a) de Planificación de Agricultura", "Encargado(a) de Planificación de Logística", "Encargado(a) de Incubación", "Encargado(a) de Engorde", "Supervisor(a) de Engorde", "Encargado(a) de Planta" }));

        GuardarDatos.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        GuardarDatos.setText("Guardar Datos");
        GuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(RolUsuarioTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreUsuarioTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContrasenaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AdministraciónUsuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreUsuarioIngresar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContrasenaIngresar)
                    .addComponent(RolUsuarioSeleccionar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GuardarDatos)
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AdministraciónUsuarios)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreUsuarioIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreUsuarioTitulo))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContrasenaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContrasenaIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RolUsuarioTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RolUsuarioSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(GuardarDatos)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarDatosActionPerformed
        int idusuario = 0;
        String driver = "com.mysql.jdbc.Driver";
        String connection = "jdbc:mysql://localhost:3306/cargill";
        String user = "root";
        String password = "admi";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connection, user, password);
                           
            if (!con.isClosed()&& NombreUsuarioIngresar.getText() != null && ContrasenaIngresar.getText()!= null ) {
                
                               
                PreparedStatement cantidadusuarios = con.prepareStatement("select * from cargill.`usuario` ");
                ResultSet resultadocantidadusuarios = cantidadusuarios.executeQuery();
                while( resultadocantidadusuarios.next() ) {
                    idusuario = Integer.parseInt(resultadocantidadusuarios.getString("idUsuario"));
                }
                
                resultadocantidadusuarios.close();
                cantidadusuarios.close();
                
                PreparedStatement usuario = con.prepareStatement("INSERT INTO `usuario` (`idUsuario`, `Nombre de Usuario`, `Contraseña`, `Perfil`) VALUES (?,?,?,?);");
                usuario.setInt(1, idusuario + 1);
                usuario.setString(2, NombreUsuarioIngresar.getText());
                usuario.setString(3, ContrasenaIngresar.getText());
                usuario.setString(4, (String) RolUsuarioSeleccionar.getSelectedItem());
                int x = usuario.executeUpdate();
                usuario.close();
                con.close();
                VentanaJava.AdministracionUsuarios.ActualizarTabla();
            }
            else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese los datos en todos los campos mostrados","Campos obligatorios incompletos", JOptionPane.ERROR_MESSAGE);
                con.close();
            }
                
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Los datos ingresados no están en el formato aceptado"+e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        
        this.dispose(); 
    }//GEN-LAST:event_GuardarDatosActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdministraciónUsuarios;
    private javax.swing.JTextField ContrasenaIngresar;
    private javax.swing.JLabel ContrasenaTitulo;
    private javax.swing.JButton GuardarDatos;
    private javax.swing.JTextField NombreUsuarioIngresar;
    private javax.swing.JLabel NombreUsuarioTitulo;
    private javax.swing.JComboBox<String> RolUsuarioSeleccionar;
    private javax.swing.JLabel RolUsuarioTitulo;
    // End of variables declaration//GEN-END:variables
}
