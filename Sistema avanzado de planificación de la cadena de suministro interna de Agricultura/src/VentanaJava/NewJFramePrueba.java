/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaJava;

import VentanaJava.DatosCosechas;
import VentanaJava.RequeridoPlanta;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class NewJFramePrueba extends javax.swing.JFrame {

    /**
     * Creates new form NewJFramePrueba
     */
    public NewJFramePrueba() {
        initComponents();
        DatosCosechas cosechas = new DatosCosechas(100);        
        RequeridoPlanta requerido = new RequeridoPlanta(100);
        ArrayList<DatosCosechas> listDatosCosechas = new ArrayList<DatosCosechas>(0);
        ArrayList<RequeridoPlanta> listRequeridoPlanta = new ArrayList<RequeridoPlanta>(0);

        Calendar hora1 =Calendar.getInstance();
        hora1.set(Calendar.YEAR,2016);
        hora1.set(Calendar.MONTH,4);
        hora1.set(Calendar.DAY_OF_MONTH,22);
        hora1.set(Calendar.HOUR_OF_DAY,18);
        hora1.set(Calendar.MINUTE,0);
        hora1.set(Calendar.SECOND,0);

        Calendar hora2 =Calendar.getInstance();
        hora2.set(Calendar.YEAR,2016);
        hora2.set(Calendar.MONTH,4);
        hora2.set(Calendar.DAY_OF_MONTH,22);
        hora2.set(Calendar.HOUR_OF_DAY,20);
        hora2.set(Calendar.MINUTE,0);
        hora2.set(Calendar.SECOND,0);
       
        Calendar hora3 =Calendar.getInstance();
        hora3.set(Calendar.YEAR,2016);
        hora3.set(Calendar.MONTH,4);
        hora3.set(Calendar.DAY_OF_MONTH,22);
        hora3.set(Calendar.HOUR_OF_DAY,22);
        hora3.set(Calendar.MINUTE,0);
        hora3.set(Calendar.SECOND,0);
        
        Calendar hora4 =Calendar.getInstance();
        hora4.set(Calendar.YEAR,2016);
        hora4.set(Calendar.MONTH,4);
        hora4.set(Calendar.DAY_OF_MONTH,23);
        hora4.set(Calendar.HOUR_OF_DAY,0);
        hora4.set(Calendar.MINUTE,0);
        hora4.set(Calendar.SECOND,0);
        
        Calendar hora5 =Calendar.getInstance();
        hora5.set(Calendar.YEAR,2016);
        hora5.set(Calendar.MONTH,4);
        hora5.set(Calendar.DAY_OF_MONTH,23);
        hora5.set(Calendar.HOUR_OF_DAY,2);
        hora5.set(Calendar.MINUTE,0);
        hora5.set(Calendar.SECOND,0);

        Calendar hora6 =Calendar.getInstance();
        hora6.set(Calendar.YEAR,2016);
        hora6.set(Calendar.MONTH,4);
        hora6.set(Calendar.DAY_OF_MONTH,23);
        hora6.set(Calendar.HOUR_OF_DAY,4);
        hora6.set(Calendar.MINUTE,0);
        hora6.set(Calendar.SECOND,0);      
        
        Calendar hora7 =Calendar.getInstance();
        hora7.set(Calendar.YEAR,2016);
        hora7.set(Calendar.MONTH,4);
        hora7.set(Calendar.DAY_OF_MONTH,23);
        hora7.set(Calendar.HOUR_OF_DAY,5);
        hora7.set(Calendar.MINUTE,28);
        hora7.set(Calendar.SECOND,0);
        
        DatosCosechas cosechas1 = new DatosCosechas(1);
        cosechas1.setSecuencia(1);
        cosechas1.setRango("Pequeño");
        cosechas1.setHoras_procesamiento(2);
        cosechas1.setCantidad_aves(18600);
        cosechas1.setCantidad_camiones(6);
        cosechas1.setHora_planta(hora1);
        cosechas1.setGalera(3);
        cosechas1.setCuadrilla(1);
        cosechas1.setHora_liberacion_cuadrilla(hora1);
        listDatosCosechas.add(cosechas1);

        DatosCosechas cosechas2 = new DatosCosechas(1);
        cosechas2.setSecuencia(2);
        cosechas2.setRango("Mediano");
        cosechas2.setHoras_procesamiento(2);
        cosechas2.setCantidad_aves(18600);
        cosechas2.setCantidad_camiones(7);
        cosechas2.setHora_planta(hora2);
        cosechas2.setGalera(5);
        cosechas2.setCuadrilla(2);
        cosechas2.setHora_liberacion_cuadrilla(hora2);
        listDatosCosechas.add(cosechas2);
        
        DatosCosechas cosechas3 = new DatosCosechas(1);
        cosechas3.setSecuencia(3);
        cosechas3.setRango("Grande");
        cosechas3.setHoras_procesamiento(2);
        cosechas3.setCantidad_aves(16800);
        cosechas3.setCantidad_camiones(7);
        cosechas3.setHora_planta(hora3);
        cosechas3.setGalera(8);
        cosechas3.setCuadrilla(3);
        cosechas3.setHora_liberacion_cuadrilla(hora3);
        listDatosCosechas.add(cosechas3);
        //porq hasta tres????
        RequeridoPlanta requerido1 = new RequeridoPlanta(1);
        requerido1.setSecuencia(1);
        requerido1.setRango("Pequeño");
        requerido1.setHoras_procesamiento(2);
        requerido1.setCantidad_aves(18600);
        requerido1.setCantidad_camiones(6);
        requerido1.setHora_planta(hora1);
        listRequeridoPlanta.add(requerido1);
        
        
        RequeridoPlanta requerido2 = new RequeridoPlanta(1);
        requerido2.setSecuencia(2);
        requerido2.setRango("Mediano");
        requerido2.setHoras_procesamiento(2);
        requerido2.setCantidad_aves(18600);
        requerido2.setCantidad_camiones(7);
        requerido2.setHora_planta(hora2);
        listRequeridoPlanta.add(requerido2);
        
        RequeridoPlanta requerido3 = new RequeridoPlanta(1);
        requerido3.setSecuencia(3);
        requerido3.setRango("Grande");
        requerido3.setHoras_procesamiento(2);
        requerido3.setCantidad_aves(16800);
        requerido3.setCantidad_camiones(7);
        requerido3.setHora_planta(hora3);
        listRequeridoPlanta.add(requerido3);
        
        RequeridoPlanta requerido4 = new RequeridoPlanta(1);
        requerido4.setSecuencia(4);
        requerido4.setRango("Pequeño");
        requerido4.setHoras_procesamiento(2);
        requerido4.setCantidad_aves(18600);
        requerido4.setCantidad_camiones(6);
        requerido4.setHora_planta(hora4);
        listRequeridoPlanta.add(requerido4);

        RequeridoPlanta requerido5 = new RequeridoPlanta(1);
        requerido5.setSecuencia(5);
        requerido5.setRango("Grande");
        requerido5.setHoras_procesamiento(2);
        requerido5.setCantidad_aves(16800);
        requerido5.setCantidad_camiones(7);
        requerido5.setHora_planta(hora5);
        listRequeridoPlanta.add(requerido5);
        
        RequeridoPlanta requerido6 = new RequeridoPlanta(1);
        requerido6.setSecuencia(6);
        requerido6.setRango("Mediano");
        requerido6.setHoras_procesamiento(2);
        requerido6.setCantidad_aves(18600);
        requerido6.setCantidad_camiones(7);
        requerido6.setHora_planta(hora6);
        listRequeridoPlanta.add(requerido6);

        RequeridoPlanta requerido7 = new RequeridoPlanta(1);
        requerido7.setSecuencia(7);
        requerido7.setRango("Pequeño");
        requerido7.setHoras_procesamiento(1.45);
        requerido7.setCantidad_aves(13530);
        requerido7.setCantidad_camiones(5);
        requerido7.setHora_planta(hora7);
        listRequeridoPlanta.add(requerido7);
        System.out.println(listRequeridoPlanta.get(0).getSecuencia());
        System.out.println(listRequeridoPlanta.get(1).getSecuencia());
        System.out.println(listRequeridoPlanta.get(2).getSecuencia());
        System.out.println(listRequeridoPlanta.get(6).getRango());
       //Prueba
        CosechaCortoPlazo cosechaCorto = new CosechaCortoPlazo(1); 
        cosechaCorto.GestionDatosMayor23(1, 20, 3, listDatosCosechas,listRequeridoPlanta);
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJFramePrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFramePrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFramePrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFramePrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFramePrueba();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
