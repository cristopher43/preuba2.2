/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duoc_Clease;

/**
 *
 * @author Cetecom
 */
public class Peliculas extends Requerimientos implements Suscripcion{
    private String duracion;
    private double calificacion;

    public Peliculas() {
    }

    public Peliculas(String duracion, double calificacion) {
        this.duracion = duracion;
        this.calificacion = calificacion;
    }

    public Peliculas(String duracion, double calificacion, String codigoIdentificador, boolean recomendacion) {
        super(codigoIdentificador, recomendacion);
        this.duracion = duracion;
        this.calificacion = calificacion;
    }
    
    public double calculoTotal(){
        if (calificacion > 4.5) {
            return COSTO_BASE_SUSCRIPCION * 1.10;
            
            
        } else {
            return COSTO_BASE_SUSCRIPCION;
        }
    }
    
    @Override
    public String toString() {
        return "Requerimientos{" + "codigoIdentificador = " + codigoIdentificador + ", recomendacion = " + recomendacion + "Duracion = " + duracion +"Calificacion = " +calificacion + '}';
    }

    @Override
    public void consumoSuscripcion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}