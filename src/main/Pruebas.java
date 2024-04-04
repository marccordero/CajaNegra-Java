package main;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Pruebas {
    
    @Test
    public void testSuma() {
        double resultado = Operaciones.realizarOperacion(2.0, 3.0, '+');
        System.out.println("Resultado de la suma: " + resultado);
        assertEquals(5.0, resultado);
    }
    
    @Test
    public void testResta() {
        double resultado = Operaciones.realizarOperacion(2.0, 3.0, '-');
        System.out.println("Resultado de la resta: " + resultado);
        assertEquals(-1.0, resultado);
    }
    
    @Test
    public void testMultiplicacion() {
        double resultado = Operaciones.realizarOperacion(2.0, 3.0, '*');
        System.out.println("Resultado de la multiplicación: " + resultado);
        assertEquals(6.0, resultado);
    }
    
    @Test
    public void testDivision() {
        double resultado = Operaciones.realizarOperacion(6.0, 3.0, '/');
        System.out.println("Resultado de la división: " + resultado);
        assertEquals(2.0, resultado);
    }
    
    @Test
    public void testDivisionPorCero() {
        double resultado = Operaciones.realizarOperacion(6.0, 0.0, '/');
        System.out.println("Resultado de la división por cero: " + resultado);
        assertEquals(0.0, resultado);
    }
}
