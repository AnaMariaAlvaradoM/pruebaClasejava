package java6Bucles;

import java.util.Scanner;

public class While {
    //! Componentes:
    //! Inicialización, Condición, Cuerpo del while, Actualización
    //? Sintaxis:
//    inicialización;
//    while(condición){
//        actualización;
//    }
    public static void ejemplo1While(){
        int contador = 1;
        while (contador <= 3){
            System.out.println("Iteración: " + contador);
            contador++;
        }
        System.out.println(contador);
    }

    public  static void ejemplo2While(){
        boolean bandera = true;
        Scanner scanner = new Scanner(System.in);
        String opcion;
        while (bandera){
            System.out.println("¿Quieres pasar el curso si/no?");
            opcion = scanner.nextLine();

            if(opcion.equalsIgnoreCase("si")){
                System.out.println("Súper!!! Felicitaciones");
                bandera = false;
            } else {
                System.out.println("Muy mal");
            }
        }
    }

    public static void ejercicio3While() {
        Scanner scanner = new Scanner(System.in);
        final String USUARIO_CORRECTO = "admin";
        final String CONTRASENA_CORRECTA = "1234";
        boolean autenticado = false;
        int intentos = 3;

        while (intentos > 0 && !autenticado) {
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Contraseña: ");
            String contrasena = scanner.nextLine();

            if (usuario.equals(USUARIO_CORRECTO) && contrasena.equals(CONTRASENA_CORRECTA)) {
                autenticado = true;
                System.out.println("¡Bienvenido!");
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Credenciales incorrectas. Intentos restantes: " + intentos);
                } else {
                    System.out.println("Cuenta bloqueada. Contacte al administrador.");
                    break;
                }
            }
        }
        if (autenticado) {
            System.out.println("Accediendo al sistema...");
        }
        scanner.close();
    }
}
