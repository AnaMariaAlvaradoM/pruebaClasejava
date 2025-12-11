package java7Metodos;

public class Metodos {
    //! Sintaxis Básica
//    modificador TipoRetorno nombreMetodo(//parametros){
//}
//    public int sumar(//parametros){
//    }
    public static void mostrarMsjBienvenida(){
        System.out.println("Bienvenido a nuestro banco");
    }

    public static double calcularInteres(double capital, double tasa , int tiempo){
        return capital * (tasa/100) * tiempo;
    }

}
