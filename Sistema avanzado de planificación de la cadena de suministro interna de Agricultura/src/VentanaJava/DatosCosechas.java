/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaJava;

import java.util.Date;

public class DatosCosechas {
  //Cosechas anteriores  
  private int secuencia;
  private String rango;
  private int horas_procesamiento;
  private int cantidad_aves;
  private int cantidad_camiones;
  private java.util.Date hora_planta;
  private int galera;
  private int cuadrilla;
  private Date hora_liberacion_cuadrilla;
 
  public DatosCosechas(int dia){ }
 
  public Integer getSecuencia(){
    return this.secuencia;
  }
  public void setSecuencia(int secuencia_i){
    this.secuencia = secuencia_i;
  }
  public String getRango(){
    return this.rango;
  }
  public void setRango(String rango_i){
    this.rango = rango_i;
  }
    public Integer getHoras_procesamiento(){
    return this.horas_procesamiento;
  }
  public void setHoras_procesamiento(int horas_procesamiento_i){
    this.horas_procesamiento = horas_procesamiento_i;
  }
  public int getCantidad_aves(){
    return this.cantidad_aves;
  }
  public void setCantidad_aves(int cantidad_aves_i){
    this.cantidad_aves = cantidad_aves_i;
  }
  public Integer getCantidad_camiones(){
    return this.cantidad_camiones;
  }
  public void setCantidad_camiones(int cantidad_camiones_i){
    this.cantidad_camiones = cantidad_camiones_i;
  }
  public Date getHora_planta(){
    return this.hora_planta;
  }
  public void setHora_planta(java.util.Date hora_planta_i){
    this.hora_planta = hora_planta_i;
  }
  public int getGalera(){
    return this.galera;
  }
  public void setGalera(int galera_i){
    this.galera = galera_i;
  }
  public Integer getCuadrilla(){
    return this.cuadrilla;
  }
  public void setCuadrilla(int cuadrilla_i){
    this.cuadrilla = cuadrilla_i;
  }
  public Date getHora_liberacion_cuadrilla(){
    return this.hora_liberacion_cuadrilla;
  }
  public void setHora_liberacion_cuadrilla(Date hora_liberacion_cuadrilla_i){
    this.hora_planta = hora_liberacion_cuadrilla;
  }

    
}
