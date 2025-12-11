package java9POOfundamentos.Taller.cafeteria;

public class Pedido {
    int id;
    Producto producto;
    int cantidad;
    boolean entregado;

    public Pedido(int id, Producto producto, int cantidad) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.entregado = false;
    }

    void marcarEntregado() {
        if (!entregado) {
            for (int i = 0; i < cantidad; i++) {
                producto.marcarVendido();
            }
            entregado = true;
            System.out.println("Pedido " + id + " entregado.");
        } else {
            System.out.println("El pedido " + id + " ya estaba entregado.");
        }
    }

    double calcularTotal() {

        return producto.precio * cantidad;
    }

    void mostrarDetalle() {
        System.out.println("----- DETALLE DEL PEDIDO -----");
        System.out.println("ID: " + id);
        System.out.println("Producto: " + producto.nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: $" + calcularTotal());
        System.out.println("Entregado: " + entregado);
    }
}

