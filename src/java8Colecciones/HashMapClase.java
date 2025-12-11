package java8Colecciones;

import java.util.HashMap;
import java.util.Map;

public class HashMapClase {
    //! Map<String, Double> nombre = new HashMap<>();

    public static void ejericio1Map(){
        Map<String, Double> inventario = new HashMap<>();

        //! agregar elementos
        inventario.put("Manzana", 1.40);
        inventario.put("Manzana", 1.40);
        inventario.put("Pera", 1.40);
        inventario.put("Mandarina", 1.40);
        inventario.put("Uvas", 1.40);

        System.out.println("Mostrando todo mi inventario");
        for(String fruta : inventario.keySet()){
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }



    }
}
