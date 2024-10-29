/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Duoc_Clease;

/**
 *
 * @author Cetecom
 */
public class Usuario {
    private String usuario;
    private String calificaion_usuario;

    public Usuario() {
    }

    public Usuario(String usuario, String calificaion_usuario) {
        this.usuario = usuario;
        this.calificaion_usuario = calificaion_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCalificaion_usuario() {
        return calificaion_usuario;
    }

    public void setCalificaion_usuario(String calificaion_usuario) {
        this.calificaion_usuario = calificaion_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", calificaion_usuario=" + calificaion_usuario + '}';
    }
    
    
}
