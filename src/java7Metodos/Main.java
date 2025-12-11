package java7Metodos;

import static java.lang.Math.*;
import static java7Metodos.Metodos.calcularInteres;

public class Main {
    public static void main(String[] args) {
        //============================================================
        //! Primera parte
        Metodos.mostrarMsjBienvenida();

        Metodos.calcularInteres(1000, 5.5, 180);
        calcularInteres(1000, 5.5, 180);
        double interes = calcularInteres(1000, 5.5, 180);
        System.out.println("El interés de tu crédito es: " + interes);


        //============================================================
        //! Segunda parte Api java
        String email = "user@hola.com";
        String password = "User1234";

        System.out.println("Longitud: " + email.length());
        System.out.println("Esto es un email valido? : " + email.contains("@"));
        System.out.println("Primer caracter: " + email.charAt(0));

        ApiJava.validarEmail(email);
        ApiJava.validarPassword(password);

        //! Usando Math
        System.out.println("Potencia: " + pow(2, 3));
        System.out.println("Raiz: " + sqrt(20));
        System.out.println("Redondear: " + round(15.67));
        System.out.println("Aleatorio: " + random()* 10000);




    }

}
