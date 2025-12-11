package java7Metodos;

public class Refactorizando {
    public static void calculando() {
        double precio1 = 100;
        double conDescuento1 = precio1 * 0.8;
        double conIva1 = conDescuento1 * 1.19;
        System.out.println("Producto 1: $" + conIva1);

        double precio2 = 200;
        double conDescuento2 = precio2 * 0.9;
        double conIva2 = conDescuento2 * 1.19;
        System.out.println("Producto 2: $" + conIva2);
    }
}
