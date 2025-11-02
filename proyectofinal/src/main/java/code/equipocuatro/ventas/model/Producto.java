package code.equipocuatro.ventas.model;

public class Producto {
    private int idProducto;
    private String nombreProducto;
    private int talla;
    private float costoProducto;
    private String estado;
    private int stock;
    public int getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
        this.talla = talla;
    }
    public float getCostoProducto() {
        return costoProducto;
    }
    public void setCostoProducto(float costoProducto) {
        this.costoProducto = costoProducto;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public Producto(int idProducto, String nombreProducto, int talla, float costoProducto, String estado, int stock) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.talla = talla;
        this.costoProducto = costoProducto;
        this.estado = estado;
        this.stock = stock;
    }

    public Producto(int idProducto, String nombreProducto, int talla, float costoProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.talla = talla;
        this.costoProducto = costoProducto;
    }

    public boolean verificarStock(int cantidadSolicitada) {
        return stock >= cantidadSolicitada;
    }

    public void actualizarStock(int stockNuevo){
       // codego 
    }

    public void actualizarEstadoDelProducto(){
        // codigo
    }
}
