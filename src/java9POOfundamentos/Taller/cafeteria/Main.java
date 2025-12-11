package java9POOfundamentos.Taller.cafeteria;

public class Main {
    public static void main(String[] args) {
        Producto cafe = new Producto("Café", 8.0);
        Producto te = new Producto("Té Matcha", 6.0);
        Producto pastel = new Producto("red Velvet", 12.0);

        Pedido p1 = new Pedido(1, cafe, 2);
        Pedido p2 = new Pedido(2, pastel, 1);
        Pedido p3 = new Pedido(3, te, 3);

        Cafeteria c1 = new Cafeteria("Central Café ");

        c1.agregarPedido(p1);
        c1.agregarPedido(p2);
        c1.agregarPedido(p3);

        p1.marcarEntregado();
        p3.marcarEntregado();

        c1.mostrarPedidos();
        c1.mostrarVentasTotales();

        System.out.println("\n--- Productos ---");
        cafe.mostrarInfo();
        te.mostrarInfo();
        pastel.mostrarInfo();
    }
}
