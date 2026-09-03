package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 *
 * @author Ester
 */
public class CalculadoraTest {

    @Test
    public void testSomarDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(5, 3);
        assertEquals(8, calculadora.resultado);

    }

    @Test
    public void testSomarNumerosNegativos() {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(-5, -3);
        assertEquals(-8, calculadora.resultado);
    }

    @Test
    public void testSomarComZero() {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(10, 0);
        assertEquals(10, calculadora.resultado);
    }

    @Test
    public void testSomarNumerosDecimais() {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(2.5, 1.5);
        assertEquals(4.0, calculadora.resultado);
    }

    @Test
    public void testSubtrairDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        calculadora.substrair(10, 4);
        assertEquals(6, calculadora.resultado);
    }

    @Test
    public void testSubtrairNumerosNegativos() {
        Calculadora calculadora = new Calculadora();
        calculadora.substrair(-10, -4);
        assertEquals(-6, calculadora.resultado);
    }

    @Test
    public void testSubtrairPorZero() {
        Calculadora calculadora = new Calculadora();
        calculadora.substrair(10, 0);
        assertEquals(10, calculadora.resultado);
    }

    @Test
    public void testResultadoDaSubtracaoPodeSerNegativo() {
        Calculadora calculadora = new Calculadora();
        calculadora.substrair(3, 10);
        assertEquals(-7, calculadora.resultado);
    }

    @Test
    public void testSubtrairNumerosDecimais() {
        Calculadora calculadora = new Calculadora();
        calculadora.substrair(5.5, 2.5);
        assertEquals(3.0, calculadora.resultado);
    }

    @Test
    public void testMultiplicarDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicar(5, 3);
        assertEquals(15, calculadora.resultado);
    }

    @Test
    public void testMultiplicarPorZero() {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicar(10, 0);
        assertEquals(0, calculadora.resultado);
    }

    @Test
    public void testMultiplicarNumeroNegativo() {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicar(-5, 3);
        assertEquals(-15, calculadora.resultado);
    }

    @Test
    public void testMultiplicarDoisNumerosNegativos() {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicar(-5, -3);
        assertEquals(15, calculadora.resultado);
    }

    @Test
    public void testMultiplicarNumerosDecimais() {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicar(2.5, 2);
        assertEquals(5.0, calculadora.resultado);
    }

    @Test
    public void testDividirDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(10, 2);
        assertEquals(5, calculadora.resultado);
    }

    @Test
    public void testDividirComResultadoDecimal() {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(5, 2);
        assertEquals(2.5, calculadora.resultado);
    }

    @Test
    public void testDividirNumeroNegativo() {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(-10, 2);
        assertEquals(-5, calculadora.resultado);
    }

    @Test
    public void testDividirDoisNumerosNegativos() {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(-10, -2);
        assertEquals(5, calculadora.resultado);
    }

    @Test
    public void testDividirZeroPorNumero() {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(0, 5);
        assertEquals(0, calculadora.resultado);
    }

    @Test
    public void testDivisaoPorZero() {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(10, 0);
        assertEquals(Double.POSITIVE_INFINITY, calculadora.resultado);
    }
}
