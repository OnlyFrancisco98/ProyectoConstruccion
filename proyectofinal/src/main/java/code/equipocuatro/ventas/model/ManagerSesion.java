package code.equipocuatro.ventas.model;

public class ManagerSesion {
    private Usuario usuarioActual;

    public Usuario getManagerSesion(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
        return usuarioActual;
    }
    
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    public void actualizarUsuarioActual(Usuario nuevoUsuario) {
        this.usuarioActual = nuevoUsuario;
    }

    public boolean haySesionActiva() {
        return usuarioActual != null;
    }


}
