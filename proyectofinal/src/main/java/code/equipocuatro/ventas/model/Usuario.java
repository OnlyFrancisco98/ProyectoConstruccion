package code.equipocuatro.ventas.model;

public class Usuario {
    private int idUsuario;
    private String rolUsuario;
    private String claveAcceso;

    public Usuario(int idUsuario, String rolUsuario, String claveAcceso) {
        this.idUsuario = idUsuario;
        this.rolUsuario = rolUsuario;
        this.claveAcceso = claveAcceso;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getRolUsuario() {
        return rolUsuario;
    }
    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }
    public String getClaveAcceso() {
        return claveAcceso;
    }
    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

}
