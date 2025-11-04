/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoConstruccion.sistema_ventas_login.model;

/**
 *
 * @author 52155
 */
public class ManagerSesion {
    private Usuario usuarioActual;
    
    public Usuario getManagerSession(Usuario usuarioActual) {
        // Este método parece redundante, pero lo implemento como está en el diagrama
        return this.usuarioActual;
    }
    
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }
    
    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
    
    public void actualizarUsuarioActual(Usuario usuarioNuevo) {
        this.usuarioActual = usuarioNuevo;
        System.out.println("Usuario actual actualizado: " + usuarioNuevo.getClaveAccess());
    }
    
    public boolean haySessionActiva() {
        return usuarioActual != null;
    }
    
    public boolean usuarioPuedeAcceder(String modulo) {
        if (!haySessionActiva()) {
            return false;
        }
        
        // Lógica de permisos por módulo basada en el rol
        String rol = usuarioActual.getRolUsuario();
        
        switch (modulo) {
            case "ventas":
                return rol.equals("admin") || rol.equals("vendedor");
            case "inventario":
                return rol.equals("admin") || rol.equals("almacen");
            case "reportes":
                return rol.equals("admin") || rol.equals("gerente");
            default:
                return rol.equals("admin"); // Solo admin para módulos desconocidos
        }
    }
    
    public boolean usuarioTenePermiso(String permiso) {
        if (!haySessionActiva()) {
            return false;
        }
        
        // Lógica granular de permisos específicos
        String rol = usuarioActual.getRolUsuario();
        
        switch (permiso) {
            case "crear_venta":
                return rol.equals("admin") || rol.equals("vendedor");
            case "eliminar_venta":
                return rol.equals("admin");
            case "ver_reportes":
                return rol.equals("admin") || rol.equals("gerente");
            case "gestionar_usuarios":
                return rol.equals("admin");
            default:
                return false;
        }
    }
}
