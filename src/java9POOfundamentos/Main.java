package java9POOfundamentos;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El principito", "Antoine de Saint");
        Libro libro2 = new Libro("La hodisea", "Homero");

        libro.mostrarInfo();
        libro2.mostrarInfo();

        libro.marcarComoLeido();
        libro2.marcarComoLeido();

        libro.mostrarInfo();
        libro2.mostrarInfo();




































//        Persona persona = new Persona(); //instancia
//        persona.nombre = "Victoria";
//        persona.edad = 30;
//        persona.saludar();
//
//        Persona persona2 = new Persona(); //instancia
//        persona2.nombre = "Lili";
//        persona2.edad = 30;
//        persona2.saludar();
//
//        Persona persona3 = new Persona();
//
//        Persona.metodoEstatico();
//
//        Persona persona4 = new Persona();
//        persona4.despedirse();
//
//        System.out.println("-------------------");
//
//        Persona persona5 = new Persona();
//        Persona persona6 = new Persona("Ana", 80, "Alvarado");
//
//        persona5.saludar();
//        persona6.saludar();

    }
}
