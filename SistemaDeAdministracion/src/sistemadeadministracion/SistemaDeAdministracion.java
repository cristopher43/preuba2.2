/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeadministracion;

import Duoc_Clease.Documentales;
import Duoc_Clease.Peliculas;
import Duoc_Clease.Series;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class SistemaDeAdministracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peliculas peliculas = new  Peliculas("2", 2, "02jws", true);
        Documentales documentales = new Documentales( "ducicacion marina", 100,"codigo01", true);
        Series series = new Series(4, true, "codigo007", true);
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        while (true) {
        
            System.out.println("*****menu*****");
            System.out.println("[1]. ver contenido");
            System.out.println("[2]. ver peliculas ");
            System.out.println("[3]. ver series");
            System.out.println("[0]. ver documentales");
            
            
            opcion = entrada.nextInt();
            
            switch (opcion = 0) {
                case 1:
                    System.out.println("Peliculas"+" "+peliculas);
                    
                    break;
                case 2:
                    System.out.println("Peliculas" + peliculas);
                    break;
                
                case 3:
                    System.out.println("Sereis" + series);
                    
                case 4:
                    System.out.println("Documentales" + documentales);
                    
                    
                default: System.out.println("salir");
                       return;
                    
            }
        }
        
        
        
    }
    
}
