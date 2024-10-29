/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duoc_Clease;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class GestionarRegistro {
    List<Peliculas> peliculaslis = new ArrayList<>();
    List<Series> serieslis = new ArrayList<>();
    List<Documentales> documentaleslis = new ArrayList<>();
    
    public void aregarPelicula(Peliculas peliculas){
        peliculaslis.add(peliculas);
    }
    
    public void aregarSeries(Series sereielis){
        serieslis.add(sereielis);
    }
    
    public void agregarDocumentales(Documentales documentales){
        documentaleslis.add(documentales);
    }
    
    //public void listarReegistro(){
        //for(Peliculas i : ingresarPeliculas)
        
    
}
