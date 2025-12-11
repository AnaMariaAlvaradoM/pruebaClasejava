package java12Testing.ejemplo1.test;


import java12Testing.ejemplo1.Calculadora;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    private Calculadora calcu;

    @Before
    public void setUp(){
        calcu = new Calculadora();
    }

    @Test
    public void sumaTest(){
        int resultado = calcu.sumar(2, 5);
        assertEquals(7, resultado);
    }
    @Test
    public void restaTest(){
        int resultado = calcu.restar(5, 2);
        assertEquals(3, resultado);
    }

}
