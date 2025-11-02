package code.equipocuatro.ventas.model;

import java.util.List;

public class CarritoDeVenta {
    private List<ArticuloDelCarrito> carritoDeVenta;
    private float costoTotalCarrito;

    // Getters y Setters
    public List<ArticuloDelCarrito> getCarritoDeVenta() {
        return carritoDeVenta;
    }

    public void setCarritoDeVenta(List<ArticuloDelCarrito> carritoDeVenta) {
        this.carritoDeVenta = carritoDeVenta;
    }

    public float getCostoTotalCarrito() {
        return costoTotalCarrito;
    }

    public void setCostoTotalCarrito(float costoTotalCarrito) {
        this.costoTotalCarrito = costoTotalCarrito;
    }

    public void agregarArticulo(int idProducto, int cantidadProducto, float descuento){
        // codigo
    }

    public void modificarArticulo(int idProducto, int nuevaCantidadProducto, float nuevoDescuento){
        // codigo
    }

    public ArticuloDelCarrito buscarArticuloEnCarrito(int idProducto){
        // codigo
        return null;
    }

    public void quitarArticulo(Producto producto){
        // codigo
    }

    public void vaciarCarrito(){

    }

    public float calcularCostoTotalCarrito(){
        // codigo
        return 0;
    }


}
