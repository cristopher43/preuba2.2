/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duoc_Clease;

/**
 *
 * @author Cetecom
 */
public class Documentales extends Requerimientos implements Suscripcion{
    
   private String enfoque_Educativo;
   private int duracion_minutos;

    public Documentales() {
    }

    public Documentales(String enfoque_Educativo, int duracion_minutos) {
        this.enfoque_Educativo = enfoque_Educativo;
        this.duracion_minutos = duracion_minutos;
    }

    public Documentales(String enfoque_Educativo, int duracion_minutos, String codigoIdentificador, boolean recomendacion) {
        super(codigoIdentificador, recomendacion);
        this.enfoque_Educativo = enfoque_Educativo;
        this.duracion_minutos = duracion_minutos;
    }
    
       public double calculoTotal(){
        if (duracion_minutos > 90) {
            return COSTO_BASE_SUSCRIPCION *0.05;
            
            
        } else {
            return COSTO_BASE_SUSCRIPCION;
        }
    }
   
   
       
    @Override
    public String toString() {
        return "Requerimientos{" + "codigoIdentificador = " + codigoIdentificador + ", recomendacion = " + recomendacion +"Enfoque educativo = "+ enfoque_Educativo +"Duracion minutos = "+ duracion_minutos + '}';
    }
    
    @Override
    public void consumoSuscripcion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
