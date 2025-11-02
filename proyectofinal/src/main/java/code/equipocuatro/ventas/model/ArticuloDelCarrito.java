package code.equipocuatro.ventas.model;

public class ArticuloDelCarrito {
    private Producto producto;
    private int cantidad;
    private float descuento;
    private float subtotal;
    private float precioPorUnidad;
    private float costoFinalArticulo;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(float precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }

    public float getCostoFinalArticulo() {
        return costoFinalArticulo;
    }

    public void setCostoFinalArticulo(float costoFinalArticulo) {
        this.costoFinalArticulo = costoFinalArticulo;
    }

    public ArticuloDelCarrito(Producto producto, int cantidad, float descuento, float subtotal, float precioPorUnidad, float costoFinalArticulo) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.subtotal = subtotal;
        this.precioPorUnidad = precioPorUnidad;
        this.costoFinalArticulo = costoFinalArticulo;
    }

    public void aplicarDescuentoDelArticulo(float descuento){
        // codigo
    }
    
}
