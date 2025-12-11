package java12Testing.ejemplo1;

public class Producto {
    private String nombre;
    private double preciobase;
    private double descuento;

    public Producto(String nombre, double preciobase, double descuento) {
        this.nombre = nombre;
        this.preciobase = preciobase;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPreciobase() {
        return preciobase;
    }

    public void setPreciobase(double preciobase) {
        this.preciobase = preciobase;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double calcularPrecioFinal(){
        return preciobase - (preciobase * descuento);
    }

}
