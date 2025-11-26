package Java4OperadoresLogicos;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n --- OPERADORES LÓGICOS ---");
        boolean tienesDinero = true;
        boolean tienesTarjetaCredito = false;
        boolean estaHaciendoFrio = true;

        //! AND &&

        boolean puedeComprar = tienesDinero && tienesTarjetaCredito;

        System.out.println("¿Puede comprar? " + puedeComprar);

        int edad = 15;

        boolean puedeEntrar = (edad >= 18) && !estaHaciendoFrio;

        estaHaciendoFrio = false;

        //! OR ||
        boolean puedeEntrar2 = (edad >= 18) || estaHaciendoFrio;


        //! NOT !
        boolean estaHaciendoFrio2 = !true;

    }
}
