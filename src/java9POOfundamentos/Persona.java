package java9POOfundamentos;

public class Persona {
    //! Atributos --> representar el estado del objeto
    String nombre;
    int edad;
    String apellido;

    Persona(){
        //this.nombre = "Sin nombre";
    }

    Persona(String nombre, int edad, String apellido){
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    public void saludar(){
        System.out.println("Hola, soy " + nombre);
        //String nuevaVariable = "hola";
        //System.out.println("Hola, soy " +nuevaVariable);
    }
    public static void metodoEstatico(){
        System.out.println("Hola desde el método estático");
    }
    public void despedirse(){
        System.out.println("Chao, soy " + nombre);
    }


}
