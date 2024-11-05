package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import control.CalculaPlas;

public class Teste {

    @Test
    public void testAdicao() {
        CalculaPlas calculadora = new CalculaPlas();
        int resultado = calculadora.adicao(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testSubtrair() {
        CalculaPlas calculadora = new CalculaPlas();
        int resultado = calculadora.subtrair(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicar() {
        CalculaPlas calculadora = new CalculaPlas();
        int resultado = calculadora.multiplicar(4, 3);
        assertEquals(12, resultado);
    }

    @Test
    public void testDividir() {
        CalculaPlas calculadora = new CalculaPlas();
        int resultado = calculadora.dividir(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    public void testDividirPorZero() {
        CalculaPlas calculadora = new CalculaPlas();
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }

    @Test
    public void testResto() {
        CalculaPlas calculadora = new CalculaPlas();
        int resultado = calculadora.resto(10, 3);
        assertEquals(1, resultado);
    }

    @Test
    public void testRestoPorZero() {
        CalculaPlas calculadora = new CalculaPlas();
        assertThrows(ArithmeticException.class, () -> calculadora.resto(10, 0));
    }
}
