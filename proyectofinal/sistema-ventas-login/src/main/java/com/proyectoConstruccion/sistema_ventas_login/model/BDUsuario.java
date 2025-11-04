/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoConstruccion.sistema_ventas_login.model;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author 52155
 */
public class BDUsuario {
     private Map<Integer, Usuario> usuarios;
    
    public BDUsuario() {
        usuarios = new HashMap<>();
        // Datos de prueba
        usuarios.put(12345, new Usuario(1, 12345, "admin"));
        usuarios.put(67890, new Usuario(2, 67890, "vendedor"));
    }
    
    public Usuario buscarUsuarioPorClave(int claveAccess) {
        return usuarios.get(claveAccess);
    }
}
