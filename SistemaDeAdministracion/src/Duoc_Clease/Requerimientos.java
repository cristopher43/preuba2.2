/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duoc_Clease;

/**
 *
 * @author Cetecom
 */
public abstract class Requerimientos {
    String codigoIdentificador;
    boolean recomendacion;

    public Requerimientos() {
    }

    public Requerimientos(String codigoIdentificador, boolean recomendacion) {
        this.codigoIdentificador = codigoIdentificador;
        this.recomendacion = recomendacion;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public boolean isRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(boolean recomendacion) {
        this.recomendacion = recomendacion;
    }
    
     @Override
    public String toString() {
        return "Requerimientos{" + "codigoIdentificador=" + codigoIdentificador + ", recomendacion=" + recomendacion + '}';
    }
    

   
    
    

   
    
}
