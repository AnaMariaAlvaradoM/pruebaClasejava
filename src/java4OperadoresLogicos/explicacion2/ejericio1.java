package java4OperadoresLogicos.explicacion2;

public class ejericio1 {

    public static String manejarEstadoPedidoOld(String estadoActual) {
        System.out.println("\n--- 3. Despacho de Lógica con SWITCH---");

        String estado = estadoActual.toUpperCase();
        String siguienteAccion = switch (estado) {
            case "CREADO" -> "Iniciar validación de pago.";
            case "PROCESANDO", "PAGADO" -> "Asignar a logística y generar guía de envío.";
            case "ENVIADO" -> "Notificar al cliente la guía de rastreo.";
            case "ENTREGADO" -> "Cerrar pedido y solicitar feedback al cliente.";
            case "CANCELADO", "FALLIDO" -> {
                System.out.println(" [LOG DE COMPENSACIÓN]: Devolviendo stock y liberando recursos.");
                yield "Pedido no procesable. Cerrado sin acción.";
            }
            default -> "Estado desconocido. Se requiere intervención manual.";
        };

        System.out.println("Para el estado '" + estadoActual + "', la acción es: " + siguienteAccion);
        return siguienteAccion;
    }



}
