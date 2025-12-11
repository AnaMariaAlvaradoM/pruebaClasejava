package java8Colecciones;

//! Son estructuras de tamaño fijo
//! Accedo a los elementos por medio de sus indices
//! Sintaxis:
//! TipoDeDato[] nombreArray = new TipoDeDato[tamañoArray]
public class ArrayClase {
    public static void ejemplo1Array(){

        //! Creamos un array fijo de 3 nombres
        String[] nombres = new String[3];

        //! Asignación manual de valores
        nombres[0] = "Sebas";
        nombres[1] = "Diana";
        nombres[2] = "Diana";
        //nombres[3] = "Diana";

        //! Acceso a un único valor:
        System.out.println(nombres[2]);

        String[] nombre = { "Victoria","Juan","Pedrito"};

        //? Array de números:
        int[] numeros = {1,2,3,4,5};

        int [] numeross = new int[5];
        numeros [0] = 1;
        numeros [1] = 2; numeros [2] = 3;
        numeros [3] = 4; numeros [4] = 5;
        System.out.println(numeros[4]);
    }
}
