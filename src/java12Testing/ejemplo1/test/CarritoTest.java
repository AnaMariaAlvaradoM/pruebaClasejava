package java12Testing.ejemplo1.test;

import java12Testing.ejemplo1.Carrito;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CarritoTest {

    @Test
    public void carritoVacioTest(){
        Carrito carrito = new Carrito();
        //carrito.agregarProducto("Laptop");
        assertTrue(carrito.estaVacio());
    }

    @Test
    public void carritoLlenoTest(){
        Carrito carrito = new Carrito();
        carrito.agregarProducto("Laptop");
        assertFalse(carrito.estaVacio());
    }
}
