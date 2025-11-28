package java5FlujoDeControl.masEjercicios;

import java.util.Scanner;

public class ifElse {
    public static void teoria(){
        //! Es la estructura básica para controlar
        //! el flujo del programa

        //* Sintaxis Básica:
        boolean condicion = false;
        if (condicion) {
            // Código si la condición es verdadera
        } else {
            // Código si la condición es falsa
        }
    }

    public static void soloIf(){
        int edad = 20;
        if (edad >= 18){
            System.out.println("Muy bien, puedes ingresar");
        }
        System.out.println("Saludo desde el final");
    }

    public static void ifConElse(int edad){
        if (edad >= 18){
            System.out.println("Muy bien, puedes ingresar");
        }else{
            System.out.println("Lo siento, eres menor");
        }
    }


    public static  void ifAnidados(){
        int edad2;
        System.out.println("Ingrese su edad: ");
        Scanner scanner = new Scanner(System.in);
        edad2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("¿Tiene identificación? (true/false): ");
        boolean tieneIdentificacion = scanner.nextBoolean();

    // Lógica de verificación
        if (edad2 >= 18) {
            if (tieneIdentificacion) {
                System.out.println("Bienvenido");
            } else {
                System.out.println("Necesita identificación");
            }
        } else {
            System.out.println("Menor de edad - Acceso denegado");
        }
    }

    //!CALIFICACIONES
    public  static  void NotaAnidados(int nota){
        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Bueno");
        } else {
            System.out.println("Perdió");
        }
    }

    //** Ejercicio Par impart
    public static void ParImpar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    //** Ejercicio apuestas
//  "Un sitio de apuestas solo permite usuarios mayores de 18 años" +
//  y con saldo mayor a $50. Implementen esta validación."
    public static void apuestas(){

        int edad = 30;
        int saldo = 40;
        if (edad >= 18 && saldo > 50) {
            System.out.println("Registro exitoso");
        } else {
            System.out.println("No cumple los requisitos");
        }
    }

    public static void apuestasOtraOpcion(){
        int edad = 20;
        double saldo = 60.0;

        if (edad >= 18 && saldo > 50) {
            System.out.println("Registro exitoso");
        } else {
            if (edad < 18) {
                System.out.println("Debe ser mayor de 18");
            }
            if (saldo <= 50) {
                System.out.println("Saldo mínimo no alcanzado");
            }
        }
    }
}
