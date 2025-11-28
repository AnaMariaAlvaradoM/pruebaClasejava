package java5FlujoDeControl;

public class ProcesarPedido {

    public static void aplicarTarifaEnvio(double valorPedido, boolean esClientePremium){
        System.out.println("\n --- 2. Tarifa envio con If-else");
        double costoEnvio = 15;
        if(esClientePremium){
            System.out.println("Envio gratis");
            costoEnvio = 0;
        } else {
            System.out.println("Vamos a calcular tu valor de envió");
        }

        if(valorPedido >= 100){
            System.out.println("El envio te queda en 5 dólares");
            costoEnvio = 5;
        } else if (valorPedido >= 50){
            System.out.println("Tiene un 50% de desc en el envío");
            costoEnvio *= 0.5;
        } else {
            System.out.println("Tu envío sería de 15");
        }
        System.out.println("El costo del envío $" + costoEnvio);
    }

    public static String manejarEstadoPedido(String estadoActual){
        System.out.println("\n 3. Switch");
        String estado = estadoActual.toUpperCase();
        String siguientePaso = "";

        switch(estado){
            case "CREADO":
                System.out.println("El predido ha sido creado");
                siguientePaso = "El pedido ha sido creado";
                break;
            case "PROCESANDO":
            case "PAGADO":
                System.out.println("Procesando el pedido y el pago");
                siguientePaso = "El pedido ha sido creado";
                break;
            case "ENVIADO":
                System.out.println("Envíar guia");
                break;
            case "ENTREGADO":
                System.out.println("El pedido fue entregado ");
                break;
            default:
                System.out.println("Error de pedido");
        }
        System.out.println("El estado del pedido es: " + siguientePaso);
        return siguientePaso;
    }
}
