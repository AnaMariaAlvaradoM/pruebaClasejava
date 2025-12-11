package java9POOfundamentos.Taller.cafeteria;

public class Producto {
    String nombre;
    double precio;
    int vendidos;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.vendidos = 0;
    }

    void marcarVendido() {

        vendidos++;
    }

    void mostrarInfo() {

        System.out.println(nombre + " | Precio: $" + precio + " | Vendidos: " + vendidos);
    }
}

