/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoConstruccion.sistema_ventas_login.model;

/**
 *
 * @author 52155
 */
public class Usuario {
    private int idUsuario;
    private int claveAccess;
    private String rolUsuario;
    
    public Usuario() {}
    
    public Usuario(int idUsuario, int claveAccess, String rolUsuario) {
        this.idUsuario = idUsuario;
        this.claveAccess = claveAccess;
        this.rolUsuario = rolUsuario;
    }
    
    // Getters y Setters
    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
    
    public int getClaveAccess() { return claveAccess; }
    public void setClaveAccess(int claveAccess) { this.claveAccess = claveAccess; }
    
    public String getRolUsuario() { return rolUsuario; }
    public void setRolUsuario(String rolUsuario) { this.rolUsuario = rolUsuario; }
    
    @Override
    public String toString() {
        return "Usuario{id=" + idUsuario + ", clave=" + claveAccess + ", rol=" + rolUsuario + "}";
    }
}
