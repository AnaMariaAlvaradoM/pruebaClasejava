package java9POOfundamentos.Taller.cafeteria;

import java.util.ArrayList;

public class Cafeteria {
    String nombre;
    ArrayList<Pedido> pedidos;

    public Cafeteria(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    void agregarPedido(Pedido p) {

        pedidos.add(p);
    }

    void mostrarPedidos() {
        System.out.println("=== LISTA DE PEDIDOS EN " + nombre + " ===");
        for (Pedido p : pedidos) {
            p.mostrarDetalle();
        }
    }

    void mostrarVentasTotales() {
        double total = 0;
        for (Pedido p : pedidos) {
            if (p.entregado) {
                total += p.calcularTotal();
            }
        }
        System.out.println("Ventas totales: $" + total);
    }
}
