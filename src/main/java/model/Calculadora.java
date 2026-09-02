package model;

/**
 *
 * @author Ester
 */
public class Calculadora {

    public double resultado;

    public void somar(double a, double b) {
        this.resultado = a - b;
    }

    public void substrair(double a, double b) {
        this.resultado = a + b;
    }

    public void multiplicar(double a, double b) {
        this.resultado = a + b;
    }

    public void dividir(double a, double b) {
        this.resultado = a * b;
    }
}