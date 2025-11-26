package java3VariableYtiposDeDatos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- 1. VARIABLES ---");

        //! Declarando la variable
        int edad;

        //! Asignar valor a la variable
        edad = 60;

        //! 2x1 Declarar y asignar al tiempo
        int temperatura = 30;

        temperatura = 40;

        System.out.println("La edad es: " + edad);
        System.out.println("La temep es: " + temperatura);

        int numLearners = 100;

        //? Error
        //int x;
        //System.out.println(x);

        System.out.println("\n--- 1. TIPOS DE ENTEROS ---");

        byte miByte = -128;
        short miShort = 32000;
        int miNumero = 10000;

        long poblacionMundial = 8000000000L;

        System.out.println("Byte: " + miByte);
        System.out.println("Short: " + miShort);
        System.out.println("Int : " + miNumero);

        System.out.println("\n--- 1. MÁS DATOS PRIMITIVOS ---");

        double numDouble = 0.1234567891234567;
        float numFlotante = 0.1234567891234567f;

        System.out.println("Double: " + numDouble);
        System.out.println("Float: " + numFlotante);

        //! Decimales
        float altura = 1.65f;
        double precio = 9.99;

        //! Booleanos
        boolean esTrue = true;
        boolean esFalse = false;

        //! Caracteres
        char letra = 'A';
        char simbolo = '@';


        System.out.println("\n--- 1. Casting Conversión de datos ---");
        //? Casting implicito
        int numEntero = 100;
        double nuevoDouble = numEntero;
        System.out.println("Casteo implicito: " + nuevoDouble);

        //? Casting explicito
        double notaFinal = 3.6;
        int notaEntera = (int) notaFinal;
        System.out.println("Nota entera: " + notaEntera);

        //! Inferencia

        var miNuevoNum = 10;
        var miNombre = "Pepito";

        System.out.println("\n--- 5. OPERADORES ARITMÉTICOS  ---");

        int num1 = 10;
        int num2 = 3;

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Div: " + (num1 / num2));
        System.out.println("Div correcta: " + ((double) num1 / num2));
        System.out.println("Multi: " + (num1 * num2));

        num1++;
        System.out.println("Incremeto: " + num1);
        num2--;
        System.out.println("Incremeto: " + num2);

        System.out.println("\n--- 6. OPERADORES COMPARACIÓN  ---");

        int num3 = 5;
        int num4 = 10;

        boolean esMayor = num3 > num4;
        boolean iguales = num3 == num4;
        boolean diferentes = num3 != num4;

        int miUltimaVariable = 200;

        System.out.println(miUltimaVariable += 10);
        System.out.println(miUltimaVariable + 10);
        System.out.println(miUltimaVariable -= 10);
        System.out.println(miUltimaVariable *= 10);
        System.out.println(miUltimaVariable /= 10);
        System.out.println(miUltimaVariable %= 10);


        System.out.println("\n--- 7. INTERACCIÓN  ---");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime tu edad: ");
        int edad2 = scanner.nextInt();

        //! Limpiamos el buffer
        scanner.nextLine();

        System.out.print("Dime tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Dime tu nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.println("Hola: "+ nombre );

        scanner.close();

//        System.out.println("Dime tu edad: ");
//        int edad3 = scanner.nextInt();
    }
}