package java12Testing.ejemplo1.test;

import java12Testing.ejemplo1.Producto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductoTest {

    @Test
    public void precioFinalTest(){
        Producto p = new Producto("laptop", 2000.0, 0.10);
        assertEquals(1800.0, p.calcularPrecioFinal(), 0.0001);
    }
    @Test
    public void precioFinalTest2(){
        Producto p = new Producto("laptop", 2000.0, 0.10);
        assertEquals(1800.0, p.calcularPrecioFinal(), 0.0001);
    }
}
