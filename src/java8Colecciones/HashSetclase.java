package java8Colecciones;

import java.util.HashSet;
import java.util.Set;

public class HashSetclase {
    //! Set <TipoDato> nombre = new HashSet<>();

    public static void ejemplo1HashSet(){
        Set<String> temasJava= new HashSet<>();

        temasJava.add("funciones");
        temasJava.add("Bucles");
        temasJava.add("funciones");
        temasJava.add("funciones");
        temasJava.add("funciones");
        temasJava.add("funciones");
        temasJava.add("funciones");
        temasJava.add("funciones");
        temasJava.add("funciones");
        temasJava.add("Colecciones");

        for(String tema : temasJava){
            System.out.println(tema);
        }

        System.out.println(temasJava.size());
    }
}
