/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duoc_Clease;

/**
 *
 * @author Cetecom
 */
public class Series extends Requerimientos implements Suscripcion{
    private int numerTemporadas;
    private boolean temporadaFinalisada;

    public Series() {
    }

    public Series(int numerTemporadas, boolean temporadaFinalisada) {
        this.numerTemporadas = numerTemporadas;
        this.temporadaFinalisada = temporadaFinalisada;
    }

    public Series(int numerTemporadas, boolean temporadaFinalisada, String codigoIdentificador, boolean recomendacion) {
        super(codigoIdentificador, recomendacion);
        this.numerTemporadas = numerTemporadas;
        this.temporadaFinalisada = temporadaFinalisada;
    }
    
       public int calculoTotal(){
        if (numerTemporadas > 3) {
            return (int) (COSTO_BASE_SUSCRIPCION * 1.08);
            
            
        } else {
            return (int) COSTO_BASE_SUSCRIPCION;
        }
    }
    @Override
    public String toString() {
        return "Requerimientos{" + "codigoIdentificador = " + codigoIdentificador + ", recomendacion = " + recomendacion + "Numero Temporadas = " + numerTemporadas + " Temporadas Finalisadas = " + temporadaFinalisada +'}';
    }
    @Override
    public void consumoSuscripcion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
