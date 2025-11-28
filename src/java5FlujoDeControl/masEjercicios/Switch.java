package java5FlujoDeControl.masEjercicios;

import java.util.Scanner;

public class Switch {
    //! Cuando tenemos muchas condiciones,
    //! switch es más limpio que múltiples if-else
    public static  void teoria(){

//    switch (variable) {
//        case valor1:
//            Código
//            break; se usa pae evitar que el codigo
        //siga ejecutando otros casos fall through
//        case valor2:
//            Código
//            break;
//        default:
//            Código si no coincide ningún caso
//    }
    }

    public static void calificaciones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una calificaicon: ");
        String calificacion = scanner.nextLine();

        switch (calificacion.toLowerCase()){
            case "a":
                System.out.println("Excelente");
                break;
            case "b":
                System.out.println("Muy bien");
                break;
            default:
                System.out.println("Calificación no valida");
        }
    }

    public static void diasSemana(){
        int dia;
        String nombreDia;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un num del 1 al 7: ");
        dia = scanner.nextInt();

        switch (dia){
            case 1:
                nombreDia="lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día inválido";
        }
        System.out.println("El día es: " + nombreDia);
    }
    public static void animales(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de un animal: ");
        String animal = scanner.nextLine();

        switch (animal.toLowerCase()) {
            // Convertimos a minúsculas para ignorar mayúsculas
            case "perro", "gato", "hamster":
                System.out.println("Es un animal doméstico");
                break;
            case "leon", "tigre", "leopardo":
                System.out.println("Es un felino salvaje");
                break;
            case "pez", "tiburón", "ballena":
                System.out.println("Es un pez");
                break;
            case "pájaro", "águila", "canario":
                System.out.println("Es un ave");
                break;
            default:
                System.out.println("No conozco ese animal");
        }
    }

    //! Ejercicio películas
//    Ejercicio: Sistema de descuentos para cine:
//    Lunes y Miércoles: 20% descuento
//    Martes: 50% descuento
//    Jueves: 2x1
//    Viernes a Domingo: Precio normal
    public static void peliculas(){
        String dia = "martes";
        double precio = 10.0;

        switch(dia.toLowerCase()) {
            case "lunes":
            case "miércoles":
                precio *= 0.8;
                break;
            case "martes":
                precio *= 0.5;
                break;
            case "jueves":
                System.out.println("2x1 - Pague 1 entrada");
                break;
            case "viernes":
            case "sábado":
            case "domingo":
                // Precio normal
                break;
            default:
                System.out.println("Día inválido");
        }
        System.out.println("Precio: $" + precio);
    }
}
