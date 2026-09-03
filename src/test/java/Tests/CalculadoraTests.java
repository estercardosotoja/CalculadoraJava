package Tests;

import model.Calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTests {
    
    @Test
    public void testSomarDoisNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        calculadora.somar(5,3);
        assertEquals(8, calculadora.resultado);
    }
}
