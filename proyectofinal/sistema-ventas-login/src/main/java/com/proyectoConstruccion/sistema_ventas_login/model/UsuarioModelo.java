/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoConstruccion.sistema_ventas_login.model;
import java.sql.ResultSet;
/**
 *
 * @author 52155
 */
public class UsuarioModelo {
    private ManagerSesion managerSession;
    private BDUsuario bdUsuario;
    
    public UsuarioModelo() {
        this.managerSession = new ManagerSesion();
        this.bdUsuario = new BDUsuario();
    }
    
    public boolean existeUsuario(int claveAccess) {
        // Simulamos consulta a BD - en realidad iría a BDUsuario
        return bdUsuario.buscarUsuarioPorClave(claveAccess) != null;
    }
    
    public Usuario obtenerUsuario(int claveAccess) {
        // Simulamos obtener usuario de BD
        Usuario usuario = bdUsuario.buscarUsuarioPorClave(claveAccess);
        return usuario;
    }
    
    public Usuario transformarDataCEnObjectUsuario(ResultSet rs) {
        // Este método sería llamado por BDUsuario al convertir ResultSet a objeto
        try {
            Usuario usuario = new Usuario();
            usuario.setIdUsuario(rs.getInt("idUsuario"));
            usuario.setClaveAccess(rs.getInt("claveAccess"));
            usuario.setRolUsuario(rs.getString("rolUsuario"));
            return usuario;
        } catch (Exception e) {
            System.out.println("Error transformando datos: " + e.getMessage());
            return null;
        }
    }
    
    public void crearSession(Usuario usuarioReferencia) {
        managerSession.setUsuarioActual(usuarioReferencia);
        System.out.println("Sesión creada para usuario: " + usuarioReferencia.getClaveAccess());
    }
    
    public void eliminarSession() {
        managerSession.setUsuarioActual(null);
        System.out.println("Sesión eliminada");
    }
    
    // Getter para que el controlador pueda verificar estado de sesión
    public boolean haySessionActiva() {
        return managerSession.haySessionActiva();
    }
}
