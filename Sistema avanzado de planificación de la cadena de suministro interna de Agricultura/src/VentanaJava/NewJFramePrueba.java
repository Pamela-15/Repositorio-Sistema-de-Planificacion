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
        DatosCosechas cosechas = new DatosCosechas(100);        RequeridoPlanta requerido = new RequeridoPlanta(100);
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
        
        cosechas.setSecuencia(1);
        cosechas.setRango("Pequeño");
        cosechas.setHoras_procesamiento(2);
        cosechas.setCantidad_aves(18600);
        cosechas.setCantidad_camiones(6);
        cosechas.setHora_planta(hora1);
        cosechas.setGalera(3);
        cosechas.setCuadrilla(1);
        cosechas.setHora_liberacion_cuadrilla(hora1);
        listDatosCosechas.add(0, cosechas);

        cosechas.setSecuencia(2);
        cosechas.setRango("Mediano");
        cosechas.setHoras_procesamiento(2);
        cosechas.setCantidad_aves(18600);
        cosechas.setCantidad_camiones(7);
        cosechas.setHora_planta(hora2);
        cosechas.setGalera(5);
        cosechas.setCuadrilla(2);
        cosechas.setHora_liberacion_cuadrilla(hora2);
        listDatosCosechas.add(1, cosechas);
        
        cosechas.setSecuencia(3);
        cosechas.setRango("Grande");
        cosechas.setHoras_procesamiento(2);
        cosechas.setCantidad_aves(16800);
        cosechas.setCantidad_camiones(7);
        cosechas.setHora_planta(hora3);
        cosechas.setGalera(8);
        cosechas.setCuadrilla(3);
        cosechas.setHora_liberacion_cuadrilla(hora3);
        listDatosCosechas.add(2, cosechas);
        
        RequeridoPlanta requerido1 = new RequeridoPlanta(100);
        requerido1.setSecuencia(1);
        requerido1.setRango("Pequeño");
        requerido1.setHoras_procesamiento(2);
        requerido1.setCantidad_aves(18600);
        requerido1.setCantidad_camiones(6);
        requerido1.setHora_planta(hora1);
        listRequeridoPlanta.add(requerido1);
        
        
        RequeridoPlanta requerido2 = new RequeridoPlanta(100);
        requerido2.setSecuencia(2);
        requerido2.setRango("Mediano");
        requerido2.setHoras_procesamiento(2);
        requerido2.setCantidad_aves(18600);
        requerido2.setCantidad_camiones(7);
        requerido2.setHora_planta(hora2);
        listRequeridoPlanta.add(requerido2);
        
        requerido.setSecuencia(3);
        requerido.setRango("Grande");
        requerido.setHoras_procesamiento(2);
        requerido.setCantidad_aves(16800);
        requerido.setCantidad_camiones(7);
        requerido.setHora_planta(hora3);
        listRequeridoPlanta.add(requerido);
        
        requerido.setSecuencia(4);
        requerido.setRango("Pequeño");
        requerido.setHoras_procesamiento(2);
        requerido.setCantidad_aves(18600);
        requerido.setCantidad_camiones(6);
        requerido.setHora_planta(hora4);
        listRequeridoPlanta.add(requerido);

        requerido.setSecuencia(5);
        requerido.setRango("Grande");
        requerido.setHoras_procesamiento(2);
        requerido.setCantidad_aves(16800);
        requerido.setCantidad_camiones(7);
        requerido.setHora_planta(hora5);
        listRequeridoPlanta.add(requerido);
        
        requerido.setSecuencia(6);
        requerido.setRango("Mediano");
        requerido.setHoras_procesamiento(2);
        requerido.setCantidad_aves(18600);
        requerido.setCantidad_camiones(7);
        requerido.setHora_planta(hora6);
        listRequeridoPlanta.add(requerido);

        requerido.setSecuencia(7);
        requerido.setRango("Pequeño");
        requerido.setHoras_procesamiento(1.45);
        requerido.setCantidad_aves(13530);
        requerido.setCantidad_camiones(5);
        requerido.setHora_planta(hora7);
        listRequeridoPlanta.add(requerido);
        System.out.println(listRequeridoPlanta.get(1).getSecuencia());
        System.out.println(listRequeridoPlanta.get(2).getSecuencia());
        System.out.println(listRequeridoPlanta.get(3).getSecuencia());
        System.out.println(listRequeridoPlanta.get(2).getRango());
       
      //  CosechaCortoPlazo cosechaCorto = new CosechaCortoPlazo(1); 
      //  cosechaCorto.GestionDatosMayor23(1, 20, 3, listDatosCosechas,listRequeridoPlanta);
     //   
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
