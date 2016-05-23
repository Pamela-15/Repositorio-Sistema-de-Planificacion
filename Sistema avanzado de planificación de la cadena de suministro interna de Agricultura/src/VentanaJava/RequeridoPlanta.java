/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaJava;

import java.util.Calendar;
import java.util.Date;

public class RequeridoPlanta {
  //Requeridos por secuencia  
  private int secuencia;  private String rango;
  private double horas_procesamiento;
  private int cantidad_aves;
  private int cantidad_camiones;
  private Calendar hora_planta;
  
  public RequeridoPlanta(int dia){ }
 
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
    public double getHoras_procesamiento(){
    return this.horas_procesamiento;
  }
  public void setHoras_procesamiento(double horas_procesamiento_i){
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
  public Calendar getHora_planta(){
    return this.hora_planta;
  }
  public void setHora_planta(Calendar hora_planta_i){
    this.hora_planta = hora_planta_i;
  }
    
}
