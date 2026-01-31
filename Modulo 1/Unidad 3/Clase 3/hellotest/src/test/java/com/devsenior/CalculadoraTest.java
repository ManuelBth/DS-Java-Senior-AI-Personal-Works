package com.devsenior;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5 ,calc.sumar(3,2));
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(1 ,calc.restar(3,2));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6 ,calc.multiplicar(3,2));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2 ,calc.dividir(4,2));

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(4, 0);
        });

        assertEquals("El divisor no puede ser cero.", exception.getMessage());
    }

}
