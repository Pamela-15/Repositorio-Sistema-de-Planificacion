package VentanaJava;

import static VentanaJava.AdministracionUsuarios.TablaAdministracionUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class IngresoCortoplazo extends javax.swing.JFrame {
    int idUsuarioAutenticado;
    
    public IngresoCortoplazo(int usuario) {
        initComponents();
        idUsuarioAutenticado=usuario;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        Generar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        jLabel1.setText("Planificación de Ingreso a Corto Plazo");

        Generar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        Generar.setText("Generar Reporte");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        Consultar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        Consultar.setText(" Consultar Reporte");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        Modificar.setFont(new java.awt.Font("Calibri Light", 0, 22)); // NOI18N
        Modificar.setText("Modificar Reporte");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Generar)
                        .addGap(51, 51, 51)
                        .addComponent(Consultar)
                        .addGap(65, 65, 65)
                        .addComponent(Modificar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Generar)
                    .addComponent(Consultar)
                    .addComponent(Modificar))
                .addGap(111, 111, 111))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        mostrarModificarPlan(idUsuarioAutenticado);
    }//GEN-LAST:event_ModificarActionPerformed

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        jDialog1.setVisible(true);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setTitle("Generando.....");
        jDialog1.setSize(200,50);
        
        String zonas="";
        Date hoy=new Date();
        int cantidad,cantidadcentral, i, mes, semana, necesidad,m,n,o, diasemana, cantidadgalerasingresar;
        float medianamesingreso, medianatotalingreso, factormes, medianajoven, medianamedia, medianavieja, factoredadm, factoredadj, factoredadv, huevosv, huevosm, huevosj,huevostotal, factorporedad;
        String [][] lista,listabackup, rangos, cortes, rangospredeterminado, cortespredeterminado, plan;
        int [] disponible;
        cantidadgalerasingresar=0;
        Calendar calendar = Calendar.getInstance();
        Calendar iniciointervalo = Calendar.getInstance();
        Calendar finintervalo = Calendar.getInstance();
        Calendar desfasesemanal= Calendar.getInstance();
        String driver = "com.mysql.jdbc.Driver";
        String connection = "jdbc:mysql://localhost:3306/cargill";
        String user = "root";
        String password = "admi";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connection, user, password);
                           
            if (!con.isClosed()) {
                PreparedStatement ordenzonas = con.prepareStatement(" select x.* from(SELECT `galera`.`zona`, max(`ingresos`.`Fecha de Ingreso`) as fecha FROM `cargill`.`ingresos` inner join `cargill`.`galera` on `ingresos`.`Galera_idGalera`= `galera`.`idGalera` group by `galera`.`zona`)x order by fecha; ");
                ResultSet resultadoordenzonas = ordenzonas.executeQuery();
                while( resultadoordenzonas.next() ) {
                    zonas=zonas+",\""+resultadoordenzonas.getString("zona")+"\"";
                }
                resultadoordenzonas.close();
                ordenzonas.close();
                
                java.util.Date javaFechaInicial = hoy;
                java.sql.Date sqlFechaInicial = new java.sql.Date(javaFechaInicial.getTime());
                calendar.setTime(hoy);
                semana=calendar.get(Calendar.WEEK_OF_YEAR);
                calendar.add(Calendar.DAY_OF_YEAR, 7);
                mes= calendar.get(Calendar.MONTH) + 1;
                java.util.Date javaFechaFinal = calendar.getTime();
                java.sql.Date sqlFechaFinal = new java.sql.Date(javaFechaFinal.getTime());
                
                PreparedStatement registros = con.prepareStatement(" Select COUNT(*) FROM `cargill`.`ingreso mediano plazo` where `ingreso mediano plazo`.`Fecha de ingreso` > ? AND `ingreso mediano plazo`.`Fecha de ingreso` < ? ; ");
                registros.setDate(1,sqlFechaInicial);
                registros.setDate(2,sqlFechaFinal);
                ResultSet cuenta = registros.executeQuery();
                cuenta.next();
                cantidad= cuenta.getInt("count(*)");
                cuenta.close();
                registros.close();
                lista= new String[cantidad][8];
                PreparedStatement ingresomediano = con.prepareStatement(" Select `ingreso mediano plazo`.`idIngreso Mediano Plazo`, `ingreso mediano plazo`.`Galera id Galera`, info.`Fecha de cosecha`, `tgaleras`.`Nombre de Granja`, `tgaleras`.`Numero de Galera`, `tgaleras`.`Zona`, `tgaleras`.`Capacidad`, `tgaleras`.`Mortalidad cierre` FROM `cargill`.`ingreso mediano plazo` inner join (Select `ingresos`.`Galera_idGalera`,max(`ingresos`.`Fecha de cosecha`) from `cargill`.`ingresos` group by `ingresos`.`Galera_idGalera`)info on info.`Galera id Galera`=`ingreso mediano plazo`.`Galera id Galera` INNER join (SELECT `galera`.`idGalera`,`galera`.`Nombre Granja`,`galera`.`Numero de Galera`,`galera`.`Zona`,`galera`.`Capacidad`,`galera`.`ActivacionGalera`,`xxx`.`Mortalidad cierre`FROM `cargill`.`galera`left outer join (select b.A,a.rownum, a.`Mortalidad cierre` from( select if(@grupo= mortalidad.`Granja`,@rownum:=@rownum+1,@rownum:=1) AS rownum, @grupo:=mortalidad.`Granja` as grupo, mortalidad.`Mortalidad cierre`from cargill.mortalidad order by mortalidad.`Granja`, mortalidad.`Mortalidad cierre` ) a, (select mortalidad.`Granja` AS A,ROUND(count(*)/2) medio from cargill.mortalidad group by mortalidad.`Granja`) b where a.rownum= b.medio and a.grupo=b.A)xxx on `galera`.`Nombre Granja`=xxx.A)tgaleras on `ingreso mediano plazo`.`Galera id Galera`= `tgaleras`.`idGalera` where `ingreso mediano plazo`.`Fecha de ingreso` > ? AND `ingreso mediano plazo`.`Fecha de ingreso` < ? AND `tgaleras`.`ActivacionGalera` =? ORDER BY FIELD( `tgaleras`.`Zona`"+zonas+"); ");
                ingresomediano.setDate(1,sqlFechaInicial);
                ingresomediano.setDate(2,sqlFechaFinal);
                ingresomediano.setString(3,"Activa");
                ResultSet planingresomediano = ingresomediano.executeQuery();
                i=0;
                while( planingresomediano.next() ) {
                    lista[i][0]=planingresomediano.getString("idIngreso Mediano Plazo");
                    lista[i][1]=planingresomediano.getString("Galera_idGalera");
                    lista[i][2]=planingresomediano.getString("Fecha de cosecha");
                    lista[i][3]=planingresomediano.getString("Nombre Granja");
                    lista[i][4]=planingresomediano.getString("Numero de Galera");
                    lista[i][5]=planingresomediano.getString("zona");
                    lista[i][6]=planingresomediano.getString("Capacidad");
                    lista[1][7]=planingresomediano.getString("Mortalidad cierre");
                    i++;
                }
                planingresomediano.close();
                ingresomediano.close();
                
                registros = con.prepareStatement(" Select count(*) as cuenta from (SELECT max(`ingresos`.`idIngresos`) as idIngresos,`ingresos`.`Galera_idGalera`,`galera`.`Carrusel`,`galera`.`zona`,`galera`.`Nombre Granja`,`galera`.`Numero de Galera`,`galera`.`Capacidad`, max(`ingresos`.`Fecha de Ingreso`),`galera`.`Carrusel`   as fecha FROM `cargill`.`ingresos` inner join `cargill`.`galera` on `ingresos`.`Galera_idGalera`= `galera`.`idGalera` group by `ingresos`.`Galera_idGalera`)xxx inner join `cargill`.`ingresos` on xxx.idIngresos= `ingresos`.`idIngresos` where ingresos.`Fecha de cosecha` is not null and xxx.`Carrusel`=\"Central\";");
                cuenta = registros.executeQuery();
                cuenta.next();
                cantidadcentral= cuenta.getInt("cuenta");
                listabackup= new String[cantidadcentral][8];
                
                PreparedStatement granjascentral = con.prepareStatement("Select xxx.Galera_idGalera, xxx.zona, xxx.`Nombre Granja`, xxx.`Numero de Galera`,xxx.Capacidad, xxx.fecha, ingresos.`Fecha de cosecha`, www.`Mortalidad cierre` from (SELECT max(`ingresos`.`idIngresos`) as idIngresos,`ingresos`.`Galera_idGalera`,`galera`.`Carrusel`,`galera`.`zona`,`galera`.`Nombre Granja`,`galera`.`Numero de Galera`,`galera`.`Capacidad`, `galera`.`Carrusel` , max(`ingresos`.`Fecha de Ingreso`)  as fecha FROM `cargill`.`ingresos` inner join `cargill`.`galera` on `ingresos`.`Galera_idGalera`= `galera`.`idGalera` group by `ingresos`.`Galera_idGalera` order by FIELD(`galera`.`zona`"+zonas+"),`ingresos`.`Fecha de Ingreso` asc)xxx inner join `cargill`.`ingresos` on xxx.idIngresos= `ingresos`.`idIngresos` inner join (select b.A,a.rownum, a.`Mortalidad cierre` from( select if(@grupo= mortalidad.`Granja`,@rownum:=@rownum+1,@rownum:=1) AS rownum, @grupo:=mortalidad.`Granja` as grupo, mortalidad.`Mortalidad cierre` from cargill.mortalidad order by mortalidad.`Granja`, mortalidad.`Mortalidad cierre` ) a, (select mortalidad.`Granja` AS A,ROUND(count(*)/2) medio from cargill.mortalidad group by mortalidad.`Granja`) b where a.rownum= b.medio and a.grupo=b.A)www on xxx.`Nombre Granja`=www.A where ingresos.`Fecha de cosecha` is not null and xxx.`Carrusel`=?;");
                granjascentral.setString(1,"Central");
                ResultSet resultadogranjascentral=granjascentral.executeQuery();
                while(resultadogranjascentral.next()){
                    listabackup[i][0]=null;
                    listabackup[i][1]=resultadogranjascentral.getString("Galera_idGalera");
                    listabackup[i][2]=resultadogranjascentral.getString("Fecha de cosecha");
                    listabackup[i][3]=resultadogranjascentral.getString("Nombre Granja");
                    listabackup[i][4]=resultadogranjascentral.getString("Numero de Galera");
                    listabackup[i][5]=resultadogranjascentral.getString("zona");
                    listabackup[i][6]=resultadogranjascentral.getString("Capacidad");
                    listabackup[1][7]=resultadogranjascentral.getString("Mortalidad cierre");
                }
                
                PreparedStatement medianames = con.prepareStatement ("select b.A,a.rownum, a.`Mortalidad cierre` from(select if(@grupo= MONTH(mortalidad.`Fecha de ingreso`),@rownum:=@rownum+1,@rownum:=1) AS rownum, @grupo:=MONTH(mortalidad.`Fecha de ingreso`) as grupo, mortalidad.`Mortalidad cierre` from cargill.mortalidad order by MONTH(mortalidad.`Fecha de ingreso`), mortalidad.`Mortalidad cierre` ) a, (select MONTH(mortalidad.`Fecha de ingreso`) AS A,ROUND(count(*)/2) medio from cargill.mortalidad group by MONTH(mortalidad.`Fecha de ingreso`)) b where a.rownum= b.medio and a.grupo=b.A and b.A=?;");
                medianames.setInt(1,mes);
                ResultSet valormedianames = medianames.executeQuery();
                valormedianames.next();
                medianamesingreso=valormedianames.getFloat("Mortalidad cierre");
                valormedianames.close();
                medianames.close();
                
                PreparedStatement mediana = con.prepareStatement ("select a.rownum, a.`Mortalidad cierre` from ( select @rownum:=@rownum+1 AS rownum, `mortalidad`.`Mortalidad cierre` from ( select @rownum:=1) r, `cargill`.`mortalidad` order by `mortalidad`.`Mortalidad cierre`) a, (select round(count(*)/2) medio from `cargill`.`mortalidad`) b where a.rownum= b.medio;");
                ResultSet valormediana = mediana.executeQuery();
                valormediana.next();
                medianatotalingreso=valormediana.getFloat("Mortalidad cierre");
                valormediana.close();
                mediana.close();
                
                factormes=medianamesingreso/medianatotalingreso;
                
                PreparedStatement medianav = con.prepareStatement ("select a.rownum, a.`Mortalidad cierre`, a.`Edad reproductora` from ( select @rownum:=@rownum+1 AS rownum, `mortalidad`.`Mortalidad cierre`, `mortalidad`.`Edad reproductora` from ( select @rownum:=0) r, `cargill`.`mortalidad` where `mortalidad`.`Edad reproductora`<66 and `mortalidad`.`Edad reproductora`>45 order by `mortalidad`.`Mortalidad cierre`) a, (select round(count(*)/2) medio from `cargill`.`mortalidad` where `mortalidad`.`Edad reproductora`<66 and `mortalidad`.`Edad reproductora`>45 ) b where a.rownum= b.medio;");
                ResultSet valormedianav = medianav.executeQuery();
                valormedianav.next();
                medianavieja=valormedianav.getFloat("Mortalidad cierre");
                valormedianav.close();
                medianav.close();
                factoredadv=medianavieja/medianatotalingreso;
                PreparedStatement medianam = con.prepareStatement ("select a.rownum, a.`Mortalidad cierre`, a.`Edad reproductora` from ( select @rownum:=@rownum+1 AS rownum, `mortalidad`.`Mortalidad cierre`, `mortalidad`.`Edad reproductora` from ( select @rownum:=0) r, `cargill`.`mortalidad` where `mortalidad`.`Edad reproductora`<46 and `mortalidad`.`Edad reproductora`>35 order by `mortalidad`.`Mortalidad cierre`) a, (select round(count(*)/2) medio from `cargill`.`mortalidad` where `mortalidad`.`Edad reproductora`<46 and `mortalidad`.`Edad reproductora`>35 ) b where a.rownum= b.medio;");
                ResultSet valormedianam = medianam.executeQuery();
                valormedianam.next();
                medianamedia=valormedianam.getFloat("Mortalidad cierre");
                valormedianam.close();
                medianam.close();
                factoredadm=medianamedia/medianatotalingreso;
                PreparedStatement medianaj = con.prepareStatement ("select a.rownum, a.`Mortalidad cierre`, a.`Edad reproductora` from ( select @rownum:=@rownum+1 AS rownum, `mortalidad`.`Mortalidad cierre`, `mortalidad`.`Edad reproductora` from ( select @rownum:=0) r, `cargill`.`mortalidad` where `mortalidad`.`Edad reproductora`<36 and `mortalidad`.`Edad reproductora`>24 order by `mortalidad`.`Mortalidad cierre`) a, (select round(count(*)/2) medio from `cargill`.`mortalidad` where `mortalidad`.`Edad reproductora`<36 and `mortalidad`.`Edad reproductora`>24 ) b where a.rownum= b.medio;");
                ResultSet valormedianaj = medianaj.executeQuery();
                valormedianaj.next();
                medianajoven=valormedianaj.getFloat("Mortalidad cierre");
                valormedianaj.close();
                medianaj.close();
                factoredadj=medianajoven/medianatotalingreso;
                
                iniciointervalo.setTime(hoy);
                iniciointervalo.add(Calendar.DAY_OF_YEAR, -21);
                java.util.Date javaInicio = iniciointervalo.getTime();
                java.sql.Date sqlInicio = new java.sql.Date(javaInicio.getTime());
                finintervalo.setTime(hoy);
                finintervalo.add(Calendar.DAY_OF_YEAR, -14);
                java.util.Date javaFinal = finintervalo.getTime();
                java.sql.Date sqlFinal = new java.sql.Date(javaFinal.getTime());
                disponible= new int[7];
                i=0;
                PreparedStatement disponibilidad = con.prepareStatement ("SELECT `incubación`.`Fecha de ingreso`, SUM(`incubación`.`Cantidad de huevos cargados`*`incubación`.`Incubabilidad`) as huevos FROM `cargill`.`incubación` where `incubación`.`Fecha de ingreso`>? AND `incubacion`.`Fecha de ingreso`<? GROUP BY `incubación`.`Fecha de ingreso`;");
                disponibilidad.setDate(1,sqlInicio);
                disponibilidad.setDate(2,sqlFinal);
                ResultSet pollosdisponibles = disponibilidad.executeQuery();
                while( pollosdisponibles.next() ) {
                    disponible[i]=pollosdisponibles.getInt("huevo");
                    i++;
                }
                pollosdisponibles.close();
                disponibilidad.close();
                huevosv=1;
                huevosm=1;
                huevosj=1;
                PreparedStatement razonedad = con.prepareStatement ("SELECT SUM(if(`incubación`.`Rango de edad`<46 and `incubación`.`Rango de edad`>35,`incubación`.`Cantidad de huevos`*`incubación`.`Incubabilidad`,0)) as joven, SUM(if(`incubación`.`Rango de edad`<36 and `incubación`.`Rango de edad`>24,`incubación`.`Cantidad de huevos`*`incubación`.`Incubabilidad`,0)) as media, SUM(if(`incubación`.`Rango de edad`<66 and `incubación`.`Rango de edad`>45,`incubación`.`Cantidad de huevos`*`incubación`.`Incubabilidad`,0)) as vieja FROM `cargill`.`incubación` where `incubación`.`Fecha de ingreso` > ? and `incubación`.`Fecha de ingreso`< ?;");
                razonedad.setDate(1,sqlInicio);
                razonedad.setDate(2,sqlFinal);
                ResultSet resultadorazonedad = razonedad.executeQuery();
                while( resultadorazonedad.next() ) {
                    huevosv=pollosdisponibles.getInt("vieja");
                    huevosm=pollosdisponibles.getInt("media");
                    huevosj=pollosdisponibles.getInt("joven");
                    
                }
                resultadorazonedad.close();
                razonedad.close();
                huevostotal=huevosv+huevosm+huevosj;
                factorporedad=((huevosv/huevostotal)*factoredadv)+((huevosm/huevostotal)*factoredadm)+((huevosj/huevostotal)*factoredadj);
                
                float[] demandanum = new float[7];
                float[] desglosesemanal = new float[7];
                
                PreparedStatement diassemana=con.prepareStatement("SELECT `raleo`.`id`,`raleo`.`Variable`, `raleo`.`Porcentaje` FROM `cargill`.`raleo` WHERE `raleo`.`id`>1 ORDER BY `raleo`.`id` ASC ;");
                ResultSet distribuciondias=diassemana.executeQuery();
                int zx=0;
                while(distribuciondias.next()){
                    desglosesemanal[zx]=distribuciondias.getFloat("Porcentaje");
                }
                distribuciondias.close();
                diassemana.close();
                int xzy=0;
                desfasesemanal.setTime(hoy);
                diasemana=desfasesemanal.get(Calendar.DAY_OF_WEEK);
                PreparedStatement demanda = con.prepareStatement ("SELECT `demanda`.`Demanda` FROM `cargill`.`demanda` where `demanda`.`Semana`=?;");
                demanda.setInt(1,semana);
                ResultSet resultadodemanda = demanda.executeQuery();
                resultadodemanda.next();
                necesidad=resultadodemanda.getInt("Demanda");
                resultadodemanda.close();
                for(o=diasemana;o<=7;o++){
                    demandanum[xzy]=(float)(necesidad*desglosesemanal[o]);
                    xzy++;
                }
                for(o=0;o<diasemana-1;o++){
                    demandanum[xzy]=(float)(necesidad*desglosesemanal[0]);
                    xzy++;
                }
                demanda.close();
                rangospredeterminado=new String[4][4];
                int e=0;
                PreparedStatement rangosespecificos =con.prepareStatement ("SELECT `rango de peso`.`Rango de Peso`, `rango de peso`.`Límite Superior`, `rango de peso`.`Límite Inferior`, `rango de peso`.`Porcentaje de Necesidad` FROM `cargill`.`rango de peso`;");
                ResultSet resultadorangosespecificos=rangosespecificos.executeQuery();
                while(resultadorangosespecificos.next()){
                    rangospredeterminado[e][0]=resultadorangosespecificos.getString("Rango de Peso");
                    rangospredeterminado[e][1]=resultadorangosespecificos.getString("Límite Superior");
                    rangospredeterminado[e][2]=resultadorangosespecificos.getString("Límite Inferior");
                    rangospredeterminado[e][3]=resultadorangosespecificos.getString("Porcentaje de Necesidad");
                    e++;
                }
                resultadorangosespecificos.close();
                rangosespecificos.close();
                cortespredeterminado=new String[3][3];
                e=0;
                PreparedStatement cortesespecificos =con.prepareStatement ("SELECT `costes estándar`.`Nombre de corte`, `costes estándar`.`Porcentaje de Necesidad`, `costes estándar`.`Porcentaje de rendimiento` FROM `cargill`.`costes estándar`;");
                ResultSet resultadocortesespecificos=cortesespecificos.executeQuery();
                while(resultadocortesespecificos.next()){
                    cortespredeterminado[e][0]=resultadocortesespecificos.getString("Nombre de corte");
                    cortespredeterminado[e][1]=resultadocortesespecificos.getString("Porcentaje de Necesidad");
                    cortespredeterminado[e][2]=resultadocortesespecificos.getString("Porcentaje de rendimiento");
                    e++;
                }
                resultadocortesespecificos.close();
                cortesespecificos.close();
                
                int cantidadcortesreal, cantidadrangosreal;
                
                PreparedStatement numerocortesreal = con.prepareStatement("SELECT count(*) FROM `cargill`.`necesidades por rango real`where (((`necesidades por rango real`.`Fecha de inicio`>=? and `necesidades por rango real`.`Fecha de inicio`<=?) or (`necesidades por rango real`.`Fecha de finalización`>=? and `necesidades por rango real`.`Fecha de finalización`<=?)) or (`necesidades por rango real`.`Fecha de inicio`<=? and `necesidades por rango real`.`Fecha de finalización`>= ? ));");
                numerocortesreal.setDate(1,sqlFechaInicial);
                numerocortesreal.setDate(2,sqlFechaFinal);
                numerocortesreal.setDate(3,sqlFechaInicial);
                numerocortesreal.setDate(4,sqlFechaFinal);
                numerocortesreal.setDate(5,sqlFechaInicial);
                numerocortesreal.setDate(6,sqlFechaFinal);
                ResultSet resultadonumerocortesreal=numerocortesreal.executeQuery();
                resultadonumerocortesreal.next();
                cantidadrangosreal=resultadonumerocortesreal.getInt("count(*)");
                resultadonumerocortesreal.close();
                numerocortesreal.close();
                rangos=new String[cantidadrangosreal][2];
                java.sql.Date[][] fechasrangos=new java.sql.Date[cantidadrangosreal][2];
                
                if(cantidadrangosreal>0){
                    
                    e=0;
                    numerocortesreal = con.prepareStatement("SELECT `necesidades por rango real`.`Fecha de inicio`, `necesidades por rango real`.`Fecha de finalización`, `necesidades por rango real`.`Porcentaje de necesidad`, `necesidades por rango real`.`Rango de peso_Nombre` FROM `cargill`.`necesidades por rango real`where (((`necesidades por rango real`.`Fecha de inicio`>=? and `necesidades por rango real`.`Fecha de inicio`<=?) or (`necesidades por rango real`.`Fecha de finalización`>=? and `necesidades por rango real`.`Fecha de finalización`<=?)) or (`necesidades por rango real`.`Fecha de inicio`<=? and `necesidades por rango real`.`Fecha de finalización`>= ? )), order by `necesidades por rango real`.`Fecha de inicio`;");
                    numerocortesreal.setDate(1,sqlFechaInicial);
                    numerocortesreal.setDate(2,sqlFechaFinal);
                    numerocortesreal.setDate(3,sqlFechaInicial);
                    numerocortesreal.setDate(4,sqlFechaFinal);
                    numerocortesreal.setDate(5,sqlFechaInicial);
                    numerocortesreal.setDate(6,sqlFechaFinal);
                    resultadonumerocortesreal=numerocortesreal.executeQuery();
                    while(resultadonumerocortesreal.next()){
                        fechasrangos[e][0]=resultadonumerocortesreal.getDate("Fecha de inicio");
                        fechasrangos[e][1]=resultadonumerocortesreal.getDate("Fecha de finalización");
                        rangos[e][0]=resultadonumerocortesreal.getString("Porcentaje de necesidad");
                        rangos[e][1]=resultadonumerocortesreal.getString("Rango de peso_Nombre");
                        e++;
                    }
                    resultadonumerocortesreal.close();
                    numerocortesreal.close();
                }
                
                
                numerocortesreal = con.prepareStatement("SELECT count(*) FROM `cargill`.`cortes real` where (((`cortes real`.`Fecha de inicio`>=? and `cortes real`.`Fecha de inicio`<=?) or (`cortes real`.`Fecha de finalización`>=? and `cortes real`.`Fecha de finalización`<=?)) or (`cortes real`.`Fecha de inicio`<=? and `cortes real`.`Fecha de finalización`>= ? ));");
                numerocortesreal.setDate(1,sqlFechaInicial);
                numerocortesreal.setDate(2,sqlFechaFinal);
                numerocortesreal.setDate(3,sqlFechaInicial);
                numerocortesreal.setDate(4,sqlFechaFinal);
                numerocortesreal.setDate(5,sqlFechaInicial);
                numerocortesreal.setDate(6,sqlFechaFinal);
                resultadonumerocortesreal=numerocortesreal.executeQuery();
                resultadonumerocortesreal.next();
                cantidadcortesreal=resultadonumerocortesreal.getInt("count(*)");
                resultadonumerocortesreal.close();
                numerocortesreal.close();
                cortes=new String[cantidadcortesreal][3];
                java.sql.Date[][] fechascortes=new java.sql.Date[cantidadcortesreal][2];
                if(cantidadcortesreal>0){
                    
                    e=0;
                    numerocortesreal = con.prepareStatement("SELECT `cortes real`.`Fecha de inicio`, `cortes real`.`Fecha de finalización`, `cortes real`.`Porcentaje de necesidad`, `cortes real`.`Porcentaje de rendimiento`, `cortes real`.`Costes estándar_Nombre` FROM `cargill`.`cortes real`where (((`cortes real`.`Fecha de inicio`>=? and `cortes real`.`Fecha de inicio`<=?) or (`cortes real`.`Fecha de finalización`>=? and `cortes real`.`Fecha de finalización`<=?)) or (`cortes real`.`Fecha de inicio`<=? and `cortes real`.`Fecha de finalización`>= ? )) order by `cortes real`.`Fecha de inicio`;");
                    numerocortesreal.setDate(1,sqlFechaInicial);
                    numerocortesreal.setDate(2,sqlFechaFinal);
                    numerocortesreal.setDate(3,sqlFechaInicial);
                    numerocortesreal.setDate(4,sqlFechaFinal);
                    numerocortesreal.setDate(5,sqlFechaInicial);
                    numerocortesreal.setDate(6,sqlFechaFinal);
                    resultadonumerocortesreal=numerocortesreal.executeQuery();
                    while(resultadonumerocortesreal.next()){
                        fechascortes[e][0]=resultadonumerocortesreal.getDate("Fecha de inicio");
                        fechascortes[e][1]=resultadonumerocortesreal.getDate("Fecha de finalización");
                        cortes[e][0]=resultadonumerocortesreal.getString("Porcentaje de necesidad");
                        cortes[e][1]=resultadonumerocortesreal.getString("Porcentaje de rendimiento");
                        cortes[e][2]=resultadonumerocortesreal.getString("Costes estándar_Nombre");
                        e++;
                    }
                    resultadonumerocortesreal.close();
                    numerocortesreal.close();
                }
                float pesopromedioGrande, pesopromedioMediano, pesopromedioPequeño;
                pesopromedioPequeño=1;
                pesopromedioGrande=1;
                pesopromedioMediano=1;
                PreparedStatement rangospesopromedio =con.prepareStatement ("SELECT avg(`cosecha corto plazo`.`Peso promedio`) as promedio, `rango de peso`.`Rango de Peso` FROM `cargill`.`cosecha corto plazo` INNER JOIN `cargill`.`rango de peso` ON `cosecha corto plazo`.`Peso promedio` <= `rango de peso`.`Límite Superior` and `cosecha corto plazo`.`Peso promedio` >= `rango de peso`.`Límite Inferior` where `cosecha corto plazo`.`Fecha de cosecha`>? group by `rango de peso`.`Rango de Peso`;");
                ResultSet resultadorangospesopromedio=rangospesopromedio.executeQuery();
                while(resultadorangospesopromedio.next()){
                    if(resultadorangospesopromedio.getString("Rango de Peso").equals("Grande")){
                        pesopromedioGrande=resultadorangospesopromedio.getFloat("promedio");
                    }
                    if(resultadorangospesopromedio.getString("Rango de Peso").equals("Mediano")){
                        pesopromedioMediano=resultadorangospesopromedio.getFloat("promedio");
               
                    }
                    if(resultadorangospesopromedio.getString("Rango de Peso").equals("Pequeño")){
                        pesopromedioPequeño=resultadorangospesopromedio.getFloat("promedio");
               
                    }
                }
                resultadorangospesopromedio.close();
                rangospesopromedio.close();
                //iniciar calculando necesidad actualizada
                java.util.Date fechaA;
                java.sql.Date fechaB;
                float[][] necesidadActualizadaAves;
                necesidadActualizadaAves=new float[7][2];
                for(m=0;m<7;m++){
                    for(n=0;n<cantidadcortesreal;n=n+3){
                        calendar.setTime(hoy);
                        calendar.add(Calendar.DAY_OF_YEAR, m);
                        fechaA = calendar.getTime();
                        fechaB = new java.sql.Date(fechaA.getTime());
                        if((fechaB.after(fechascortes[n][0])||fechaB.equals(fechascortes[n][0])) && (fechaB.equals(fechascortes[n][1])||fechaB.before(fechascortes[n][1]))){
                            necesidadActualizadaAves[m][0]=(demandanum[n]*Float.parseFloat(cortes[n][0])*Float.parseFloat(cortes[n][1]))+(demandanum[n]*Float.parseFloat(cortes[n+1][0])*Float.parseFloat(cortes[n+1][1]))+(demandanum[n]*Float.parseFloat(cortes[n+2][0])*Float.parseFloat(cortes[n+2][1]));
                        }else{
                            necesidadActualizadaAves[m][0]=(demandanum[n]*Float.parseFloat(cortespredeterminado[0][1])*Float.parseFloat(cortespredeterminado[0][2]))+(demandanum[n]*Float.parseFloat(cortespredeterminado[1][1])*Float.parseFloat(cortespredeterminado[1][2]))+(demandanum[n]*Float.parseFloat(cortespredeterminado[2][1])*Float.parseFloat(cortespredeterminado[2][2]));
                        }
                    }
                    for(o=0;o<cantidadrangosreal;o=o+3){
                        calendar.setTime(hoy);
                        calendar.add(Calendar.DAY_OF_YEAR, m);
                        fechaA = calendar.getTime();
                        fechaB = new java.sql.Date(fechaA.getTime());
                        if((fechaB.after(fechasrangos[o][0])||fechaB.equals(fechasrangos[o][0])) && (fechaB.equals(fechasrangos[o][1])||fechaB.before(fechasrangos[o][1]))){
                            necesidadActualizadaAves[m][1]=((necesidadActualizadaAves[m][0]*Float.parseFloat(rangos[o][0]))/pesopromedioPequeño)+((necesidadActualizadaAves[m][0]*Float.parseFloat(rangos[o+1][0]))/pesopromedioMediano)+((necesidadActualizadaAves[m][0]*Float.parseFloat(rangos[o+2][0]))/pesopromedioGrande);
                        }else{
                            necesidadActualizadaAves[m][1]=((necesidadActualizadaAves[m][0]*Float.parseFloat(rangospredeterminado[0][3]))/pesopromedioPequeño)+((necesidadActualizadaAves[m][0]*Float.parseFloat(rangospredeterminado[1][3]))/pesopromedioMediano)+((necesidadActualizadaAves[m][0]*Float.parseFloat(rangospredeterminado[2][3]))/pesopromedioGrande);
                        }
                    }
                }
              //cierro calculo de necesidad  
                
                for(m=0;m<cantidad;m++){
                    lista[m][7]=Float.toString(Float.parseFloat(lista[m][7])*factormes*factorporedad);                   
                }
                for(m=0;m<cantidadcentral;m++){
                    listabackup[m][7]=Float.toString(Float.parseFloat(listabackup[m][7])*factormes*factorporedad);
                }
                plan=new String[cantidad+cantidadcentral][9];
                java.sql.Date[] fechasplan=new java.sql.Date[7];
                float demandacubierta=0;
                float huevosasignados=0;
                for(int g=0;g<7;g++){
                    for(int v=0;v<cantidad && g<7;v++){
                    calendar.setTime(hoy);
                    calendar.add(Calendar.DAY_OF_YEAR, g);
                    fechaA = calendar.getTime();
                    fechasplan[g] = new java.sql.Date(javaFechaFinal.getTime());
                        if(disponible[g]>(huevosasignados+Integer.parseInt(lista[v][6]))){
                            plan[v][0]=lista[v][0];
                            plan[v][1]=lista[v][1];
                            plan[v][2]=lista[v][2];
                            plan[v][3]=lista[v][3];
                            plan[v][4]=lista[v][4];
                            plan[v][5]=lista[v][5];
                            plan[v][6]=lista[v][6];
                            plan[v][7]=lista[v][7];
                            plan[v][8]=fechasplan[g].toString();
                            huevosasignados=huevosasignados+Integer.parseInt(plan[v][6]);
                            demandacubierta=demandacubierta+(Integer.parseInt(plan[v][6])*(1-Float.parseFloat(plan[v][7])));
                        }else{
                            plan[v][0]=lista[v][0];
                            plan[v][1]=lista[v][1];
                            plan[v][2]=lista[v][2];
                            plan[v][3]=lista[v][3];
                            plan[v][4]=lista[v][4];
                            plan[v][5]=lista[v][5];
                            plan[v][6]=Float.toString(disponible[g]-huevosasignados);
                            plan[v][7]=lista[v][7];
                            plan[v][8]=fechasplan[g].toString();
                            huevosasignados=0;
                            g++;
                            demandacubierta=demandacubierta+(Integer.parseInt(plan[v][6])*(1-Float.parseFloat(plan[v][7])));
                            cantidadgalerasingresar=v;
                        }
                    }
                    for(int s=0;s<cantidadcentral && g<7 ;s++){
                        if(disponible[g]>(huevosasignados+Integer.parseInt(listabackup[s][6]))){
                            plan[cantidad+s][0]=null;
                            plan[cantidad+s][1]=listabackup[s][1];
                            plan[cantidad+s][2]=listabackup[s][2];
                            plan[cantidad+s][3]=listabackup[s][3];
                            plan[cantidad+s][4]=listabackup[s][4];
                            plan[cantidad+s][5]=listabackup[s][5];
                            plan[cantidad+s][6]=listabackup[s][6];
                            plan[cantidad+s][7]=listabackup[s][7];
                            plan[cantidad+s][8]=fechasplan[g].toString();
                            huevosasignados=huevosasignados+Integer.parseInt(plan[cantidad+s][6]);
                            demandacubierta=demandacubierta+(Integer.parseInt(plan[cantidad+s][6])*(1-Float.parseFloat(plan[cantidad+s][7])));
                        }else{
                            plan[cantidad+s][0]=null;
                            plan[cantidad+s][1]=listabackup[s][1];
                            plan[cantidad+s][2]=listabackup[s][2];
                            plan[cantidad+s][3]=listabackup[s][3];
                            plan[cantidad+s][4]=listabackup[s][4];
                            plan[cantidad+s][5]=listabackup[s][5];
                            plan[cantidad+s][6]=Float.toString(disponible[g]-huevosasignados);
                            plan[cantidad+s][7]=listabackup[s][7];
                            plan[cantidad+s][8]=fechasplan[g].toString();
                            huevosasignados=0;
                            g++;
                            demandacubierta=demandacubierta+(Integer.parseInt(plan[cantidad+s][6])*(1-Float.parseFloat(plan[cantidad+s][7])));
                            cantidadgalerasingresar=cantidad+s;
                        }
                    }
                }
                float demandasemanal=0;
                for(m=0;m<7;m++){
                    demandasemanal=demandasemanal+necesidadActualizadaAves[m][1];
                    
                }
                float diferencia=0;
                diferencia=demandasemanal-demandacubierta;
                jDialog1.setVisible(false);
                mostrarGenerarPlan(cantidadgalerasingresar,idUsuarioAutenticado,plan,diferencia);
            }   
        } catch (Exception e) {
            jDialog1.setVisible(false);
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_GenerarActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        mostrarConsultarPlan(idUsuarioAutenticado);
    }//GEN-LAST:event_ConsultarActionPerformed
    public void mostrarGenerarPlan(int cantidadlineas,int usuario, String[][] planingreso,float error) {
        PlanIngresoCortoPlazo plan=new PlanIngresoCortoPlazo(cantidadlineas,usuario,planingreso,error);//cantidad de lineas con info del plan, idusuario por aquello, el plan en string, y la diferencia entre aves necesarias y aves colocadas
        plan.setVisible(true);
        plan.setLocationRelativeTo(null);
    }
    public void mostrarConsultarPlan(int usuario) {
        ConsultarIngresoCorto plan=new ConsultarIngresoCorto();
        plan.setVisible(true);
        plan.setLocationRelativeTo(null);
    }
    public void mostrarModificarPlan(int usuario) {
        ModificarPlanIngresoCortoPlazo plan=new ModificarPlanIngresoCortoPlazo();
        plan.setVisible(true);
        plan.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(IngresoCortoplazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoCortoplazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoCortoplazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoCortoplazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int a=0;
                new IngresoCortoplazo(a).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JButton Generar;
    private javax.swing.JButton Modificar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
