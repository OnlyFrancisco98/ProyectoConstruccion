/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoConstruccion.sistema_ventas_login.model;

/**
 *
 * @author 52155
 */
public class ControladorSesionDeUsuario {
    private UsuarioModelo usuarioModelo;
    
    public ControladorSesionDeUsuario() {
        this.usuarioModelo = new UsuarioModelo();
    }
    
    public boolean iniciarSession(int claveAccess) {
        if (usuarioModelo.existeUsuario(claveAccess)) {
            Usuario usuario = usuarioModelo.obtenerUsuario(claveAccess);
            usuarioModelo.crearSession(usuario);
            return true;
        } else {
            inicioSessionErroneo();
            return false;
        }
    }
    
    public void inicioSessionErroneo() {
        System.out.println("Error: Clave de acceso incorrecta");
        // En una implementación real, aquí podríamos:
        // - Llevar un contador de intentos fallidos
        // - Bloquear después de X intentos
        // - Mostrar mensaje en la vista
    }
    
    public void cerrarSession() {
        usuarioModelo.eliminarSession();
        System.out.println("Sesión cerrada correctamente");
    }
}
