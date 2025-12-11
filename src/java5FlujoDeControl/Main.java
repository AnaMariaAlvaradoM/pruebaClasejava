package java5FlujoDeControl;

import java7Metodos.Metodos;

public class Main {
    public static void main(String[] args) {
        int stockDisponible = 50;
        int cantidadSolicitada = 3;

        System.out.println("\n --- 1. Solo if ---");

        if(cantidadSolicitada <= stockDisponible){
            System.out.println("Puede continuar con la compra");
        }
        System.out.println("Siguiente parte de la compra");

        //! Demostración Método aplicar tarifa envío:
        ProcesarPedido.aplicarTarifaEnvio(120, false);
        ProcesarPedido.aplicarTarifaEnvio(60, false);
        ProcesarPedido.aplicarTarifaEnvio(20, true);

        //! Demostración Método manejar estado pedido:
        ProcesarPedido.manejarEstadoPedido("creado");

        Metodos.mostrarMsjBienvenida();

    }
}
