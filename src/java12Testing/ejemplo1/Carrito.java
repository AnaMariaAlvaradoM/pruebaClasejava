package java12Testing.ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<String> productos = new ArrayList<>();

    public boolean estaVacio(){
        return  productos.isEmpty();
    }

    public void agregarProducto(String producto){
        productos.add(producto);
    }
}
